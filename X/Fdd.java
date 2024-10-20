package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.inject.FbInjector;

/* loaded from: Fdd.class */
public final class Fdd implements GJM {
    public EpN A00;
    public boolean A01;
    public final Fde A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final java.util.Map A09;

    public Fdd(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A08 = 1Bu.A03(r0, 16428);
        this.A04 = 1Bu.A03(r0, 376);
        this.A05 = 1Bu.A03(r0, AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS);
        this.A07 = 1Bq.A00(49322);
        this.A06 = 1BK.A0C();
        C1F6 c1f6 = (C1F6) 1Br.A0B(this.A04);
        Context A0I = 7zQ.A0I(r0);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Fde fde = new Fde(A0I, this, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A02 = fde;
            this.A09 = AnonymousClass001.A0u();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.GJM
    public void Brm(Context context, LifecycleOwner lifecycleOwner) {
        Fde.A00(context, lifecycleOwner, this.A02);
    }

    @Override // X.GJM
    public View Bs1(Context context, LifecycleOwner lifecycleOwner, Ecl ecl) {
        return this.A02.Bs1(context, lifecycleOwner, ecl);
    }

    @Override // X.GJM
    public void CnC(Ewv ewv) {
        this.A02.A00 = ewv;
    }
}
