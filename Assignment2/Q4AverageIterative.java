class Q4AverageIterative{


  static double findaverage(int [] arr){
  int sum =0;
  
  
  for(int i = 0; i < arr.length; i++){
  sum += arr[i];
  
  
  }
  return (double) sum/arr.length;
  
  
  
  }
  public static void main(String[] agrs){
  
  int [] numbers ={10,20,30,40,50};
  
  double average = findaverage(numbers);
  
  System.out.println("average of array elements is " + average);
  
  
  }





}