// cd /Users/hannojacobs/Documents/4_Docs/MIT_Sem_2_2023/_1_MIT805_project/Assignment_2_work/Java_projects/mapreduce_java

package org.example;

import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class wordcount_reducer  extends MapReduceBase implements Reducer<Text,IntWritable,Text,IntWritable>
{
    public void reduce(Text key, Iterator<IntWritable> values,OutputCollector<Text,IntWritable> output, Reporter reporter) throws IOException
    {
        int sum=0;
        while (values.hasNext())
        {
            sum+=values.next().get();
        }
        output.collect(key,new IntWritable(sum));
    }
}