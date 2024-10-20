package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fmj.class */
public final class Fmj implements GOL, GFf {
    public 1BY A00;
    public final Context A01;
    public final F7J A03;
    public final Fmh A04;
    public final Fch A06;
    public final 3oV A07;
    public final 6Gx A05 = DKD.A0Z();
    public final C00i A02 = AbH.A0F();

    public Fmj(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        Context A0J = 7zP.A0J();
        Fch A0b = DKD.A0b();
        3oV r0 = (3oV) 1Bi.A03(Constants.LOAD_RESULT_PGO);
        F7J f7j = (F7J) 1Bi.A03(99158);
        Fmh fmh = (Fmh) 1Bn.A0B(99136);
        this.A01 = A0J;
        this.A06 = A0b;
        this.A07 = r0;
        this.A03 = f7j;
        this.A04 = fmh;
        fmh.A01 = this;
    }

    @Override // X.GFf
    public void Brw(P2pPaymentConfig p2pPaymentConfig, Er2 er2) {
        ThreadKey threadKey = p2pPaymentConfig.A02;
        er2.A0A = (threadKey == null || !threadKey.A1F()) ? null : Long.toString(threadKey.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x019c, code lost:
    
        if (r0.A00 != X.Qnz.A01) goto L27;
     */
    @Override // X.GOL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.ListenableFuture Bz7(android.content.Context r302, com.facebook.payments.p2p.datamodel.P2pPaymentConfig r303, com.facebook.payments.p2p.datamodel.P2pPaymentData r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fmj.Bz7(android.content.Context, com.facebook.payments.p2p.datamodel.P2pPaymentConfig, com.facebook.payments.p2p.datamodel.P2pPaymentData, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // X.GOL
    public ListenableFuture Bz8(P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData) {
        ListenableFuture Bz8 = this.A04.Bz8(p2pPaymentConfig, p2pPaymentData);
        1Kd.A0E(FwK.A01(this, 26), Bz8);
        return Bz8;
    }

    @Override // X.GFg
    public void Cqu(RTb rTb) {
    }
}
