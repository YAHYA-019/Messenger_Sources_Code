package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.1BL;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import java.util.Arrays;

/* loaded from: ThreadJoinRequest.class */
public final class ThreadJoinRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(77);
    public final int A00;
    public final long A01;
    public final UserKey A02;
    public final UserKey A03;

    public ThreadJoinRequest(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, UserKey.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A03 = (UserKey) A0C;
        this.A01 = parcel.readLong();
        this.A02 = (UserKey) 1BL.A0C(parcel, UserKey.class);
        this.A00 = parcel.readInt();
    }

    public ThreadJoinRequest(UserKey userKey, UserKey userKey2, int i, long j) {
        11T.A0F(userKey, 1);
        this.A03 = userKey;
        this.A01 = j;
        this.A02 = userKey2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadJoinRequest threadJoinRequest = (ThreadJoinRequest) obj;
            if (this.A01 != threadJoinRequest.A01 || !11T.A0O(this.A03, threadJoinRequest.A03) || !11T.A0O(this.A02, threadJoinRequest.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Long.valueOf(this.A01), this.A02, Integer.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeLong(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
    }
}
