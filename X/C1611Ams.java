package X;

/* renamed from: X.Ams, reason: case insensitive filesystem */
/* loaded from: Ams.class */
public final class C1611Ams extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C1611Ams(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = obj2;
        this.A02 = obj4;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r311 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611Ams.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        if (this.A00 == 0) {
            Bkp bkp = (Bkp) this.A03;
            7zP.A0e(bkp.A01.A00).markerEnd(1072830039, bkp.A00, (short) 3);
            return;
        }
        Bwp bwp = (Bwp) this.A01;
        C0e3 c0e3 = bwp.A02;
        c0e3.A01 = true;
        c0e3.A00 = null;
        C0e3 c0e32 = bwp.A03;
        c0e32.A01 = true;
        c0e32.A00 = null;
        0fH.A0r("payment_info_loader_tag", "Failed to load payment config.", th);
        BgG bgG = bwp.A00;
        if (bgG != null) {
            bgG.A00.A04.A00(new BmI((String) (!c0e3.A01 ? null : c0e3.A00), (String) (!c0e32.A01 ? null : c0e32.A00)), null);
        }
    }
}
