/**
 * 
 */
package pt.carlos.alex.rosario;

import android.text.Html;
import android.text.Spanned;

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
		"5º Mistério - A Coroação de Nossa Senhora, no Céu, como Rainha dos Anjos e dos Santos",
		"Intenções finais"
	};
	
	public final static String [] GOZOSOS = {
		"1º Mistério - Anunciação do Anjo a Nossa Senhora",
		"2º Mistério - A visita de Nossa Senhora a Sua prima Santa Isabel",
		"3º Mistério - Nascimento de Jesus em Belém",
		"4º Mistério - Apresentação de Jesus no Templo",
		"5º Mistério - Jesus no Templo, entre os Doutores",
		"Intenções finais"
	};
	
	public final static String [] DOLOROSOS = {
		"1º Mistério - Agonia de Jesus no Horto das Oliveiras",
		"2º Mistério - A flagelação de Jesus",
		"3º Mistério - A coroação de espinhos",
		"4º Mistério - Jesus a caminho do Calvário com a cruz às costas",
		"5º Mistério - A crucificação e morte de Jesus",
		"Intenções finais"
	};
	
	public final static String [] LUMINOSOS = {
		"1º Mistério - O Batismo de Jesus no rio Jordão",
		"2º Mistério - A revelação de Jesus nas bodas de Caná",
		"3º Mistério - O Anúncio do Reino de Deus e o convite à conversão",
		"4º Mistério - A Transfiguração de Jesus",
		"5º Mistério - A Última Ceia de Jesus e a instituição da Eucarístia",
		"Intenções finais"
	};
	
	private static final String PRIMEIRO_GLORIOSO =
			"<html><head></head><body>1º Mistério - A ressureição de Nosso Senhor Jesus Cristo</body></html>";
	
	private static final String SEGUNDO_GLORIOSO = 
			"<html><head></head><body>2º Mistério - A Ascensão de Jesus ao Céu</body></html>";
	
	private static final String TERCEIRO_GLORIOSO = 
			"<html><head></head><body>3º Mistério - A descida do Espírito Santo sobre Nossa Senhora e os Apóstolos</body></html>";
	
	private static final String QUARTO_GLORIOSO = 
			"<html><head></head><body>4º Mistério - A Assunção de Nossa Senhora ao Céu</body></html>";
	
	private static final String QUINTO_GLORIOSO = 
			"<html><head></head><body>5º Mistério - A Coroação de Nossa Senhora, no Céu, como Rainha dos Anjos e dos Santos</body></html>";
		
	private static final String PRIMEIRO_GOZOSO =
			"<html><head></head><body><h1><font color=\"#0000FF\">1º Mistério Gozoso</font></h1><h2><font color=\"#0000FF\">Anúncio do nascimento de Jesus <sub><i>(Lc 1,26-38)</i></sub></font></h2><br /><sup><font color=\"#A52A2A\">26</font></sup>Ao sexto mês, o anjo Gabriel foi enviado por Deus a uma cidade da Galileia chamada Nazaré, <br /><sup><font color=\"#A52A2A\">27</font></sup>a uma virgem desposada com um homem chamado José, da casa de David; e o nome da virgem era Maria.<br /><sup><font color=\"#A52A2A\">28</font></sup>Ao entrar em casa dela, o anjo disse-lhe: «Salve, ó cheia de graça, o Senhor está contigo.» <br /><sup><font color=\"#A52A2A\">29</font></sup>Ao ouvir estas palavras, ela perturbou-se e inquiria de si própria o que significava tal saudação. <br /><sup><font color=\"#A52A2A\">30</font></sup>Disse-lhe o anjo: «Maria, não temas, pois achaste graça diante de Deus. <br /><sup><font color=\"#A52A2A\">31</font></sup>Hás-de conceber no teu seio e dar à luz um filho, ao qual porás o nome de Jesus. <br /><sup><font color=\"#A52A2A\">32</font></sup>Será grande e vai chamar-se Filho do Altíssimo. O Senhor Deus vai dar-lhe o trono de seu pai David, <br /><sup><font color=\"#A52A2A\">33</font></sup>reinará eternamente sobre a casa de Jacob e o seu reinado não terá fim.»<br /><sup><font color=\"#A52A2A\">34</font></sup>Maria disse ao anjo: «Como será isso, se eu não conheço homem?» <br /><sup><font color=\"#A52A2A\">35</font></sup>O anjo respondeu-lhe: «O Espírito Santo virá sobre ti e a força do Altíssimo estenderá sobre ti a sua sombra. Por isso, aquele que vai nascer é Santo e será chamado Filho de Deus. <br /><sup><font color=\"#A52A2A\">36</font></sup>Também a tua parente Isabel concebeu um filho na sua velhice e já está no sexto mês, ela, a quem chamavam estéril, <br /><sup><font color=\"#A52A2A\">37</font></sup>porque nada é impossível a Deus.» <br /><sup><font color=\"#A52A2A\">38</font></sup>Maria disse, então: «Eis a serva do Senhor, faça-se em mim segundo a tua palavra.» E o anjo retirou-se de junto dela. </body></html>";
	
	private static final String SEGUNDO_GOZOSO = 
			"<html><head></head><body><h1><font color=\"#0000FF\">2º Mistério Gozoso</font></h1><h2><font color=\"#0000FF\">A visita de Nossa Senhora a Sua prima Santa Isabel <sub><i>(Lc 1, 39-45)</i></sub></font></h2><br /><sup><font color=\"#A52A2A\">39</font></sup>Por aqueles dias, Maria pôs-se a caminho e dirigiu-se à pressa para a montanha, a uma cidade da Judeia. <br /><sup><font color=\"#A52A2A\">40</font></sup>Entrou em casa de Zacarias e saudou Isabel. <br /><sup><font color=\"#A52A2A\">41</font></sup>Quando Isabel ouviu a saudação de Maria, o menino saltou-lhe de alegria no seio e Isabel ficou cheia do Espírito Santo. <br /><sup><font color=\"#A52A2A\">42</font></sup>Então, erguendo a voz, exclamou: «Bendita és tu entre as mulheres e bendito é o fruto do teu ventre. <br /><sup><font color=\"#A52A2A\">43</font></sup>E donde me é dado que venha ter comigo a mãe do meu Senhor? <br /><sup><font color=\"#A52A2A\">44</font></sup>Pois, logo que chegou aos meus ouvidos a tua saudação, o menino saltou de alegria no meu seio. <br /><sup><font color=\"#A52A2A\">45</font></sup>Feliz de ti que acreditaste, porque se vai cumprir tudo o que te foi dito da parte do Senhor.» </body></html>";
	
	private static final String TERCEIRO_GOZOSO = 
			"<html><head></head><body><h1><font color=\"#0000FF\">3º Mistério Gozoso</font></h1><h2><font color=\"#0000FF\">Nascimento de Jesus em Belém <sub><i>(Lc 2,4-7)</i></sub></font></h2><br /><sup><font color=\"#A52A2A\">4</font></sup>Também José, deixando a cidade de Nazaré, na Galileia, subiu até à Judeia, à cidade de David, chamada Belém, por ser da casa e linhagem de David, <br /><sup><font color=\"#A52A2A\">5</font></sup>a fim de se recensear com Maria, sua esposa, que se encontrava grávida.<br /><sup><font color=\"#A52A2A\">6</font></sup>E, quando eles ali se encontravam, completaram-se os dias de ela dar à luz <br /><sup><font color=\"#A52A2A\">7</font></sup>e teve o seu filho primogénito, que envolveu em panos e recostou numa manjedoura, por não haver lugar para eles na hospedaria. </body></html>";
	
	private static final String QUARTO_GOZOSO = 
			"<html><head></head><body><h1><font color=\"#0000FF\">4º Mistério Gozoso</font></h1><h2><font color=\"#0000FF\">Apresentação de Jesus no Templo <sub><i>(Lc 2,22-24)</i></sub></font></h2><br /><sup><font color=\"#A52A2A\">22</font></sup>Quando se cumpriu o tempo da sua purificação, segundo a Lei de Moisés, levaram-no a Jerusalém para o apresentarem ao Senhor, <br /><sup><font color=\"#A52A2A\">23</font></sup>conforme está escrito na Lei do Senhor: «Todo o primogénito varão será consagrado ao Senhor» <br /><sup><font color=\"#A52A2A\">24</font></sup>e para oferecerem em sacrifício, como se diz na Lei do Senhor, duas rolas ou duas pombas. </body></html>";
	
	private static final String QUINTO_GOZOSO = 
			"<html><head></head><body><h1><font color=\"#0000FF\">5º Mistério Gozoso</font></h1><h2><font color=\"#0000FF\">Jesus no Templo, entre os Doutores <sub>(Lc 2,41-51)</sub></font></h2><br /><sup><font color=\"#A52A2A\">41</font></sup>Os pais de Jesus iam todos os anos a Jerusalém, pela festa da Páscoa. <br /><sup><font color=\"#A52A2A\">42</font></sup>Quando Ele chegou aos doze anos, subiram até lá, segundo o costume da festa. <br /><sup><font color=\"#A52A2A\">43</font></sup>Terminados esses dias, regressaram a casa e o menino ficou em Jerusalém, sem que os pais o soubessem. <br /><sup><font color=\"#A52A2A\">44</font></sup>Pensando que Ele se encontrava na caravana, fizeram um dia de viagem e começaram a procurá-lo entre os parentes e conhecidos. <br /><sup><font color=\"#A52A2A\">45</font></sup>Não o tendo encontrado, voltaram a Jerusalém, à sua procura.<br /><sup><font color=\"#A52A2A\">46</font></sup>Três dias depois, encontraram-no no templo, sentado entre os doutores, a ouvi-los e a fazer-lhes perguntas. <br /><sup><font color=\"#A52A2A\">47</font></sup>Todos quantos o ouviam, estavam estupefactos com a sua inteligência e as suas respostas.<br /><sup><font color=\"#A52A2A\">48</font></sup>Ao vê-lo, ficaram assombrados e sua mãe disse-lhe: «Filho, porque nos fizeste isto? Olha que teu pai e eu andávamos aflitos à tua procura!» <br /><sup><font color=\"#A52A2A\">49</font></sup>Ele respondeu-lhes: «Porque me procuráveis? Não sabíeis que devia estar em casa de meu Pai?»<br /><sup><font color=\"#A52A2A\">50</font></sup>Mas eles não compreenderam as palavras que lhes disse.<br /><sup><font color=\"#A52A2A\">51</font></sup>Depois desceu com eles, voltou para Nazaré e era-lhes submisso. Sua mãe guardava todas estas coisas no seu coração.</body></html>";
	
	private static final String PRIMEIRO_DOLOROSO =
			"<html><head></head><body>1º Mistério - Agonia de Jesus no Horto das Oliveiras</body></html>";
	
	private static final String SEGUNDO_DOLOROSO = 
			"<html><head></head><body>2º Mistério - A flagelação de Jesus</body></html>";
	
	private static final String TERCEIRO_DOLOROSO = 
			"<html><head></head><body>3º Mistério - A coroação de espinhos</body></html>";
	
	private static final String QUARTO_DOLOROSO = 
			"<html><head></head><body>4º Mistério - Jesus a caminho do Calvário com a cruz às costas</body></html>";
	
	private static final String QUINTO_DOLOROSO = 
			"<html><head></head><body>5º Mistério - A crucificação e morte de Jesus</body></html>";

	private static final String PRIMEIRO_LUMINOSO =
			"<html><head></head><body>1º Mistério - O Batismo de Jesus no rio Jordão</body></html>";
	
	private static final String SEGUNDO_LUMINOSO = 
			"<html><head></head><body>2º Mistério - A revelação de Jesus nas bodas de Caná</body></html>";
	
	private static final String TERCEIRO_LUMINOSO = 
			"<html><head></head><body>3º Mistério - O Anúncio do Reino de Deus e o convite à conversão</body></html>";
	
	private static final String QUARTO_LUMINOSO = 
			"<html><head></head><body>4º Mistério - A Transfiguração de Jesus</body></html>";
	
	private static final String QUINTO_LUMINOSO = 
			"<html><head></head><body>5º Mistério - A Última Ceia de Jesus e a instituição da Eucarístia</body></html>";
	
	private static final String INTENCOES = 
			"<html><head></head><body>Louvado seja Nosso Senhor Jesus Cristo<br />Para sempre seja louvado<br />com Sua mãe Maria Santíssima.</body></html>";

	
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
	
	public final static Spanned Obter_Misterio_do_Dia (int dia_semana, int misterio) {
		
		switch (MISTERIOS[dia_semana]) {
		case 0:
			return Gloriosos (misterio);
		case 1:
			return Gozosos (misterio);
		case 2:
			return Dolorosos (misterio);
		case 3:
			return Luminosos (misterio);
		}
				
		return null;
		
	}
	
	
	public static final Spanned Gozosos (int i) {
		
		switch (i) {
		case 0:
			return Html.fromHtml(PRIMEIRO_GOZOSO);
		case 1:
			return Html.fromHtml(SEGUNDO_GOZOSO);
		case 2:
			return Html.fromHtml(TERCEIRO_GOZOSO);
		case 3:
			return Html.fromHtml(QUARTO_GOZOSO);
		case 4:
			return Html.fromHtml(QUINTO_GOZOSO);
		case 5:
			return Html.fromHtml(INTENCOES);
		}
		
		return null;
	}
	
