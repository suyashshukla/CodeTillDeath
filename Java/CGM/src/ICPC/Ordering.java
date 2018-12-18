package ICPC;

import java.util.*;

class Ordering{

    boolean isgreater(int a[],int b[],int c[],int signal){
        int count=0;
        for(int i = 0;i<3;i++){
            if(signal==1){
                if(a[i]>b[i] && a[i]>c[i]){
                    count=1;
                    break;
                }
            }
            else if(signal==2){
                if(b[i]>c[i] && b[i]>a[i]){
                    count=1;
                    break;
                }
            }
            else if(signal==3){
                if(c[i]>a[i] && c[i]>b[i]){
                    count=1;
                    break;
                }
            }
        }

        if(count==1)
            return true;
        else
            return false;


    }



    public static void main(String args[]){

        Ordering o = new Ordering();

        int test=0;
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();

        int a[]=new int[3];

        int b[]=new int[3];

        int c[]=new int[3];

        while(T>0){

            for(int i=0;i<3;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<3;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<3;i++){
                c[i]=sc.nextInt();
            }

            int flag=0;

            for(int i=0;i<3;i++){

                if(a[i]>=b[i] && a[i]>=c[i] && o.isgreater(a,b,c,1))
                    flag++;
                test=1;
            }


            if(flag!=3){
                flag=0;

                for(int i=0;i<3;i++){

                    if(b[i]>=c[i] && b[i]>=a[i] && o.isgreater(a,b,c,2))
                        flag++;
                    test=2;
                }
            }

            if(flag!=3){
                flag=0;
                for(int i=0;i<3;i++){
                    if(c[i]>=a[i] && c[i]>=b[i] && o.isgreater(a,b,c,3))
                        flag++;
                }
                test=3;
            }

            int count=0;

            for(int i=0;i<3;i++){
                if(test==1){
                    if(b[i]>c[i])
                        count++;
                }
                else if(test==2){
                    if(a[i]>c[i])
                        count++;
                }
                else if(test==3){
                    if(b[i]>a[i])
                        count++;
                }
            }

            if(count<1){
                count=0;
                for(int i=0;i<3;i++){
                    if(test==1){
                        if(b[i]<c[i])
                            count++;
                    }
                    else if(test==2){
                        if(a[i]<c[i])
                            count++;
                    }
                    else if(test==3){
                        if(b[i]<a[i])
                            count++;
                    }
                }
            }

            if(flag==3 && count>=1)
                System.out.println("yes");
            else
                System.out.println("no");

            T--;
            flag=0;


        }
    }
}
        