package com.mayab.patrones.command;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		this.light.on();
	}
	
	public void undo() {
		this.light.off();
	}
}
