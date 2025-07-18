//IdimArray.java
public class IDimArray{
public static void main(String args[]){

//example on static array
//declare int array size of 5
int i[]=new int[5];
//initialize array variables
i[0]=1;i[1]=2;i[2]=3;i[3]=4;i[4]=5;

//dynamic array declaration and initialization
int[] j = {5,2,1,4,3};

//accessing values from array
//using length and index
int len1=i.length;
for(int k=0;k<len1;k++){
if(k==3)
continue;
else

System.out.print(i[k]+" ");
}
System.out.println();

//using for-each loop
  for(int k : j){
     System.out.print(k+" ");
   }
System.out.println();

//using stream(j)
//Array.stream(j)
//.sorted()
//.forEach(System.out::println);
}
}
