package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M8Q.class */
public final class M8Q extends C00q implements Function2 {
    public static final M8Q A00 = new M8Q();

    public M8Q() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MBU mbu = (MBU) obj;
        L3z l3z = (L3z) obj2;
        LCI lci = new LCI(l3z.A00);
        MN5 mn5 = Kz2.A0L;
        return C0s8.A10(Kz2.A00(mn5, mbu, lci), Kz2.A00(mn5, mbu, new LCI(l3z.A01)));
    }
}
