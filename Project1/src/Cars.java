public class Cars {
    public int speed;
    public int year;

    public Cars(int speed, int year){
        this.speed = speed;
        this.year = year;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Car's speed : ").append(speed).append(", and year : ").append(year);
        return sb.toString();
    }
}
