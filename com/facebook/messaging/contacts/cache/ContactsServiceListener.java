package com.facebook.messaging.contacts.cache;

import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Ex;
import X.1Hv;
import X.1I7;
import X.1PA;
import X.C02l;
import X.D0R;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: ContactsServiceListener.class */
public final class ContactsServiceListener {
    public Context A00;
    public 1PA A01;
    public final 1Ex A02 = (1Ex) 1Bi.A03(83426);
    public final 1I7 A03;
    public final 1Br A04;
    public final C02l A05;

    public ContactsServiceListener() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        11T.A09(A00);
        this.A03 = (1I7) 1Hv.A02(A00, 65728);
        this.A04 = 1Bq.A00(83627);
        this.A05 = new D0R(this, 6);
    }
}
