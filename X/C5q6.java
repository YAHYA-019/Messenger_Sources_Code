package X;

/* renamed from: X.5q6, reason: invalid class name */
/* loaded from: 5q6.class */
public final class C5q6 implements 4aT {
    public final 2DJ A00;
    public final 2Er A01;
    public final 4aT A02;

    public C5q6(2DJ r302, 2Er r303, 4aT r304) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = r304;
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        2IU r0 = c04364ar.A05;
        2Dp r02 = c04364ar.A07;
        Object obj = c04364ar.A08;
        3xX r03 = r02.A0F;
        if (r03 == null || r03.B43() == null) {
            this.A02.CZW(interfaceC04444az, interfaceC04374as);
            return;
        }
        r0.CEC(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer");
        InterfaceC04494b5 B42 = this.A00.B42(r02, obj);
        int i = r02.A00;
        boolean z = false;
        if ((i & 1) == 0) {
            z = true;
        }
        java.util.Map map = null;
        2EU AUN = z ? this.A01.AUN(B42) : null;
        if (AUN != null) {
            if (r0.ChL(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer")) {
                map = C05004ck.A00("cached_value_found", "true");
            }
            r0.CEA(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer", map);
            r0.CS8(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer", true);
            interfaceC04374as.CaJ("memory_bitmap", "postprocessed");
            interfaceC04444az.CEP(1.0f);
            interfaceC04444az.C9C(AUN, 1);
            AUN.close();
            return;
        }
        boolean z2 = r03 instanceof C5q8;
        boolean z3 = false;
        if ((i & 2) == 0) {
            z3 = true;
        }
        C5q9 c5q9 = new C5q9(B42, this.A01, interfaceC04444az, z2, z3);
        if (r0.ChL(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer")) {
            map = C05004ck.A00("cached_value_found", "false");
        }
        r0.CEA(interfaceC04374as, "PostprocessedBitmapMemoryCacheProducer", map);
        this.A02.CZW(c5q9, interfaceC04374as);
    }
}
