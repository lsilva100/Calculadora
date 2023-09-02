public class Calculadora{
    private double num1;
    private double num2;

    public void setNumeros(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public double getNumero1(){
        return num1;
    }


    public double getNumero2(){
        return num2;
    }

    public double Soma(){
        return getNumero1() + getNumero2();
    }

    private double Subtração(){
        return getNumero1() - getNumero2();

    }

    private double Multiplicação(){
        return getNumero1() * getNumero2();

    }

    private double Divisão(){
        return getNumero1() / getNumero2();

    }
}


