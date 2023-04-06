public class SyntaxLecture {

    public static void main(String[] args) {
//        Declaring Variable without initializing
        int weight;
        //initialization after declaration
        weight = 12;
        // Initialize and declare all at once
        String breed = "Toy Spaniel";
        String name = "Grinch";
        int cuteness = 10;
        // A Statement;
        //"JVM, do soemthing"
//        System.out.println(name + " is a " + breed);
//        System.out.println(cuteness + name);

        //very small number : byte datatype
        byte smol = 12;
//        System.out.println(smol);
        // declare a long: ca hold very big numbers
        long bigNumber;
        //assign the small value to the large variable
        // "pour smol buvket into lorge bucket
        bigNumber = smol;
//        System.out.println(bigNumber);
        // assign a big value to the big bucket
        bigNumber = 90000000000L;
////        This wint work: assigning a big value to a smaller type
//        smol = bigNumber
////                casting : converting one data type into another
        smol = (byte) bigNumber;
//        System.out.println(smol);

        // float has 4 bytes of storage space
        float imaFloat;
        // double : has 8 bytes of storage
        double imaDouble = 9.0123456789012;
//        I cant fit a double inside a float
//        imaFloat = imaDouble;
//        System.out.println(imaDouble);
        imaFloat = (float) imaDouble;
//        System.out.println(imaFloat);
    }


}
