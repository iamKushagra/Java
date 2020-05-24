    public class BubbleSort {  
        static void bubbleSort(int[] b) {  
            int n = b.length;  
            int temp = 0;  
             for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++)
                     {  
                              if(b[j-1] > b[j])
                              {  
                                     temp = b[j-1];  
                                     b[j-1] = b[j];  
                                     b[j] = temp;  
                             }  
                              
                     }  
             }  
      
        }  
        public static void main(String[] args) {  
                    int b[] ={3,60,35,2,451,320,5};  
                     
                    System.out.println("Array Before Bubble Sort");  
                    for(int i=0; i < b.length; i++){  
                            System.out.print(b[i] + " ");  
                    }  
                    System.out.println();
                    bubbleSort(b);
                     
                    System.out.println("Array After Bubble Sort");  
                    for(int i=0; i < b.length; i++)
                    {  
                            System.out.print(b[i] + " ");  
                    }  
       
            }  
    }  