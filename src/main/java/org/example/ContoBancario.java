package org.example;

public class ContoBancario
{
    public double saldo;

    public ContoBancario()
    {
        saldo = 0.0;
    }
    public ContoBancario(double saldo)
    {
        this.saldo = saldo;
    }

    public double preleva(double prelievo) throws SaldoInsufficienteException
    {
        if(prelievo > saldo)
        {
            throw new SaldoInsufficienteException("", saldo, prelievo);
        }

        if(prelievo <= 0)
        {
            throw new ImportoNonValidoException("Importo non valido");
        }

        this.saldo = saldo - prelievo;

        return saldo;
    }
}
