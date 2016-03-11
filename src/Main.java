import com.sun.jmx.remote.internal.Unmarshal;
import com.sun.xml.internal.ws.util.Pool;
import entity.DocumentsEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {



    static class Ddr extends Unmarshaller.Listener{
        public Ddr(){
            super();
        }
        @Override
        public void afterUnmarshal(Object target, Object parent) {
            System.out.println("cdcdcdcdc");
            super.afterUnmarshal(target, parent);
        }
    }



    public static void main(String[] args) {

        try {

            File file = new File("D:\\dev\\tests\\testJaxB-master\\src\\test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DocumentsEntity.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            jaxbUnmarshaller.setListener(new Ddr());
            DocumentsEntity documents = (DocumentsEntity) jaxbUnmarshaller.unmarshal(file);
            System.out.println(documents);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
