package design.singelton;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance;
    List<String> names;

    private  Database() {
        names = new ArrayList<>();
    };

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

}
