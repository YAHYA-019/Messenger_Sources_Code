package com.facebook.messaging.model.threads;

import X.0Ig;
import X.11T;
import X.1BK;
import X.C2xc;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.MoreObjects;

/* loaded from: ThreadRtcCallInfoData.class */
public final class ThreadRtcCallInfoData implements Parcelable {
    public static final ThreadRtcCallInfoData A05 = new ThreadRtcCallInfoData(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, (String) null, (String) null, true, (Long) null);
    public static final Parcelable.Creator CREATOR = new C2xc(35);
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public ThreadRtcCallInfoData(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = C53v.A0S(parcel);
        this.A00 = parcel.readInt() == 1 ? Long.valueOf(parcel.readLong()) : null;
    }

    public ThreadRtcCallInfoData(Long l, String str, String str2, String str3, boolean z) {
        this.A01 = str;
        this.A03 = str3;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = l;
    }

    public ThreadRtcCallInfoData(String str, String str2, String str3, boolean z, Long l) {
        this.A01 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
        this.A03 = null;
        this.A02 = null;
        this.A04 = true;
        this.A00 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            ThreadRtcCallInfoData threadRtcCallInfoData = (ThreadRtcCallInfoData) obj;
            if (this.A01 != threadRtcCallInfoData.A01 || !11T.A0O(this.A03, threadRtcCallInfoData.A03) || !11T.A0O(this.A02, threadRtcCallInfoData.A02) || this.A04 != threadRtcCallInfoData.A04 || !0Ig.A00(this.A00, threadRtcCallInfoData.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A01;
        int i = 0;
        if (str != null) {
            i = 0 + str.hashCode();
        }
        String str2 = this.A03;
        if (str2 != null) {
            i = (i * 31) + str2.hashCode();
        }
        String str3 = this.A02;
        if (str3 != null) {
            i = (i * 31) + str3.hashCode();
        }
        Long l = this.A00;
        if (l != null) {
            i = 1BK.A03(l, i * 31);
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("callState", this.A01);
        stringHelper.add("serverInfo", this.A03);
        stringHelper.add("initiatorId", this.A02);
        stringHelper.add("willExpandToNewThread", this.A04);
        stringHelper.add("lastUpdateTimestamp", this.A00);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        C53v.A0L(parcel, this.A00);
    }
}
