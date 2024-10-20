package com.facebook.tigon;

import X.11T;
import X.C40t;
import com.facebook.tigon.iface.TigonErrorCode;

/* loaded from: TigonError.class */
public final class TigonError {
    public static final C40t Companion = new Object();
    public static final TigonError None = new TigonError(TigonErrorCode.NONE, "", 0, "");
    public final String analyticsDetail;
    public final TigonErrorCode category;
    public final int domainErrorCode;
    public final String errorDomain;

    public TigonError(TigonErrorCode tigonErrorCode, String str, int i, String str2) {
        11T.A0F(tigonErrorCode, 1);
        11T.A0F(str, 2);
        11T.A0F(str2, 4);
        this.category = tigonErrorCode;
        this.errorDomain = str;
        this.domainErrorCode = i;
        this.analyticsDetail = str2;
    }
}
