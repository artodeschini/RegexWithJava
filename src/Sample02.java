public class Sample02 {
    public static void main(String[] args) {

        // sample to use qunatifiers

        // 1. * matches 0 or more instances of preceding character
        String p1 = "abc*";
        String s1 = "abc";

        System.out.println(s1.matches(p1));
        System.out.println("abccccccccccccc".matches(p1));
        System.out.println("ab".matches(p1));

        // 2.  + machets 1 or more instances of preceding character
        String p2 = "abc+";

        System.out.println(s1.matches(p2));
        System.out.println("abccccccccccccc".matches(p2));
        System.out.println("ab".matches(p2));

        // 2.  + machets 0 or 1 instances of preceding character

        String p3 = "abc?";

        System.out.println(s1.matches(p3));
        System.out.println("abccccccccccccc".matches(p3));
        System.out.println("ab".matches(p3));
    }
}
