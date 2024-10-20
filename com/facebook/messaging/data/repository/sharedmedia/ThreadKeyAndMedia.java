package com.facebook.messaging.data.repository.sharedmedia;

import X.11T;
import X.7zU;
import X.C1pq;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadKeyAndMedia.class */
public final class ThreadKeyAndMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(33);
    public final ThreadKey A00;
    public final String A01;

    public ThreadKeyAndMedia(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public ThreadKeyAndMedia(ThreadKey threadKey, String str) {
        C1pq.A08("mediaType", str);
        this.A01 = str;
        C1pq.A08("threadKey", threadKey);
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadKeyAndMedia)) {
                return false;
            }
            ThreadKeyAndMedia threadKeyAndMedia = (ThreadKeyAndMedia) obj;
            if (!11T.A0O(this.A01, threadKeyAndMedia.A01) || !11T.A0O(this.A00, threadKeyAndMedia.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }
}
