public class Main {

    public static void main(String[] args) {
        //1
        int a=6,b=10;
        System.out.println("sum is:" +(a+b));
        System.out.println("sub is: " +(a-b));
        System.out.println("mult is:" +(a*b));
        System.out.println("div is: " +(b/a));
        System.out.println("mod is:" +(b%a));

        //2
        int value = 22;
        System.out.println("Initial Value: " + value);
        System.out.println("After Increment: " + (++value));
        System.out.println("After Decrement: " + (--value));

        //3
        int N = 6;
        System.out.println("Is >0: " + (N > 0));

        //4
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        while (count > 1) {
            System.out.print(--count + " ");
        }
        System.out.println();
        //5
        int nr = 9;
        nr += 5;
        System.out.println("+= " + nr);
        nr -= 3;
        System.out.println("-= " + nr);
        nr *= 2;
        System.out.println("*= " + nr);
        nr /= 2;
        System.out.println("/= " + nr);
        nr %= 2;
        System.out.println("%= " + nr);


        //6
        int x=22,y=20;
        if(x>y)
            System.out.println("x mai mare ca y");

        else if(x<y)
            System.out.println("x mia mic ca y ");
        else
            System.out.println(("x=y"));

        //7
        int q=12 ;
        double s=15.0d;
        System.out.println("sum is :" +(q + s));

        //8
        byte n1=2,n2=4 ;
        byte sumz= (byte)(n1+ n2);
        System.out.println( "sum is " + sumz);

        //9
        int lungime=6,latime=7;
        System.out.println("aria este : " + (lungime*latime));

        //10
        int number= 7;
        System.out.println( "reverse n is :" + (-number));

        //11
        boolean val1=true ,val2=false ;
        System.out.println("negation1 : " +!(val1));
        System.out.println("negation2 : " +!(val2));

        //12
         int aux =65;
        System.out.println("val is :" + aux );
        System.out.println( "val +1 :"+ ++aux);
        System.out.println( "val -1 :" + --aux);

        //13
         double pret  =245d ;
          double reducere= pret /25;
         double pretfinal = pret - reducere ;
        System.out.println( "pret final este : "+ pretfinal);

        //14
          int lastval =77;
        System.out.println(" numar este cuprins intre 0 si 100 : "+ (0<=lastval && lastval <=100));



    }
}