package com.facebook.messaging.service.model;

import X.AbK;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: FetchMoreRecentMessagesParams.class */
public final class FetchMoreRecentMessagesParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(94);
    public final int A00;
    public final long A01;
    public final ThreadKey A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public FetchMoreRecentMessagesParams(Parcel parcel) {
        this.A02 = AbK.A0X(parcel);
        this.A01 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = C53v.A0S(parcel);
    }

    public FetchMoreRecentMessagesParams(ThreadKey threadKey, String str, String str2, int i, long j, boolean z) {
        this.A02 = threadKey;
        this.A01 = j;
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FetchMoreRecentMessagesParams.class);
        stringHelper.add("threadKey", this.A02);
        stringHelper.add("messageTimeMs", this.A01);
        stringHelper.add("messageId", this.A03);
        stringHelper.add("messageOfflineThreadingId", this.A04);
        stringHelper.add("maxToFetch", this.A00);
        stringHelper.add("isLoadingMoreMessagesContext", this.A05);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
