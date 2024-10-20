package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: H2W.class */
public final class H2W extends 6TJ {
    public final AtomicReference A00;
    public final AtomicReference A01;
    public final /* synthetic */ HkR A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2W(HkR hkR) {
        super(false, false);
        this.A02 = hkR;
        this.A01 = GOn.A1L((Object) null);
        this.A00 = GOn.A1L((Object) null);
    }

    public Class A04() {
        return 6UA.class;
    }

    public /* bridge */ /* synthetic */ void A05(6QK r302) {
        6UA r0 = (6UA) r302;
        11T.A0F(r0, 0);
        GRS grs = this.A02.A00;
        if (grs != null) {
            String str = grs.B3e().value;
            C52j c52j = r0.A03;
            String str2 = c52j.value;
            int i = r0.A02;
            0fH.A0Y(str, str2, Integer.valueOf(i), Integer.valueOf(grs.Afn()), "FbGrootPlayer", "Handle Seek Event; State: %s; event trigger: %s; seek time %d; pos %d");
            if (i != -1) {
                grs.A12(c52j, i);
            }
            int i2 = r0.A01;
            if (i2 != -1) {
                grs.A0v(i2);
            }
        }
    }
}
