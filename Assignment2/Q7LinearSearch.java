class Q7LinearSearch{

 public static int linearserach(int[] arr,int searchElement){
 
 for(int i=0; i< arr.length; i++){
 if(arr[i] == searchElement){
 return i;
 
 
 }
 
 
 }
 return -1;
 
 
 }
 
 public static void main(String[] aegs){
 
 int[] arr={10,20,30,40,50};
 int searchElement = 30;
 
 int result = linearserach(arr, searchElement);
 
 if(result != -1){
 
 System.out.println("element found at index" + result);
 }else{
 System.out.println("element not found in the array");
 
 }
 
 
 }




}