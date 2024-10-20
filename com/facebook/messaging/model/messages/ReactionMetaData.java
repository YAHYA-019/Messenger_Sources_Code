package com.facebook.messaging.model.messages;

import X.0S2;
import X.11T;
import X.82M;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;

/* loaded from: ReactionMetaData.class */
public final class ReactionMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(47);
    public final UserKey A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;

    public ReactionMetaData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = 0S2.A00(2)[parcel.readInt()];
        this.A02 = Long.valueOf(parcel.readLong());
        this.A03 = parcel.readString();
        this.A00 = (UserKey) parcel.readParcelable(classLoader);
    }

    public ReactionMetaData(UserKey userKey, Integer num, Long l, String str) {
        C1pq.A08("reactionStyle", num);
        this.A01 = num;
        C1pq.A08("reactionTimestamp", l);
        this.A02 = l;
        C1pq.A08("reactionUnicode", str);
        this.A03 = str;
        C1pq.A08("userKey", userKey);
        this.A00 = userKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReactionMetaData)) {
                return false;
            }
            ReactionMetaData reactionMetaData = (ReactionMetaData) obj;
            if (this.A01 != reactionMetaData.A01 || !11T.A0O(this.A02, reactionMetaData.A02) || !11T.A0O(this.A03, reactionMetaData.A03) || !11T.A0O(this.A00, reactionMetaData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, (num == null ? -1 : num.intValue()) + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.intValue());
        parcel.writeLong(this.A02.longValue());
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }
}
