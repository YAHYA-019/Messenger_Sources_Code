package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: Fmv.class */
public final class Fmv implements GJs {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Elt A01;
    public final /* synthetic */ EzZ A02;
    public final /* synthetic */ RYQ A03;
    public final /* synthetic */ GJr A04;

    public Fmv(FbUserSession fbUserSession, Elt elt, EzZ ezZ, RYQ ryq, GJr gJr) {
        this.A01 = elt;
        this.A00 = fbUserSession;
        this.A02 = ezZ;
        this.A04 = gJr;
        this.A03 = ryq;
    }

    @Override // X.GJs
    public void Blu() {
        EzO ezO = this.A01.A02;
        FbUserSession fbUserSession = this.A00;
        EzZ ezZ = this.A02;
        ezO.A01(this.A04.getContext(), fbUserSession, ER0.A04, ezZ, 0S2.A00);
    }

    @Override // X.GJs
    public void Bm6(Context context, Dkz dkz, CurrencyAmount currencyAmount) {
        this.A01.A02.A00(context, this.A00, dkz, null, this.A02, 0S2.A00);
    }

    @Override // X.GJs
    public void CDq() {
        EzO ezO = this.A01.A02;
        FbUserSession fbUserSession = this.A00;
        EzZ ezZ = this.A02;
        ezO.A01(this.A04.getContext(), fbUserSession, this.A03.A00, ezZ, 0S2.A00);
    }

    @Override // X.GJs
    public void CJi() {
    }
}
