package X;

import java.util.Observable;

/* loaded from: G8b.class */
public final class G8b extends Observable {
    @Override // java.util.Observable
    public void notifyObservers(Object obj) {
        super.setChanged();
        super.notifyObservers(obj);
    }
}
