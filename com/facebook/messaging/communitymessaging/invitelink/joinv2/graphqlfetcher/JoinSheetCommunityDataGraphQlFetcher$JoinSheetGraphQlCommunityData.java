package com.facebook.messaging.communitymessaging.invitelink.joinv2.graphqlfetcher;

import X.11T;
import X.1BL;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.class */
public final class JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(76);
    public final int A00;
    public final int A01;
    public final String A02;

    public JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData(int i, String str, int i2) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData)) {
                return false;
            }
            JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData = (JoinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData) obj;
            if (this.A01 != joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.A01 || !11T.A0O(this.A02, joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.A02) || this.A00 != joinSheetCommunityDataGraphQlFetcher$JoinSheetGraphQlCommunityData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + 1BL.A05(this.A02)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
