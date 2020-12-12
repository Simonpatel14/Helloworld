package oopsconcept;

public class MethodsDemo {



    public static void main(String[] args){
       methodNum();
      MethodsDemo Category = new MethodsDemo();
      Category.gradeMethod();



    }
    public static void methodNum(){
         String a = "Hello World!!!";
         System.out.println(a);
    }
    public void gradeMethod(){
        String studentName = "John";
        int score = 90;
        String grade;
        if (score >=90 && score <=100){
           grade = "A";}
        else if (score >=80 && score <=90){
            grade = "B";}
        else if (score >=70 && score <=80){
            grade = "C";}
        else {
            grade = "D";
        }
        System.out.println("Grade of   "  + studentName  + "  is:  "  + grade);

        studentName = "Tom";
        score = 80;
        if (score >=90 && score <=100){
            grade = "A";}
        else if (score >=80 && score <=90){
            grade = "B";}
        else if (score >=70 && score <=80){
            grade = "C";}
        else {
            grade = "D";
        }
        System.out.println("Grade of   "  + studentName  + "  is:  "  + grade);


    }






}
