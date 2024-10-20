package com.facebook.messaging.data.communitymessaging;

import X.11T;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DirectInvitePresetModel.class */
public final class DirectInvitePresetModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(30);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public DirectInvitePresetModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j) {
        11T.A0F(str, 2);
        7zT.A11(3, str2, str3, str4, str5);
        7zP.A1M(str6, 7, str7);
        this.A06 = j;
        this.A08 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A07 = str5;
        this.A05 = str6;
        this.A00 = i;
        this.A03 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DirectInvitePresetModel)) {
                return false;
            }
            DirectInvitePresetModel directInvitePresetModel = (DirectInvitePresetModel) obj;
            if (this.A06 != directInvitePresetModel.A06 || !11T.A0O(this.A08, directInvitePresetModel.A08) || !11T.A0O(this.A02, directInvitePresetModel.A02) || !11T.A0O(this.A04, directInvitePresetModel.A04) || !11T.A0O(this.A01, directInvitePresetModel.A01) || !11T.A0O(this.A07, directInvitePresetModel.A07) || !11T.A0O(this.A05, directInvitePresetModel.A05) || this.A00 != directInvitePresetModel.A00 || !11T.A0O(this.A03, directInvitePresetModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, (AnonymousClass002.A07(this.A05, AnonymousClass002.A07(this.A07, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A02, AnonymousClass002.A07(this.A08, 7zQ.A02(this.A06))))))) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DirectInvitePresetModel(community_id=");
        A0k.append(this.A06);
        A0k.append(", presetType=");
        A0k.append(this.A08);
        A0k.append(", firstProfilePictureUrl=");
        A0k.append(this.A02);
        A0k.append(", secondProfilePictureUrl=");
        A0k.append(this.A04);
        A0k.append(", descriptionSubtitle=");
        A0k.append(this.A01);
        A0k.append(", memberCountSubtitle=");
        A0k.append(this.A07);
        A0k.append(", title=");
        A0k.append(this.A05);
        A0k.append(", source=");
        A0k.append(this.A00);
        A0k.append(", presetTypeV2=");
        A0k.append(this.A03);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
