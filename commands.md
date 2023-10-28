# Demo

cd /Users/hannojacobs/Documents/4_Docs/MIT_Sem_2_2023/_1_MIT805_project/Assignment_2_work/Java_projects/mapreduce_java

hadoop fs -rm /MIT805_Datasets/inputs/demo_tweet_text.txt
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/head_Ukraine/demo_tweet_text.txt /MIT805_Datasets/inputs
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/demo_tweet_text.txt      /MIT805_Datasets/outputs/demo_reduced_tweet_text
hadoop fs -rm -r /MIT805_Datasets/outputs/demo_reduced_tweet_text

--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------


# Run wordcount on filtered tweet field.txt files
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_0_location.txt      /MIT805_Datasets/outputs/out_Ukraine_full_0_location
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_1_following.txt     /MIT805_Datasets/outputs/out_Ukraine_full_1_following
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_2_followers.txt     /MIT805_Datasets/outputs/out_Ukraine_full_2_followers
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_3_totaltweets.txt   /MIT805_Datasets/outputs/out_Ukraine_full_3_totaltweets
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_4_usercreatedts.txt /MIT805_Datasets/outputs/out_Ukraine_full_4_usercreatedts
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_5_retweetcount.txt  /MIT805_Datasets/outputs/out_Ukraine_full_5_retweetcount
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_full_6_text.txt          /MIT805_Datasets/outputs/out_Ukraine_full_6_text



## Postprocess mapreduce

hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/mapreduced_tweet_fields/post_processed_tweet_fields/Ukraine_text_a-z_only.txt         /MIT805_Datasets/inputs
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/Ukraine_text_a-z_only.txt      /MIT805_Datasets/outputs/out_Ukraine_text_a-z_only

hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/mapreduced_tweet_fields/post_processed_tweet_fields/unreduced_hastags.txt         /MIT805_Datasets/inputs
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/unreduced_hastags.txt      /MIT805_Datasets/outputs/out_reduced_hastags

hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/mapreduced_tweet_fields/post_processed_tweet_fields/unreduced_side_1_bad_hastags.txt         /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/mapreduced_tweet_fields/post_processed_tweet_fields/unreduced_side_2_bad_hastags.txt         /MIT805_Datasets/inputs
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/unreduced_side_1_bad_hastags.txt      /MIT805_Datasets/outputs/reduced_side_1_bad_hastags
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/unreduced_side_2_bad_hastags.txt      /MIT805_Datasets/outputs/reduced_side_2_bad_hastags


cd /Users/hannojacobs/Documents/4_Docs/MIT_Sem_2_2023/_1_MIT805_project/Assignment_2_work/Java_projects/mapreduce_java

hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/mapreduced_tweet_fields/post_processed_tweet_fields/bot_all_language_unreduced_locations.txt         /MIT805_Datasets/inputs
hadoop jar target/mapreduce_java-1.0-SNAPSHOT.jar org.example.wordcount_runner /MIT805_Datasets/inputs/bot_all_language_unreduced_locations.txt      /MIT805_Datasets/outputs/bot_all_language_reduced_locations



# Copy to hdfs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_0_location.txt         /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_1_following.txt        /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_2_followers.txt        /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_3_totaltweets.txt      /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_4_usercreatedts.txt    /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_5_retweetcount.txt     /MIT805_Datasets/inputs
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_full_6_text.txt             /MIT805_Datasets/inputs

hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/input.csv /MIT805_Datasets/
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/input.txt /MIT805_Datasets/
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_head.csv /MIT805_Datasets/
hadoop fs -copyFromLocal /Users/hannojacobs/MIT805_datasets/Ukraine_twitter_invasion.csv /MIT805_Datasets/

# Remove Dir
hadoop fs -rm -r /MIT805_Datasets/outputs
hadoop fs -rm -r /MIT805_Datasets/invasion_outputs
hadoop fs -rm -r /MIT805_Datasets/invasion_inputs
hadoop fs -rm -r /MIT805_Datasets/invasion_outputs/output_Ukraine_twitter_invasion_tweet_4_location
hadoop fs -rm -r /MIT805_Datasets/invasion_outputs/output_Ukraine_twitter_invasion_tweet_5_following

# mkdir
hadoop fs -mkdir /MIT805_Datasets/inputs
hadoop fs -mkdir /MIT805_Datasets/outputs

# Remove files
hadoop fs -rm /MIT805_Datasets/input.txt
hadoop fs -rm /MIT805_Datasets/inputs
hadoop fs -rm /MIT805_Datasets/output
hadoop fs -rm /MIT805_Datasets/input.csv
hadoop fs -rm /MIT805_Datasets/Ukraine_head.csv
hadoop fs -rm /MIT805_Datasets/Ukraine_twitter_invasion.csv

