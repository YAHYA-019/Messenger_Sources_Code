package X;

import java.util.concurrent.Callable;

/* loaded from: J4y.class */
public final /* synthetic */ class J4y implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IeR A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ J4y(IeR ieR, long j, boolean z) {
        this.A01 = ieR;
        this.A02 = z;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        IeR ieR = this.A01;
        boolean z = this.A02;
        long j = this.A00;
        if (!ieR.A0d) {
            throw AnonymousClass001.A0N("Not recording video.");
        }
        I50 i50 = ieR.A08;
        i50.getClass();
        i50.A02(I50.A0Y, GOo.A0m());
        IeR.A06(ieR);
        if (z) {
            IeR.A05(ieR);
        }
        I50 i502 = ieR.A08;
        i502.getClass();
        i502.A02(I50.A0X, Long.valueOf(j));
        return ieR.A08;
    }
}
