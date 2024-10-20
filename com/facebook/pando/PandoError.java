package com.facebook.pando;

import X.11T;
import X.1BK;
import X.1BL;

/* loaded from: PandoError.class */
public final class PandoError {
    public final String additionalInfoFromRESTDoNotUseExceptForMigration;
    public final String apiErrorDebugInfo;
    public final String apiErrorDescription;
    public final boolean apiErrorIsSilent;
    public final boolean apiErrorIsTransient;
    public final boolean apiErrorRequiresReauth;
    public final String apiErrorSummary;
    public final String message;
    public final String tigonErrorAnalyticsDetail;
    public final String tigonErrorAnalyticsDomain;
    public final short tigonErrorCode;
    public final String tigonErrorCodeDescription;

    public PandoError(String str, String str2, String str3, short s, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8) {
        1BL.A1H(str, str2, str3);
        1BL.A1G(str4, str5);
        1BK.A1L(str6, 7, str7);
        11T.A0F(str8, 12);
        this.message = str;
        this.tigonErrorCodeDescription = str2;
        this.tigonErrorAnalyticsDomain = str3;
        this.tigonErrorCode = s;
        this.tigonErrorAnalyticsDetail = str4;
        this.apiErrorSummary = str5;
        this.apiErrorDescription = str6;
        this.additionalInfoFromRESTDoNotUseExceptForMigration = str7;
        this.apiErrorIsTransient = z;
        this.apiErrorIsSilent = z2;
        this.apiErrorRequiresReauth = z3;
        this.apiErrorDebugInfo = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PandoError(java.lang.String r302, java.lang.String r303, java.lang.String r304, short r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, boolean r310, boolean r311, boolean r312, java.lang.String r313, int r314, kotlin.jvm.internal.DefaultConstructorMarker r315) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.pando.PandoError.<init>(java.lang.String, java.lang.String, java.lang.String, short, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
