import org.example.ContoBancario;
import org.example.SaldoInsufficienteException;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() throws Exception
{
    ContoBancario cb = new ContoBancario();

    println("Inserire saldo del proprio conto bancario: ");
    cb.saldo = Double.parseDouble(readln());
    println("Inserire importo da prelevare: ");
    cb.preleva(Double.parseDouble(readln()));

    println("Nuovo saldo: " + cb.saldo);
}