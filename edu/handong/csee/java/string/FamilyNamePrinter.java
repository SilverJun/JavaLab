package edu.handong.csee.java.string;

/**
 * FamilyNamePrinter
 */
public class FamilyNamePrinter {
    private String[] stringNames;
    private String[] familyNames;
    
    //"Eunjun Jang, Hakyeong Bang, Junpyo Seo, Chanju Lee, Seonghyuk Kim, Ahrin Jang, Minjae Kim, Seonji Kim, Sunwoo Park"
    public static void main(String[] args)
    {
        FamilyNamePrinter printer = new FamilyNamePrinter(args[0]);
        printer.printFamilyNames();
    }

    public FamilyNamePrinter(String names)
    {
        stringNames = names.split(",");
        familyNames = new String[stringNames.length];
        for (int i = 0; i < stringNames.length; i++) {
            familyNames[i] = stringNames[i].split(" ")[1];
        }
    }

    public void printFamilyNames()
    {
        for (String var : familyNames) {
            System.out.println(var);
        }
    }

}
