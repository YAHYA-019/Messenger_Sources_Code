package com.facebook.messaging.blocking.params;

import X.11T;
import X.4YV;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;

/* loaded from: BlockUnblockParams.class */
public final class BlockUnblockParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(3);
    public final UserKey A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public BlockUnblockParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = AbK.A15(parcel, parcel.readInt());
        this.A00 = (UserKey) parcel.readParcelable(A0e);
    }

    public BlockUnblockParams(UserKey userKey, String str, String str2) {
        C1pq.A08("displayNameOrFullName", str);
        this.A01 = str;
        C1pq.A08("shortDisplayName", str2);
        this.A02 = str2;
        this.A03 = null;
        C1pq.A08("userKey", userKey);
        this.A00 = userKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BlockUnblockParams)) {
                return false;
            }
            BlockUnblockParams blockUnblockParams = (BlockUnblockParams) obj;
            if (!11T.A0O(this.A01, blockUnblockParams.A01) || !11T.A0O(this.A02, blockUnblockParams.A02) || !11T.A0O(this.A03, blockUnblockParams.A03) || !11T.A0O(this.A00, blockUnblockParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        4YW.A0E(parcel, this.A03);
        parcel.writeParcelable(this.A00, i);
    }
}
