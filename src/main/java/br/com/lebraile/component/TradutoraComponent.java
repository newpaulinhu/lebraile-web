package br.com.lebraile.component;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lebraile.util.Pares;
import br.com.lebraile.util.TradutoraBraile;

@Component
public class TradutoraComponent {

//	private static final Logger log = LoggerFactory.getLogger(TradutoraComponent.class);
	
	public Pares traduzirLetra(Character letra) {
		
//		Futura chamada para mqtt
//		List<Equipamento> equipamentos = equipamentoComponent.getEquipamentos();
//		RestTemplate restTemplate = new RestTemplate();
		 
//		equipamentos.forEach(e -> {
//			 log.info("Enviando a Letra: " + letraTraduzida.getCaractere() + "(" + letraTraduzida.getBraile() + ")" +" para o equipamento: " + e.getIp());
//			 try {
//				 restTemplate.getForObject("http://" + e.getIp() + ":80/braille/?pin="+ letraTraduzida.getBraile() + "&tempo=" + e.getTempoCaractere(), Object.class);
//			} catch (Exception e2) {
//				log.error("Erro Ao Enviar para o equipamento: " + e.getIp(), e2);
//			}
//		});
		
		return new TradutoraBraile().traduzirCaracter(letra);
	}
	
	public List<Pares> traduzirTexto(String texto) {
		List<Pares> textoTraduzido = new TradutoraBraile().traduzirTexto(texto);
		return textoTraduzido;
	}
	
}
