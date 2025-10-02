class Q2FindMin {

public static int findminelement(int[] arr){

int min = arr[0];




for(int i = 1; i< arr.length; i++){

 if(arr[i] < min){
 
 min = arr[i];
 }

}

return min;
}

public static void main(String[]agrs){

int[] numbers1 ={15,8,22,5,19};
int[] numbers2 ={-4,-15,-7,-2,-30};

System.out.println("min of numbers1" + findminelement(numbers1));
System.out.println("min of numbers2" + findminelement(numbers2));


}












}

