package swing;

public class Character {
    public String name;
    public String imagePath;
    public String bio;
    public String group;
    public String birthday;
    public String food;

    public Character(String name, String imagePath, String group, String food, String birthday, String bio) {
        this.name = name;
        this.imagePath = imagePath;
        this.group = group;
        this.food = food;
        this.birthday = birthday;
        this.bio = bio;
    }
}
