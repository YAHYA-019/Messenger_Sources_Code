package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.currency.CurrencyAmount;

/* loaded from: Fmu.class */
public final class Fmu implements GJs {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ Ej4 A01;
    public final /* synthetic */ EzZ A02;
    public final /* synthetic */ GJr A03;

    public Fmu(FbUserSession fbUserSession, Ej4 ej4, EzZ ezZ, GJr gJr) {
        this.A01 = ej4;
        this.A02 = ezZ;
        this.A00 = fbUserSession;
        this.A03 = gJr;
    }

    @Override // X.GJs
    public void Blu() {
        EzZ ezZ = this.A02;
        Dkz dkz = ezZ.A04;
        EzO ezO = this.A01.A01;
        FbUserSession fbUserSession = this.A00;
        if (dkz != null) {
            ezO.A00(this.A03.getContext(), fbUserSession, dkz, null, ezZ, 0S2.A0C);
            return;
        }
        ezO.A01(this.A03.getContext(), fbUserSession, ER0.A04, ezZ, 0S2.A0C);
    }

    @Override // X.GJs
    public void Bm6(Context context, Dkz dkz, CurrencyAmount currencyAmount) {
        this.A01.A01.A00(context, this.A00, dkz, null, this.A02, 0S2.A0C);
    }

    @Override // X.GJs
    public void CDq() {
    }

    @Override // X.GJs
    public void CJi() {
    }
}
