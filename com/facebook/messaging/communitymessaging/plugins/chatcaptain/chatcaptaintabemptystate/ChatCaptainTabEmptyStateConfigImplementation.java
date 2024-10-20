package com.facebook.messaging.communitymessaging.plugins.chatcaptain.chatcaptaintabemptystate;

import X.06Z;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.7zM;
import X.AKM;
import X.AbG;
import X.C00m;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ChatCaptainTabEmptyStateConfigImplementation.class */
public final class ChatCaptainTabEmptyStateConfigImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ParcelableSecondaryData A06;
    public final C00m A07;

    public ChatCaptainTabEmptyStateConfigImplementation(Context context, 06Z r303, ParcelableSecondaryData parcelableSecondaryData) {
        1BL.A1F(context, r303);
        this.A00 = context;
        this.A01 = r303;
        this.A06 = parcelableSecondaryData;
        this.A03 = 1Bq.A00(82783);
        this.A04 = AbG.A0c();
        1Br A0e = 7zM.A0e(context);
        this.A05 = A0e;
        this.A02 = 1Br.A03(A0e);
        this.A07 = new AKM(this, 27);
    }
}
