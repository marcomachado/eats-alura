package br.com.caelum.eats.restaurante;

import java.time.DayOfWeek;
import java.time.LocalTime;

class HorarioDeFuncionamentoDto {

	private Long id;

	private DayOfWeek diaDaSemana;

	private LocalTime horarioDeAbertura;

	private LocalTime horarioDeFechamento;

	public HorarioDeFuncionamentoDto() {
	}

	public HorarioDeFuncionamentoDto(Long id, DayOfWeek diaDaSemana, LocalTime horarioDeAbertura,
									 LocalTime horarioDeFechamento) {
		this.id = id;
		this.diaDaSemana = diaDaSemana;
		this.horarioDeAbertura = horarioDeAbertura;
		this.horarioDeFechamento = horarioDeFechamento;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DayOfWeek diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public LocalTime getHorarioDeAbertura() {
		return horarioDeAbertura;
	}

	public void setHorarioDeAbertura(LocalTime horarioDeAbertura) {
		this.horarioDeAbertura = horarioDeAbertura;
	}

	public LocalTime getHorarioDeFechamento() {
		return horarioDeFechamento;
	}

	public void setHorarioDeFechamento(LocalTime horarioDeFechamento) {
		this.horarioDeFechamento = horarioDeFechamento;
	}

	public HorarioDeFuncionamentoDto(HorarioDeFuncionamento horario) {
		this(horario.getId(), horario.getDiaDaSemana(), horario.getHorarioDeAbertura(), horario.getHorarioDeFechamento());
	}
}
