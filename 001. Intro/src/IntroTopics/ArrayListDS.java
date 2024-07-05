package IntroTopics;

import java.util.ArrayList;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("PHP");
        languages.add("JavaScript");

        System.out.println(languages);
        for(String language : languages){
            System.out.println(language);
        }

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr);
        for(int num : arr){
            System.out.println(num);
        }

        // access
        String str = languages.get(2);
        System.out.println(str);

        //change
        languages.set(2, "RUST");
        System.out.println(languages);

        System.out.println(languages.size());
        languages.remove(2);
        System.out.println(languages.size());
        System.out.println(languages);

        languages.add(2, "Kotlin");
        System.out.println(languages);
    }
}
