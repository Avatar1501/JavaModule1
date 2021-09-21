public class bikers {
    public static void main(String args[])
    { float b1=21,b2=22,b3=23,b4=24,b5=25,average;
      average = (b1+b2+b3+b4+b5)/5;
        System.out.println("Speed of qualifying racers: " +average);
        if(b1>average)
            System.out.println("b1 has qualified.");
        if(b2>average)
            System.out.println("b2 has qualified.");
        if(b3>average)
            System.out.println("b3 has qualified.");
        if(b4>average)
            System.out.println("b4 has qualified.");
        if(b5>average)
            System.out.println("b5 has qualified.");
    }
}
