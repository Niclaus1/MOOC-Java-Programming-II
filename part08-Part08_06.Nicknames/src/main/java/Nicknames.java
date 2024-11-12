import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew's", "matt");
        nicknames.put("michael's", "mix");
        nicknames.put("arthur's", "artie");

        System.out.println("matthew's nickname is " + nicknames.get("matthew's") );
    }

}
