package X;

import androidx.lifecycle.Observer;

/* loaded from: G1y.class */
public final class G1y implements Runnable {
    public static final String __redex_internal_original_name = "DefaultARFLMConsentManager$notifyObserversIfStateChanges$1";
    public final /* synthetic */ Observer A00;
    public final /* synthetic */ EOp A01;

    public G1y(Observer observer, EOp eOp) {
        this.A00 = observer;
        this.A01 = eOp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onChanged(this.A01);
    }
}
