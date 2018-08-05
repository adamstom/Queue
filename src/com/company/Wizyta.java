package com.company;

public class Wizyta {
    private Pacjent pacjent;
    private Lekarz lekarz;

    public Wizyta(Pacjent pacjent, Lekarz lekarz) {
        this.pacjent = pacjent;
        this.lekarz = lekarz;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public void setLekarz(Lekarz lekarz) {
        this.lekarz = lekarz;
    }

    @Override
    public String toString() {
        return "Wizyta{" +
                "pacjent=" + pacjent +
                ", lekarz=" + lekarz +
                '}';
    }
}
