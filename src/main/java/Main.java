
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;



public abstract class Main {

    static String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
    static String fileNameCsv = "data.csv";
    static String fileNameCsvToJson = "data.json";
    static String fileNameXml = "data.xml";
    static String fileNameXmltoJson = "new_data.json";





    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        List<Employee> list = ParserCSV.parseCSV(columnMapping,fileNameCsv);
        String json = String.valueOf(ToJson.listToJson(list,fileNameCsvToJson));
        List<Employee> list1 = ParserXML.parserXML(fileNameXml);
        String json1 = String.valueOf(ToJson.listToJson(list1,fileNameXmltoJson));




    }
}







