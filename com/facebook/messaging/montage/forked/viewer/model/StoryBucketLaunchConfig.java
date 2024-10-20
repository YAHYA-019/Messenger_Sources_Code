package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import X.GOq;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;

/* loaded from: StoryBucketLaunchConfig.class */
public final class StoryBucketLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(93);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public StoryBucketLaunchConfig(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readString();
        this.A05 = AbN.A1U(parcel);
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
    }

    public StoryBucketLaunchConfig(String str) {
        C1pq.A08("bucketId", str);
        this.A00 = str;
        this.A01 = null;
        this.A02 = "";
        this.A05 = false;
        this.A03 = null;
        this.A04 = null;
        Preconditions.checkArgument(!Platform.stringIsNullOrEmpty(str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryBucketLaunchConfig)) {
                return false;
            }
            StoryBucketLaunchConfig storyBucketLaunchConfig = (StoryBucketLaunchConfig) obj;
            if (!11T.A0O(this.A00, storyBucketLaunchConfig.A00) || !11T.A0O(this.A01, storyBucketLaunchConfig.A01) || !11T.A0O(this.A02, storyBucketLaunchConfig.A02) || this.A05 != storyBucketLaunchConfig.A05 || !11T.A0O(this.A03, storyBucketLaunchConfig.A03) || !11T.A0O(this.A04, storyBucketLaunchConfig.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A05)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("StoryBucketLaunchConfig{bucketId=");
        A0k.append(this.A00);
        A0k.append(", initialStoryId=");
        A0k.append(this.A01);
        A0k.append(", launchSource=");
        A0k.append(this.A02);
        A0k.append(", shouldOpenToLastPostedThread=");
        A0k.append(this.A05);
        A0k.append(", targetMentionId=");
        A0k.append(this.A03);
        A0k.append(", viewerSessionId=");
        return GOq.A12(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
    }
}
