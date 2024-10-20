package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.2y3, reason: invalid class name */
/* loaded from: 2y3.class */
public final class C2y3 extends C00q implements Function1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y3(Object obj, String str, int i, int i2, boolean z) {
        super(1);
        this.A00 = i2;
        this.A03 = str;
        this.A01 = i;
        this.A02 = obj;
        this.A04 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean ADn;
        switch (this.A00) {
            case 0:
                C1ru c1ru = (C1ru) obj;
                11T.A0F(c1ru, 0);
                ADn = c1ru.ADm(this.A02, this.A03, this.A01, this.A04);
                break;
            case 1:
                C1ru c1ru2 = (C1ru) obj;
                11T.A0F(c1ru2, 0);
                ADn = c1ru2.ADn(this.A03, (Function1) this.A02, this.A01, this.A04);
                break;
            default:
                C1ru c1ru3 = (C1ru) obj;
                11T.A0F(c1ru3, 0);
                return c1ru3.Aan(this.A02, this.A03, this.A01, this.A04);
        }
        return Boolean.valueOf(ADn);
    }
}
