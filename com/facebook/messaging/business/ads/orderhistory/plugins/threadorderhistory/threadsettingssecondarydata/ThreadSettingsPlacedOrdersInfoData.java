package com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.threadsettingssecondarydata;

import X.7zT;
import X.BkL;
import X.Blw;
import X.C1x;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsPlacedOrdersInfoData.class */
public final class ThreadSettingsPlacedOrdersInfoData {
    public BkL A00;
    public Blw A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final C1x A06;

    public ThreadSettingsPlacedOrdersInfoData(Context context, FbUserSession fbUserSession, ThreadKey threadKey, C1x c1x) {
        7zT.A1T(context, fbUserSession, c1x);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A05 = threadKey;
        this.A06 = c1x;
    }
}
