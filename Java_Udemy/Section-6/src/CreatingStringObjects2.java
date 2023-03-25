public class CreatingStringObjects2 {
    public static void main(String[] args) {
        String str = new String("netbeans");
        System.out.println(str.toUpperCase());
        String str2 = str.replace("net","kunjesh");
        System.out.println(str2);

        String s = "java";
        String s2 = "Java";
        System.out.println(s.compareTo(s2));
    }

}
