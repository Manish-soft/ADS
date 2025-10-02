


class Q1UsingIterative{


public static int findmaxelement(int[] arr){

int max = arr[0];

for(int i=1; i<arr.length; i++){

if(arr[i]> max){
 max = arr[i];

}


}
    return max;


}

public static void main(String[] agrs){

  int [] numbers1 = {10,25,7,3,19};
  int [] numbers2 = {-5,-10,-3,-20,-7};
  
  System.out.println("number1 is " + findmaxelement(numbers1));
   System.out.println("number2is " + findmaxelement(numbers2));


}



}