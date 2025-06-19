# FileWriter

## FileWriterDemo

L'obiettivo di questo esercizio è l'utilizzo delle classi **FileWriter** e **BufferedWriter**.

Creare la classe `FileWriterDemo` con all'interno il metodo `main()` dove istanzieremo la classe e lanceremo i metodi `run()` con le operazioni di scrittura non bufferizzate e bufferizzate.
Questo esercizio non richiede test JUnit.

> **Nota:** Scrivere all'interno del file `writed_sentences.txt` utilizzando la scrittura _non bufferizzata_, invece nel file `writed_sentences_buffered.txt` con la _scrittura bufferizzata_.

```java
class FileWriterDemo {

    public static void main(String[] args) {}

    private void run() {}
}
```

### Output

All'interno dei file `writed_sentences.txt` e `writed_sentences_buffered.txt` verranno scritte delle frasi con i diversi metodi di scrittura.

### Consigli

**_Scrittura non bufferizzata_**
Definire il `FileWriter fw` utilizzando il costruttore `FileWriter (File f)`.
Scrivi più righe all'interno del file con il metodo `fw.write(String row)`
Per terminare eseguire utilizza `fw.flush()` e `fw.close()`.

**_Scrittura bufferizzata_**
Definire il `FileWriter fw` utilizzando il costruttore `FileWriter (File f)`.
Definire il `BufferedWriter bw = new BufferedWriter(fw);`
Scrivi più righe all'interno del file con il metodo `bw.write(String row)`
Per terminare eseguire utilizza `bw.flush()` e `bw.close()`.

## Files

**writed_sentences.txt**
**writed_sentences_buffered.txt**
