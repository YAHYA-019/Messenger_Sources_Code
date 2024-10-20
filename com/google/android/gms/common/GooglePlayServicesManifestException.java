package com.google.android.gms.common;

/* loaded from: GooglePlayServicesManifestException.class */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {
    public final int zza;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.zza = i;
    }
}
