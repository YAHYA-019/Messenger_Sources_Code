package X;

import android.os.Bundle;

/* loaded from: G2x.class */
public final class G2x implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverServiceMessageHandler$10";
    public final /* synthetic */ DNc A00;
    public final /* synthetic */ String A01;

    public G2x(DNc dNc, String str) {
        this.A00 = dNc;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        DNc dNc = this.A00;
        if (dNc.A01 != null) {
            Bundle A05 = 1BK.A05();
            A05.putString("promiseID", this.A01);
            dNc.A01.A0B(A05, EOz.A04);
        }
    }
}
