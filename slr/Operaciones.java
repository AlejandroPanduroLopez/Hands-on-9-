package slr;
public class Operaciones {
    
//Xi 
public double X1(double numeros[]){
     double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];  
      }  
  return resultado;
} 
//X^2
public double X2(double numeros[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=Math.pow(numeros[i],2);
    }
    return resultado;
}
//x^3
public double X3(double numeros[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=Math.pow(numeros[i],3);
    }
    return resultado;
}
//x^4
public double X4(double numeros[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=Math.pow(numeros[i],4);
    }
    return resultado;
}

//Yi
public double Y1(double numeros[]){
    double resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];    
    }
    return resultado;
}
}
