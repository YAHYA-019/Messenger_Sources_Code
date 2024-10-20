package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* loaded from: K29.class */
public final class K29 extends AnonymousClass283 {
    @Override // X.AnonymousClass285
    public final /* bridge */ /* synthetic */ List A00(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : 1BK.A17(googleSignInOptions.A08);
    }

    @Override // X.AnonymousClass283
    public final /* synthetic */ 2AE A01(Context context, Looper looper, 2A4 r304, 2A6 r305, 2A9 r306, Object obj) {
        return new K31(context, looper, (GoogleSignInOptions) obj, r304, r305, r306);
    }
}
