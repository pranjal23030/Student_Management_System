package model;

public class Classes {
    public Classes(String section, int class_no, String CR) {
        this.section = section;
        this.class_no = class_no;
        this.CR = CR;
    }

    String section;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    public String getCR() {
        return CR;
    }

    public void setCR(String CR) {
        this.CR = CR;
    }

    int class_no;
    String CR;

}
