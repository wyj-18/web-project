package main.vo;

public class CountryWeather {
    private int id;

    private String name;

    private int month;

    private double temp;


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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "CountryWeather{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month=" + month +
                ", temp=" + temp +
                '}';
    }
}
