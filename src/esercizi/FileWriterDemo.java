package esercizi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriterDemo fwd = new FileWriterDemo();
		fwd.run1();
		fwd.run2();
	}

	private void run1() {
		File file = new File("src/text_files/writed_sentences.txt");
		
		// Creo il FileWriter e scrivo delle righe nel file
		FileWriter fw = null;
		try {
			// fw = new FileWriter(file); // Con questo costruttore creo un FileWriter, che ogni volta che viene eseguito sovrascrive il file
			fw = new FileWriter(file, true); // Con questo costruttore creo un FileWriter, che ogni volta che viene eseguito, aggiunge le scritte sul file e non le sovrascrive.
			fw.write("Ciao sono la prima riga\n");
			fw.write("Io sono la seconda riga\n");
			fw.write("E io invece l'ultima..\n");
			
			/* Il flush serve quando ho un buffer di parole da scrivere. Il problema che va a 
			 * risolvere è quello della chiusura precoce del file (ovvero, noi diciamo attraverso
			 * il programma di scrivere delle cose, il sistema operativo inizia a farlo. 
			 * Subito dopo, quando chiudiamo il FileWriter, non è detto che il sistema operativo 
			 * abbia terminato di scrivere sul disco. Questa funzione allora serve a dire, prima 
			 * finisci di scrivere tutto, e solo dopo puoi chiudere il FileWriter.
			 * In questo caso che non usiamo il BUFFERED WRITER non serve a molto.*/
			fw.flush(); 
			fw.close();
			System.out.println("Riga scritta");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void run2() {
		File file = new File("src/text_files/writed_sentences_buffered.txt");
			
		// Creo il FileWriter
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Creo il BufferedWriter per scrivere tutto in una volta, creando una pila, e quindi avere performance migliori rispetto al FileReader che scrive ogni volta che glielo dico.
		BufferedWriter bw = null;
		
		try {
			// fw = new FileWriter(file); // Con questo costruttore creo un FileWriter, che ogni volta che viene eseguito sovrascrive il file
			bw = new BufferedWriter(fw); // Con questo costruttore creo un FileWriter, che ogni volta che viene eseguito, aggiunge le scritte sul file e non le sovrascrive.
			bw.write("Ciao sono la prima riga bufferizzata!\n");
			bw.write("Io sono la seconda riga bufferizzata\n");
			bw.write("E io invece l'ultima...");
			bw.flush(); 
			bw.close();
			System.out.println("Riga scritta - Buffered");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
