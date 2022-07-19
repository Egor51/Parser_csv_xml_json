import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ToJson {
    public static List<Employee> listToJson(List<Employee> list,String fileName) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        Type listType = new TypeToken<List<Employee>>() {
        }.getType();
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(gson.toJson(list, listType));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
