package br.com.submarine.proccess;

import br.com.submarine.exception.InvalidNavigationException;

public interface IFactoryNavigation<T> {

	public IMove<T> processValueNavigationForMoviment(T t)
			throws InvalidNavigationException;	
}
