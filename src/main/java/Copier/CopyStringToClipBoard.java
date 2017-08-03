package Copier;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;

class CopyStringToClipBoard {


    private static String content;

    public static void basic(String filename) throws IOException {

        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;


        while ((strLine = br.readLine()) != null)   {

            content += strLine;
            System.out.println (strLine);
        }

        br.close();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();

        StringSelection strSel = new StringSelection(content);
        clipboard.setContents(strSel, null);


    }

     


}
