package IntroTopics;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = new String("Hello wortld v2");

        System.out.println(str2.length());

        // concat
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // check equals
        System.out.println(str1.equals(str2));

        // '==' and 'equals' works differently for strings. '==' just check ref.
        // of two strings and 'equals' compare values of two string
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // this will provide 'true' because both string has same value
        System.out.println(s1.equals(s2));
        // this will provide 'false' because both string has different references
        System.out.println(s1 == s2);
        System.out.println("Hello");

        // indexing
        System.out.println(s1.charAt(2));

        // substring
        // str.substring(beginIndex) this will give the substring from begin index to end of the string
        // str.substring(firstIndex, indexBeforeLastIndex)
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1, 3));

        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.startsWith("H"));
    }
}
