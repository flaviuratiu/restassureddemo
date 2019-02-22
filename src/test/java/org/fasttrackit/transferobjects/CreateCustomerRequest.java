package org.fasttrackit.transferobjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateCustomerRequest {
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    private String address;
    private String vatNumber;
    private String tradeRegisterRegistrationNumber;
    private String bankAccount;
    private String bankName;
    private String preferredLanguageCode;
    private String preferredDateTimeFormat;
    private boolean company;


    public String getPreferredLanguageCode() {
        return preferredLanguageCode;
    }

    public void setPreferredLanguageCode(String preferredLanguageCode) {
        this.preferredLanguageCode = preferredLanguageCode;
    }

    public String getPreferredDateTimeFormat() {
        return preferredDateTimeFormat;
    }

    public void setPreferredDateTimeFormat(String preferredDateTimeFormat) {
        this.preferredDateTimeFormat = preferredDateTimeFormat;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTradeRegisterRegistrationNumber() {
        return tradeRegisterRegistrationNumber;
    }

    public void setTradeRegisterRegistrationNumber(String tradeRegisterRegistrationNumber) {
        this.tradeRegisterRegistrationNumber = tradeRegisterRegistrationNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public boolean isCompany() {
        return company;
    }

    public void setCompany(boolean company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "CreateCustomerRequest{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", tradeRegisterRegistrationNumber='" + tradeRegisterRegistrationNumber + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", bankName='" + bankName + '\'' +
                ", preferredLanguageCode='" + preferredLanguageCode + '\'' +
                ", preferredDateTimeFormat='" + preferredDateTimeFormat + '\'' +
                ", company=" + company +
                '}';
    }
}
