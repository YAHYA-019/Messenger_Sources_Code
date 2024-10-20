package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.logging.P2pPaymentsLoggingExtraData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fmw.class */
public final class Fmw implements GJs {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Enx A01;
    public final /* synthetic */ EzZ A02;
    public final /* synthetic */ RYQ A03;
    public final /* synthetic */ RYQ A04;
    public final /* synthetic */ GJr A05;

    public Fmw(FbUserSession fbUserSession, Enx enx, EzZ ezZ, RYQ ryq, RYQ ryq2, GJr gJr) {
        this.A01 = enx;
        this.A00 = fbUserSession;
        this.A02 = ezZ;
        this.A05 = gJr;
        this.A03 = ryq;
        this.A04 = ryq2;
    }

    @Override // X.GJs
    public void Blu() {
        EzO ezO = this.A01.A02;
        FbUserSession fbUserSession = this.A00;
        EzZ ezZ = this.A02;
        ezO.A01(this.A05.getContext(), fbUserSession, ER0.A04, ezZ, 0S2.A01);
    }

    @Override // X.GJs
    public void Bm6(Context context, Dkz dkz, CurrencyAmount currencyAmount) {
        this.A01.A02.A00(context, this.A00, dkz, null, this.A02, 0S2.A01);
    }

    @Override // X.GJs
    public void CDq() {
        Enx enx = this.A01;
        FGy fGy = enx.A01;
        EzZ ezZ = this.A02;
        if (fGy.A03(ezZ)) {
            EzO ezO = enx.A02;
            FbUserSession fbUserSession = this.A00;
            Fmn fmn = ezO.A01;
            String str = ezZ.A0H;
            fmn.A00(fbUserSession, new RTb(ezZ.A05, (ER3) null, (P2pPaymentsLoggingExtraData) null, (ImmutableList) null, ezZ.A0G, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null), str);
            return;
        }
        enx.A02.A01(this.A05.getContext(), this.A00, this.A03.A00, ezZ, 0S2.A01);
    }

    @Override // X.GJs
    public void CJi() {
        EzO ezO = this.A01.A02;
        FbUserSession fbUserSession = this.A00;
        EzZ ezZ = this.A02;
        ezO.A01(this.A05.getContext(), fbUserSession, this.A04.A00, ezZ, 0S2.A01);
    }
}
