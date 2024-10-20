package com.facebook.cameracore.ardelivery.xplat.models;

import X.1BK;
import X.1BL;
import X.4YV;
import X.7zR;

/* loaded from: XplatEffectLoggingInfo.class */
public final class XplatEffectLoggingInfo {
    public final String effectId;
    public final String effectInstanceID;
    public final String effectSessionID;
    public final boolean isPrefetch;
    public final String oneCameraActiveSessionID;
    public final String operationUniqueID;
    public final String productName;
    public final String productSessionID;
    public final String requestSource;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public XplatEffectLoggingInfo(X.FEf r302, com.facebook.cameracore.ardelivery.model.ARRequestAsset r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            X.1BL.A1F(r0, r1)
            r0 = r303
            X.FH3 r0 = r0.A02
            r304 = r0
            r0 = r304
            java.lang.String r0 = r0.A09
            r305 = r0
            java.lang.String r0 = ""
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L1d
            r0 = r306
            r305 = r0
        L1d:
            r0 = r302
            java.lang.String r0 = r0.A01
            r307 = r0
            r0 = r302
            java.lang.String r0 = r0.A00
            r308 = r0
            r0 = r304
            java.lang.String r0 = r0.A0A
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L38
            r0 = r306
            r309 = r0
        L38:
            r0 = r302
            boolean r0 = r0.A02
            r310 = r0
            r0 = r302
            java.lang.String r0 = r0.A04
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L4d
            r0 = r306
            r311 = r0
        L4d:
            r0 = r302
            java.lang.String r0 = r0.A03
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L5c
            r0 = r306
            r312 = r0
        L5c:
            java.lang.String r0 = X.1BK.A0t()
            r313 = r0
            r0 = r301
            r314 = r0
            r0 = r301
            r1 = r305
            r2 = r307
            r3 = r308
            r4 = r309
            r5 = r310
            r6 = r311
            r7 = r312
            r8 = r306
            r9 = r313
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r304
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = r0.A02
            r314 = r0
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            r304 = r0
            r0 = r314
            r1 = r304
            if (r0 != r1) goto L8b
            return
        L8b:
            java.lang.String r0 = "This adapter is only for effect asset"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo.<init>(X.FEf, com.facebook.cameracore.ardelivery.model.ARRequestAsset):void");
    }

    public XplatEffectLoggingInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8) {
        1BL.A1H(str, str2, str3);
        4YV.A1M(str5, 6, str6);
        this.effectId = str;
        this.operationUniqueID = str2;
        this.effectSessionID = str3;
        this.effectInstanceID = str4;
        this.isPrefetch = z;
        this.productSessionID = str5;
        this.productName = str6;
        this.requestSource = str7;
        this.oneCameraActiveSessionID = str8;
    }

    public XplatEffectLoggingInfo(boolean z) {
        this("", 7zR.A0s(), 7zR.A0s(), "", z, "", "", "", 1BK.A0t());
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectInstanceID() {
        return this.effectInstanceID;
    }

    public final String getEffectSessionID() {
        return this.effectSessionID;
    }

    public final String getOneCameraActiveSessionID() {
        return this.oneCameraActiveSessionID;
    }

    public final String getOperationUniqueID() {
        return this.operationUniqueID;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductSessionID() {
        return this.productSessionID;
    }

    public final String getRequestSource() {
        return this.requestSource;
    }

    public final boolean isPrefetch() {
        return this.isPrefetch;
    }
}
