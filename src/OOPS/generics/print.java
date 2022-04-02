package OOPs.generics;

public class print {

    //public static<T extends motor> void printArray (T arr[]){         // very restrictive , as it works only for the extended class
    public static <T extends printInterface> void  printArray(T arr[]){
        for (int i =0 ; i< arr.length; i++){
            arr[i].print();
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        /*Integer arr[] =  new Integer[5];                          // because the constraints are integers or strings cannot be passed
        for (int i =0; i<arr.length; i++ ){                         // as data stored in classes bounded to the generic methods need to
            arr[i] = i +1;                                          // be printed.
        }
        printArray(arr);

        String arr1[] =  new String[5];
        for (int i =0; i<arr.length; i++ ){
            arr1[i] = "asd";
        }
        printArray(arr1);*/

        motor m[] = new motor[5];
        for (int i =0; i<m.length; i++ ){
            m[i] = new motor(10*i , "BMW");
        }
        printArray(m);

        student s[]= new student[5];
        for (int i =0; i<s.length; i++ ){
            s[i] = new student(10*i+1);
        }
        printArray(s);


    }
}
