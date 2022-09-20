package gt.csv.formatter;

import gt.ScrapData;

import java.util.LinkedHashMap;


public interface CsvDataFormatter {
    LinkedHashMap<String, String> format(ScrapData scrapData);
}
