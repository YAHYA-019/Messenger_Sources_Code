package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.80k, reason: invalid class name */
/* loaded from: 80k.class */
public final class C80k implements 6CS {
    public final Function1 A00;
    public final /* synthetic */ C2lh A01;

    public C80k(C2lh c2lh, Function1 function1) {
        this.A01 = c2lh;
        this.A00 = function1;
    }

    public C2ld BIF(C2ld c2ld) {
        11T.A0F(c2ld, 0);
        int i = this.A01.A00;
        return new C2ld(c2ld, this.A00.invoke(c2ld.A00.get(i)), i);
    }
}
