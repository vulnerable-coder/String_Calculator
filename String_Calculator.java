import java.util.*;
class String_Calculator
{
    public int Add(String n,String x)
    {int k=0;
       String[] na=n.split(x);
       for(String a: na)
      { int p=Integer.parseInt(a);
    if(p<0)
    {k=p;   
      break;}
    k+=p;
    } return k;

    }
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        String num="";
       // String k=" ";
        String x="";
        num=in.nextLine();
      //  if(num.length()==0)
       // k="";
         if(num.substring(0,2).equals("//"))
      {  x=""+num.charAt(2);
    num="";} 
    num=in.nextLine();
       /* while(k.equals("")==false)
       {k=in.nextLine();
    num+=k+x;}*/
        String_Calculator ob=new String_Calculator();
       int k= ob.Add(num,x);
       if(k<=0)
       System.out.println("negatives not allowed :"+k); 
       in.close();
    }
}