package HT1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your document path");

        String scanDocPath = scanner.nextLine();

        System.out.println("Type path for valid document numbers report");

        String scanValidReportPath = scanner.nextLine();

        System.out.println("Type path for non valid document numbers report");

        String scanNonValidReportPath = scanner.nextLine();

        File file = new File(scanDocPath);
        File validDocs = new File(scanValidReportPath);
        File nonValidDocs = new File(scanNonValidReportPath);

        WorkWithFiles wWF = new WorkWithFiles();

        wWF.checkDocValid(file, validDocs, nonValidDocs);



    }

}
