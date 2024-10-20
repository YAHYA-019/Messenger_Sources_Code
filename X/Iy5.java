package X;

import com.facebook.rsys.crypto.gen.CryptoE2eeModel;

/* loaded from: Iy5.class */
public final class Iy5 implements Runnable {
    public static final String __redex_internal_original_name = "WebrtcUiHandler$onE2eeModel$1";
    public final /* synthetic */ CryptoE2eeModel A00;
    public final /* synthetic */ IRF A01;

    public Iy5(CryptoE2eeModel cryptoE2eeModel, IRF irf) {
        this.A01 = irf;
        this.A00 = cryptoE2eeModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IRF irf = this.A01;
        CryptoE2eeModel cryptoE2eeModel = this.A00;
        2QN r0 = irf.A1e;
        if (!11T.A0O(r0.A08, cryptoE2eeModel)) {
            r0.A08 = cryptoE2eeModel;
            2QN.A00(new C3lj() { // from class: X.3bz
                @Override // X.C3lj
                public final void Cir(3Fu r302) {
                    11T.A0F(r302, 0);
                    r302.A02();
                }
            }, r0);
        }
        if (r0.A0S) {
            IRF.A0H(cryptoE2eeModel, irf);
        }
    }
}
