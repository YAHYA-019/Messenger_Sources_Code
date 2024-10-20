package X;

/* renamed from: X.4gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4gw.class */
public final class C06444gw implements InterfaceC06464gy {
    public final /* synthetic */ 4Zo A00;

    public C06444gw(4Zo r302) {
        this.A00 = r302;
    }

    @Override // X.InterfaceC06464gy
    public void CP7(5TY r302, int i) {
        4Zo r0 = this.A00;
        synchronized (r0.A0B) {
            C04r c04r = r0.A03;
            c04r.put(r302, Integer.valueOf(((Number) c04r.getOrDefault(r302, 0)).intValue() + 1));
        }
        C06474gz c06474gz = (C06474gz) r0.A05.A00.get();
        int i2 = 4Zo.A00(r0).A04.get();
        int i3 = 4Zo.A00(r0).A03.get();
        if (((2yD) c06474gz.A04.get()).AZk(36311298497710810L)) {
            C00i c00i = c06474gz.A08;
            C7z0 A02 = ((5iW) c00i.get()).A02(r302);
            if (A02 != null) {
                A02.Bcf("bg_prefetch_num", i2);
            }
            C7z0 A022 = ((5iW) c00i.get()).A02(r302);
            if (A022 != null) {
                A022.Bcf("bg_prerender_num", i3);
            }
            C06474gz.A01(c06474gz).execute(new 7ST(r302, c06474gz, i2, i3));
        }
    }

    @Override // X.InterfaceC06464gy
    public void CPM(5TY r302) {
        11T.A0F(r302, 0);
        4Zo r0 = this.A00;
        synchronized (r0.A0B) {
            C04r c04r = r0.A03;
            int intValue = ((Number) c04r.getOrDefault(r302, 1)).intValue() - 1;
            if (intValue == 0) {
                c04r.remove(r302);
            } else {
                c04r.put(r302, Integer.valueOf(intValue));
            }
        }
    }
}
