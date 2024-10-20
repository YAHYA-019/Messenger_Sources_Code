package com.facebook.messaging.tray.model.metadata.ranklogging;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: TrayListItemRankLoggingMetadata.class */
public final class TrayListItemRankLoggingMetadata extends C04v implements Parcelable {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C4Ny(39);
    public final RankingLoggingItem A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(TrayListItemRankLoggingMetadata.class, null);
    }

    public TrayListItemRankLoggingMetadata(RankingLoggingItem rankingLoggingItem) {
        11T.A0F(rankingLoggingItem, 1);
        this.A00 = rankingLoggingItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TrayListItemRankLoggingMetadata) && 11T.A0O(this.A00, ((TrayListItemRankLoggingMetadata) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TrayListItemRankLoggingMetadata(rankLoggingItem=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
