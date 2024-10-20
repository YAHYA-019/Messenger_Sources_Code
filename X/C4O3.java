package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.4O3, reason: invalid class name */
/* loaded from: 4O3.class */
public final class C4O3 extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4O3(Object obj, Object obj2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        4FO r307;
        switch (this.A00) {
            case 0:
                r307 = ((C4NW) ((C2lh) this.A02).A02).A00;
                break;
            case 1:
                r307 = ((4OO) ((C2lh) this.A02).A02).A00;
                break;
            case 2:
                r307 = ((C4Xn) ((C2lh) this.A02).A02).A00;
                break;
            default:
                C1rn c1rn = (C1rn) this.A01;
                4NO r0 = new 4NO((Function1) this.A02);
                11T.A0F(c1rn, 1);
                C1rn c1rn2 = new C1rn(r0.A00.invoke(c1rn.A00));
                c1rn.A01.add(new 4NQ(c1rn2, c1rn, r0));
                return c1rn2;
        }
        C00l c00l = (C00l) this.A01;
        11T.A0F(c00l, 0);
        r307.A00 = c00l;
        return null;
    }
}
