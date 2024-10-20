package X;

import com.facebook.fury.context.ReqContext;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1w6, reason: invalid class name */
/* loaded from: 1w6.class */
public final class C1w6 extends C1w7 {
    public final 1wA A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final AtomicBoolean A07;
    public final C1w9 A08;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.1w9] */
    public C1w6(C1w0 c1w0, final ReqContext reqContext, String str, long j) {
        super(c1w0, reqContext, str, j);
        this.A05 = 1Bq.A00(16873);
        this.A03 = 1Bq.A00(16859);
        this.A06 = 1Bq.A00(84488);
        this.A02 = 1Bq.A00(33137);
        this.A04 = 1Bq.A00(33138);
        this.A01 = 1Bq.A00(49187);
        this.A07 = new AtomicBoolean(true);
        ?? r0 = new Object() { // from class: X.1w9
            public void A00(Runnable runnable) {
                C1wr c1wr = (C1wr) 1Br.A0B(C1w6.this.A05);
                Runnable A01 = C0jy.A01(reqContext, runnable);
                11T.A0D(A01);
                1BK.A1E(c1wr.A03).execute(A01);
            }
        };
        this.A08 = r0;
        this.A00 = new 1wA((C1w9) r0);
    }
}
