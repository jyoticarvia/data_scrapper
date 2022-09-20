package gt.csv;

import com.opencsv.CSVWriter;
import gt.csv.formatter.CsvDataFormatter;
import gt.csv.formatter.GujratTourismDataFormatter;
import gt.ScrapData;

import java.io.File;
import java.io.FileWriter;
import java.util.List;


public class ScrapDataCsv {
    private ScrapDataCsv(){}
    public static void createCsv(List<ScrapData> dataList, CsvDataFormatter csvDataFormatter) {
        File file=new File("/home/ankush/Desktop/ScrapData3.gt.csv");
        try{
            if (!file.exists())
                file.createNewFile();
            FileWriter outputFile=new FileWriter(file);
            CSVWriter writer=new CSVWriter(outputFile);
            String[] header= GujratTourismDataFormatter.keyMapper.keySet().toArray(String[]::new);
            writer.writeNext(header);
            dataList.stream().map(csvDataFormatter::format).forEach(scrapData ->
                    writer.writeNext(scrapData.values().stream().map(Object::toString).toArray(String[]::new)));
            writer.close();
            System.out.println("CSV file created");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
