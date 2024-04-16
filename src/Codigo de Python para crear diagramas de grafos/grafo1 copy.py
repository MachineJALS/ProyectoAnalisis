import networkx as nx #Citar estas librerias
import matplotlib.pyplot as plt #Citar estas librerias
# Crear un grafo
G = nx.Graph()
for i in range(20):
    G.add_node(i)
# Generamos el clique de nuestro ejercicio
for i in range(13):
    for j in range(i + 1, 13):
        G.add_edge(i, j)
G.add_edge(13,14);
G.add_edge(18,15);
# Encontrar todos los cliques en el grafo
cliques = list(nx.find_cliques(G))
# Supongamos que queremos colorear el clique máximo
max_clique = max(cliques, key=len)
# Configurar colores para los nodos
node_color = ['skyblue' if not node in max_clique else 'limegreen' for node in G.nodes()]
# Dibujar el grafo
pos = nx.random_layout(G)  # Posicionamiento de los nodos
nx.draw(G, pos, with_labels=True, node_color=node_color, node_size=2000, font_size=12, font_weight='bold')
plt.show()