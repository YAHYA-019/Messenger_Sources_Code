package X;

/* loaded from: Lfu.class */
public final class Lfu implements MGV {
    public final KPV A00;
    public final KPX A01;
    public final Lj4 A02;
    public final L4o A03;
    public final Integer A04;
    public final String A05;

    public Lfu(KPV kpv, KPX kpx, Lj4 lj4, Integer num, String str) {
        this.A05 = str;
        this.A03 = L9b.A01(str);
        this.A02 = lj4;
        this.A00 = kpv;
        this.A01 = kpx;
        this.A04 = num;
    }

    public static Lfu A00(KPV kpv, KPX kpx, Lj4 lj4, Integer num, String str) {
        if (kpx == KPX.A03) {
            if (num != null) {
                throw JQx.A10("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw JQx.A10("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new Lfu(kpv, kpx, lj4, num, str);
    }

    @Override // X.MGV
    public L4o Azu() {
        return this.A03;
    }
}
