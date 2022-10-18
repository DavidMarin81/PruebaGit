package sax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import model.Persona;
import org.xml.sax.SAXException;


public class VersionesSAX {

   
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        saxParserFactory.setNamespaceAware(true);
        SAXParser saxParser = saxParserFactory.newSAXParser();
        File file = new File(Paths.get("src", "sax", "personas.xml").toString());
        PersonasHandler handler = new PersonasHandler();
        saxParser.parse(file, handler);
        
        ArrayList<Persona> personas = handler.getPersonas();
        
        for (Persona p : personas){
            System.out.println(p);
        }
    }
    
}
