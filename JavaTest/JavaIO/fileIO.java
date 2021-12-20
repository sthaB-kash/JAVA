import java.io.*;
class FileReaderAndWriterDemo {
    public static void main(String a[]) throws IOException{
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader("readfile.txt");
            fw=new FileWriter("writefile.txt");
            int c;
            while((c=fr.read())!=-1){
                fw.write(c);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");}
        finally{
            if(fr!=null){
                fr.close();
            }
            if(fw!=null){
                fw.close();
            }
        }
    }
}
