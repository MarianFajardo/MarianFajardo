package com.prueba.ml.restservice;

public class Mutante {

	private String[] dna = {};

	public Mutante(final String[] dna) {
		this.dna = dna;
	}

	static public boolean isMutant (String[] dna) {
		int m = dna.length;
		char arregloSeq[][] = new char[m][6];
		// String [][] arregloSeq = {};
		for (int i = 0; i < m; i++) {
			String seqX = dna[i];
			//System.out.println("Palabra " + seqX);
			char[] seqY = seqX.toCharArray();

			for (int j = 0; j < seqY.length; j++) {
				char letter = seqY[j];
				//String letString = String.valueOf(letter);
				arregloSeq[i][j] = letter;
			}

		}


		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < arregloSeq.length; j++) {

				if (i <= 6 && j <= 3) {
					if (arregloSeq[i][j+1] == arregloSeq[i][j] && arregloSeq[i][j+2] == arregloSeq[i][j] && arregloSeq[i][j+3] == arregloSeq[i][j]){
						return true;
					}
				} 

				if (i <= 3 && j <= arregloSeq.length-4) {
					if (arregloSeq[i+1][j] == arregloSeq[i][j] && arregloSeq[i+2][j] == arregloSeq[i][j] && arregloSeq[i+3][j] == arregloSeq[i][j]){
						return true;
					}
				}

				if (i <= 3 && j <= arregloSeq.length-4) {
					if (arregloSeq[i+1][j+1] == arregloSeq[i][j] && arregloSeq[i+2][j+2] == arregloSeq[i][j] && arregloSeq[i+3][j+3] == arregloSeq[i][j]){
						return true;
					}
				}

			}
		}
		System.out.println("respuesta: "+dna);
		return false;
	}

	public String[] getDna() {
		return dna;
	}

}
