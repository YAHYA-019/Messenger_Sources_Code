package com.google.android.gms.fido.fido2;

import X.0FI;
import X.4FE;
import X.KY4;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;

/* loaded from: zzg.class */
public final class zzg extends zzq {
    public final /* synthetic */ 4FE A00;

    public zzg(4FE r302) {
        this.A00 = r302;
        0FI.A09(1210502956, 0FI.A03(-1992138113));
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void DCQ(PendingIntent pendingIntent, Status status) {
        int A03 = 0FI.A03(1595407424);
        KY4.A00(status, this.A00, pendingIntent);
        0FI.A09(1072884253, A03);
    }
}
