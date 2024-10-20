package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7g.class */
public final class M7g extends C00q implements Function2 {
    public static final M7g A00 = new M7g();

    public M7g() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        java.util.Map CXL = ((LO4) obj2).CXL();
        if (CXL.isEmpty()) {
            CXL = null;
        }
        return CXL;
    }
}
