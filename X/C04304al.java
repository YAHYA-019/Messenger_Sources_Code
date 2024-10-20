package X;

import android.graphics.Bitmap;

/* renamed from: X.4al, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4al.class */
public final class C04304al implements 4aT {
    public final 1iL A00;
    public final 1iL A01;
    public final 4aT A02;

    public C04304al(4aT r302, final 1CO r303) {
        this.A02 = r302;
        final int i = 0;
        this.A00 = new 1iL(this, r303, i) { // from class: X.30m
            public final int A00;
            public final Object A01;
            public final Object A02;

            {
                this.A00 = i;
                this.A01 = this;
                this.A02 = r303;
            }

            public /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(((2yD) this.A02).AZk(this.A00 != 0 ? 36310731562026053L : 36310731562091590L));
            }
        };
        final int i2 = 1;
        this.A01 = new 1iL(this, r303, i2) { // from class: X.30m
            public final int A00;
            public final Object A01;
            public final Object A02;

            {
                this.A00 = i2;
                this.A01 = this;
                this.A02 = r303;
            }

            public /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(((2yD) this.A02).AZk(this.A00 != 0 ? 36310731562026053L : 36310731562091590L));
            }
        };
    }

    public static InterfaceC04374as A00(Bitmap.Config config, InterfaceC04374as interfaceC04374as) {
        2Dp r0 = ((C04364ar) interfaceC04374as).A07;
        C2r9 c2r9 = r0.A07;
        if (config == c2r9.A03) {
            return interfaceC04374as;
        }
        2IA A02 = 2IA.A02(r0);
        2rA r02 = new 2rA();
        r02.A00(c2r9);
        r02.A03 = config;
        A02.A04 = new C2r9(r02);
        return new C04354aq(interfaceC04374as, A02.A04());
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        4aT r305;
        C2r9 c2r9;
        C2r9 c2r92;
        2Dp r0 = ((C04364ar) interfaceC04374as).A07;
        if (((Boolean) this.A00.get()).booleanValue() && (((c2r92 = r0.A07) == null || c2r92.A05 == null) && r0.A0F == null)) {
            r305 = this.A02;
            interfaceC04374as = A00(Bitmap.Config.HARDWARE, interfaceC04374as);
        } else {
            if (((Boolean) this.A01.get()).booleanValue() && (((c2r9 = r0.A07) == null || c2r9.A05 == null) && r0.A0F == null)) {
                interfaceC04374as = A00(Bitmap.Config.RGB_565, interfaceC04374as);
            }
            r305 = this.A02;
        }
        r305.CZW(interfaceC04444az, interfaceC04374as);
    }
}
