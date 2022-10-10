@RestController
public class Controller {
    @PostMapping("/post")
    public void post(){
        System.out.println("post call");
    }

    @PostMapping("/test")
    public void tesst(){
        System.out.println("test call");
    }
}