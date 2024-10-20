package com.facebook.messaging.montage.forked.model.viewer;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StoryviewerReply.class */
public final class StoryviewerReply implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(88);
    public final long A00;
    public final String A01;

    public StoryviewerReply(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryviewerReply)) {
                return false;
            }
            StoryviewerReply storyviewerReply = (StoryviewerReply) obj;
            if (!11T.A0O(this.A01, storyviewerReply.A01) || this.A00 != storyviewerReply.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A03(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }
}
