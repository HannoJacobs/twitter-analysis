from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.manifold import TSNE
import matplotlib.pyplot as plt

words_ = [
    ['russia', 1422], ['putin', 1235], ['war', 1191], ['standwithukraine', 793],
    ['nato', 628], ['russian', 596], ['peace', 569], ['world', 540], ['people', 527],
    ['today', 445], ['breaking', 437], ['kyiv', 406], ['news', 399], ['russians', 384],
    ['ukrainian', 361], ['help', 344], ['please', 344], ['them', 331], ['stop', 318],
    ['ukrainians', 318], ['children', 310], ['china', 310], ['country', 308],
    ['europe', 305], ['mariupol', 292], ['slavaukraini', 286], ['zelensky', 277],
    ['march', 271], ['sanctions', 271]
]

words, frequencies = zip(*words_)
text_corpus = [' '.join([word] * freq) for word, freq in zip(words, frequencies)]
tfidf_vectorizer = TfidfVectorizer()
tfidf_matrix = tfidf_vectorizer.fit_transform(text_corpus)

tsne = TSNE(n_components=2, perplexity=30, n_iter=300)
tsne_results = tsne.fit_transform(tfidf_matrix.toarray())

plt.figure(figsize=(10, 8))
plt.scatter(tsne_results[:, 0], tsne_results[:, 1], marker='o')

for i, word in enumerate(words):
    plt.annotate(word, (tsne_results[i, 0], tsne_results[i, 1]))

plt.xlabel("t-SNE Dimension 1")
plt.ylabel("t-SNE Dimension 2")
plt.title("t-SNE Visualization of Word Frequencies")
plt.grid(True)
plt.show()
