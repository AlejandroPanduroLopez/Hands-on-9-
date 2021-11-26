package slr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;


public class SLR extends Agent {
    
//Cuadratico
    //double x[]={-3,-2,-1,0,1,2,3};
    //double y[]={7.5,3,0.5,1,3,6,14};
    
//Polinomial
    //double x[] = {50, 50, 50, 70, 70, 70, 80,80,80,90,90,90,100,100,100};
    //double y[] = {3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5,2.9,2.4,3.0,3.1,2.8,3.3,3.5,3.0};
    
 //Temperatura
        double x[] = {0,20,40,60,80,100};
        double y[] = {0.0002,0.0012,0.0060,0.0300,0.0900,0.2700};

    @Override
    public void setup(){
        
        addBehaviour(new MyOneshotBehaviour());
           System.out.println("Agente ejecutado");
    }

    private class MyOneshotBehaviour extends OneShotBehaviour {
    
        @Override 
        public void action(){
            
        //Objetos
        Operaciones op = new Operaciones();
        Betas betas = new Betas();
        Multi multi = new Multi();
        
        //Variables
        int n = x.length; //Se saca el calor de N dependieno el tamaño del arreglo
        double xy = multi.Multiplicacion(x,y);
        double x2y = multi.Multiplicacion2(x,y);
        double x1 = op.X1(x);
        double x2 = op.X2(x);
        double x3 = op.X3(x);
        double x4 = op.X4(x);
        double y1 = op.Y1(y);
        
        //Determiante del sistema
        double ds = betas.Ds(n, x1, x2, x3, x4, y1, xy, x2y);
        //B0
        double b0 = betas.B0(n, x1, x2, x3, x4, y1, xy, x2y)/ds;
        //B1
        double b1 = betas.B1(n, x1, x2, x3, x4, y1, xy, x2y)/ds;
        //B2
        double b2 = betas.B2(n, x1, x2, x3, x4, y1, xy, x2y)/ds;
        
        //Presentaciones a Pantalla
        System.out.println("N: "+n);
        System.out.println("(X*Y): "+xy);
        System.out.println("(X^2)*Y: "+x2y);
        System.out.println("X: "+x1);
        System.out.println("X^2: "+x2);
        System.out.println("X^3: "+x3);
        System.out.println("X^4: "+x4);
        System.out.println("Y: "+y1);
        System.out.println("DS: "+ds);
        System.out.println("------------------------------------------------");
        System.out.println("Valor de Beta0: " + b0);
        System.out.println("Valor de Beta1: " + b1);
        System.out.println("Valor de Beta2: " + b2);
        System.out.println("------------------------------------------------");
        }
        
        @Override
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }

}
