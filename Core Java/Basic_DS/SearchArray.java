public class SearchArray {
    static boolean search_array(int[]arr,int check){
        boolean ans = false;
        for (int i = 0; i< arr.length; i++){
            if(arr[i]==check){
                ans=true;
                break;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {4,27,85,45,2,98,67,43,80,21,23,35,36,37,1};
        int valuetocheck = 98;
        boolean ans = search_array(arr, valuetocheck);
        if (ans==true){
            System.out.println("number is found:");
    
        }else{
            System.out.println("number is not found..");
        }
    }
}
