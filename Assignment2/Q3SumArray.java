class Q3SumArray{

static int findsum(int[] arr){
 int sum = 0;
 
 
 
 
 for(int i=0;i<arr.length;i++){
 sum += arr[i];
 
 
 }

return sum;


}

public static void main(String[] agrs){

int [] number1 = {1,2,3,4,5};
int [] number2 = {-1,2,-3,4,-5};

System.out.println("sum of number1 is :"  + findsum(number1));
System.out.println("sum of numbers2 is :" + findsum(number2));



}


}