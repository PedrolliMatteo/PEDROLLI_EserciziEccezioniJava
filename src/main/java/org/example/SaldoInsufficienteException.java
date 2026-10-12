package org.example;

public class SaldoInsufficienteException extends RuntimeException
{
    public SaldoInsufficienteException(String message)
    {
        super(message);
    }

    public SaldoInsufficienteException(String message, double saldoAttuale, double prelievoRichiesto)
    {
        super(message +
            "\nSaldo attuale: " + saldoAttuale +
            "\nPrelievo richiesto: " + prelievoRichiesto
        );
    }
}