public static final Spanned Gloriosos (int i) {
		
		switch (i) {
		case 0:
			return Html.fromHtml(PRIMEIRO_GLORIOSO);
		case 1:
			return Html.fromHtml(SEGUNDO_GLORIOSO);
		case 2:
			return Html.fromHtml(TERCEIRO_GLORIOSO);
		case 3:
			return Html.fromHtml(QUARTO_GLORIOSO);
		case 4:
			return Html.fromHtml(QUINTO_GLORIOSO);
		case 5:
			return Html.fromHtml(INTENCOES);
		}
		
		return null;
	}
	
public static final Spanned Dolorosos (int i) {
	
	switch (i) {
	case 0:
		return Html.fromHtml(PRIMEIRO_DOLOROSO);
	case 1:
		return Html.fromHtml(SEGUNDO_DOLOROSO);
	case 2:
		return Html.fromHtml(TERCEIRO_DOLOROSO);
	case 3:
		return Html.fromHtml(QUARTO_DOLOROSO);
	case 4:
		return Html.fromHtml(QUINTO_DOLOROSO);
	case 5:
		return Html.fromHtml(INTENCOES);
	}
	
	return null;
}

public static final Spanned Luminosos (int i) {
	
	switch (i) {
	case 0:
		return Html.fromHtml(PRIMEIRO_LUMINOSO);
	case 1:
		return Html.fromHtml(SEGUNDO_LUMINOSO);
	case 2:
		return Html.fromHtml(TERCEIRO_LUMINOSO);
	case 3:
		return Html.fromHtml(QUARTO_LUMINOSO);
	case 4:
		return Html.fromHtml(QUINTO_LUMINOSO);
	case 5:
		return Html.fromHtml(INTENCOES);
	}
	
	return null;
}


}
