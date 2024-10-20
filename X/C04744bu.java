package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.4bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bu.class */
public final class C04744bu extends 2QB {
    public boolean A00;
    public final 1Br A01 = 1Bq.A00(16458);
    public final Context A02;
    public final 3cP A03;
    public final C08k A04;

    public C04744bu() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A02 = A00;
        C08j c08j = new 3cP(this);
        this.A03 = c08j;
        this.A04 = new C08k(c08j);
    }

    public void A06() {
        09X.A00();
        09X.A03(this.A02, this.A04);
        this.A00 = true;
    }

    public void A07() {
        if (this.A00) {
            this.A02.unregisterReceiver(this.A04);
            this.A00 = false;
        }
    }
}
