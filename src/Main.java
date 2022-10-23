import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    int[] array = {3,7,1,5,7,2,25,2,5,90};
        for (int ty: array) {
            System.out.println(ty);
        }
        Sorterer(array);
        for (int ty: array) {
            System.out.println(ty);
        }

    }

    public static void Sorterer(int[] value){

        try(FileWriter writer = new FileWriter("LogFile.txt", false))
        {
            for(int i = 0; i < value.length-1; i++){
                for(int j = 0; j < value.length-1; j++){
                    if (value[j + 1] > value[j]) {
                        int temp = value[j];
                        value[j] = value[j + 1];
                        value[j + 1] = temp;
                        String text = "Перемещено значение " + value[i + 1] + " вместо значения " + value[i] + " \n";
                        writer.write(text);
                    }
                }
            }

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}







