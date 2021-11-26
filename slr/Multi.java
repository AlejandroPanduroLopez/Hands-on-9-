package slr;
public class Multi { 

//Xi*Yi
public double Multiplicacion(double numeros[],double numeros2[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=(numeros[i]*numeros2[i]);
    }
    return resultado;
}

//X^2*Y
public double Multiplicacion2(double numeros[],double numeros2[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=(Math.pow(numeros[i],2))*numeros2[i];
    }
    return resultado;
}
}
