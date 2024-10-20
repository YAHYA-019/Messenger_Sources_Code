package X;

/* renamed from: X.77l, reason: invalid class name */
/* loaded from: 77l.class */
public final class C77l implements C77n {
    public final java.util.Map A00;

    public C77l() {
        this(new 0QO(0));
    }

    public C77l(java.util.Map map) {
        this.A00 = map;
    }

    @Override // X.C77n
    public C6xq AUP(Class cls) {
        11T.A0F(cls, 0);
        C6xq AUk = AUk(null, cls);
        if (AUk != null) {
            return AUk;
        }
        throw 1BK.A0h();
    }

    @Override // X.C77n
    public C6xq AUk(C6xq c6xq, Class cls) {
        11T.A0F(cls, 0);
        C6xq c6xq2 = (C6xq) this.A00.get(cls);
        if (c6xq2 != null) {
            return c6xq2;
        }
        return null;
    }

    @Override // X.C77n
    public C77n BBM() {
        0QO r0 = new 0QO(0);
        r0.putAll(this.A00);
        return new C77l(r0);
    }

    @Override // X.C77n
    public C6xq ClL(C6xq c6xq) {
        11T.A0F(c6xq, 0);
        return (C6xq) this.A00.put(c6xq.getClass(), c6xq);
    }

    @Override // X.C77n
    public void Cld(C6xq... c6xqArr) {
        11T.A0F(c6xqArr, 0);
        int length = c6xqArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            ClL(c6xqArr[i2]);
            i = i2 + 1;
        }
    }
}
