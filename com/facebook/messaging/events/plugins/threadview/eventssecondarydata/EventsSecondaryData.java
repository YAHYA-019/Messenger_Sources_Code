package com.facebook.messaging.events.plugins.threadview.eventssecondarydata;

import X.6iB;
import X.7zO;
import X.7zT;
import X.LR8;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EventsSecondaryData.class */
public final class EventsSecondaryData {
    public LiveData A00;
    public final Context A01;
    public final Observer A02;
    public final FbUserSession A03;
    public final ThreadKey A04;
    public final 6iB A05;
    public final AtomicBoolean A06;

    public EventsSecondaryData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, 6iB r305) {
        7zT.A1T(context, fbUserSession, r305);
        this.A01 = context;
        this.A03 = fbUserSession;
        this.A04 = threadKey;
        this.A05 = r305;
        this.A02 = LR8.A00(this, 19);
        this.A06 = 7zO.A15();
    }
}
