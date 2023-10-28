import matplotlib.pyplot as plt
from wordcloud import WordCloud

words_ = [  ['russia', 1422], ['putin', 1235], ['war', 1191], ['standwithukraine', 793], 
            ['nato', 628], ['russian', 596], ['peace', 569], ['world', 540], ['people', 527], 
            ['today', 445], ['breaking', 437], ['kyiv', 406], ['news', 399], ['russians', 384], 
            ['ukrainian', 361], ['help', 344], ['please', 344], ['them', 331], ['stop', 318], 
            ['ukrainians', 318], ['children', 310], ['china', 310], ['country', 308], 
            ['europe', 305], ['mariupol', 292], ['slavaukraini', 286], ['zelensky', 277], 
            ['march', 271], ['sanctions', 271]]

output_file_path = "Assignment_2_work/Python_code/word_frequencies.txt"

with open(output_file_path, 'w') as file:
    for word, frequency in words_:
        for i in range(frequency):
            file.write(f"{word}\n")

print(f"Word frequencies have been written to {output_file_path}")
input_file_path = output_file_path

word_counts = {}
with open(input_file_path, "r") as file:
    for line in file:
        words = line.strip().split()
        for word in words:
            word_counts[word] = word_counts.get(word, 0) + 1

wordcloud = WordCloud(width=800, height=400, background_color="white")
wordcloud.generate_from_frequencies(word_counts)

plt.figure(figsize=(10, 5))
plt.imshow(wordcloud, interpolation="bilinear")
plt.axis("off")
plt.show()
