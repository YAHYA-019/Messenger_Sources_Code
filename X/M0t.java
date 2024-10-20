package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M0t.class */
public final class M0t extends 01I implements Function2 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M0t(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L3e;
                default: goto L20;
            }
        L20:
            java.lang.Class<X.5e7> r0 = X.C5e7.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "readIfAbsent"
            r307 = r0
            java.lang.String r0 = "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"
            r308 = r0
        L2f:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r308
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L3e:
            java.lang.Class<X.5x8> r0 = X.C5x8.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "onKeyboardVisibilityChanged"
            r307 = r0
            java.lang.String r0 = "onKeyboardVisibilityChanged(ZI)V"
            r308 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0t.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (r0.Aj5(r0).BUZ() == false) goto L14;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = 2
            r1 = r304
            int r0 = r0 - r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L51
            r0 = r302
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r305 = r0
            r0 = r303
            int r0 = X.AnonymousClass001.A03(r0)
            r306 = r0
            java.util.Set r0 = X.C5x8.A01
            r307 = r0
            r0 = r307
            java.util.Iterator r0 = r0.iterator()
            r308 = r0
        L27:
            r0 = r308
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4d
            r0 = r308
            java.lang.Object r0 = r0.next()
            X.6s9 r0 = (X.C6s9) r0
            r307 = r0
            r0 = r307
            r1 = r305
            r2 = r306
            r0.C3H(r1, r2)
            goto L27
        L4d:
            X.04S r0 = X.04S.A00
            return r0
        L51:
            r0 = r302
            kotlinx.serialization.descriptors.SerialDescriptor r0 = (kotlinx.serialization.descriptors.SerialDescriptor) r0
            r302 = r0
            r0 = r303
            int r0 = X.AnonymousClass001.A03(r0)
            r309 = r0
            r0 = r302
            r1 = r301
            java.lang.Object r0 = X.JR0.A0o(r0, r1)
            X.5e7 r0 = (X.C5e7) r0
            r310 = r0
            r0 = r302
            r1 = r309
            boolean r0 = r0.BRu(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L8d
            r0 = r302
            r1 = r309
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.Aj5(r1)
            r307 = r0
            r0 = r307
            boolean r0 = r0.BUZ()
            r309 = r0
            r0 = 1
            r304 = r0
            r0 = r309
            if (r0 != 0) goto L92
        L8d:
            r0 = 0
            r304 = r0
            r0 = 0
            r307 = r0
        L92:
            r0 = r310
            r1 = r304
            r0.A00 = r1
            r0 = r304
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0t.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
