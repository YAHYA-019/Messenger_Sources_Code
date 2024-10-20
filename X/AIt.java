package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AIt.class */
public final class AIt extends 0DO implements Function2 {
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIt(Object obj, 0DR r303, float f, float f2, int i) {
        super(2, r303);
        this.A03 = i;
        this.A04 = obj;
        this.A01 = f;
        this.A02 = f2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AIt(this.A04, r303, this.A01, this.A02, this.A03 != 0 ? 1 : 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A03
            r303 = r0
            X.0Ds r0 = X.0Ds.A02
            r304 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L5f
            r0 = r305
            if (r0 != 0) goto L9c
            r0 = r302
            X.0Dt.A00(r0)
            r0 = r301
            java.lang.Object r0 = r0.A04
            X.8DP r0 = (X.8DP) r0
            X.16K r0 = r0.A08
            r307 = r0
            r0 = r301
            float r0 = r0.A01
            r308 = r0
            r0 = r301
            float r0 = r0.A02
            r309 = r0
            X.9cK r0 = new X.9cK
            r310 = r0
            r0 = r310
            r1 = r308
            r2 = r309
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = r307
            r1 = r310
            r2 = r301
            java.lang.Object r0 = r0.emit(r1, r2)
            r310 = r0
        L57:
            r0 = r310
            r1 = r304
            if (r0 != r1) goto La0
            r0 = r304
            return r0
        L5f:
            r0 = r305
            if (r0 != 0) goto L9c
            r0 = r302
            X.0Dt.A00(r0)
            r0 = r301
            java.lang.Object r0 = r0.A04
            X.Jan r0 = (X.C2831Jan) r0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r0.A09
            r311 = r0
            r0 = r301
            float r0 = r0.A01
            r309 = r0
            r0 = r301
            float r0 = r0.A02
            r312 = r0
            r0 = r309
            r1 = r312
            long r0 = X.KvH.A00(r0, r1)
            r313 = r0
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = r311
            r1 = r301
            r2 = r313
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableKt.A00(r0, r1, r2)
            r310 = r0
            goto L57
        L9c:
            r0 = r302
            X.0Dt.A00(r0)
        La0:
            X.04S r0 = X.04S.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
