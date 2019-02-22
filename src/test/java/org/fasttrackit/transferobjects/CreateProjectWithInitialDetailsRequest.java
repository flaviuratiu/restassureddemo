package org.fasttrackit.transferobjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateProjectWithInitialDetailsRequest {

    private CreateCustomerRequest customer;
    private Address address;
    private String constructionTypeId;
    private String constructionTypeInitialDescription;
    private String initialDetails;

    public String getConstructionTypeInitialDescription() {
        return constructionTypeInitialDescription;
    }

    public void setConstructionTypeInitialDescription(String constructionTypeInitialDescription) {
        this.constructionTypeInitialDescription = constructionTypeInitialDescription;
    }

    public CreateCustomerRequest getCustomer() {
        return customer;
    }

    public void setCustomer(CreateCustomerRequest customer) {
        this.customer = customer;
    }

    public String getInitialDetails() {
        return initialDetails;
    }

    public void setInitialDetails(String initialDetails) {
        this.initialDetails = initialDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getConstructionTypeId() {
        return constructionTypeId;
    }

    public void setConstructionTypeId(String constructionTypeId) {
        this.constructionTypeId = constructionTypeId;
    }

    @Override
    public String toString() {
        return "CreateProjectWithInitialDetailsRequest{" +
                "customer=" + customer +
                ", constructionTypeId='" + constructionTypeId + '\'' +
                ", constructionTypeInitialDescription='" + constructionTypeInitialDescription + '\'' +
                ", initialDetails='" + initialDetails + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
