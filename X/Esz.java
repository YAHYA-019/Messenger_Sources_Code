package X;

import androidx.activity.ComponentActivity;

/* loaded from: Esz.class */
public final class Esz {
    public final int A00;
    public final Euv A01;

    public Esz(Euv euv, int i) {
        11T.A0F(euv, 2);
        this.A00 = i;
        this.A01 = euv;
    }

    public void A00() {
        Euv euv = this.A01;
        ComponentActivity componentActivity = euv.A03;
        String str = euv.A04;
        if (F1o.A00(componentActivity, str) != 0) {
            AnonymousClass088 anonymousClass088 = euv.A01;
            if (anonymousClass088 == null) {
                throw AnonymousClass001.A0N("Launcher has not been initialized");
            }
            anonymousClass088.A02(str);
        }
    }
}
