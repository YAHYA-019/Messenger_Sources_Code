package X;

import android.content.Context;
import java.util.WeakHashMap;

/* loaded from: Bxj.class */
public final class Bxj {
    public CJ8 A00;
    public ChN A01;
    public final Context A02;
    public final C00i A03;
    public final AZg A04;
    public final EIg A05;
    public final FFj A06;
    public final D4t A07;

    /* JADX WARN: Type inference failed for: r0v29, types: [X.AZg, java.lang.Object, X.D07] */
    public Bxj(Context context, 1pK r303) {
        1BQ A02 = 1BQ.A02(84488);
        this.A03 = A02;
        this.A02 = context;
        FFj A00 = FFj.A00();
        this.A06 = A00;
        CJ8 cj8 = new CJ8();
        this.A00 = cj8;
        ChN chN = this.A01;
        if (chN == null) {
            chN = (ChN) 1Bn.A0E(context, (1BY) null, 83907);
            this.A01 = chN;
        }
        cj8.A03(chN, 1, 0L);
        D4t d4t = new D4t((C0dr) A02.get(), this.A00);
        this.A07 = d4t;
        this.A05 = new EIg(r303);
        r303.A1T(new C2065Daq(this));
        ?? obj = new Object();
        obj.A01 = A00;
        obj.A00 = d4t;
        obj.A02 = new WeakHashMap();
        this.A04 = obj;
    }
}
