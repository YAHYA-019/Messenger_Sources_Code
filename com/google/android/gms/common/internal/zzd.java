package com.google.android.gms.common.internal;

import X.0FI;
import X.2AD;
import X.AbstractC00481b7;
import X.C01123q2;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* loaded from: zzd.class */
public final class zzd extends zzb implements IInterface {
    public 2AD A00;
    public final int A01;

    public zzd() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        0FI.A09(-2092427052, 0FI.A03(-1315334273));
    }

    public zzd(2AD r302, int i) {
        this();
        int A03 = 0FI.A03(1789541247);
        this.A00 = r302;
        this.A01 = i;
        0FI.A09(986536137, A03);
    }

    private final void A03(Bundle bundle, IBinder iBinder, int i) {
        int A03 = 0FI.A03(-2065250662);
        AbstractC00481b7.A03(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        2AD r0 = this.A00;
        int i2 = this.A01;
        C01123q2 c01123q2 = new C01123q2(bundle, iBinder, r0, i);
        Handler handler = r0.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, c01123q2));
        this.A00 = null;
        0FI.A09(1797520623, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e0, code lost:
    
        if (r0.A00 >= r316.A00) goto L41;
     */
    @Override // com.google.android.gms.internal.common.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(int r302, android.os.Parcel r303, android.os.Parcel r304, int r305) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzd.A02(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
