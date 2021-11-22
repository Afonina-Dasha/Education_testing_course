package lesson1;

public abstract class Menu {

    private String name;
    private Integer coast;

    public Menu(final String name, final Integer coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer newCoast) {
        coast = newCoast;
    }

}