package com.mayab.patrones.observer;

import java.util.ArrayList;

public class Vuelo implements Observable {

	public ArrayList<Observer> observers;
	public String sala;
	public String salida;
	public String estado;
	public String destino;
	
	public Vuelo(String sala, String salida, String estado, String destino) {
		this.sala = sala;
		this.salida = salida;
		this.estado = estado;
		this.destino = destino;
		this.observers = new ArrayList<Observer>();
	}
	
	/**
	 * @return the observers
	 */
	public ArrayList<Observer> getObservers() {
		return observers;
	}

	/**
	 * @param observers the observers to set
	 */
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	/**
	 * @return the sala
	 */
	public String getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(String sala) {
		this.sala = sala;
		this.notifyObservers();
	}

	/**
	 * @return the salida
	 */
	public String getSalida() {
		return salida;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(String salida) {
		this.salida = salida;
		this.notifyObservers();
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
		this.notifyObservers();
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
		this.notifyObservers();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void deleteObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >=0) {
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i <observers.size();i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(sala, salida, estado, destino);
		}
	}
	
	

}
