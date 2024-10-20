package com.facebook.messaging.publicchats.creation.newgroupchat.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.7zK;
import X.AnonymousClass001;
import X.C1pq;
import X.CSS;
import X.GOm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CreatePublicChatParams.class */
public final class CreatePublicChatParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(29);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public CreatePublicChatParams(Parcel parcel) {
        getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        boolean z = true;
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            strArr2[i2] = parcel.readString();
        }
        this.A01 = ImmutableList.copyOf(strArr2);
        this.A05 = parcel.readString();
    }

    public CreatePublicChatParams(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A03 = null;
        C1pq.A08("recipients", immutableList);
        this.A00 = immutableList;
        this.A04 = str2;
        C1pq.A08(7zK.A00(424), immutableList2);
        this.A01 = immutableList2;
        this.A05 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreatePublicChatParams)) {
                return false;
            }
            CreatePublicChatParams createPublicChatParams = (CreatePublicChatParams) obj;
            if (!11T.A0O(this.A02, createPublicChatParams.A02) || this.A06 != createPublicChatParams.A06 || this.A07 != createPublicChatParams.A07 || this.A08 != createPublicChatParams.A08 || this.A09 != createPublicChatParams.A09 || !11T.A0O(this.A03, createPublicChatParams.A03) || !11T.A0O(this.A00, createPublicChatParams.A00) || !11T.A0O(this.A04, createPublicChatParams.A04) || !11T.A0O(this.A01, createPublicChatParams.A01) || !11T.A0O(this.A05, createPublicChatParams.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A02), this.A06), this.A07), this.A08), this.A09))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CreatePublicChatParams{entryPoint=");
        A0k.append(this.A02);
        A0k.append(", isAdminApprovalEnabled=");
        A0k.append(this.A06);
        A0k.append(", isBroadcast=");
        A0k.append(this.A07);
        A0k.append(", isFeaturedUnitEnabled=");
        A0k.append(this.A08);
        A0k.append(", isPinChannelToInboxEnabled=");
        A0k.append(this.A09);
        A0k.append(", offlineThreadingId=");
        A0k.append(this.A03);
        A0k.append(", recipients=");
        A0k.append(this.A00);
        A0k.append(", selectedEmoji=");
        A0k.append(this.A04);
        A0k.append(", selectedGradientColors=");
        A0k.append(this.A01);
        A0k.append(GOm.A00(34));
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeString(AnonymousClass001.A0i(A0b));
        }
        1BL.A13(parcel, this.A04);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeString(AnonymousClass001.A0i(A0b2));
        }
        parcel.writeString(this.A05);
    }
}
