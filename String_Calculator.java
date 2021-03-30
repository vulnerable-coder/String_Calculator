import java.util.*;
class String_Calculator
{
    public int Add(String n)
    {int k=0;
       String[] na=n.split("[, ]");
       for(String a: na)
       k+=Integer.parseInt(a);
        return k;

    }
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        String num="";
        String k=" ";
        
        while(k.equals("")==false)
       {k=in.nextLine();
    num+=k+" ";}
        String_Calculator ob=new String_Calculator();
        System.out.println(ob.Add(num));
        in.close();
    }
}