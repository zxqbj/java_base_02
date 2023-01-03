public class Action {
    private String name;

    public String getName() {
        return name;
    }

    public Action(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Action{" +
                "name='" + name + '\'' +
                '}';
    }
}
