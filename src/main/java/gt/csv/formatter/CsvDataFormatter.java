package gt.csv.formatter;

import gt.ScrapData;

import java.util.LinkedHashMap;
import java.util.List;

public interface CsvDataFormatter {
    LinkedHashMap<String, String> format(ScrapData scrapData);
}
