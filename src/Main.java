/**
 * Created by George Rokkos 24/01/2018
 */
public class Main {


    public static void main(String[] args) {
        BasicBlock genesisBlock = new BasicBlock("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        BasicBlock secondBlock = new BasicBlock("Yo im the second block",genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        BasicBlock thirdBlock = new BasicBlock("Hey im the third block",secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);

    }


}
