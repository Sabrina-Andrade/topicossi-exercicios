package br.edu.univas.calc.impl;

import br.edu.univas.calc.api.CalculadoraService;
import br.edu.univas.calc.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Result somar(float first, float second) {
		float result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

	@Override
	public Result subtrair(float first, float second) {
		float result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

}
