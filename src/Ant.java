public class Ant {

    private Color color;
    private char name;

    public Ant(Color color, char name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return color + " " + name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
