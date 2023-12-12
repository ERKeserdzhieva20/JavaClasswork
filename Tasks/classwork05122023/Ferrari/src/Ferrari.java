public class Ferrari implements Interface{
    private String driverName;
    private String model;

    public Ferrari(String driverName, String model) {
        this.driverName = driverName;
        this.model = model;
    }
    @Override
    public String brakets() {
        return("Brakes!");
    }

    @Override
    public String gas(){
        return ("brum-brum-brum-brrrrr");
    }
    public String toString() {
        return (model + "/" + brakets() +"/"+ gas() +"/" + driverName);
    }
}
