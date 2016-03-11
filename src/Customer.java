import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam158 on 11.03.2016.
 */

    @XmlRootElement

    public class Customer {

        String name;

        Integer age;

        int id;

        String phone;

        List<String> phones;
        List<String> phone_bis;
    @XmlTransient
        String ppd="";

    public List<String> getPhones() {
        return phones;
    }

    @XmlElementWrapper(name = "phones")
    @XmlElement(name = "phone")
    @XmlJavaTypeAdapter(PhoneAdapter.class)
    public void setPhones(List<String> phones) {
        if(phones.size()>0){
            if(phone_bis==null){
                phone_bis= new ArrayList<String>(phones.size());
            }
            for(String p:phones){
                phone_bis.add(p + "_bis");
            }
        }
        this.phones = phones;
    }




    public String getName() {
            return name;
        }

        @XmlElement
        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        @XmlElement
        @XmlJavaTypeAdapter(IntegerWithoutNull.class)
        public void setAge(Integer age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        @XmlAttribute
        public void setId(int id) {
            this.id = id;
        }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", phones=" + phones +
                ", phone_bis=" + phone_bis +
                ", ppd='" + ppd + '\'' +
                '}';
    }
}

