package Strings;

public class StringBuilders{
    public static void main(String[] args) {
        StringBuilder s = new  StringBuilder();
        System.out.println(s.length()+ " "+s.capacity());
        //System.out.println(s);
        s.append("bhavika");
        System.out.println(s);
        System.out.println(s.length()+ " "+s.capacity());
        s.setCharAt(0,'v');
        System.out.println(s);
        System.out.println(s.reverse());
        s.insert(0,'v');
        s.delete(0,1);


    }
}

