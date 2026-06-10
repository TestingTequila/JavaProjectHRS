package day18;

public class Automobile
{
    private String name;
    private int manufacturingYear;
    private String color;

    //Assigning value through constructor
    public  Automobile(String name, int manufacturingYear, String color)
    {
        this.name = name;
        this.manufacturingYear = manufacturingYear;
        this.color = color;
    }

    //Updating the assigned value
    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public  void assignValues(String name, int manufacturingYear, String color)
    {
          this.name = name;
          this.manufacturingYear = manufacturingYear;
          this.color =color;
    }

}
