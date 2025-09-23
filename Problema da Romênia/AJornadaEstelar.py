import networkx as nx
import matplotlib.pyplot as plt
import math


GP = nx.Graph()

coordenadas = {
    "Terra": (0, 0),
    "Marte": (2, 1),
    "Júpiter": (4, 2),
    "Saturno": (6, 1),
    "Urano": (7, 4),
    "Netuno": (9, 3)
}

for planeta, pos in coordenadas.items():
    GP.add_node(planeta, pos=pos)

rotas = [
    ("Terra", "Marte", 3),
    ("Terra", "Júpiter", 7),
    ("Marte", "Júpiter", 2),
    ("Marte", "Saturno", 6),
    ("Júpiter", "Saturno", 2),
    ("Saturno", "Urano", 4),
    ("Urano", "Netuno", 3),
    ("Júpiter", "Urano", 5)
]
GP.add_weighted_edges_from(rotas)

def heuristica(u, v):
    x1, y1 = coordenadas[u]
    x2, y2 = coordenadas[v]
    return math.hypot(x2 - x1, y2 - y1)

origem = "Terra"
destino = "Netuno"
caminho = nx.astar_path(GP, origem, destino, heuristic=heuristica, weight="weight")

custo_total = nx.path_weight(GP, caminho, weight="weight")

print("Caminho encontrado:", caminho)
print("Custo total da viagem (anos-luz):", custo_total)

pos = coordenadas
plt.figure(figsize=(7, 6))
nx.draw(
    GP, pos,
    with_labels=True,
    node_color="lightblue",
    node_size=2000,
    font_size=11,
    font_weight="bold",
    edge_color="gray"
)

labels = nx.get_edge_attributes(GP, 'weight')
nx.draw_networkx_edge_labels(GP, pos, edge_labels=labels)
plt.show()