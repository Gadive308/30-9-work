class Student {
    private String birth;
    private String name;
    private String mssv;

    public Student(String birth, String name, String mssv) {
        this.birth = birth;
        this.name = name;
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
    public String getMssv() {
        return mssv;
    }
    public void getInfo() {
        System.out.println(getName() + " " + getBirth() + " " + getMssv());
    }
}