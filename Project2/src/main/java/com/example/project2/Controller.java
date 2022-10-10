@RestController
public class Controller {
    @PostMapping("/post")
    public void post(){
        System.out.println("post call");
    }
}