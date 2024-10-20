package X;

/* loaded from: Ii0.class */
public final class Ii0 implements C6dl {
    public final int A00;
    public final Object A01;

    public Ii0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C6dl
    public void CGp(Hgo hgo) {
        int i = this.A00;
        11T.A0F(hgo, 0);
        Object obj = this.A01;
        6U2 A01 = i != 0 ? ((I9A) obj).A01() : (6U2) obj;
        if (A01 != null) {
            A01.A06(new C6do(hgo));
        }
    }

    @Override // X.C6dl
    public void CGt() {
        6U2 r304;
        if (this.A00 != 0) {
            I9A i9a = (I9A) this.A01;
            6U2 A01 = i9a.A01();
            if (A01 != null) {
                A01.A06(new C6do(null));
            }
            r304 = i9a.A01();
            if (r304 == null) {
                return;
            }
        } else {
            r304 = (6U2) this.A01;
            if (r304 == null) {
                return;
            } else {
                r304.A06(new C6do(null));
            }
        }
        r304.A06(new C6dp(false));
    }

    @Override // X.C6dl
    public void CGv(Throwable th) {
    }
}
