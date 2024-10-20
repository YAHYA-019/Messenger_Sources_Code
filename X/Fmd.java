package X;

import com.facebook.payments.p2m.logging.McomThreadIds;
import com.google.common.collect.ImmutableMap;

/* loaded from: Fmd.class */
public final class Fmd implements GFa {
    public final int A00;
    public final Object A01;

    public Fmd(F7Z f7z, int i) {
        this.A00 = i;
        this.A01 = f7z;
    }

    @Override // X.GFa
    public final void BoD() {
        switch (this.A00) {
            case 0:
                ((F7Z) this.A01).A01(EQy.A03, EQz.A01, new McomThreadIds(null, "", "", 0, "", null, ""), (ImmutableMap) null, 7zK.A00(266));
                return;
            case 1:
                ((F7Z) this.A01).A01(EQy.A03, EQz.A01, new McomThreadIds(null, "", "", 0, "", null, ""), (ImmutableMap) null, "bae_call_kbank");
                return;
            default:
                return;
        }
    }
}
