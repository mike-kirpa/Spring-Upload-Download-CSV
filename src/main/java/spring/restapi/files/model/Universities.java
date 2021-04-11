package spring.restapi.files.model;

/**
 * Class data model class corresponds to entity and table universities.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universities")
public class Universities {

    @Column(name = "state")
    private String state;

    @Column(name = "name")
    private String name;

    @Column(name = "institutionType")
    private String institutionType;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "website")
    private String website;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        institutionType = institutionType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        website = website;
    }

    public Universities(){

    }

    public Universities(String state, String name, String institutionType, String phoneNumber, String website){
        this.state = state;
        this.name = name;
        this.institutionType = institutionType;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Universities{" +
                "state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", institutionType='" + institutionType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
