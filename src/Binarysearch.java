public class Binarysearch {
    int a[]={11,22,33,44,55,66,77,88,99};
    int SearchItem = 44;

    public void find(){
        int lowerbound = 0;
        int upperbound = a.length-1;
        while(true) {
            int mid = lowerbound + upperbound / 2;
            if(a[mid]==SearchItem){
                System.out.println("Element found at "+mid+" position");
            }
            else if(lowerbound > upperbound){
                System.out.println("Element not present in the given array");
            }
            else {
                if(a[mid]>SearchItem){
                    upperbound=mid-1;
                }
                if(a[mid]<SearchItem){
                    lowerbound=mid+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Binarysearch BS = new Binarysearch();
        BS.find();
    }
}
