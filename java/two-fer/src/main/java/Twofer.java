public class Twofer {
    public String twofer(String name) {
        if( name == null || name == "") {
            String ans = "One for you, one for me.";
                return ans;
        }
        String ans = "One for "+name+", one for me.";
            return ans;
    }
}
