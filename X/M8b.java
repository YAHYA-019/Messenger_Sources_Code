package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M8b.class */
public final class M8b extends C00q implements Function2 {
    public static final M8b A00 = new M8b();

    public M8b() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean A1V = AnonymousClass001.A1V(obj2);
        StringBuilder A0x = 7zO.A0x(obj, 0);
        A0x.append("Writing setLink to physical stream: buffer=");
        A0x.append(obj);
        R3t.A00(GOq.A13(", flushing=", A0x, A1V), new Object[0]);
        return 04S.A00;
    }
}
