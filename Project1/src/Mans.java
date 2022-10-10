public class Mans {
    String name;
    int age;
    String job;

    public Mans(String name, int age, String job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name).append("\nage=").append(age).append("\njob=").append(job);
        return sb.toString();
    }
}
