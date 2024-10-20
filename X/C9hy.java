package X;

/* renamed from: X.9hy, reason: invalid class name */
/* loaded from: 9hy.class */
public abstract class C9hy {
    public final C9fO A00;
    public final 2lO A01;

    public C9hy(C9fO c9fO, 2lO r303) {
        this.A01 = r303;
        this.A00 = c9fO;
    }

    public static C9hy A07(C9hy c9hy, Integer num, Object obj, int i) {
        return c9hy.A08(null, new 2lO((2lO) null, new C2xi(num, obj, i)));
    }

    public C9hy A08(C9fO c9fO, 2lO r303) {
        if (this instanceof 8Hj) {
            2lO A00 = this.A01.A00(r303);
            if (c9fO == null) {
                c9fO = this.A00;
            }
            11T.A0F(c9fO, 2);
            return new C9hy(c9fO, A00);
        }
        boolean z = this instanceof 8Hn;
        2lO A002 = this.A01.A00(r303);
        if (z) {
            if (c9fO == null) {
                c9fO = this.A00;
            }
            11T.A0F(c9fO, 2);
            return new C9hy(c9fO, A002);
        }
        if (c9fO == null) {
            c9fO = this.A00;
        }
        11T.A0F(c9fO, 2);
        return new C9hy(c9fO, A002);
    }

    public final C9hy A09(CharSequence charSequence) {
        2lQ r0 = 2lO.A02;
        return A08(new C9fO(charSequence, this.A00.A01), 7zS.A0d((2lO) null, charSequence));
    }

    public final C9hy A0A(String str) {
        2lQ r0 = 2lO.A02;
        return A07(this, 0S2.A08, str, 1);
    }
}
