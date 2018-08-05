package com.company;

public enum Specjalizacja {
    BRAK(1),
    LARYNGOLOG(2),
    PEDIATRA(3),
    RODZINNY(4),
    GERIATRA(5);
    private int id;
    private Specjalizacja(int i){
        this.id=i;
    }

    public int getId() {
        return id;
    }
}
