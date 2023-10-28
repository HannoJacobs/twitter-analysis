from gensim.models import Word2Vec
from sklearn.decomposition import PCA
import matplotlib.pyplot as plt

words_ = [  ['russia', 1422], ['putin', 1235], ['war', 1191], ['standwithukraine', 793], 
            ['nato', 628], ['russian', 596], ['peace', 569], ['world', 540], ['people', 527], 
            ['today', 445], ['breaking', 437], ['kyiv', 406], ['news', 399], ['russians', 384], 
            ['ukrainian', 361], ['help', 344], ['please', 344], ['them', 331], ['stop', 318], 
            ['ukrainians', 318], ['children', 310], ['china', 310], ['country', 308], 
            ['europe', 305], ['mariupol', 292], ['slavaukraini', 286], ['zelensky', 277], 
            ['march', 271], ['sanctions', 271]]

word_list = []
for word in words_:
    word_list.append(word[0])
sentences = [[word] for word in word_list]

model = Word2Vec(sentences, vector_size=100, window=5, min_count=1, sg=0)
word_embeddings = [model.wv[word] for word in word_list]
pca = PCA(n_components=2)
result = pca.fit_transform(word_embeddings)

plt.figure(figsize=(10, 6))
plt.scatter(result[:, 0], result[:, 1])

for i, word in enumerate(word_list):
    plt.annotate(word, xy=(result[i, 0], result[i, 1]))

plt.xlabel('Principal Component 1')
plt.ylabel('Principal Component 2')
plt.title('2D Visualization of Word Embeddings')
plt.show()
