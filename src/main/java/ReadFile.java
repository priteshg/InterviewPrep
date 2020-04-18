
import java.io.*;

/**
 * Created by Pritesh on 08/05/2017.
 */
public class ReadFile {
    private String fileName;
    private File file;


    public ReadFile(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
    }

    public String printFile() {
        StringBuffer sb = new StringBuffer();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while((line=br.readLine())!= null){
                sb.append(line);
                System.out.println(line);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public void writeToFile(String content){
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(content);
            writer.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
