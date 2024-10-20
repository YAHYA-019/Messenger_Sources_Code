package com.google.android.gms.internal.auth;

import X.0FI;
import X.4FE;
import X.K2M;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: zzx.class */
public final class zzx extends IStatusCallback.Stub {
    public final /* synthetic */ 4FE A00;

    public zzx(4FE r302) {
        this.A00 = r302;
        0FI.A09(620593635, 0FI.A03(-1029619808));
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void CHc(Status status) {
        int A03 = 0FI.A03(-825792969);
        K2M.A02(status, this.A00, (Object) null);
        0FI.A09(-1050853202, A03);
    }
}
