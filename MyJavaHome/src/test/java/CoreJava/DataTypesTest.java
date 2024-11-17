package CoreJava;

public class DataTypesTest {

    public static void main(String[] arg){
        // int type --> takes n= 4 bytes --> range -2^N to 2^N -1
        int a=10;

        // byte type --> takes n= 2 bytes --> range -2^N to 2^N -1
        byte b=20;
        // Float type --> takes n= 4 bytes --> range -2^N to 2^N -1 with DECIMALS
        float c=99.01f;

        // Double type --> takes n= 8 bytes --> range -2^N to 2^N -1 with decimal followed by d
        double age=111111d;

        // Short type --> takes n= 2 bytes --> range -2^N to 2^N -1
        short z= 888;

        // char type --> takes n= 8 bytes --> range -2^N to 2^N -1 with CHARACTERS
        char Ch='A';

        // Boolean type --> takes true or false --> range depends on JVM
        boolean man=true;


        int sum1 = a+b;
        int div1 = b/a;
        System.out.println("bollean is"+div1);
        System.out.println(man);
        System.out.println("sum is "+sum1);
    }


}
