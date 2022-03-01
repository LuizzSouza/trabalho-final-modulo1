package com.dbc.poo.TRANSLATECLEANEDIT;

public class ProUser extends User {
    private String whatsApp;

    public ProUser(String username, String password, PersoInfo persoInfo, Address address, ProgLangs progLangs, Gender gender, Pref pref, String whatsApp) {
        super(username, password, persoInfo, address, progLangs, gender, pref);
        this.whatsApp = whatsApp;
    }

    public String getWhatsApp() {
        return whatsApp;
    }
    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    @Override
    public void printMyInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ProUser{" +
                "username='" + getUsername() + '\'' +
                ", persoInfo=" + getPersoInfo() +
                ", address=" + getAddress() +
                ", progLangs=" + getProgLangs() +
                ", gender=" + getGender() +
                ", pref=" + getPref() +
                ", whatsApp=" + getWhatsApp() +
                '}';
    }
}
