import java.util.*;
public class pattern1{
public static void main(String[] args){
int i,j;
int n=5;
for(i=0;i<n;i++){

for(j=2*(n-1-i);j>=0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}



for(i=0;i<n;i++){
for(j=(n-1-i);j>=0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}

for(i=n;i>=0;i--){
for(j=(n-1-i);j>=0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}











}
}