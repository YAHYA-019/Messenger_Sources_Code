package X;

/* renamed from: X.Jau, reason: case insensitive filesystem */
/* loaded from: Jau.class */
public abstract class AbstractC2837Jau extends KoR {
    public KlG A02(Object obj) {
        boolean A1U;
        MED med;
        AbstractC2837Jau abstractC2837Jau;
        boolean z;
        AbstractC2837Jau abstractC2837Jau2;
        AbstractC2837Jau abstractC2837Jau3 = this;
        if (this instanceof C2834Jar) {
            A1U = AnonymousClass001.A1U(obj);
            med = null;
            z = false;
            abstractC2837Jau2 = abstractC2837Jau3;
        } else {
            if (this instanceof C2836Jat) {
                C2836Jat c2836Jat = (C2836Jat) this;
                A1U = AnonymousClass001.A1U(obj);
                med = c2836Jat.A00;
                abstractC2837Jau = c2836Jat;
            } else {
                A1U = AnonymousClass001.A1U(obj);
                med = null;
                abstractC2837Jau = abstractC2837Jau3;
            }
            z = true;
            abstractC2837Jau2 = abstractC2837Jau;
        }
        return new KlG(abstractC2837Jau2, med, obj, A1U, z);
    }
}
