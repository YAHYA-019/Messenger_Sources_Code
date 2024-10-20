package X;

/* loaded from: Krb.class */
public final class Krb {
    public Object A00;
    public boolean A01 = false;
    public final 3eQ A02;

    public Krb(3eQ r302) {
        this.A02 = r302;
    }

    public void A00(28Q r302, C26c c26c, Kl7 kl7) {
        this.A01 = true;
        if (r302.A0T()) {
            Object obj = this.A00;
            r302.A0Q(obj == null ? null : String.valueOf(obj));
            return;
        }
        25L r0 = kl7.A01;
        if (r0 != null) {
            r302.A0i(r0);
            kl7.A03.A0A(r302, c26c, this.A00);
        }
    }

    public boolean A01(28Q r302, C26c c26c, Kl7 kl7) {
        Object obj = this.A00;
        if (obj == null) {
            return false;
        }
        if (!this.A01 && !kl7.A04) {
            return false;
        }
        if (r302.A0T()) {
            String.valueOf(obj);
            throw new Jxa(r302, 1BJ.A00(823));
        }
        kl7.A03.A0A(r302, c26c, obj);
        return true;
    }
}
