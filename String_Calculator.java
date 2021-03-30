import java.util.*;
class String_Calculator
{
    public int Add(String n)
    {int k=0;
        if(n.length()!=0)
       {
           if(n.indexOf(',')==-1)
           k=Integer.parseInt(n);
           else
           {
               int a=Integer.parseInt(n.substring(0,n.indexOf(',')));
               int b=Integer.parseInt(n.substring(n.indexOf(',')+1,n.length()));
               k=a+b;
           }
       }
        return k;

    }
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        String num=in.nextLine();
        String_Calculator ob=new String_Calculator();
        System.out.println(ob.Add(num));
        in.close();
    }
}