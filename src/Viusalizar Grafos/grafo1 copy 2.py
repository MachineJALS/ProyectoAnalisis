import networkx as nx #Citar estas librerias
import matplotlib.pyplot as plt #Citar estas librerias

# Crear un grafo
G = nx.Graph()
for i in range(80):
    G.add_node(i)

for i in range(10, 39):
    for j in range(i + 1, 39):
        G.add_edge(i, j)

#G.add_edges_from([(0, 1), (0, 2), (0, 3), (1, 2), (1, 3), (2, 3)]) #Primer Grafo


G.add_edge(0, 2);
G.add_edge(3, 8);
G.add_edge(4, 9);
G.add_edge(6, 7);
G.add_edge(1, 5);
G.add_edge(40, 45);
G.add_edge(41, 46);
G.add_edge(42, 50);
G.add_edge(43, 55);
G.add_edge(44, 49);
G.add_edge(51, 58);
G.add_edge(52, 59);
G.add_edge(60, 65);
G.add_edge(61, 70);
G.add_edge(62, 66);
G.add_edge(63, 67);
G.add_edge(64, 68);
G.add_edge(69, 75);
G.add_edge(71, 76);
G.add_edge(72, 77);
G.add_edge(73, 78);
G.add_edge(74, 79);




# Encontrar todos los cliques en el grafo
cliques = list(nx.find_cliques(G))
# Supongamos que queremos colorear el clique máximo
max_clique = max(cliques, key=len)

# Configurar colores para los nodos
node_color = ['skyblue' if not node in max_clique else 'limegreen' for node in G.nodes()]

# Dibujar el grafo
pos = nx.random_layout(G)# Posicionamiento de los nodos
nx.draw(G, pos, with_labels=True, node_color=node_color, node_size=1500, font_size=10, font_weight='bold')
plt.show()