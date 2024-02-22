import javax.swing.*;

public class calculadota_main {
    public static void main(String[] args) {

        oprecion cal1 = new oprecion();
        int val1;
        int val2;
        String proceso;
        String sum = "sumar";
        String div = "dividir";
        String m = "multiplicar";
        String res = "restar";
        int h;

        System.out.printf("muy buenos dias bienvenido");

        h=Integer.parseInt(JOptionPane.showInputDialog("1.seguir 2.terminar"));

        while (h == 1)
        {


        System.out.printf("ingresse el primer valor");
        val1=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
        cal1.setValor1(val1);

        System.out.printf("ingresse el segundo valor");
        val2=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
        cal1.setValor2(val2);

        proceso=JOptionPane.showInputDialog("ingrese que desea hacer con los numeros");
         if (sum.equals(proceso)){
             JOptionPane.showMessageDialog(null,"el resltudado de la suma es "+ cal1.sum());

         }
         else if (div.equals(proceso)){
             cal1.div();

         }
         else if (m.equals(proceso)){
             JOptionPane.showMessageDialog(null, " el restulado de la multiplicacion es "+cal1.mult(val1,val2));

         } else if (res.equals(res)) {

             cal1.rest(val1,val2);
         }

         System.out.printf("muy buenos dias bienvenido");
         h=Integer.parseInt(JOptionPane.showInputDialog("1.seguir 2.terminar"));

         }

        JOptionPane.showMessageDialog(null,"adios");




    }
}
