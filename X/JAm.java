package X;

import kotlin.jvm.functions.Function1;

/* loaded from: JAm.class */
public final class JAm extends C00q implements Function1 {
    public static final JAm A00 = new JAm();

    public JAm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        11T.A0F(str, 0);
        IDO.A00.A04("RpCallFinder", 0Pz.A0j("findCall for ", str, " invoked before real implementation was set"), (Throwable) null);
        return null;
    }
}
