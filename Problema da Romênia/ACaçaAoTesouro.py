import math
import networkx as nx
import matplotlib.pyplot as plt 

G = nx.Graph()

ilhas = ["Ilha A", "Ilha B", "Ilha C", "Ilha D", "Ilha E", "Ilha F"]
G.add_nodes_from(ilhas)

pontes = [
    ("Ilha A", "Ilha B"),
    ("Ilha A", "Ilha C"),
    ("Ilha B", "Ilha D"),
    ("Ilha C", "Ilha E"),
    ("Ilha D", "Ilha F"),
    ("Ilha E", "Ilha F"),
    ("Ilha B", "Ilha E")
]
G.add_edges_from(pontes)

caminho = nx.shortest_path(G, source="Ilha A", target="Ilha F")

num_pontes = len(caminho) - 1

print("Menor caminho da Ilha A até a Ilha F:", caminho)
print("Número de pontes percorridas:", num_pontes)

plt.figure(figsize=(7, 6))
nx.draw(
    G,
    with_labels=True,
    node_color="lightblue",
    node_size=2000,
    font_size=11,
    font_weight="bold",
    edge_color="gray"
)
plt.show()
