package Strings;

public class BuiltInMethods {
    static void main(String[] args) {
        String x = "bhavika khedkar";
        System.out.println(x.indexOf('k'));  //first Occurrence return
        System.out.println(x.lastIndexOf('k'));//last Occurrence return
        System.out.println(x.toLowerCase());//makes every string small
        System.out.println(x.toUpperCase());//makes every string large
        System.out.println(x.contains("bhavi"));//Gives boolean reply if the passed string is present in the orginal string


    }
}
