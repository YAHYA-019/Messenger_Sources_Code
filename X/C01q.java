package X;

import android.os.Bundle;

/* renamed from: X.01q, reason: invalid class name */
/* loaded from: 01q.class */
public interface C01q {
    void abortBroadcast();

    int getResultCode();

    String getResultData();

    Bundle getResultExtras(boolean z);

    boolean isInitialStickyBroadcast();

    boolean isOrderedBroadcast();

    void setResult(int i, String str, Bundle bundle);

    void setResultCode(int i);

    void setResultData(String str);

    void setResultExtras(Bundle bundle);
}
