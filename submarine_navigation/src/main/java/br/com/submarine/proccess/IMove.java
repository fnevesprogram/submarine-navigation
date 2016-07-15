package br.com.submarine.proccess;

import br.com.submarine.exception.InvalidNavigationException;

public interface IMove<T> {

	public IMove<T> move(T t) throws InvalidNavigationException;
	
	public Integer getValue();
	public String getCadinatePoint();
}
