package com.facebook.messaging.phonebookintegration.account;

import X.0FI;
import X.C1341Aeh;
import X.C2rm;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: MessengerSyncAdapterService.class */
public final class MessengerSyncAdapterService extends C2rm {
    public C1341Aeh A00;

    public IBinder A10(Intent intent) {
        C1341Aeh c1341Aeh = this.A00;
        if (c1341Aeh != null) {
            return c1341Aeh.getSyncAdapterBinder();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Aeh, android.content.AbstractThreadedSyncAdapter] */
    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(477233597);
        this.A00 = new AbstractThreadedSyncAdapter(getApplicationContext(), true);
        0FI.A0A(-173268887, A04);
    }
}
