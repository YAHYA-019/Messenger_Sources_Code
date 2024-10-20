package com.facebook.audience.model.interfaces;

import X.11T;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StoryDestinationConfiguration.class */
public final class StoryDestinationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(9);
    public final GroupStoryData A00;
    public final MomentsStoryData A01;
    public final SharesheetPageStoryData A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public StoryDestinationConfiguration(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SharesheetPageStoryData sharesheetPageStoryData = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (GroupStoryData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MomentsStoryData) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (SharesheetPageStoryData) parcel.readParcelable(A0e) : sharesheetPageStoryData;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1W(parcel);
    }

    public StoryDestinationConfiguration(GroupStoryData groupStoryData, MomentsStoryData momentsStoryData, SharesheetPageStoryData sharesheetPageStoryData, boolean z, boolean z2, boolean z3) {
        this.A00 = groupStoryData;
        this.A01 = momentsStoryData;
        this.A02 = sharesheetPageStoryData;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryDestinationConfiguration)) {
                return false;
            }
            StoryDestinationConfiguration storyDestinationConfiguration = (StoryDestinationConfiguration) obj;
            if (!11T.A0O(this.A00, storyDestinationConfiguration.A00) || !11T.A0O(this.A01, storyDestinationConfiguration.A01) || !11T.A0O(this.A02, storyDestinationConfiguration.A02) || this.A03 != storyDestinationConfiguration.A03 || this.A04 != storyDestinationConfiguration.A04 || this.A05 != storyDestinationConfiguration.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
