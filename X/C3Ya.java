package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Ya, reason: invalid class name */
/* loaded from: 3Ya.class */
public final class C3Ya implements 4aT {
    public final 1iL A00;
    public final 2DJ A01;
    public final 2Fg A02;
    public final 2H7 A03;
    public final 4aT A04;

    public C3Ya(1iL r302, 2DJ r303, 2Fg r304, 2H7 r305, 4aT r306) {
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = r305;
        this.A02 = r304;
        this.A04 = r306;
    }

    public static void A00(InterfaceC04494b5 interfaceC04494b5, 2Ds r302, InterfaceC04444az interfaceC04444az, C3Ya c3Ya, InterfaceC04374as interfaceC04374as) {
        c3Ya.A04.CZW(new 36D(interfaceC04494b5, c3Ya.A00, r302, c3Ya.A02, c3Ya.A03, interfaceC04444az, AnonymousClass001.A1O(((C04364ar) interfaceC04374as).A07.A00 & 32)), interfaceC04374as);
    }

    public void CZW(final InterfaceC04444az interfaceC04444az, final InterfaceC04374as interfaceC04374as) {
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        2Dp r0 = c04364ar.A07;
        int i = r0.A00;
        boolean A1O = AnonymousClass001.A1O(i & 16);
        boolean A1O2 = AnonymousClass001.A1O(i & 32);
        if (!A1O && !A1O2) {
            this.A04.CZW(interfaceC04444az, interfaceC04374as);
            return;
        }
        final 2IU r02 = c04364ar.A05;
        r02.CEC(interfaceC04374as, "PartialDiskCacheProducer");
        final InterfaceC04494b5 Aji = this.A01.Aji(r0.A05.buildUpon().appendQueryParameter("fresco_partial", "true").build(), r0, c04364ar.A08);
        if (!A1O) {
            r02.CEA(interfaceC04374as, "PartialDiskCacheProducer", !r02.ChL(interfaceC04374as, "PartialDiskCacheProducer") ? null : C05004ck.A00("cached_value_found", String.valueOf(false)));
            A00(Aji, null, interfaceC04444az, this, interfaceC04374as);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((4bG) this.A00.get()).AvN().A05(Aji, atomicBoolean).A06(new C4cw() { // from class: X.3Ul
                @Override // X.C4cw
                public /* bridge */ /* synthetic */ Object D4C(C05034cn c05034cn) {
                    if (c05034cn.A09() || (c05034cn.A0A() && (c05034cn.A07() instanceof CancellationException))) {
                        r02.CE6(interfaceC04374as, "PartialDiskCacheProducer", (java.util.Map) null);
                        interfaceC04444az.Bn2();
                        return null;
                    }
                    if (c05034cn.A0A()) {
                        2IU r03 = r02;
                        InterfaceC04374as interfaceC04374as2 = interfaceC04374as;
                        r03.CE8(interfaceC04374as2, "PartialDiskCacheProducer", c05034cn.A07(), (java.util.Map) null);
                        C3Ya.A00(Aji, null, interfaceC04444az, this, interfaceC04374as2);
                        return null;
                    }
                    2Ds r04 = (2Ds) c05034cn.A08();
                    2IU r05 = r02;
                    if (r04 == null) {
                        InterfaceC04374as interfaceC04374as3 = interfaceC04374as;
                        r05.CEA(interfaceC04374as3, "PartialDiskCacheProducer", !r05.ChL(interfaceC04374as3, "PartialDiskCacheProducer") ? null : C05004ck.A00("cached_value_found", String.valueOf(false)));
                        C3Ya.A00(Aji, r04, interfaceC04444az, this, interfaceC04374as3);
                        return null;
                    }
                    InterfaceC04374as interfaceC04374as4 = interfaceC04374as;
                    r05.CEA(interfaceC04374as4, "PartialDiskCacheProducer", !r05.ChL(interfaceC04374as4, "PartialDiskCacheProducer") ? null : C05004ck.A01("cached_value_found", String.valueOf(true), "encodedImageSize", String.valueOf(r04.A05())));
                    int A05 = r04.A05() - 1;
                    1BK.A1S(AnonymousClass001.A1P(A05));
                    3xY r06 = new 3xY(0, A05);
                    r04.A08 = r06;
                    int A052 = r04.A05();
                    2Dp r07 = ((C04364ar) interfaceC04374as4).A07;
                    3xY r08 = r07.A06;
                    if (r08 != null && 0 <= r08.A00 && r08.A01 <= r06.A01) {
                        interfaceC04374as4.CaJ("disk", "partial");
                        r05.CS8(interfaceC04374as4, "PartialDiskCacheProducer", true);
                        interfaceC04444az.C9C(r04, 9);
                        return null;
                    }
                    InterfaceC04444az interfaceC04444az2 = interfaceC04444az;
                    interfaceC04444az2.C9C(r04, 8);
                    2IA A02 = 2IA.A02(r07);
                    int i2 = A052 - 1;
                    1BK.A1S(1BL.A1S(i2));
                    A02.A03 = new 3xY(i2, (-1) >>> 1);
                    C3Ya.A00(Aji, r04, interfaceC04444az2, this, new C04354aq(interfaceC04374as4, A02.A04()));
                    return null;
                }
            });
            interfaceC04374as.A5P(new C2585GiM(this, atomicBoolean, 2));
        }
    }
}
