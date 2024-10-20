package com.facebook.messaging.communitymessaging.plugins.participation.secondarydata;

import X.1BL;
import X.6iB;
import X.7zO;
import X.AKM;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C9qq;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ParticipationSecondaryDataImplementation.class */
public final class ParticipationSecondaryDataImplementation {
    public LiveData A00;
    public final Context A01;
    public final Observer A02;
    public final FbUserSession A03;
    public final 6iB A04;
    public final AtomicBoolean A05;
    public final C01i A06;

    public ParticipationSecondaryDataImplementation(Context context, FbUserSession fbUserSession, 6iB r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A01 = context;
        this.A03 = fbUserSession;
        this.A04 = r304;
        this.A06 = C01g.A00(C03i.A03, new AKM(this, 35));
        this.A05 = 7zO.A15();
        this.A02 = new C9qq(this, 11);
    }
}
