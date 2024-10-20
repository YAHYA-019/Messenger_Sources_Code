package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jz, reason: invalid class name */
/* loaded from: 8jz.class */
public final class C8jz extends C1rj {
    public AnonymousClass554 A00;

    public C8jz() {
        super("BroadcastFlowM4ButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int Ahv;
        AnonymousClass554 anonymousClass554 = this.A00;
        int A00 = C0A8.A00(r302.A0D, 16.0f);
        C5Ax A002 = 5Av.A00(r302);
        A002.A01.A00 = A00;
        A002.A2d(2132279312);
        A002.A2a(7zL.A03());
        A002.A2i(anonymousClass554.A03);
        7zR.A1H(A002, 2KV.A05, false);
        A002.A2S(anonymousClass554.A01);
        boolean z = anonymousClass554.A04;
        A002.A2j(true);
        7zN.A1C(A002, r302, C8jz.class, "BroadcastFlowM4ButtonAccessoryLayout");
        float f = A00;
        MigColorScheme migColorScheme = anonymousClass554.A00;
        if (z) {
            A002.A2f(7zR.A0C(migColorScheme, f));
            Ahv = migColorScheme.B4i();
        } else {
            A002.A2f(C2cn.A02(f, migColorScheme.Aht()));
            Ahv = migColorScheme.Ahv();
        }
        return 7zM.A0x(A002, Ahv);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        ((C8jz) r0).A00.A02.onClick(((3xC) obj).A00);
        return null;
    }
}
