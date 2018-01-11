package booleanlog;

public class BooleanLog {

    public static void main(String[] args) {
        // application of logical operations;
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("  а =  " + a);
        System.out.println("  b =  " + b);
        System.out.println(" a|b =  " + c);
        System.out.println(" а&Ь =  " + d);
        System.out.println(" a^b =  " + e);
        System.out.println("(!a&b)|(a&!b) =  " + f);
        System.out.println("!а =  " + g);

    }

}
