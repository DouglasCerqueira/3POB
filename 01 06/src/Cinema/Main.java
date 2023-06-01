package Cinema;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Filme filme = new Filme(1, "Casablanca", "US", 1954, 90);
		filmes.add(filme);
		
		filme = new Filme(2, "E o Vento Levou...", "US", 1955, 110);
		filmes.add(filme);
		
		filme = new Filme(3, "Ben Hur", "US", 1957, 120);
		filmes.add(filme);
		
		filme = new Filme(4, "007", "US", 1960, 90);
		filmes.add(filme);
		
		ArrayList<Sala> salas = new ArrayList<Sala>();
		Sala sala = new Sala(1, 4, 5);
		salas.add(sala);
		
		sala = new Sala(2, 4, 5);
		salas.add(sala);
		
		sala = new Sala(3, 4, 5);
		salas.add(sala);
		
		sala = new Sala(4, 4, 5);
		salas.add(sala);
		
		ArrayList<Sessao> sessoes = new ArrayList<Sessao>();
		Sessao sessao = new Sessao(1, 1, 1, LocalDateTime.now());
		sessoes.add(sessao);
		
		sessao = new Sessao(2, 2, 2, LocalDateTime.now().plusMinutes(120));
		sessoes.add(sessao);
		
		sessao = new Sessao(3, 3, 3, LocalDateTime.now().plusMinutes(130));
		sessoes.add(sessao);
		
		sessao = new Sessao(4, 4, 4, LocalDateTime.now().plusMinutes(140));
		sessoes.add(sessao);
		
		filmes.forEach(x->System.out.println(x.getNome()));
		salas.forEach(x->System.out.println("\nSala: " + x.getId() + " \nQuantidade de Filas: " + x.getFilas() + " \nQuantidade de Cadeiras por Fila: " + x.getCadeirasFila()));
	}
}
