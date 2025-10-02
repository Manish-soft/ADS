class Q5ReverseArray{

static void printreverse(int [] arr){

for (int i = arr.length -1; i >=0;i--){

System.out.print(arr[i]);
if(i !=0){

}


}




}


public static void main(String[] agrs){

int [] arr1 ={1,2,3,4,5};
int [] arr2 ={-1,2,-3,4,-5};

System.out.print("Reverse arr1 is");
printreverse(arr1);

System.out.print("Reverse arr2 is");
printreverse(arr2);





}

}