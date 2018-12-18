package OS;

import java.util.*;

public class LRU{

    boolean isPresent(int arr[],int item){

        boolean b = false;
        for(int i=0;i<4;i++){
            if(arr[i]==item){
                b=true;
                break;
            }
        }

        return b;
    }

    public void shift(int arr[],int item){
        int index = 1;

        int temp[] = new int[4];

        for(int i = 0; i<arr.length;i++){
            if(item == arr[i]){
                temp[0] = arr[i];
                continue;
            }
            temp[index++] = arr[i];
        }

        for(int i = 0;i<arr.length;i++)
            arr[i] = temp[i];
    }

    public void replace(int arr[],int item){

        for(int i = 3; i>=0;i--){
            if(arr[i]==0){
                arr[i] = item;
                break;
            }
        }
    }


    public boolean iszero(int arr[]){
        boolean b = false;
        for(int i = 0;i<4;i++){
            if(arr[i]==0){
                b = true;
                break;
            }
        }
        return b;
    }



    public void display(int arr[]){
        System.out.println("\n_____");
        for(int i = 0;i<arr.length;i++)
            System.out.println("| "+arr[i]+" |");
        System.out.println("_____");

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        LRU h = new LRU();
        int hh = 0;
        int mm = 0;

        int cache[] = new int[4];

        int x = 1;

        while(x!=0){
            x=sc.nextInt();

            if(x==0)
                break;

            if(h.isPresent(cache,x)){
                h.shift(cache,x);
                h.display(cache);
                hh++;
            }
            else if(h.iszero(cache)){
                h.replace(cache,x);
                h.display(cache);
                mm++;
            }
            else{
                cache[3]=x;
                h.display(cache);
                mm++;
            }
        }

        double hratio = ((double)hh/(hh+mm))*100;

        System.out.println("Hit Ratio = "+hratio);

    }
}
        
        