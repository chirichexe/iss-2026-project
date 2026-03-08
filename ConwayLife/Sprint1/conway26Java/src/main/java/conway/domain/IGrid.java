package main.java.conway.domain;

public interface IGrid {
	// Una griglia ha la capacità di dire quante righe la compongono tramite getRowsNum
	public int getRowsNum();

	// Una griglia ha la capacità di dire quante colonne la compongono tramite getColsNum
	public int getColsNum();

	// Una griglia ha la capacità di modificare lo stato di una cella specifica, dati il suo indice di riga, di colonna
	// e un valore booleano
	public void setCellValue(int x, int y, boolean state);

	// Una griglia ha la capacità di restituire la cella corrispondente agli indici di riga e colonna forniti tramite getCell
	public ICell getCell(int x, int y);

	// Una griglia ha la capacità di restituire il valore booleano della cella corrispondente agli indici di riga e colonna 
	// forniti tramite getCellValue
	public boolean getCellValue(int x, int y);

	// Una griglia ha la capacità di azzerarsi, riportandosi al suo stato iniziale tramite reset
	public void reset();
}
