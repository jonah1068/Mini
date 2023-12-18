package language.model;

public interface Statement extends Node {
    static String printTabs(int tabs) {
        return new String(new char[tabs]).replace("\0", "\t");
    }
}
