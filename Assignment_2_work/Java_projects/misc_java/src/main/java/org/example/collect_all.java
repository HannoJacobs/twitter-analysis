package org.example;
import com.opencsv.CSVReader;

import com.opencsv.CSVReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class collect_all
{
    public static void main(String[] args)
    {
        // Specify the path to your CSV file
        String file_path = "/Users/hannojacobs/MIT805_datasets/";
        String file_name = "Ukraine_head";
//        String file_name = "Ukraine_full";
        Path filePath = Paths.get(file_path + file_name + ".csv");

        try {
            readAndProcessLines(filePath, file_path, file_name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndProcessLines(Path filePath, String file_path, String file_name) throws IOException
    {
        int csv_index;
        String working_field;
        String output_file_name;
        long startTime;
        FileWriter fileWriter;
        double runtime;
//        String output_file_path = "/Users/hannojacobs/MIT805_datasets/full_Ukraine_full/"; // change the output
        String output_file_path = "/Users/hannojacobs/MIT805_datasets/head_Ukraine/"; // change the output

        // Unnamed:
        // 0,               = 0
        // userid,          = 1
        // username,        = 2
        // acctdesc,        = 3
        // location,        = 4
        // following,       = 5
        // followers,       = 6
        // totaltweets,     = 7
        // usercreatedts,   = 8
        // tweetid,         = 9
        // tweetcreatedts,  = 10
        // retweetcount,    = 11
        // text,            = 12
        // hashtags,        = 13
        // language,        = 14
        // coordinates,     = 15
        // favorite_count,  = 16
        // extractedts      = 17


        ///////////////////////////////////////////////////////
        csv_index = 1;
        working_field =  "userid";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 2;
        working_field =  "username";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 3;
        working_field =  "acctdesc";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 4;
        working_field =  "location";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 5;
        working_field =  "following";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 6;
        working_field =  "followers";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 7;
        working_field =  "totaltweets";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 8;
        working_field =  "usercreatedts";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 9;
        working_field =  "tweetid";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 10;
        working_field =  "tweetcreatedts";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 11;
        working_field =  "retweetcount";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 12;
        working_field =  "text";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 13;
        working_field =  "hashtags";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 14;
        working_field =  "language";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 15;
        working_field =  "coordinates";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 16;
        working_field =  "favorite_count";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");


        ///////////////////////////////////////////////////////
        csv_index = 17;
        working_field =  "extractedts";
        output_file_name = output_file_path + "full_" + file_name + "_tweet_" +csv_index + "_" + working_field + ".txt";

        startTime = System.currentTimeMillis();
        fileWriter = new FileWriter(output_file_name);
        System.out.println("Writing \"" + working_field + "\" to the file: " + output_file_name + " ... ");
        try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
            try (Reader reader = Files.newBufferedReader(filePath)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    String[] nextRecord;
                    while ((nextRecord = csvReader.readNext()) != null) {
                        // Check if the array has at least X elements before accessing the X'th element
                        if (nextRecord.length >= csv_index + 1) {
                            writer.write(nextRecord[csv_index] + "\t"); // Write the X'th element
                        } else {
                            writer.write("\t"); // Write a tab if there's no X'th element
                        }
                        writer.newLine(); // Move to the next line for the next row
                    }
                }
            }
        }
        runtime = (System.currentTimeMillis() - startTime)/1000.0;
        System.out.println("Done writing \"" + working_field + "\" to file. Runtime = " + runtime + " seconds\n");



    } // END readAndProcessLines
}
