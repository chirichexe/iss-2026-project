package main.java.conway.domain;

public interface LifeInterface {
    // Life ha la capacità di calcolare come la griglia evolve passando alla generazione successiva
    void nextGeneration();

    // Life ha la capacità di dire se una cella specifica é viva o morta, dati riga e colonna
    boolean isAlive(int row, int col);

    // Life ha la capacità di impostare lo stato di una cella specifica, dati riga, colonna e valore booleano
    void setCell(int row, int col, boolean alive);

    // Life ha la capacità di restituire la cella corrispondente agli indici forniti
    ICell getCell(int x, int y);

    // Life ha la capacità di restituire la griglia
    Grid getGrid();

    // Life ha la capacità di riportare la griglia al suo stato iniziale
    void resetGrids();

    // public String gridRep();
}