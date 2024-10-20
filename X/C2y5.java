package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.2y5, reason: invalid class name */
/* loaded from: 2y5.class */
public final class C2y5 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2y5(Object obj, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = str2;
        this.A04 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C1ru c1ru = (C1ru) obj;
                11T.A0F(c1ru, 0);
                c1ru.D72((6CS) this.A01, this.A03, this.A02, this.A04);
                break;
            case 1:
                C1ru c1ru2 = (C1ru) obj;
                11T.A0F(c1ru2, 0);
                c1ru2.D81((C2l4) this.A01, this.A03, this.A02, this.A04);
                break;
            default:
                C1ru c1ru3 = (C1ru) obj;
                11T.A0F(c1ru3, 0);
                c1ru3.D83((C2l4) this.A01, this.A03, this.A02, this.A04);
                break;
        }
        return 04S.A00;
    }
}
