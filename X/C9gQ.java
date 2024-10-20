package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9gQ, reason: invalid class name */
/* loaded from: 9gQ.class */
public final class C9gQ {
    public Context A00;
    public 9Xi A01;
    public ImmutableList A02;
    public boolean A03;
    public 1BY A04;
    public final C00i A05;
    public final C00i A06 = 1BQ.A02(16469);
    public final AHZ A07;
    public final C6wc A08;
    public final String A09;

    public C9gQ(1BO r302, C6wc c6wc, String str) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        this.A05 = new 1HH(context, 100181);
        this.A02 = null;
        this.A03 = false;
        this.A07 = new AHZ(this);
        this.A04 = 7zL.A0Q(r302);
        this.A09 = str;
        this.A08 = c6wc;
    }

    public static void A00(C9gQ c9gQ, ImmutableList immutableList, Throwable th) {
        9Xi r0;
        synchronized (c9gQ) {
            r0 = c9gQ.A01;
        }
        if (th == null) {
            if (r0 != null && immutableList != null) {
                r0.A00(immutableList);
            }
            synchronized (c9gQ) {
                c9gQ.A02 = immutableList;
            }
            return;
        }
        if (r0 != null) {
            C1qb c1qb = r0.A00;
            ELK elk = ELK.A02;
            if (c1qb.A0J() != null) {
                c1qb.A0G(7zL.A0f(new Object[]{elk, null, th}, 0), "updateState:AlbumDataServiceSection.updateState");
            }
            2Yg.A0H(c1qb, 0S2.A0N, th, true);
        }
    }
}
