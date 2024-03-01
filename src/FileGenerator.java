import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        FileWriter newFile = new FileWriter(address.cep() + ".json");
        newFile.write(gson.toJson(address));
        newFile.close();
    }
}
