import os
import pandas as pd
print("\n")

# csv_path = "/Users/hannojacobs/MIT805_datasets/Ukraine_head.csv"
csv_path = "/Users/hannojacobs/MIT805_datasets/Ukraine_full.csv"

print(f"Loading {csv_path} to df...")
df = pd.read_csv(csv_path, low_memory=True, nrows=14e6, encoding='utf-8', error_bad_lines=False, warn_bad_lines=True)
pkl_file_path = f"{csv_path[:-4]}.pkl"

print(f"Writing {csv_path} to pkl...")
df.to_pickle(pkl_file_path)
print(f"Done writing to pkl.")
print(f"pkl file: {pkl_file_path}")
print("\n")
