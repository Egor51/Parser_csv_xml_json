import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserXML {

<<<<<<< HEAD
=======

>>>>>>> a3fce1f25c18933b4fb88877da5ff625e8ad1c09
    public static List<Employee> parseXML(String fileName) throws IOException, SAXException, ParserConfigurationException {
        List<Employee> staff = new ArrayList<>();
        try {

            File file = new File(fileName);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            NodeList nodeLst = doc.getElementsByTagName("employee");


            for (int s = 0; s < nodeLst.getLength(); s++) {
                Node fstNode = nodeLst.item(s);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    // id
                    Element fstElmnt = (Element) fstNode;
                    NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("id");
                    Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
                    NodeList fstNm = fstNmElmnt.getChildNodes();
                    String ID = ((Node) fstNm.item(0)).getNodeValue();
                    System.out.println("id : " + ID);

                    //firstName

                    NodeList lstNmElmntLst2 = fstElmnt.getElementsByTagName("firstName");
                    Element lstNmElmnt2 = (Element) lstNmElmntLst2.item(0);
                    NodeList lstNm2 = lstNmElmnt2.getChildNodes();
                    String FirstName = ((Node) lstNm2.item(0)).getNodeValue();
                    System.out.println("firstName : " + FirstName);

                    //lastName

                    NodeList lstNmElmntLst3 = fstElmnt.getElementsByTagName("lastName");
                    Element lstNmElmnt3 = (Element) lstNmElmntLst3.item(0);
                    NodeList lstNm3 = lstNmElmnt3.getChildNodes();
                    String LastName = ((Node) lstNm3.item(0)).getNodeValue();
                    System.out.println("lastName : " + LastName);

                    //country

                    NodeList lstNmElmntLst4 = fstElmnt.getElementsByTagName("country");
                    Element lstNmElmnt4 = (Element) lstNmElmntLst4.item(0);
                    NodeList lstNm4 = lstNmElmnt4.getChildNodes();
                    String Country = ((Node) lstNm4.item(0)).getNodeValue();
                    System.out.println("country : " + Country);

                    //age

                    NodeList lstNmElmntLst5 = fstElmnt.getElementsByTagName("age");
                    Element lstNmElmnt5 = (Element) lstNmElmntLst5.item(0);
                    NodeList lstNm5 = lstNmElmnt5.getChildNodes();
                    String Age = ((Node) lstNm5.item(0)).getNodeValue();
                    System.out.println("age : " + Age);

                    //toList

                    Employee employee = new Employee(Long.parseLong(ID), FirstName, LastName, Country, Integer.parseInt(Age));
                    staff.add(employee);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return staff;
    }
}






