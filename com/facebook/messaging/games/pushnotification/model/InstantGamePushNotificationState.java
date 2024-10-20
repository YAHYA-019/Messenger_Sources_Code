package com.facebook.messaging.games.pushnotification.model;

import X.11T;
import X.7zL;
import X.AbM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InstantGamePushNotificationState.class */
public final class InstantGamePushNotificationState implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(67);
    public final String gameId;
    public final long muteUntilSeconds;

    public InstantGamePushNotificationState() {
        this.muteUntilSeconds = 0L;
        this.gameId = null;
    }

    public InstantGamePushNotificationState(Parcel parcel) {
        this.muteUntilSeconds = parcel.readLong();
        this.gameId = parcel.readString();
    }

    public InstantGamePushNotificationState(String str, long j) {
        this.muteUntilSeconds = j;
        this.gameId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof InstantGamePushNotificationState)) {
            if (this == obj) {
                return true;
            }
            InstantGamePushNotificationState instantGamePushNotificationState = (InstantGamePushNotificationState) obj;
            if (11T.A0O(this.gameId, instantGamePushNotificationState.gameId) && this.muteUntilSeconds == instantGamePushNotificationState.muteUntilSeconds) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.gameId, Long.valueOf(this.muteUntilSeconds));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.muteUntilSeconds);
        parcel.writeString(this.gameId);
    }
}
