package X;

import com.facebook.inject.FbInjector;

/* loaded from: Jwk.class */
public final class Jwk extends Kuc {
    public final C00i A00;

    public Jwk() {
        super(FbInjector.A00());
        this.A00 = AbH.A0S();
    }

    @Override // X.Kuc
    public Integer A00(String str) {
        Integer num;
        synchronized (this.A09) {
            boolean z = false;
            if (!1BK.A1T(1BK.A0R(this.A08), (1G2) DKG.A0w().A0A.getValue()) && !str.equals(1BJ.A00(511)) && !str.equals(1BJ.A00(334)) && !str.equals("configs_fetch")) {
                z = super.A04();
            }
            if (z) {
                0fH.A0A(Jwk.class, "ZBD: performZeroBalanceDetection - ping disabled due to cool-down.");
                num = "periodic".equals(this.A06) ? 0S2.A0C : 0S2.A01;
            } else if (this.A05) {
                0fH.A0A(Jwk.class, "ZBD: performZeroBalanceDetection - ping disabled due to on-going ping.");
                num = "periodic".equals(this.A06) ? 0S2.A0Y : 0S2.A0N;
            } else {
                num = 0S2.A00;
                A03(new LZJ(this), num, str);
            }
        }
        return num;
    }
}
