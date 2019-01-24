package com.heaven.pattern.observer.instance;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by whd@zizizizizi.com on 2016/4/27.
 */
public class StateHolder {
	private final Set<StateListener> listeners = new HashSet<StateListener>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	public void addStateListener( StateListener listener ) {
		listeners.add( listener );
	}

	public void removeStateListener( StateListener listener ) {
		listeners.remove( listener );
	}
	private void broadcast( StateEvent stateEvent ) {
		for( StateListener listener : listeners ) {
			listener.stateChanged( stateEvent );
		}
	}
}
