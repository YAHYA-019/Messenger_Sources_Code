package com.facebook.messaging.communitymessaging.plugins.events.secondarydata.eventsdata;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.7zO;
import X.C1x;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EventsData.class */
public final class EventsData {
    public LiveData A00;
    public final Context A01;
    public final Observer A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final C1x A05;
    public final AtomicBoolean A06;

    public EventsData(Context context, FbUserSession fbUserSession, C1x c1x) {
        1BL.A1H(context, c1x, fbUserSession);
        this.A01 = context;
        this.A05 = c1x;
        this.A03 = fbUserSession;
        this.A04 = 1Bq.A00(82302);
        this.A02 = CaE.A00(this, 70);
        this.A06 = 7zO.A15();
    }
}
