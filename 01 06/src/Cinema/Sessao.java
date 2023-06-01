package Cinema;
import java.time.LocalDateTime;

public class Sessao {
	private int id;
	private int idFilme;
	private int idSala;
	private LocalDateTime horario;
	
	public Sessao(int id, int idFilme, int idSala, LocalDateTime horario) {
		this.id = id;
		this.idFilme = idFilme;
		this.idSala = idSala;
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public int getIdFilme() {
		return idFilme;
	}

	public int getIdSala() {
		return idSala;
	}

	public LocalDateTime getHorario() {
		return horario;
	}
}
