import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFile<E> {
    public List<E> readFromFile(String path){
        List<E> list = new ArrayList<>();
        File file = null;
        FileInputStream fis = null;
        ObjectInputStream ois =null;
        try {
            file = new File(path);
            if (!file.exists()) {
                return list;
            }
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            list = (List<E>) ois.readObject();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois!=null){
                    ois.close();
                }
            }catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return list;
    }

    public void writeToFile(String path, List<E> list){
        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos =null;
        try {
            file = new File(path);
            if (!file.exists()) {
               file.createNewFile();
            }
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos!=null){
                    oos.close();
                }
            }catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
