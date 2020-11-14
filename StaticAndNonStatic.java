package day1;

public class StaticAndNonStatic {
    public void nonStaticTEST() {
        char c = 'F';
        boolean l= true;
        System.out.println(c);
        System.out.println(l);
    }

    public static void staticTest(){
        int a=10;
        double d=20.5;
        System.out.println(a+d);


    }
public static void main(String[]args){
        StaticAndNonStatic sbj=new StaticAndNonStatic();
        sbj.nonStaticTEST();
        staticTest();
    }







}
