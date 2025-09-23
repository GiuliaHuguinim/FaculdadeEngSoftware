import networkx as nx
import matplotlib.pyplot as plt

NDG = nx.Graph()

pessoas = [ "Giulia","Matheus","Pollyanna", "Ester","Alisson"]

NDG.add_nodes_from(pessoas)

amigos = [
    ("Giulia", "Matheus"),
    ("Giulia", "Pollyanna"),
    ("Pollyanna", "Ester"),
    ("Ester", "Alisson"),
    ("Alisson", "Matheus")
]

NDG.add_edges_from(amigos)

print("Lista de Adjacência:")
for pessoa in NDG.nodes():
    print(f"{pessoa}: {list(NDG.adj[pessoa])}") 


plt.figure(figsize=(5,5))
nx.draw(NDG, 
        with_labels=True, 
        node_color="lightgreen", 
        node_size=800, 
        font_size=12, 
        font_weight="bold", 
        arrows=True)
plt.title("Grafo Não Dirigido")
plt.show()