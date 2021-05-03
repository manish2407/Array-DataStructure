public class ObjectClassArray {
    private ObjectClass[] arr;                  //reference to array
    private int Nelements;
    public ObjectClassArray(int size){
        arr = new ObjectClass[size];
        Nelements =0;
    }
    public void insert(String First, String Last, int age1){
        arr[Nelements] = new ObjectClass(First, Last,age1);
        Nelements++;
    }
    public  void search(String searchname){
        int j;
        for (j = 0; j < Nelements ; j++) {
            if (arr[j].getLastName().equals(searchname)) {
                System.out.println("Object found at " + j + " position");
                break;
            }
        }
        if(j==Nelements){
            System.out.println("Object is not present in array");
        }
    }
    public  void delete(String searchname){
        int k;
        for (k = 0; k < Nelements ; k++) {
            if (arr[k].getLastName().equals(searchname)) {
                break;
            }
        }
        if(k==Nelements){
            System.out.println("Element not found");
        }
        else{
            for(int l=k; l<Nelements - 1; l++) {
                arr[l] = arr[l + 1];
            }
            Nelements--;
        }

    }
    public void display(){
        for (int i = 0; i < Nelements ; i++) {
            arr[i].display();
        }
    }
}
