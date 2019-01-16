import java.util.*;
class assessment{
public static void main(String[] args)
{
double n,a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Total number of calls in this month");
n=sc.nextInt();
a=300;
if(n<=120){
System.out.println(a);
}
else if(n>120 && n<190){
b=n-120;
a=a+b*1;

System.out.println(a);
}
else if(n>190 && n<240){
b=n-190;
a=a+(1*70)+(0.8*b);
System.out.println(a);

}
else{
b=n-240;
a=a+(1*70)+(0.8*50)+(0.4*b);
System.out.println(a);

}

}
}