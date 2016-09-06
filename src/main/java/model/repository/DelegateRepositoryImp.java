package model.repository;

import model.objects.Delegate;

import javax.validation.constraints.NotNull;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quentin on 9/6/16.
 */
public class DelegateRepositoryImp implements DelegateRepository {

    static final String FILE_PATH = "/Users/HereWegoR/Desktop/delegates.txt";

    @Override
    public List<Delegate> getDelegates() throws IllegalStateException {
        List<Delegate> result = new ArrayList<>();
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Object temp = null;
            while ((temp = in.readObject()) != null) {
                result.add((Delegate) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Delegate findDelegateByNation(String nation) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Delegate findDelegateByName(String name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void updateDelegates(@NotNull List<Delegate> delegates) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            for (Delegate delegate :
                    delegates) {
                out.writeObject(delegate);
            }
            out.writeObject(null);
        } finally {
            out.close();
        }
    }
}
