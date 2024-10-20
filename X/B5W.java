package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: B5W.class */
public class B5W extends AbstractC2385Gbm {
    public static final String __redex_internal_original_name = "AddressPickerLocationSearchResultsFragment";
    public Clv A00;
    public Clx A01;

    public 1iF A1R() {
        return AbF.A0C(1645341882290020L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2385Gbm
    public void A1S(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        C1F6 c1f6 = (C1F6) 7zO.A0l(this, 626);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Clv clv = new Clv(c1f6, A0G);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = clv;
            this.A01 = (Clx) 1Bn.A0A(83419);
            super.A1S(bundle);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.AbstractC2385Gbm
    public JEw A1X() {
        return this.A00;
    }

    @Override // X.AbstractC2385Gbm
    public MFU A1Y() {
        return this.A01;
    }
}
