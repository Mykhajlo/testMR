public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String ddd = "test";

        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int length = sb.length();
        char ch = sub.charAt(3);
        System.out.println(sub + " " + length + " " + ch + " " + ddd.substring(1,3));

        sb.append("-").append(true);
        System.out.println("StringBuilder append() sb = " + sb);

        sb.insert(7, "-");
        System.out.println("StringBuilder insert() after 7 symbol - to sb = " + sb);
        sb.insert(0, "-");
        System.out.println("StringBuilder insert() - before sb = " + sb);
        sb.insert(4, "-");
        System.out.println("StringBuilder insert() - in pos 4 at sb = " + sb);
    }
}
