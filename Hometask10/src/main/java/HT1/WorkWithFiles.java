package HT1;

import java.io.*;

public class WorkWithFiles {

    public void checkDocValid(File file, File pathForValidReports, File pathForNonValidReports) {

        try (LineNumberReader reader = new LineNumberReader(new FileReader(file));
             Writer validWriter = new FileWriter(pathForValidReports);
             Writer nonValidWriter = new FileWriter(pathForNonValidReports)){

            String s = reader.readLine();

            while (s != null) {
                System.out.println(s);

                if (s.length() == 15) {
                    if (s.startsWith("docnum") || s.startsWith("contract")){
                        System.out.println("Document number is valid");
                        validWriter.write("\n" + s);
                    } else {
                        System.out.println("Document number is not valid");
                        nonValidWriter.write("\n" + s + ": don't starts with docnum or contract");
                    }
                } else {
                    System.out.println("Document number is not valid");
                    nonValidWriter.write("\n" + s + ": have more or less 15 chars");
                }
                s = reader.readLine();
            }

        } catch (IOException exc) {

        }

    }

}
