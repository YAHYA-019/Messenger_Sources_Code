package X;

import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;

/* loaded from: Ftn.class */
public final class Ftn implements GGj {
    public final Ep4 A00;

    public Ftn(Ep4 ep4) {
        this.A00 = ep4;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        if (obj instanceof EDU) {
            Ep4 ep4 = this.A00;
            3oH r0 = ((ZeroSDKServiceProvider) ep4.A02.get()).A00;
            if (!((1Pz) ep4.A03.get()).A02() || r0 == null || !((Eqk) r0.getState()).A0A) {
                ((1I7) ep4.A01.get()).CkS(4YU.A0A("com.facebook.zero.ACTION_ZERO_REFRESH_TOKEN").putExtra("zero_token_request_reason", "zero_carrier_signal_state_changed"));
                return;
            }
            C00i c00i = ((Fud) ep4.A04.get()).A05;
            3oH r02 = ((ZeroSDKServiceProvider) c00i.get()).A00;
            1QE r307 = r02 == null ? 1QE.A02 : ((Eqk) r02.getState()).A04.A01;
            3oH r03 = ((ZeroSDKServiceProvider) c00i.get()).A00;
            if (r03 != null) {
                r03.ANn(new EE0((Ejt) null, r307, "zero_carrier_signal_state_changed"));
            }
        }
    }
}
