class Lecturer {
    private String birth;
    private String name;

    public Lecturer(String birth, String name) {
        this.birth = birth;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
    public void getInfo() {
        System.out.println(getName() + " " + getBirth());
    }
}

