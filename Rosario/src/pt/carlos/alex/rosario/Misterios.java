/**
 * 
 */
package pt.carlos.alex.rosario;

/**
 * @author Alexandre Carlos
 * 
 */
public final class Misterios {

	public static final String[] DESIGN = { 
		"Mistérios Gloriosos (da Glória)", // 0
		"Mistérios Gozosos (da Alegria)", // 1
		"Mistérios Dolorosos (da Dor)", // 2
		"Mistérios Luminosos (da Luz)" // 3
	};

	public final static int[] MISTERIOS = { -1, // Erro ???
			0, // Domingo - Mistérios Gloriosos (da Glória)
			1, // 2ª Feira - Mistérios Gozosos (da Alegria)
			2, // 3ª Feira - Mistérios Dolorosos (da Dor)
			0, // 4ª Feira - Mistérios Gloriosos (da Glória)
			3, // 5ª Feira - Mistérios Luminosos (da Luz)
			2, // 6ª Feira - Mistérios Dolorosos (da Dor)
			1  // Sábado - Mistérios Gozosos (da Alegria)
	};
	
	public final static String [] GLORIOSOS = {
		"1º Mistério - A ressureição de Nosso Senhor Jesus Cristo",
		"2º Mistério - A Ascensão de Jesus ao Céu",
		"3º Mistério - A descida do Espírito Santo sobre Nossa Senhora e os Apóstolos",
		"4º Mistério - A Assunção de Nossa Senhora ao Céu",
		"5º Mistério - A Coroação de Nossa Senhora, no Céu, como Rainha dos Anjos e dos Santos"
	};
	
	public final static String [] GOZOSOS = {
		"1º Mistério - Anunciação do Anjo a Nossa Senhora",
		"2º Mistério - A visita de Nossa Senhora a Sua prima Santa Isabel",
		"3º Mistério - Nascimento de Jesus em Belém",
		"4º Mistério - Apresentação de Jesus no Templo",
		"5º Mistério - Jesus no Templo, entre os Doutores"
	};
	
	public final static String [] DOLOROSOS = {
		"1º Mistério - Agonia de Jesus no Horto das Oliveiras!",
		"2º Mistério - A fflagelação de Jesus",
		"3º Mistério - A coroação de espinhos",
		"4º Mistério - Jesus a caminho do Calvário com a cruz às costas",
		"5º Mistério - A crucificação e morte de Jesus"
	};
	
	public final static String [] LUMINOSOS = {
		"1º Mistério - O Batismo de Jesus no rio Jordão",
		"2º Mistério - A revelação de Jesus nas bodas de Caná",
		"3º Mistério - O Anúncio do Reino de Deus e o convite à conversão",
		"4º Mistério - A Transfiguração de Jesus",
		"5º Mistério - A Última Ceia de Jesus e a instituição da Eucarístia"
	};
	
	/**
	 * @param dia_semana int com o dia da semana 
	 * 			1 - Domingo
	 * 			2 - 2ª Feira
	 * 			3 - 3ª Feira
	 * 			4 - 4ª Feira
	 * 			5 - 5ª Feira
	 * 			6 - 6ª Feira
	 * 			7 - Sábado
	 * @return String Array com os Mistérios associados ao dia da semana
	 */
	public final static String [] Design__Misterios (int dia_semana) {
		switch (MISTERIOS[dia_semana]) {
		case 0:
			return GLORIOSOS;
		case 1:
			return GOZOSOS;
		case 2:
			return DOLOROSOS;
		case 3:
			return LUMINOSOS;
		default:
			break;
		}
		
		return null;
	}
}
