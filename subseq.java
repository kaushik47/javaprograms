public class subseq{
public static void main(String[] args)
{


String str="This is Kaushik";

System.out.println(str.subSequence(0,7));


String str1=str.concat("jhaver");

System.out.println(str1);
System.out.println(str);



StringBuffer st=new StringBuffer("This is Kaush");
StringBuffer st1=st.append("jhave");
System.out.println(st1);
System.out.println(st);

}

}