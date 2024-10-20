package com.facebook.messaging.games.pushnotification.model;

import X.11T;
import X.CSQ;
import X.RIw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: GamesPushNotificationSettings.class */
public final class GamesPushNotificationSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(66);
    public final long muteUntilSeconds;
    public final ImmutableList pushNotificationStates;

    public GamesPushNotificationSettings() {
        this.muteUntilSeconds = 0L;
        this.pushNotificationStates = null;
    }

    public GamesPushNotificationSettings(RIw rIw) {
        this.muteUntilSeconds = rIw.A00;
        this.pushNotificationStates = rIw.A01;
    }

    public GamesPushNotificationSettings(Parcel parcel) {
        this.muteUntilSeconds = parcel.readLong();
        ArrayList readArrayList = parcel.readArrayList(InstantGamePushNotificationState.class.getClassLoader());
        this.pushNotificationStates = readArrayList != null ? ImmutableList.copyOf((Collection) readArrayList) : null;
    }

    public GamesPushNotificationSettings(ImmutableList immutableList) {
        this.muteUntilSeconds = 0L;
        this.pushNotificationStates = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GamesPushNotificationSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GamesPushNotificationSettings gamesPushNotificationSettings = (GamesPushNotificationSettings) obj;
        if (this.muteUntilSeconds != gamesPushNotificationSettings.muteUntilSeconds) {
            return false;
        }
        ImmutableList immutableList = this.pushNotificationStates;
        ImmutableList immutableList2 = gamesPushNotificationSettings.pushNotificationStates;
        return immutableList == null ? immutableList2 == null : immutableList.equals(immutableList2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.muteUntilSeconds), this.pushNotificationStates});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.muteUntilSeconds);
        parcel.writeList(this.pushNotificationStates);
    }
}
