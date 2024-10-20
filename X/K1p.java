package X;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: K1p.class */
public final class K1p extends UserRecoverableAuthException {
    public final int zza;

    public K1p(Intent intent, String str, int i) {
        super(null, intent, KMF.A01, str);
        this.zza = i;
    }
}
