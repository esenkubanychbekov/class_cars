package Home_work;

public abstract class Car {

    public String rule;
    public String coleso;
    private String name_Car;

    public Car(String rule, String coleso, String name_Car){

        this.rule = rule;
        this.coleso = coleso;
        this.name_Car = name_Car;
    }

    public String getRule(){
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getColeso() {
        return coleso;
    }

    public void setColeso(String coleso) {
        this.coleso = coleso;
    }

    public String getName_Car() {
        return name_Car;
    }

    public void setName_Car(String name_Car) {
        this.name_Car = name_Car;
    }
}
