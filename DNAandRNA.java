import java.util.Scanner;
public  class Q1{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the DNA sequence");
String DNA = sc.next();
String st =" ";
DNA=DNA.toUpperCase();
int flag =0;
for (int i=0;i<DNA.length();i++){
if (DNA.charAt(i)=='G')
{
st=st+'C';
}
else if (DNA.charAt(i)=='C')
{
st=st+'G';
}
else if(DNA.charAt(i)=='T')
{
st=st+'A';
}
else if(DNA.charAt(i)=='A')
{
st=st+'U';
}
else
{
System.out.println("Invalid Input ");
flag=1;
break;
}
}
if(flag==0){
System.out.println(st);
}
}
}


