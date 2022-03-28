package Lesson_7;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;

public class Csv {
    public static void main(String[] args) throws IOException {
        int[][] data = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        AppData firstData = new AppData("первый, второй, третий", data);
        File file = new File("C:\\Users\\Users\\IdeaProjects\\anton1\\src\\java\\newtable.csv");
        file.createNewFile();
        CSVWriter writer = new CSVWriter(new FileWriter(file), ';', ' ', ' ', "\n");
        WorkCsv.nameCsv(writer, firstData);
        WorkCsv.dataCsv(writer, firstData);
        writer.close();


    }
}
class WorkCsv {
    public static void nameCsv(CSVWriter writer,AppData appData)throws IOException {
        String[] record = appData.getHeader();
        writer.writeNext(record);
    }

    public static void dataCsv(CSVWriter writer, AppData appData) throws IOException {
        for (int i=0; i < appData.getData().length;i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < appData.getData()[i].length; j++) {
                stringBuffer.append(appData.getData()[i][j]);
                stringBuffer.append(",");
            }
            String x = String.valueOf(stringBuffer);
            String[] record = x.split(",");
            writer.writeNext(record);
        }
    }
}
class AppData {


    private String[] header;

    private int[][] data;
    AppData(String listOfHeader,int[][] data ){
        this.header = listOfHeader.split(",");
        this.data = data;

    }

    public  String[] getHeader() {
        return header;

    }

    public void setHeader(String[] header) {
        this.header = header;

    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
