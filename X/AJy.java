package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AJy.class */
public final class AJy extends 19S implements Function1 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AJy(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            if (r0 == 0) goto L2d
            java.lang.Class<X.DSA> r0 = X.DSA.class
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "handleImagineAction"
            r307 = r0
            java.lang.String r0 = "handleImagineAction(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineMediaAction;Z)V"
            r308 = r0
            r0 = 0
            r309 = r0
        L1d:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r308
            r6 = r309
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L2d:
            java.lang.Class<X.LtK> r0 = X.LtK.class
            r305 = r0
            r0 = 1
            r306 = r0
            java.lang.String r0 = "add"
            r307 = r0
            java.lang.String r0 = "add(Ljava/lang/Object;)Z"
            r308 = r0
            r0 = 8
            r309 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJy.<init>(java.lang.Object, int):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            ESI esi = (ESI) obj;
            11T.A0F(esi, 0);
            ((DSA) ((19S) this).receiver).A0A(esi, false);
        } else {
            ((LtK) ((19S) this).receiver).A0C(obj);
        }
        return 04S.A00;
    }
}
