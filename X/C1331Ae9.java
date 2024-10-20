package X;

import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Ae9, reason: case insensitive filesystem */
/* loaded from: Ae9.class */
public final class C1331Ae9 extends MutableLiveData {
    public final long A02;
    public final AdA A03;
    public final C21N A05;
    public final AtomicBoolean A01 = 7zO.A15();
    public final 1Br A00 = 7zM.A0Z();
    public final C1qM A04 = new CxO(this, 11);
    public final Function1 A07 = new AV4(this, 29);
    public final Function1 A06 = new AV4(this, 28);

    public C1331Ae9(AdA adA, C21N c21n, long j) {
        this.A02 = j;
        this.A05 = c21n;
        this.A03 = adA;
    }

    public static final void A00(C1331Ae9 c1331Ae9) {
        if (c1331Ae9.A01.getAndSet(true)) {
            return;
        }
        AdA adA = c1331Ae9.A03;
        long j = c1331Ae9.A02;
        C2sa c2sa = C2sa.A00;
        11T.A0F(c2sa, 1);
        1Kd.A0E(D4p.A00(c1331Ae9.A07, c1331Ae9.A06, 22), new C1283Acn(c2sa, adA.A00, j).A00());
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        this.A05.A00(this.A04);
        A00(this);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        this.A05.A01(this.A04);
        this.A01.set(false);
    }
}
