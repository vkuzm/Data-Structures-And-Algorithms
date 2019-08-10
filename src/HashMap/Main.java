package HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap(10);
        hashMap.set("bears", "5");
        hashMap.set("cats", "15");
        hashMap.set("dogs", "170");
        hashMap.set("dogs", "70");

        System.out.println("Get all values:");
        for (String s : hashMap.getValues()) {
            System.out.println(s);
        }

        System.out.println("\nGet value:");
        System.out.println(hashMap.get("cats"));
    }
}
