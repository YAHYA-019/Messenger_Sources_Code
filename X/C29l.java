package X;

/* renamed from: X.29l, reason: invalid class name */
/* loaded from: 29l.class */
public final class C29l implements C1st {
    public final C2lr A00;
    public final C2ll A01;

    public C29l(C2lr c2lr, C2ll c2ll) {
        this.A00 = c2lr;
        this.A01 = c2ll;
    }

    @Override // X.C1st
    public 25P ADG(C23d c23d, int i, int i2) {
        Object obj = c23d.A02;
        c23d.A02 = null;
        final C2m0 BY9 = this.A00.BY9(new C2ly(c23d, obj), 23U.A00(i, i2));
        final C2lm c2lm = this.A01.A02;
        return new 25P() { // from class: X.2m1
            public 25P AcN(int i3) {
                throw AnonymousClass001.A0q("A PrimitiveLayoutResult has no children");
            }

            public int AcW() {
                return 0;
            }

            public Object AtS() {
                return BY9.A02;
            }

            public int B15() {
                return 0;
            }

            public int B16() {
                return 0;
            }

            public int B17() {
                return 0;
            }

            public int B18() {
                return 0;
            }

            public 25G B6y() {
                return c2lm;
            }

            public int BL7(int i3) {
                throw AnonymousClass001.A0q("A PrimitiveLayoutResult has no children");
            }

            public int BLJ(int i3) {
                throw AnonymousClass001.A0q("A PrimitiveLayoutResult has no children");
            }

            public int getHeight() {
                return BY9.A00;
            }

            public int getWidth() {
                return BY9.A01;
            }
        };
    }

    @Override // X.C1st
    public /* synthetic */ 25P ADH(C23d c23d, long j) {
        return ADG(c23d, 26N.A01(j), 26N.A00(j));
    }
}
