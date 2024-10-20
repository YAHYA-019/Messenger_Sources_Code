package com.facebook.messaging.inbox.units;

import X.11T;
import X.1BL;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.presence.unifiedpresence.UnifiedPresenceViewLoggerItem;

/* loaded from: InboxLoggingExtra.class */
public final class InboxLoggingExtra implements Parcelable {
    public static final C4Ny CREATOR = new C4Ny(9);
    public final RankingLoggingItem A00;
    public final UnifiedPresenceViewLoggerItem A01;

    public InboxLoggingExtra(Parcel parcel) {
        this.A01 = (UnifiedPresenceViewLoggerItem) 1BL.A0C(parcel, UnifiedPresenceViewLoggerItem.class);
        this.A00 = (RankingLoggingItem) 1BL.A0C(parcel, RankingLoggingItem.class);
    }

    public InboxLoggingExtra(RankingLoggingItem rankingLoggingItem, UnifiedPresenceViewLoggerItem unifiedPresenceViewLoggerItem) {
        this.A01 = unifiedPresenceViewLoggerItem;
        this.A00 = rankingLoggingItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
