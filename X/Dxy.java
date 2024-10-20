package X;

/* loaded from: Dxy.class */
public final class Dxy extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxy() {
        super("NTFBExpandableTextComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r0.getBoolean(49, false) == false) goto L10;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dxy.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Iw r308;
        C2l4 A0N;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1109243225) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            r308 = r0.A00;
            Dxy dxy = (Dxy) r02;
            FJ9.A0B(dxy.A00, dxy.A01, 48);
            if (r308.A02 == null) {
                return null;
            }
            A0N = 7zS.A0N(true);
        } else {
            if (i != 2137867948) {
                return null;
            }
            1Iv r03 = r302.A00;
            1Is r04 = r03.A01;
            r308 = r03.A00;
            Dxy dxy2 = (Dxy) r04;
            FJ9.A0B(dxy2.A00, dxy2.A01, 51);
            if (r308.A02 == null) {
                return null;
            }
            A0N = 7zQ.A0V(false, 0);
        }
        r308.A0H(A0N, "updateState:NTFBExpandableTextComponent.setExpanded");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((QNQ) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
