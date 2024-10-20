package com.facebook.video.common.livestreaming;

import X.0Cc;
import X.7zS;
import X.AnonymousClass001;

/* loaded from: LiveStreamingError.class */
public class LiveStreamingError {
    public final String description;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final LiveStreamingError innerError;
    public final boolean isConnectivityLost;
    public final boolean isRecoverable;
    public final boolean isStreamTerminated;
    public final String reason;

    public LiveStreamingError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        7zS.A17(3, str2, str3, str4);
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.description = str3;
        this.fullDescription = str4;
        this.isRecoverable = z;
        this.isConnectivityLost = z2;
        this.isStreamTerminated = z3;
        this.innerError = null;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("\n        Error:");
        A0k.append(this.errorCode);
        A0k.append(", \n        Domain:");
        A0k.append(this.domain);
        A0k.append(", \n        Reason:");
        A0k.append(this.reason);
        A0k.append(", \n        Description:");
        A0k.append(this.description);
        A0k.append(", \n        Full Description:");
        A0k.append(this.fullDescription);
        A0k.append(", \n        isTransient:");
        A0k.append(this.isRecoverable);
        A0k.append(", \n        isConnectionLost:");
        A0k.append(this.isConnectivityLost);
        A0k.append(", \n        isStreamTerminated:");
        A0k.append(this.isStreamTerminated);
        String A0j = 0Cc.A0j(AnonymousClass001.A0d("\n        ", A0k));
        LiveStreamingError liveStreamingError = this.innerError;
        if (liveStreamingError != null) {
            liveStreamingError.toString();
        }
        return A0j;
    }
}
