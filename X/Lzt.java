package X;

import kotlin.jvm.functions.Function2;

/* loaded from: Lzt.class */
public final class Lzt extends 0Ml implements Function2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzt(C2818Jaa c2818Jaa, 0DR r303, int i) {
        super(2, r303);
        this.A08 = i;
        this.A09 = c2818Jaa;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Lzt lzt = new Lzt((C2818Jaa) this.A09, r303, this.A08 != 0 ? 1 : 0);
        lzt.A06 = obj;
        return lzt;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x013a, code lost:
    
        if (r305 == 8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00cb -> B:4:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0124 -> B:16:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0127 -> B:5:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0076 -> B:4:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lzt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
