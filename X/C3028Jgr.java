package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* renamed from: X.Jgr, reason: case insensitive filesystem */
/* loaded from: Jgr.class */
public final class C3028Jgr extends ViewModel {
    public static final 96H A0A = 96H.A07;
    public F7a A00;
    public String A01;
    public boolean A03;
    public boolean A04;
    public final 1Br A09 = 1Bq.A00(66360);
    public C00m A02 = M2r.A00;
    public final MutableLiveData A06 = new LiveData(A0A);
    public final MutableLiveData A07 = new LiveData(0);
    public final MutableLiveData A08 = new LiveData(false);
    public final MutableLiveData A05 = new LiveData(false);

    public final void A00() {
        F7a f7a = this.A00;
        if (f7a != null) {
            f7a.A01();
        }
        ((C1x1) 1Br.A0B(this.A09)).A00(this.A05, true);
    }

    public final void A01(96H r302) {
        ((C1x1) 1Br.A0B(this.A09)).A00(this.A06, r302);
    }

    public final void A02(Integer num) {
        ((C1x1) 1Br.A0B(this.A09)).A00(this.A07, Integer.valueOf(num != null ? num.intValue() : 0));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.F7a, java.lang.Object] */
    public final void A03(Integer num, String str, C00m c00m, boolean z, boolean z2) {
        F7a f7a = this.A00;
        if (f7a != null) {
            f7a.A01();
        }
        F7a f7a2 = this.A00;
        if (f7a2 != null) {
            f7a2.A00 = null;
        }
        this.A01 = str;
        this.A03 = z;
        this.A02 = c00m;
        this.A00 = new Object();
        this.A04 = z2;
        A01(A0A);
        A02(num);
        A04(false);
        ((C1x1) 1Br.A0B(this.A09)).A00(this.A05, false);
    }

    public final void A04(boolean z) {
        ((C1x1) 1Br.A0B(this.A09)).A00(this.A08, Boolean.valueOf(z));
    }
}
