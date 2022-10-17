package animal;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		ArrayList<gato> gatinhos = new ArrayList<>();
		ArrayList<Cachorro> cachorros = new ArrayList<>();

		gato g1 = new gato();
		g1.setNome("Lola");
		g1.setRaca("Sianes");
		g1.setComprimento(45.0f);
		g1.setNumeropatas(4);
		g1.setCor("branco");
		g1.setEcossistema("casa");
		gatinhos.add(g1);

		gato g2 = new gato();
		g2.setNome("Gil");
		g2.setRaca("Angorá");
		g2.setComprimento(43.0f);
		g2.setNumeropatas(3);
		g2.setCor("marrom");
		g2.setEcossistema("casa");
		gatinhos.add(g2);

		gato g3 = new gato();
		g3.setNome("Bil");
		g3.setRaca("Sianes");
		g3.setComprimento(40.0f);
		g3.setNumeropatas(4);
		g3.setCor("Cinza");
		g3.setEcossistema("casa");
		gatinhos.add(g3);

		for (gato gato : gatinhos) {
			
			System.out.println(gato.getNome());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getNumeropatas());
			System.out.println(gato.getCor());
			System.out.println(gato.getEcossistema());
			
	
		}
		Cachorro c1 = new Cachorro();

		c1.setNome("Lady");
		c1.setRaca("pug");
		c1.setComprimento(28.0f);
		c1.setNumeropatas(4);
		c1.setCor("Marron");
		c1.setEcossistema("casa");
		cachorros.add(c1);

		Cachorro c2 = new Cachorro();
		c2.setNome("Toby");
		c2.setRaca("pastor alemão");
		c2.setComprimento(31.0f);
		c2.setNumeropatas(4);
		c2.setCor("Preto");
		c2.setEcossistema("casa");
		cachorros.add(c2);

		Cachorro c3 = new Cachorro();
		c3.setNome("Chico");
		c3.setRaca("Pincher");
		c3.setComprimento(20.0f);
		c3.setNumeropatas(4);
		c3.setCor("Marron");
		c3.setEcossistema("casa");
		cachorros.add(c3);
		

		for (Cachorro cachorro : cachorros) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getNumeropatas());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getEcossistema());
			
	
		}
	}

}
