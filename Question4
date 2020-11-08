import java.util.StringTokenizer;
import java.util.Scanner;
public class Daynumber{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the date  with format 10-02-2030"); 
String  date =sc.next();
String date1=null;
StringTokenizer st = new StringTokenizer(date,"-");
while(st.hasMoreTokens()){
date1=st.nextToken()+date1;
}
int result=daynumbercalculation(date1);
System.out.println(result);
}

static int  daynumbercalculation(String date){
int result=0;
int count=0;
int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
int day=Integer.parseInt(date.substring(0,2));
int month=Integer.parseInt(date.charAt[3]);
int year=Integer.parseInt(date.substring(4,8));
if(year%4 ==0||year%100==0||year%400==0)
{
count++;
}
for (int i =month-1;i>=0;i--){
day=day+arr[i]+count;
}
return result;
}
}


