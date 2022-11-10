package runner;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Hooks {

    public static void getData(DataTable dt) {
        List<Map<String, String>> data = dt.asMaps(String.class, String.class);

        for(Map<String, String> map : data){
            for(Map.Entry<String, String> entry : map.entrySet()){
                System.out.format("| Key: %s - Value: %s |\n", entry.getKey(), entry.getValue());
            }
        }
    }
}
