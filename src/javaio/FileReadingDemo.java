package javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

    public void readFile() throws IOException {

        String filePath = "/Users/asif/QA-Automation/Auto-Project-Classwork/IdeaProjects/data/demo.txt";

        FileReader fileReader = new FileReader(filePath);

        //fileReader.read();
        int i;
        while ((i = fileReader.read())!=-1){
            //print don't create new line ...use print instead of println
            //char so it print letter from numbers since Read class hold numbers as letter
            System.out.print((char) i);

        }

    }


}
