package com.facebook.messaging.communitymessaging.plugins.channellist.channelcreationmenu;

import X.1pI;
import X.7zT;
import android.content.Context;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: ChannelCreationFoldersMenuItemImplementation.class */
public final class ChannelCreationFoldersMenuItemImplementation {
    public final Context A00;
    public final 1pI A01;
    public final ParcelableSecondaryData A02;
    public final Long A03;

    public ChannelCreationFoldersMenuItemImplementation(Context context, 1pI r303, ParcelableSecondaryData parcelableSecondaryData, Long l) {
        7zT.A1T(parcelableSecondaryData, r303, context);
        this.A02 = parcelableSecondaryData;
        this.A01 = r303;
        this.A03 = l;
        this.A00 = context;
    }
}
