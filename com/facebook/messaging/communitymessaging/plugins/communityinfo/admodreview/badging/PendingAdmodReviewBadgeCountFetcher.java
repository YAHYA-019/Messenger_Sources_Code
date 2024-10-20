package com.facebook.messaging.communitymessaging.plugins.communityinfo.admodreview.badging;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: PendingAdmodReviewBadgeCountFetcher.class */
public final class PendingAdmodReviewBadgeCountFetcher {
    public final Context A00;
    public final FbUserSession A01;
    public final ParcelableSecondaryData A02;

    public PendingAdmodReviewBadgeCountFetcher(Context context, FbUserSession fbUserSession, ParcelableSecondaryData parcelableSecondaryData) {
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = parcelableSecondaryData;
    }
}
