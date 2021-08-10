package com.prueba.ml.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutanteController {


	@PostMapping("/mutant")
	public ResponseEntity<String> isMutant(@RequestBody Adn adn) {
		try {
			String[] Auxdna = new String[adn.getAdn().length];
			System.arraycopy(adn.getAdn(), 0, Auxdna, 0, adn.getAdn().length);


			if (Mutante.isMutant(Auxdna)) {
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.FORBIDDEN);
			}

		} catch (RuntimeException e) {

			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
	
	

	@GetMapping("/mutant")
	public ResponseEntity<String> MutantGet() {

		return new ResponseEntity<>(HttpStatus.OK);

	}


}
