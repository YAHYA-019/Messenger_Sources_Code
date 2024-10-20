package com.facebook.messaging.games.model;

import X.11T;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: InstantGameChannel.class */
public final class InstantGameChannel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(65);
    public final String applicationId;
    public final ImmutableList permissionList;
    public final String privacyText;

    public InstantGameChannel() {
        this.applicationId = null;
        this.privacyText = null;
        this.permissionList = null;
    }

    public InstantGameChannel(Parcel parcel) {
        this.applicationId = parcel.readString();
        this.privacyText = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.permissionList = createStringArrayList != null ? ImmutableList.copyOf((Collection) createStringArrayList) : null;
    }

    public InstantGameChannel(ImmutableList immutableList, String str, String str2) {
        this.applicationId = str;
        this.privacyText = str2;
        this.permissionList = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof InstantGameChannel)) {
                return false;
            }
            InstantGameChannel instantGameChannel = (InstantGameChannel) obj;
            if (!11T.A0O(this.applicationId, instantGameChannel.applicationId) || !11T.A0O(this.privacyText, instantGameChannel.privacyText)) {
                return false;
            }
            ImmutableList immutableList = this.permissionList;
            ImmutableList immutableList2 = instantGameChannel.permissionList;
            if (immutableList != null) {
                return immutableList.equals(immutableList2);
            }
            if (immutableList2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.applicationId;
        String str2 = this.privacyText;
        return Arrays.hashCode(new Object[]{str, str2, str2});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.applicationId);
        parcel.writeString(this.privacyText);
        parcel.writeStringList(this.permissionList);
    }
}
