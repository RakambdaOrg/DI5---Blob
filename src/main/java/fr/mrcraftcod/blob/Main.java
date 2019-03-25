package fr.mrcraftcod.blob;

import java.util.Random;

/**
 * Created by mrcraftcod (MrCraftCod - zerderr@gmail.com) on 2019-03-25.
 *
 * @author Thomas Couchoud
 * @since 2019-03-25
 */
public class Main{
	public static void main(String[] args){
		final var graph = new Graph(6);
		graph.getNode(0).ifPresent(n0 -> {
			graph.getNode(1).ifPresent(n1 -> graph.setUndirectionalDistance(n0, n1, 0.5));
			graph.getNode(3).ifPresent(n3 -> graph.setUndirectionalDistance(n0, n3, 0.5));
		});
		
		//Init
		final var rnd = new Random();
		final var d = new double[graph.getNodeCount()][graph.getNodeCount()];
		final var q = new double[graph.getNodeCount()][graph.getNodeCount()];
		for(int i = 0; i < graph.getNodeCount(); i++){
			for(int j = 0; j < graph.getNodeCount(); j++){
				d[i][j] = rnd.nextDouble();
				q[i][j] = 0D;
			}
		}
		graph.getNodes().forEach(n -> n.setPressure(0D));
		var count = 1;
		var shouldStop = false;
		
		//Loop
		do{
			final var pe = 0D;
			
			//TODO: Calculate pressure of every node
			
			for(int i = 0; i < graph.getNodeCount(); i++){
				for(int j = 0; j < graph.getNodeCount(); j++){
					//q[i][j] = (d[i][j]) / ();
				}
			}
			
			count++;
			shouldStop = count > 10000;
		}
		while(!shouldStop);
	}
}
