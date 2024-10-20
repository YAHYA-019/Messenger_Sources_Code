package com.facebook.messaging.rtc.calllog.database.api;

import X.AbK;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: RtcCallLogInfo.class */
public final class RtcCallLogInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(50);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final ThreadKey A05;
    public final String A06;
    public final boolean A07;
    public final long A08;

    public RtcCallLogInfo(Parcel parcel) {
        this.A08 = parcel.readLong();
        this.A05 = AbK.A0X(parcel);
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = (readInt < 0 || readInt > 4) ? 0 : readInt;
        int readInt2 = parcel.readInt();
        this.A00 = (readInt2 < 0 || readInt2 > 4) ? 0 : readInt2;
        int readInt3 = parcel.readInt();
        this.A01 = (readInt3 < 0 || readInt3 > 5) ? 0 : readInt3;
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A07 = AnonymousClass001.A1P(parcel.readInt());
    }

    public RtcCallLogInfo(ThreadKey threadKey, String str, int i, int i2, int i3, long j, long j2, long j3, boolean z) {
        this.A08 = j2;
        threadKey.getClass();
        this.A05 = threadKey;
        str.getClass();
        this.A06 = str;
        this.A02 = (i3 < 0 || i3 > 4) ? 0 : i3;
        this.A00 = (i < 0 || i > 4) ? 0 : i;
        this.A01 = (i2 < 0 || i2 > 5) ? 0 : i2;
        this.A04 = j3;
        this.A03 = j;
        this.A07 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("mLogId", this.A08);
        stringHelper.add("mThreadKey", this.A05);
        stringHelper.add("mMessageId", this.A06);
        stringHelper.add("mCallType", this.A02);
        stringHelper.add("mCallRole", this.A00);
        stringHelper.add("mCallState", this.A01);
        stringHelper.add("mTimestamp", this.A04);
        stringHelper.add("mDuration", this.A03);
        stringHelper.add("mSeenOrPlayed", this.A07);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A08);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
