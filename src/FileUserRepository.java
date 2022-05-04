import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUserRepository
implements UserRepository {

    @Override
    public void insert(User user) {
        List<User> users = findAll();
        users.add(user);
        File file = new File("users.bin");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
