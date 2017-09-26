package br.edu.univas.calc.api;

public class Result {
	
	private float first;
	private float second;
	private float result;
	
	public float getFirst() {
		return first;
	}
	
	public void setFirst(float first) {
		this.first = first;
	}

	public Result withFirst(float first){
		this.first = first;
		return this;
	}
	
	public float getSecond() {
		return second;
	}
	
	public void setSecond(float second) {
		this.second = second;
	}
	
	public Result withSecond(float second) {
		this.second = second;
		return this;
	}
	
	public float getResult() {
		return result;
	}
	
	public void setResult(float result) {
		this.result = result;
	}
	
	public Result withResult(float result) {
		this. result = result;
		return this;
	}
	
	
	
	

}
