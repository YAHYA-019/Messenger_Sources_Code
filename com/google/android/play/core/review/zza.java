package com.google.android.play.core.review;

import X.AbstractC2327GOs;
import X.AnonymousClass001;
import android.app.PendingIntent;

/* loaded from: zza.class */
public final class zza extends ReviewInfo {
    public final PendingIntent A00;
    public final boolean A01;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw AnonymousClass001.A0Q("Null pendingIntent");
        }
        this.A00 = pendingIntent;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ReviewInfo)) {
                return false;
            }
            zza zzaVar = (zza) ((ReviewInfo) obj);
            if (!this.A00.equals(zzaVar.A00) || this.A01 != zzaVar.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A01) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.A00.toString();
        boolean z = this.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ReviewInfo{pendingIntent=");
        A0k.append(obj);
        A0k.append(", isNoOp=");
        return AbstractC2327GOs.A0X(A0k, z);
    }
}
