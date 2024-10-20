package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6c.class */
public final class M6c extends C00q implements Function1 {
    public static final M6c A00 = new M6c();

    public M6c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GNn gNn;
        MOt BAS;
        MQU AAf;
        String id;
        Long l = null;
        if ((obj instanceof GNn) && (gNn = (GNn) obj) != null && (BAS = gNn.BAS()) != null && (AAf = BAS.AAf()) != null && (id = AAf.getId()) != null) {
            l = 1BK.A0n(id);
        }
        return l;
    }
}
