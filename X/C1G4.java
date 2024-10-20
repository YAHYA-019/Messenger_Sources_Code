package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* renamed from: X.1G4, reason: invalid class name */
/* loaded from: 1G4.class */
public final class C1G4 extends MutableLiveData {
    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        11T.A0H(lifecycleOwner, observer);
        super.observe(lifecycleOwner, observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(Observer observer) {
        11T.A0F(observer, 0);
        super.removeObserver(observer);
    }
}
