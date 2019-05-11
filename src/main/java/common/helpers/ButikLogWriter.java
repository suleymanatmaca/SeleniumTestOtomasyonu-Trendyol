package common.helpers;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ButikLogWriter {
    private static BufferedWriter bufferedWriter;

    public static void LogOpen() {
        String dataFileName;
        String dataFilePath;

        dataFileName = Util.getProperty("LOG");
        dataFilePath = System.getProperty("user.dir") + Util.getProperty("path") + dataFileName;

        try {
            FileOutputStream outputStream = new FileOutputStream(dataFilePath, true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            bufferedWriter = new BufferedWriter(outputStreamWriter);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void LogClose() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void LogWrite(String log) {
        try {
            bufferedWriter.write(log);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

