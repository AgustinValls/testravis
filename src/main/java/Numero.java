public class Numero {

    int numerador;
    int denominador;
    int cociente;
    int resto;

    public Numero(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int sum(){
        return numerador + denominador;
    }

    public double result(int numerador, int denominador){
        return numerador / denominador;
    }
}
