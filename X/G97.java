package X;

/* loaded from: G97.class */
public final class G97 extends 0DO implements C0Bd {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04 = 0;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G97(C2lh c2lh, java.util.Map map, 0DR r304) {
        super(3, r304);
        this.A05 = map;
        this.A01 = c2lh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G97(EKK ekk, ESK esk, 0DR r304) {
        super(3, r304);
        this.A03 = ekk;
        this.A05 = esk;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        G97 g97;
        0DR r0 = (0DR) obj3;
        if (this.A04 != 0) {
            g97 = new G97((EKK) this.A03, (ESK) this.A05, r0);
            g97.A01 = obj;
            g97.A02 = obj2;
        } else {
            g97 = new G97((C2lh) this.A01, (java.util.Map) this.A05, r0);
            g97.A02 = obj;
            g97.A03 = obj2;
        }
        return g97.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0101, code lost:
    
        if (r0.A08 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G97.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
