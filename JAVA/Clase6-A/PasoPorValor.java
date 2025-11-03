
package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX= 20;
        System.out.println("valorX = " + valorX);
        CambioValor(valorX);//Solo enviamos una copia
    }
    public static void CambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
}
}
