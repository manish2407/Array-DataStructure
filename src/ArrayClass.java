public class ArrayClass {
    int[] arr = {10,20,30,40,50,40};            //declaring array using alternate method
    //traverse function
    public void traverseFunction(){
        for(int i =0; i<arr.length;i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }
    }
    //update function
    public void updateFunction(int item, int match){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==match){
                arr[i]=item;
            }
        }
    }
    //searching function
    public void searchFunction(int searchItem){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==searchItem){
                System.out.println("Element found at "+i+" index");
            }
        }
    }
    //insert function
    public void insertFunction(int insertItem, int position){
        int[] newArray = new  int[arr.length+1];
        for(int i =0; i<arr.length;i++){
            if(i==position){
                arr[i]=insertItem;
            }
        }
    }
    public static void main(String[] args) {
        ArrayClass arrobj = new ArrayClass();
        /*System.out.println("Array before insertion is----");
        arrobj.traverseFunction();*/

        /*System.out.println("Array after insertion is----");
        arrobj.updateFunction(80,40);
        arrobj.traverseFunction();*/

        //arrobj.searchFunction(40);

        /*inserting element in array
        int[] ar = new int[5];                      //declare array
        ar[0]=77;
        ar[1]=78;
        ar[2]=79;
        ar[3]=80;
        ar[4]=81;
        for(int i =0; i<ar.length;i++){
            System.out.println("Element at index "+i+" is "+ar[i]);
        }*/
    }
}

