package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int i = symbol;
        if((i>=97) && (i<=122) || (i>=65) && (i<=90)) {
            System.out.println("English");}
        else {
            System.out.println("Non English");
        }
    }
}
