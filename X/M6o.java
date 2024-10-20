package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6o.class */
public final class M6o extends C00q implements Function1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6o(Object obj, int i, Object obj2, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj;
        this.A04 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6o(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        if (1 - i3 != 0) {
            this.A03 = iArr;
            this.A02 = i2;
            this.A04 = iArr2;
        } else {
            this.A04 = iArr;
            this.A02 = i2;
            this.A03 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
    
        if (r319 == null) goto L37;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M6o.invoke(java.lang.Object):java.lang.Object");
    }
}
