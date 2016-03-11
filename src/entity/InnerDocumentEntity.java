package entity;


import entity.Adapters.AddresseeAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by smasalykin on 04.03.2016.
 */
@XmlRootElement(name = "InnerDocument")
public class InnerDocumentEntity extends NativeDocumentEntity {

    /* Адресаты */
    private List<String> addresseeIds = new ArrayList<String>();
    private List<String> addressees;

    /* Статус предписания */
    private String prescriptionStatus;


    public List<String> getAddressees() {
        if(addressees == null) {
            return null;
        }
        return Collections.unmodifiableList(addressees);
    }

    @XmlElementWrapper(name="addressees")
    @XmlElement(name="addressee")
    @XmlJavaTypeAdapter(AddresseeAdapter.class)
    public void setAddressees(List<String> addressees) {
        if(addressees.size() >0){
            for(String addr:addressees){
                addresseeIds.add(addr);
            }
        }

        this.addressees = addressees;
    }


    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    @XmlElement(name="prescriptionStatus")
    public void setPrescriptionStatus(String prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
    }


    public List<String> getAddresseeIds() {
        if(addresseeIds == null) {
            return null;
        }
        return Collections.unmodifiableList(addresseeIds);
    }

    public void setAddresseeIds(List<String> addresseeIds) {
        this.addresseeIds = addresseeIds;
        if(addresseeIds!=null && addresseeIds.size()>0 ){
            processAddressees();
        }else{
            this.addresseeIds = Collections.EMPTY_LIST;
        }
    }

    /**
     * Заоплняет список addresseeIds из данных
     */
    private void processAddressees(){
            // TODO processAddressees
            this.addresseeIds = Collections.EMPTY_LIST;
    }

}
