import entity.DocumentsEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        try {

            File file = new File("D:\\dev\\tests\\testJaxB-master\\src\\test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentsEntity.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            DocumentsEntity documents = (DocumentsEntity) jaxbUnmarshaller.unmarshal(file);
            System.out.println(documents);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
