import java.io.*;

public class FileCreate {
   public static void main() throws IOException {
       File f= new File("C:/Users/RAMSARAN DEEPTHISHRE/Desktop/file/file.txt");
       System.out.println(String.valueOf(f.createNewFile()));

       //wriet the file

       FileWriter fw = new FileWriter("C:/Users/RAMSARAN DEEPTHISHRE/Desktop/file/file.txt");
       fw.write("Murugan Ramalingam is confident person who never give up.");
       fw.close();

       FileReader fr = new FileReader("C:/Users/RAMSARAN DEEPTHISHRE/Desktop/file/file.txt");
       System.out.println("Read:"+fr.readAllAsString());

       try{
           File f1 = new File("C:/Users/RAMSARAN DEEPTHISHRE/Desktop/file/data.txt");
           if(!f1.exists()){
               if(f1.createNewFile()){
                   System.out.println(f1.getAbsolutePath());
               }
           } else {
               System.out.println("File is not created");
           }
       }catch (IOException ex){
           ex.printStackTrace();       }



    }
}
