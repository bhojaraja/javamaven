package javadem.javadem;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Addition of Two Mubers");
        
        Calculator calc=new Calculator();
        int result=calc.add(100, 200);
        System.out.println("Addition RESULT :"+result);
    }
}
