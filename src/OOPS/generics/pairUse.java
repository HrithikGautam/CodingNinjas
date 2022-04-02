package OOPs.generics;

import OOPs.interfaces.Vehicle1;

public class pairUse {

    public static void main(String[] args) {

        pair<String, Integer> pInner = new pair<String, Integer>();
        pair<pair<String,Integer> , String>  p =  new pair<>();
        p.setFirst(pInner);
        System.out.println(p.getFirst());
        System.out.println(p.getFirst().getFirst());    // to access the first element of the pair object
        System.out.println(p.getFirst().getSecond());   // to access the second element of the pair object

//        p.setSecond("abcd");
//        System.out.println(p.getSecond());

//        pair<String , Integer>  pSI =  new pair<String , Integer>("ab", 10);


        int i =10;          // primitive data type , creates variable i     || cannot be null
        Integer i1 = 10;    //reference which points to i1 value            || can write null here

//        pair p = new pair(10,20);
//        p.setFirst("aa");
//        p.setFirst(10);
//        String f =(String) p.getFirst(); //(not recommended to do forget mentioning type of object for generics class.

//        System.out.println(p.getFirst() + " " + p.getSecond());
/*
        pair<String> ps = new pair<String>("aa","bb");
        System.out.println(ps.getFirst() + " " + ps.getSecond());
        ps.setFirst("string 1");

        pair<Double> pd = new pair<Double>(3.1,4.3);
        System.out.println(pd.getFirst() + " " + pd.getSecond());

//        pair<int> p = new pair<int>(10,20);         // primitive data type is not allowed.

        pair<Integer> pI = new pair<Integer>(10,20);     // wrapper class is used in case of primitive data type.
        System.out.println(pI.getFirst() + " " + pI.getSecond());

//        pair<Vehicle1 pV = new pair<Vehicle1>(new Vehicle1(), new Vehicle1()); //can even use a class


 */
    }
}
