import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        try {
//            FileOutputStream fos = new FileOutputStream("E:\\JAVACORE\\BinaryFile\\src\\binary.txt") ;
//            DataOutputStream dos = new DataOutputStream(fos);
//            for (int i = 0; i < arr.length ; i++) {
//                dos.writeInt(arr[i]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fis = new FileInputStream("E:\\JAVACORE\\BinaryFile\\src\\binary.txt");
            DataInputStream dis = new DataInputStream(fis);
            while (true) {
                System.out.println(dis.readInt());
            }

        }catch (EOFException e1){

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}