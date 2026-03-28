public class removeduplicatessintegers {
    public static void main(String[] args) {
        
        int arr[] = {12, 1, 2, 12, 15};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(arr[i] + " ");
            }
        }
       // System.out.println(arr[i]+"");
    }
}
      
    
    

