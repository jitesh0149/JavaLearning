package examples.super_sub_class;

public class Vehicle {

    Integer id;
    String name;
    String weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    String getWeight() {
        return weight;
    }

    protected String getName() {
        return name;
    }

    public String getDetail() {
        return "Name is : " + name + ". Weight is : " + weight;
    }

    public Vehicle() {
    }

    public Vehicle(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
}
