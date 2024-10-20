package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* loaded from: K27.class */
public final class K27 extends AnonymousClass283 {
    @Override // X.AnonymousClass283
    public final /* bridge */ /* synthetic */ 2AE A01(Context context, Looper looper, 2A4 r304, 2A6 r305, 2A9 r306, Object obj) {
        Integer num = r306.A00;
        Bundle A05 = 1BK.A05();
        A05.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            A05.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        A05.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        A05.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        A05.putString("com.google.android.gms.signin.internal.serverClientId", null);
        A05.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        A05.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        A05.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        A05.putString("com.google.android.gms.signin.internal.logSessionId", null);
        A05.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new K38(context, A05, looper, r304, r305, r306);
    }
}
