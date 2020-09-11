/*
 *  Author: OneRCH Team
 *  Project: OneRCH Project
 *  School: RMIT - University
 */
package rmit.lybao.restserver;

public class Data {
    private String id;
    private String guid;
    private int index;
    private boolean isActive;
    private String balance;
    private int age;
    private String eyeColor;
    private String first_name;
    private String last_name;
    private String company;

    public Data(String id, String guid, int index, boolean isActive, String balance,
                int age, String eyeColor, String first_name, String last_name, String company) {
        this.id = id;
        this.guid = guid;
        this.index = index;
        this.isActive = isActive;
        this.balance = balance;
        this.age = age;
        this.eyeColor = eyeColor;
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
