package HT1;

public  class StringsM {

    static void printNumbers(String docNum) {
        String numbSubStr1 = docNum.substring(0, 4);
        String numbSubStr2 = docNum.substring(9, 13);
        System.out.println(numbSubStr1 + numbSubStr2);
    }

     static void replaceLetters(String docNum) {
        String replace = docNum.replace("A", "*").replace("b", "*").replace("c", "*").replace("d", "*").replace("E", "*").replace("f", "*");
        System.out.println(replace);
    }

     static void lettersInLowerCase(String docNum) {
        String letSubStr1 = docNum.substring(5, 8).toLowerCase();
        String letSubStr2 = docNum.substring(14, 17).toLowerCase();
        String letSubStr3 = docNum.substring(19, 20).toLowerCase();
        String letSubStr4 = docNum.substring(21, 22).toLowerCase();
        System.out.println(letSubStr1 + "/" + letSubStr2 + "/" + letSubStr3 + "/" + letSubStr4);
    }

     static void sbLettersInUpperCase (String docNum) {
        StringBuilder sb = new StringBuilder();
        sb.append(docNum);
         String letSubStr1 = sb.substring(5, 8).toUpperCase();
         String letSubStr2 = sb.substring(14, 17).toUpperCase();
         String letSubStr3 = sb.substring(19, 20).toUpperCase();
         String letSubStr4 = sb.substring(21, 22).toUpperCase();
         System.out.println("Letters:" + letSubStr1 + "/" + letSubStr2 + "/" + letSubStr3 + "/" + letSubStr4);
    }

    static void contain(String docNum) {
        if (docNum.contains("abc") || docNum.contains("ABC")) {
            System.out.println("Document number contain abc");
        } else {
            System.out.println("document number not contain abc");
        }
    }

    static void startWith(String docNum) {
        if (docNum.startsWith("555")) {
            System.out.println("Document number start with 555");
        } else {
            System.out.println("document number not start with 555");
        }
    }

    static void endWith(String docNum) {
        if (docNum.endsWith("1a2b")) {
            System.out.println("Document number end with 1a2b");
        } else {
            System.out.println("Document number not end with 1a2b");
        }
    }

}
