package com.facebook.msys.mci;

import X.1SL;
import X.C1ju;
import X.C1un;

/* loaded from: EventLoggingData.class */
public class EventLoggingData {
    public final long mEventId;
    public final String mEventName;
    public final boolean mLocal;
    public final int mLogMode;
    public final C1un[] mParams;
    public final PrivacyContext mPrivacyContext;

    static {
        1SL.A00();
    }

    public EventLoggingData(PrivacyContext privacyContext, String str, long j, int i, boolean z, Object[] objArr) {
        int length = objArr.length;
        C1ju.A00(length % 4 == 0);
        int i2 = length / 4;
        this.mPrivacyContext = privacyContext;
        this.mEventName = str;
        this.mEventId = j;
        this.mLogMode = i;
        this.mLocal = z;
        C1un[] c1unArr = new C1un[i2];
        this.mParams = c1unArr;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 4;
            c1unArr[i3] = new C1un(objArr[i4 + 3], ((Number) objArr[i4 + 2]).byteValue(), ((Number) objArr[i4]).intValue(), ((Number) objArr[i4 + 1]).longValue());
        }
    }
}
