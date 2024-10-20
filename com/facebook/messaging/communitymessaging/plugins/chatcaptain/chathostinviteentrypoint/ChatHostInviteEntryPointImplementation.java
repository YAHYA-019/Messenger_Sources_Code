package com.facebook.messaging.communitymessaging.plugins.chatcaptain.chathostinviteentrypoint;

import X.06Z;
import X.11T;
import X.1Br;
import X.AbG;
import X.C5ww;
import X.Cvn;
import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ChatHostInviteEntryPointImplementation.class */
public final class ChatHostInviteEntryPointImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final C5ww A03;
    public final MigColorScheme A04;
    public final ParcelableSecondaryData A05;

    public ChatHostInviteEntryPointImplementation(Context context, 06Z r303, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData) {
        11T.A0F(migColorScheme, 3);
        this.A00 = context;
        this.A01 = r303;
        this.A04 = migColorScheme;
        this.A05 = parcelableSecondaryData;
        this.A02 = AbG.A0c();
        this.A03 = Cvn.A00(this, 33);
    }
}
