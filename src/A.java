public class A {
    public static void main(String[] args) {
        fun();
    }

    A other;
    static void fun(){
        String b = "Hola";
        String a = "Hola";

       System.out.print( "Hola".equals(b));
        System.out.print( a == b);

    }
}
