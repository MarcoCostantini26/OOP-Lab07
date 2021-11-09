package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	List<T> list = new ArrayList<>();
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}

	@Override
	public Acceptor<T> acceptor() {
		Iterator<T> iterator = list.iterator();
		return new Acceptor<T>() {

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(newElement.equals(iterator.next())) {
					return;
				}else {
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(!iterator.hasNext()) {
					return;
				}else {
					throw new EndNotAcceptedException();
				}
				
			} 
			
		};
	}

}
