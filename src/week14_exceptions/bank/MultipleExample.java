package week14_exceptions.bank;

public class MultipleExample {
    public static void main(String[] args) {



        try {
        }catch (StringIndexOutOfBoundsException e){

        }catch (NullPointerException e){

        }catch (ArrayIndexOutOfBoundsException e){

        }
        //variation
        try{

        }catch (IndexOutOfBoundsException e){

        }
        //variation
        try{
            int[] a={1,3,4};
            a[100]=10;

            int[] b=null;
            b[0]=1;
        }catch (NullPointerException| IndexOutOfBoundsException e){

        }
    }
}
