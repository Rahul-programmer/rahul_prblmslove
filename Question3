public class longestCollatzSequence{
public static void main(String[]args){
int length_sequence=0;
long num=0;
int max=1;
int max_i=0;
for (int i=1;i<=1000000;i++){
num=i;
while (num!=1){
length_sequence++;
if (num%2==0)
num =num/2;
else
num=3*num+1;
}

if(length_sequence>max){
max=length_sequence;
max_i=i;
}
}

System.out.println(max_i);
}
}
