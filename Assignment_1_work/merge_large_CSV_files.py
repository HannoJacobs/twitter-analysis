import pandas as pd
import glob

path_name = "/Volumes/External_1/MIT805_datasets/Ukraine_twitter/Ukraine_Twitter_invasion"
file_paths = glob.glob(f"{path_name}/*.csv")

# Load CSV files into DataFrames
dfs = [pd.read_csv(file) for file in file_paths]

# Concatenate DataFrames
combined_df = pd.concat(dfs, ignore_index=True)

# Save Combined DataFrame to CSV
combined_df.to_csv(f"{path_name}/combined.csv", index=False)
