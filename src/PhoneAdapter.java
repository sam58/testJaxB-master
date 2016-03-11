import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created by sam158 on 11.03.2016.
 */
public class PhoneAdapter extends XmlAdapter<String,String> {
    @Override
    public String unmarshal(String v) throws Exception {
        return v;
    }

    @Override
    public String marshal(String v) throws Exception {
        return v;
    }
}
