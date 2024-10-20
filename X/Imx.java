package X;

import com.google.common.base.Function;

/* loaded from: Imx.class */
public final class Imx implements Function, JI9 {
    public final 1De A00;
    public volatile Hfi A01;
    public volatile boolean A02;

    public Imx(1De r302) {
        this.A00 = r302;
    }

    @Override // X.JI9
    public void BlV(Hfi hfi, Hfi hfi2) {
        11T.A0F(hfi2, 1);
        this.A01 = hfi2;
    }

    @Override // X.JI9
    public void CSA() {
        this.A01 = null;
        this.A02 = false;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        synchronized (this) {
            11T.A0F((Object) null, 0);
            Hfi hfi = this.A01;
            if (!this.A02 && hfi != null) {
                RR4 rr4 = hfi.A00;
                if (rr4 != null && rr4.A02) {
                    this.A02 = true;
                }
            }
            1BY r0 = this.A00.A00;
            1Lm.A07(AbK.A0D(r0), r0, 114923);
            throw AnonymousClass001.A0Q("videoState");
        }
    }
}
