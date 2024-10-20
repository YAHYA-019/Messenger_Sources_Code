package X;

import android.content.Context;

/* renamed from: X.84c, reason: invalid class name */
/* loaded from: 84c.class */
public final class C84c implements AY8 {
    public final /* synthetic */ 2PF A00;
    public final /* synthetic */ 1Iw A01;
    public final /* synthetic */ 2Yj A02;
    public final /* synthetic */ boolean A03;

    public C84c(2PF r302, 1Iw r303, 2Yj r304, boolean z) {
        this.A03 = z;
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = r304;
    }

    @Override // X.AY8
    public void BoD() {
        if (this.A03 || this.A00.A00()) {
            return;
        }
        9WD r0 = (9WD) 1Bn.A0A(68284);
        1Iw r02 = this.A01;
        Context A0A = 7zL.A0A(r02);
        2Yj r03 = this.A02;
        r0.A00(A0A, r03.A00, new AQd(r02, r03, 15));
    }
}
