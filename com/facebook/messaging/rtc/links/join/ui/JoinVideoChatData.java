package com.facebook.messaging.rtc.links.join.ui;

import X.11T;
import X.1BL;
import X.7zN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.rtc.interfaces.LinkLogMetadata;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.google.common.collect.ImmutableList;

/* loaded from: JoinVideoChatData.class */
public final class JoinVideoChatData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(56);
    public final LinkLogMetadata A00;
    public final RtcCallVideoOptions A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public JoinVideoChatData(LinkLogMetadata linkLogMetadata, RtcCallVideoOptions rtcCallVideoOptions, ImmutableList immutableList, ImmutableList immutableList2, Integer num, Integer num2, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(rtcCallVideoOptions, 6);
        this.A08 = str;
        this.A09 = str2;
        this.A05 = num;
        this.A0A = z;
        this.A0D = z2;
        this.A01 = rtcCallVideoOptions;
        this.A0B = z3;
        this.A0C = z4;
        this.A02 = immutableList;
        this.A04 = num2;
        this.A00 = linkLogMetadata;
        this.A03 = immutableList2;
        this.A06 = l;
        this.A07 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof JoinVideoChatData)) {
                return false;
            }
            JoinVideoChatData joinVideoChatData = (JoinVideoChatData) obj;
            if (!11T.A0O(this.A08, joinVideoChatData.A08) || !11T.A0O(this.A09, joinVideoChatData.A09) || !11T.A0O(this.A05, joinVideoChatData.A05) || this.A0A != joinVideoChatData.A0A || this.A0D != joinVideoChatData.A0D || !11T.A0O(this.A01, joinVideoChatData.A01) || this.A0B != joinVideoChatData.A0B || this.A0C != joinVideoChatData.A0C || !11T.A0O(this.A02, joinVideoChatData.A02) || !11T.A0O(this.A04, joinVideoChatData.A04) || !11T.A0O(this.A00, joinVideoChatData.A00) || !11T.A0O(this.A03, joinVideoChatData.A03) || !11T.A0O(this.A06, joinVideoChatData.A06) || !11T.A0O(this.A07, joinVideoChatData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass002.A05(this.A01, ((((((((1BL.A05(this.A08) * 31) + 1BL.A05(this.A09)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 7zN.A05(this.A07);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        C3o5.A0f(parcel, this.A05);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeSerializable(this.A02);
        C3o5.A0f(parcel, this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeSerializable(this.A03);
        C3o5.A0g(parcel, this.A06);
        parcel.writeString(this.A07);
    }
}
