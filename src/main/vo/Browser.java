package main.vo;

public class Browser {
    private int id;
    private String name;
    private double percent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }
}
