package slr;

public class Betas {
    
    //Determiante del Sistema
    public double Ds(int n,double x1,double x2,double x3,double x4,double y1,double xy,double x2y){
        double ds=0;
        ds = (n*x2*x4)+(x1*x3*x2)+(x2*x1*x3)-(x1*x1*x4)-(n*x3*x3)-(x2*x2*x2);
        return ds;
    }  
    
    //Beta 0
    public double B0(int n,double x1,double x2,double x3,double x4,double y1,double xy,double x2y){
        double d0=0;
        d0 = (y1*x2*x4)+(x1*x3*x2y)+(xy*x3*x2)-(x2*x2*x2y)-(x3*x3*y1)-(xy*x1*x4);
        return d0;
    }  
    
    //Beta 1
     public double B1(int n,double x1,double x2,double x3,double x4,double y1,double xy,double x2y){
        double d1=0;
        d1 = (n*xy*x4)+(y1*x3*x2)+(x1*x2y*x2)-(x2*xy*x2)-(x3*x2y*n)-(x1*y1*x4);
        return d1;
    }  
     
     //Beta 2
     public double B2(int n,double x1,double x2,double x3,double x4,double y1,double xy,double x2y){
        double d2=0;
        d2 = (n*x2*x2y)+(x1*xy*x2)+(x1*x3*y1)-(y1*x2*x2)-(xy*x3*n)-(x1*x1*x2y);
        return d2;
    }  
         
}
