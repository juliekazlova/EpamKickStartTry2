package geometry.com.epam.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataReader {

    public List<String> getData(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path)).useDelimiter(";").useLocale(Locale.US);
        try {
            List<String> list = new ArrayList<>();

            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
            return list;
        } finally {
            scanner.close();
        }
    }

}
