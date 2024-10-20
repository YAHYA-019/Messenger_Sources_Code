package com.facebook.wearable.common.comms.hera.host;

/* loaded from: ExtensionsKt.class */
public abstract class ExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object dispatchTo(com.meta.wearable.comms.calling.hera.engine.base.Any r301, com.facebook.wearable.common.comms.hera.host.intf.IHeraHost r302, X.0DR r303) {
        /*
            r0 = r303
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.host.ExtensionsKt$dispatchTo$1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8f
            r0 = r303
            r305 = r0
            r0 = r303
            com.facebook.wearable.common.comms.hera.host.ExtensionsKt$dispatchTo$1 r0 = (com.facebook.wearable.common.comms.hera.host.ExtensionsKt$dispatchTo$1) r0
            r305 = r0
            r0 = r305
            int r0 = r0.label
            r306 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r307 = r0
            r0 = r306
            r1 = r307
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L8f
            r0 = r306
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0.label = r1
        L36:
            r0 = r305
            java.lang.Object r0 = r0.result
            r308 = r0
            X.0Ds r0 = X.0Ds.A02
            r309 = r0
            r0 = r305
            int r0 = r0.label
            r304 = r0
            r0 = 1
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L62
            r0 = r304
            r1 = r307
            if (r0 != r1) goto La0
            r0 = r305
            java.lang.Object r0 = r0.L$0
            r301 = r0
            r0 = r308
            X.0Dt.A00(r0)
        L60:
            r0 = r301
            return r0
        L62:
            r0 = r308
            X.0Dt.A00(r0)
            r0 = r301
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Any"
            X.11T.A0I(r0, r1)
            r0 = r305
            r1 = r301
            r0.L$0 = r1
            r0 = r305
            r1 = r307
            r0.label = r1
            r0 = r302
            r1 = r301
            r2 = r305
            java.lang.Object r0 = r0.dispatchToStore(r1, r2)
            r310 = r0
            r0 = r310
            r1 = r309
            if (r0 != r1) goto L60
            r0 = r309
            return r0
        L8f:
            com.facebook.wearable.common.comms.hera.host.ExtensionsKt$dispatchTo$1 r0 = new com.facebook.wearable.common.comms.hera.host.ExtensionsKt$dispatchTo$1
            r305 = r0
            r0 = r305
            r1 = r303
            X.0DR r1 = (X.0DR) r1
            r0.<init>(r1)
            goto L36
        La0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.host.ExtensionsKt.dispatchTo(com.meta.wearable.comms.calling.hera.engine.base.Any, com.facebook.wearable.common.comms.hera.host.intf.IHeraHost, X.0DR):java.lang.Object");
    }
}
