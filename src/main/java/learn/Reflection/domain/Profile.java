package learn.Reflection.domain;

import java.io.Serializable;

public class Profile implements Serializable {
    private static final long serialVersionUID = 2225296203195621598L;
    private String userid;

    private String actscount;

    private String highlevel;

    private String birthday;

    private String constellation;

    private String resident;

    private String birthplace;

    private String zodiac;

    private String gender;

    private String carh;

    private String authen;

    private String openacts;

    private String comments;

    private String age;

    private String umetag;

    private String hotairport;

    private String preferaircorp;

    private String preferseat;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getActscount() {
        return actscount;
    }

    public void setActscount(String actscount) {
        this.actscount = actscount == null ? null : actscount.trim();
    }

    public String getHighlevel() {
        return highlevel;
    }

    public void setHighlevel(String highlevel) {
        this.highlevel = highlevel == null ? null : highlevel.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident == null ? null : resident.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac == null ? null : zodiac.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCarh() {
        return carh;
    }

    public void setCarh(String carh) {
        this.carh = carh == null ? null : carh.trim();
    }

    public String getAuthen() {
        return authen;
    }

    public void setAuthen(String authen) {
        this.authen = authen == null ? null : authen.trim();
    }

    public String getOpenacts() {
        return openacts;
    }

    public void setOpenacts(String openacts) {
        this.openacts = openacts == null ? null : openacts.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getUmetag() {
        return umetag;
    }

    public void setUmetag(String umetag) {
        this.umetag = umetag == null ? null : umetag.trim();
    }

    public String getHotairport() {
        return hotairport;
    }

    public void setHotairport(String hotairport) {
        this.hotairport = hotairport == null ? null : hotairport.trim();
    }

    public String getPreferaircorp() {
        return preferaircorp;
    }

    public void setPreferaircorp(String preferaircorp) {
        this.preferaircorp = preferaircorp == null ? null : preferaircorp.trim();
    }

    public String getPreferseat() {
        return preferseat;
    }

    public void setPreferseat(String preferseat) {
        this.preferseat = preferseat == null ? null : preferseat.trim();
    }
}