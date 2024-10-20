package X;

/* loaded from: AQi.class */
public final class AQi extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQi(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQi(C2k5 c2k5, 9cU r303, Dvx dvx, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A04 = dvx;
        switch (i2) {
            case 5:
            case 6:
            case 7:
                this.A03 = c2k5;
                this.A01 = i;
                this.A02 = r303;
                break;
            default:
                this.A02 = c2k5;
                this.A01 = i;
                this.A03 = r303;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0152, code lost:
    
        if (r0 != null) goto L19;
     */
    @Override // X.C00m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQi.invoke():java.lang.Object");
    }
}
