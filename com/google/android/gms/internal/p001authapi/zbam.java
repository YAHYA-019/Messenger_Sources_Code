package com.google.android.gms.internal.p001authapi;

import X.0FI;
import X.4FE;
import X.KY4;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: zbam.class */
public final class zbam extends IStatusCallback.Stub {
    public final /* synthetic */ 4FE A00;

    public zbam(4FE r302) {
        this.A00 = r302;
        0FI.A09(846240713, 0FI.A03(-293508753));
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void CHc(Status status) {
        int A03 = 0FI.A03(-278491405);
        KY4.A00(status, this.A00, (Object) null);
        0FI.A09(-689671785, A03);
    }
}
