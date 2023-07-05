package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ("AEIOUaeiou".indexOf(character) != -1)
 {
        System.out.println("Vowel");
    } else if ("QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm".indexOf(character) != -1) {
        System.out.println("Consonant");
    }
    else {
        System.out.println("wrong alphabet!");
    }
    }
}
