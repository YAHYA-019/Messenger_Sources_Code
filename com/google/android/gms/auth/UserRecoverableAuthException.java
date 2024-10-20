package com.google.android.gms.auth;

import X.KMF;
import X.KQX;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;

/* loaded from: UserRecoverableAuthException.class */
public class UserRecoverableAuthException extends KQX {
    public final Intent zza;
    public final PendingIntent zzb;
    public final KMF zzc;

    public UserRecoverableAuthException(PendingIntent pendingIntent, Intent intent, KMF kmf, String str) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = kmf;
    }

    public Intent A00() {
        String str;
        Intent intent = this.zza;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.zzc.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
        } else {
            if (ordinal != 2) {
                return null;
            }
            str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
        }
        Log.e("Auth", str);
        return null;
    }
}
