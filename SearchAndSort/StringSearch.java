public class StringSearch {
    public static void main(String[] args) {
        String name = "Bhavika";
        char search = 'i';

        for(int i = 0 ; i < name.length() ; i++){
            if(search == name.charAt(i)){
                System.out.println(" '"+search+"' "+"found in String --> " + name );
            }
        }
    }
}
