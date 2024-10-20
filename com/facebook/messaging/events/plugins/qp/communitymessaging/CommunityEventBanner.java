package com.facebook.messaging.events.plugins.qp.communitymessaging;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.C0ty;
import X.CaC;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* loaded from: CommunityEventBanner.class */
public final class CommunityEventBanner {
    public LiveData A00;
    public Observer A01;
    public ThreadSummary A02;
    public List A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ThreadKey A08;

    public CommunityEventBanner(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        1BL.A1F(context, fbUserSession);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A08 = threadKey;
        this.A06 = 7zM.A0f(context);
        this.A07 = 1Bu.A00(83314);
        C0ty c0ty = C0ty.A00;
        this.A00 = new LiveData(c0ty);
        this.A01 = CaC.A00;
        this.A03 = c0ty;
    }
}
