package com.base.dp.behaviour.strategy;

public class DivisionCalculater extends Calculater{

	@Override
	public int calc(int a, int b) {
		if(validate(a,b)){
			return a/b;
		}
		return -1;
	}

}
