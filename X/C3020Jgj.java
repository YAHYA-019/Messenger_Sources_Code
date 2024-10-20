package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Jgj, reason: case insensitive filesystem */
/* loaded from: Jgj.class */
public final class C3020Jgj extends LiveData {
    public 82Z A00;
    public Integer A01;
    public final LiveData A02;
    public final /* synthetic */ C6sy A05;
    public final Observer A04 = LR8.A00(this, 17);
    public final Observer A03 = LR8.A00(this, 16);

    public C3020Jgj(C6sy c6sy, ThreadKey threadKey) {
        this.A05 = c6sy;
        this.A02 = C6sy.A00(c6sy, threadKey);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        ((LiveData) this.A05.A01.getValue()).observeForever(this.A04);
        this.A02.observeForever(this.A03);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        ((LiveData) this.A05.A01.getValue()).removeObserver(this.A04);
        this.A02.removeObserver(this.A03);
    }
}
