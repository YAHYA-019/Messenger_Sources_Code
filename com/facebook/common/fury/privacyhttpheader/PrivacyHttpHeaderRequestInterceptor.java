package com.facebook.common.fury.privacyhttpheader;

import X.1Br;
import X.1Bu;
import X.2CX;
import X.C06w;
import X.C06z;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.RequestInterceptor;

/* loaded from: PrivacyHttpHeaderRequestInterceptor.class */
public final class PrivacyHttpHeaderRequestInterceptor extends RequestInterceptor {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(PrivacyHttpHeaderRequestInterceptor.class, "appSpecificFuryParams", "getAppSpecificFuryParams()Lcom/facebook/common/fury/experiment/AppSpecificFuryParams;", 0)};
    public static final 2CX Companion = new Object();
    public final 1Br appSpecificFuryParams$delegate = 1Bu.A00(66843);

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2CX] */
    static {
        C0il.A0B("privacyhttpheader");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0080, code lost:
    
        if (X.0Zi.A01(r0).A4P == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PrivacyHttpHeaderRequestInterceptor() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 66843(0x1051b, float:9.3667E-41)
            X.1Br r0 = X.1Bu.A00(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.appSpecificFuryParams$delegate = r1
            boolean r0 = com.facebook.common.fury.Fury.A04
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L83
            r0 = r301
            X.1Br r0 = r0.appSpecificFuryParams$delegate
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4Fz r0 = (X.C4Fz) r0
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r302
            android.content.Context r0 = (android.content.Context) r0
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            X.0t9 r0 = X.0Zi.A01(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A4S
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L83
            r0 = r301
            X.1Br r0 = r0.appSpecificFuryParams$delegate
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4Fz r0 = (X.C4Fz) r0
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            r0 = r302
            android.content.Context r0 = (android.content.Context) r0
            r302 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            X.0t9 r0 = X.0Zi.A01(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A4P
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L87
        L83:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L87:
            r0 = r303
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.mHybridData = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.fury.privacyhttpheader.PrivacyHttpHeaderRequestInterceptor.<init>():void");
    }

    public static final native HybridData initHybrid(boolean z);
}
