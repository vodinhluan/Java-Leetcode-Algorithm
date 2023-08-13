class oop {
    
    public String name;
    public int age;
    public String colorSkin;

    public oop(String name, int age, String colorSkin) {
        this.name = name;
        this.age = age;
        this.colorSkin = colorSkin;
    }
    
    public static void main(String[] args) {
        System.out.println("");
        oop ben = new oop("Ben", 18, "white");
        System.out.println(ben.age);
        System.out.println("");

    }
}