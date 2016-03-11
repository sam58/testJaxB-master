package entity;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author lukyanyukdv
 *
 */

@XmlRootElement(name = "CitizenDocument")
@XmlAccessorType(XmlAccessType.FIELD)
public class CitizenDocumentEntity extends DocumentEntity implements GeographicData,Serializable {

    @XmlElement(name = "incomingDate")
    protected Date incomingDate;

    @XmlElement(name = "repeatAppeal")
    @XmlElementWrapper(name = "repeatAppeals")
    protected List<String> repeatAppeals;

    @XmlElement(name = "corrRegion")
    protected String corrRegion;

    @XmlElement(name = "corrArea")
    protected String corrArea;


    @XmlElement(name = "corrPostalCode")
    protected String corrPostalCode;


    @XmlElement(name = "corrCity")
    protected String corrCity;


    @XmlElement(name = "corrLocality")
    protected String corrLocality;


    @XmlElement(name = "corrStreet")
    protected String corrStreet;


    @XmlElement(name = "corrHouse")
    protected String corrHouse;


    @XmlElement(name = "corrStructure")
    protected String corrStructure;


    @XmlElement(name = "corrFlat")
    protected String corrFlat;


    @XmlElement(name = "corrPhone")
    protected String corrPhone;

    @XmlElement(name = "corrEMail")
    protected String corrEMail;


    @XmlElement(name = "summary")
    protected String summary;

    @XmlElement(name = "topic")
    protected String topic;

    @XmlElement(name = "discountStructure")
    protected String discountStructure;

    @XmlElement(name = "corrType")
    protected String corrType;

    //для совместимости с интерфейсом GeographicData
    //По спеке страны нет
    protected String corrCountry;

    public void setCorrCountry(String corrCountry) {
        this.corrCountry = corrCountry;
    }

    @Override
    public String getCorrCountry() {
        return corrCountry;
    }

    public Date getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public List<String> getRepeatAppeals() {
        return repeatAppeals;
    }

    public void setRepeatAppeals(List<String> repeatAppeals) {
        this.repeatAppeals = repeatAppeals;
    }

    public String getCorrRegion() {
        return corrRegion;
    }

    public void setCorrRegion(String corrRegion) {
        this.corrRegion = corrRegion;
    }

    public String getCorrArea() {
        return corrArea;
    }

    public void setCorrArea(String corrArea) {
        this.corrArea = corrArea;
    }

    public String getCorrPostalCode() {
        return corrPostalCode;
    }

    public void setCorrPostalCode(String corrPostalCode) {
        this.corrPostalCode = corrPostalCode;
    }

    public String getCorrCity() {
        return corrCity;
    }

    public void setCorrCity(String corrCity) {
        this.corrCity = corrCity;
    }

    public String getCorrLocality() {
        return corrLocality;
    }

    public void setCorrLocality(String corrLocality) {
        this.corrLocality = corrLocality;
    }

    public String getCorrStreet() {
        return corrStreet;
    }

    public void setCorrStreet(String corrStreet) {
        this.corrStreet = corrStreet;
    }

    public String getCorrHouse() {
        return corrHouse;
    }

    public void setCorrHouse(String corrHouse) {
        this.corrHouse = corrHouse;
    }

    public String getCorrStructure() {
        return corrStructure;
    }

    public void setCorrStructure(String corrStructure) {
        this.corrStructure = corrStructure;
    }

    public String getCorrFlat() {
        return corrFlat;
    }

    public void setCorrFlat(String corrFlat) {
        this.corrFlat = corrFlat;
    }

    public String getCorrPhone() {
        return corrPhone;
    }

    public void setCorrPhone(String corrPhone) {
        this.corrPhone = corrPhone;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDiscountStructure() {
        return discountStructure;
    }

    public void setDiscountStructure(String discountStructure) {
        this.discountStructure = discountStructure;
    }

    public String getCorrType() {
        return corrType;
    }

    public void setCorrType(String corrType) {
        this.corrType = corrType;
    }

    public String getCorrEMail() {
        return corrEMail;
    }

    public void setCorrEMail(String corrEMail) {
        this.corrEMail = corrEMail;
    }

    @Override
    public String toString() {
        return "CitizenDocumentEntity{" +
                "incomingDate='" + incomingDate + '\'' +
                "repeatAppeals='" + repeatAppeals + '\'' +
                "corrRegion='" + corrRegion + '\'' +
                "corrArea='" + corrArea + '\'' +
                "corrPostalCode='" + corrPostalCode + '\'' +
                "corrLocality='" + corrLocality + '\'' +
                "corrStreet='" + corrStreet + '\'' +
                "corrHouse='" + corrHouse + '\'' +
                "corrStructure='" + corrStructure + '\'' +
                "corrFlat='" + corrFlat + '\'' +
                "corrPhone='" + corrPhone + '\'' +
                "corrEMail='" + corrEMail + '\'' +
                "summary='" + summary + '\'' +
                "topic='" + topic + '\'' +
                "discountStructure='" + discountStructure + '\'' +
                "corrType='" + corrType + '\'' +
                '}';
    }

}


