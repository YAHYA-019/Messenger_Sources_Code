package X;

/* renamed from: X.8lg, reason: invalid class name */
/* loaded from: 8lg.class */
public final class C8lg extends C1rj {
    public int A00;
    public 1Im A01;
    public 1Im A02;
    public 1Im A03;
    public C2ko A04;
    public C6wl A05;
    public C6wl A06;
    public C6wl A07;
    public 6wJ A08;

    public C8lg() {
        super("GalleryActionButtonsContainer");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A08, this.A05, this.A06, this.A07, this.A03, Integer.valueOf(this.A00)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0066, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8lg.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5Rn r0 = C3s9.A04;
        5X3 A01 = C3s9.A01(r0, "add_to_button", "edit_button", "send_button");
        A01.A02(7zQ.A01(A01, C2jm.A00));
        5X3 A012 = C3s9.A01(r0, "send_button", "add_to_button");
        A012.A06(new C2jo[]{C2jm.A07, C2jm.A08});
        return new 5XA(new 5X3[]{A01, A012});
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        if (c2ko.A02 != -1203683575) {
            return null;
        }
        1Iw r0 = c2ko.A00;
        C1rl c1rl = c2ko.A01;
        int i = ((9Pp) obj).A00;
        C8lg c8lg = (C8lg) c1rl;
        6wJ r02 = c8lg.A08;
        C6wl c6wl = c8lg.A06;
        C6wl c6wl2 = c8lg.A05;
        C6wl c6wl3 = c8lg.A07;
        11T.A0F(r0, 0);
        7zT.A1W(r02, c6wl, c6wl2, c6wl3);
        if (r0.A02 == null) {
            return null;
        }
        r0.A0G(7zL.A0f(new Object[]{r02, Integer.valueOf(i), c6wl, c6wl2, c6wl3}, 0), "updateState:GalleryActionButtonsContainer.onUpdateSelectionState");
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A04, this, r303);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
