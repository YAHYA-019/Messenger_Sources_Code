package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.2y2, reason: invalid class name */
/* loaded from: 2y2.class */
public final class C2y2 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y2(Object obj, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = str;
        this.A01 = obj;
        this.A03 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 == 0) {
            C1ru c1ru = (C1ru) obj;
            11T.A0F(c1ru, 0);
            return c1ru.A8u((2Yv) this.A01, this.A02, this.A03);
        }
        C1ru c1ru2 = (C1ru) obj;
        11T.A0F(c1ru2, 0);
        c1ru2.D82((C2l4) this.A01, this.A02, this.A03);
        return 04S.A00;
    }
}
