public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int length = sb.length();
        char ch = sub.charAt(3);
        System.out.println(sub + " " + length + " " + ch);

        sb.append("-").append(true);
        System.out.println("StringBuilder append() sb = " + sb);

        sb.insert(7, "-");
        System.out.println("StringBuilder insert() after 7 symbol - to sb = " + sb);
        sb.insert(0, "-");
        System.out.println("StringBuilder insert() sb = " + sb);
        sb.insert(4, "-");
        System.out.println("StringBuilder insert() sb = " + sb);
    }
}
