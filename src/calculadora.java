import javax.swing.*;

public class calculadora {
    private int valor1;

    private int valor2;

    public calculadora() {
    }

    public calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int sum(){
        int sum = this.valor1+this.valor2;
        return sum;
    }

    public int mult(int valor1,int valor2){
        int mult = this.valor1+this.valor2;
        return mult;
    }

    public void div(){
        int div = this.valor1+this.valor2;
        JOptionPane.showMessageDialog(null," la divicion tendria un resultado de " + div);
    }

    public void rest( int valor2, int valor1){
        float rest = this.valor1-this.valor2;

        JOptionPane.showMessageDialog(null," la resta tendria un resultado de " + rest);

    }

}
