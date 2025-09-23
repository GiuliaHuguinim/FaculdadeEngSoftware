import math
import networkx as nx
import matplotlib.pyplot as plt

edges = [
    ('Arad', 'Zerind', 75),
    ('Arad', 'Sibiu', 140),
    ('Arad', 'Timisoara', 118),
    ('Zerind', 'Oradea', 71),
    ('Oradea', 'Sibiu', 151),
    ('Timisoara', 'Lugoj', 111),
    ('Lugoj', 'Mehadia', 70),
    ('Mehadia', 'Drobeta', 75),
    ('Drobeta', 'Craiova', 120),
    ('Craiova', 'Pitesti', 138),
    ('Craiova', 'Rimnicu Vilcea', 146),
    ('Rimnicu Vilcea', 'Sibiu', 80),
    ('Rimnicu Vilcea', 'Pitesti', 97),
    ('Sibiu', 'Fagaras', 99),
    ('Fagaras', 'Bucareste', 211),
    ('Pitesti', 'Bucareste', 101),
    ('Bucareste', 'Giurgiu', 90),
    ('Bucareste', 'Urziceni', 85),
    ('Urziceni', 'Hirsova', 98),
    ('Hirsova', 'Eforie', 86),
    ('Urziceni', 'Vaslui', 142),
    ('Vaslui', 'Iasi', 92),
    ('Iasi', 'Neamt', 87)
]

romenia = nx.Graph()
romenia.add_weighted_edges_from(edges)

pos = {
    'Arad': (1, 4), 'Zerind': (0, 5), 'Oradea': (0, 6), 'Sibiu': (2, 5),
    'Timisoara': (1, 3), 'Lugoj': (2, 2), 'Mehadia': (2, 1), 'Drobeta': (1, 0),
    'Craiova': (3, 0), 'Pitesti': (4, 1), 'Rimnicu Vilcea': (3, 2), 'Fagaras': (4, 4),
    'Bucareste': (5, 3), 'Giurgiu': (5, 2), 'Urziceni': (6, 3), 'Hirsova': (7, 3),
    'Eforie': (8, 3), 'Vaslui': (7, 4), 'Iasi': (7, 5), 'Neamt': (6, 5)
}

origem = "Arad"

dfs = list(nx.dfs_preorder_nodes(romenia, source=origem))
bfs = list(nx.bfs_tree(romenia, source=origem))

print(" Ordem de visita (DFS) a partir de Arad:")
print(dfs)

print("\n Ordem de visita (BFS) a partir de Arad:")
print(bfs)

def heuristica(u, v):
    x1, y1 = pos[u]
    x2, y2 = pos[v]
    return math.hypot(x2 - x1, y2 - y1)

caminho_astar = nx.astar_path(romenia, "Arad", "Bucareste", heuristic=heuristica, weight="weight")
custo_total = nx.path_weight(romenia, caminho_astar, weight="weight")

print("\n⭐ Menor caminho (A*) de Arad até Bucareste:")
print(" → ".join(caminho_astar))
print(f"Custo total da viagem: {custo_total} km")

plt.figure(figsize=(12, 8))
nx.draw(
    romenia, pos,
    with_labels=True,
    node_color="lightyellow",
    node_size=2000,
    font_size=9,
    font_weight="bold",
    edge_color="gray"
)
labels = nx.get_edge_attributes(romenia, 'weight')
nx.draw_networkx_edge_labels(romenia, pos, edge_labels=labels, font_size=8)
plt.title("Mapa da Romênia 🇷🇴")
print(" Ordem de visita (DFS) a partir de Arad:")
plt.show()