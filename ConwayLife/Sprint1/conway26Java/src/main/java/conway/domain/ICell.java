package main.java.conway.domain;

public interface ICell {
	// La cella ha la <capacità di impostare il proprio stato interno, identificato da un valore booleano
	void setStatus(boolean v);
	
	// Una cella ha la capacità di rispondere alla query "isAlive" per dire se è viva o morta tramite il valore del suo stato
	boolean isAlive();

	// Una cella ha la capacità di passare da uno stato all'altro (viva -> morta e viceversa)
	void switchCellState();
}
