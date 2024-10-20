package X;

import java.io.Serializable;

/* loaded from: D4z.class */
public final class D4z implements Serializable {
    public final String mMessageId;
    public final int mMaxRetryCount = 10;
    public int retryCount = 0;

    public D4z(String str) {
        this.mMessageId = str;
    }
}
