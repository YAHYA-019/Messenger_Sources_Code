package com.facebook.smartcapture.camera;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.7zR;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DialogTexts.class */
public final class DialogTexts implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(19);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DialogTexts() {
        this("", "", "", "", "", "", "", "");
    }

    public DialogTexts(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(str5, str6);
        7zR.A1P(str7, str8);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A05 = str7;
        this.A04 = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DialogTexts)) {
                return false;
            }
            DialogTexts dialogTexts = (DialogTexts) obj;
            if (!11T.A0O(this.A03, dialogTexts.A03) || !11T.A0O(this.A02, dialogTexts.A02) || !11T.A0O(this.A01, dialogTexts.A01) || !11T.A0O(this.A00, dialogTexts.A00) || !11T.A0O(this.A07, dialogTexts.A07) || !11T.A0O(this.A06, dialogTexts.A06) || !11T.A0O(this.A05, dialogTexts.A05) || !11T.A0O(this.A04, dialogTexts.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A04, AnonymousClass002.A07(this.A05, AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A07, AnonymousClass002.A07(this.A00, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A02, 4YV.A02(this.A03))))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DialogTexts(rationaleTitle=");
        A0k.append(this.A03);
        A0k.append(", rationaleText=");
        A0k.append(this.A02);
        A0k.append(", rationaleOk=");
        A0k.append(this.A01);
        A0k.append(", rationaleCancel=");
        A0k.append(this.A00);
        A0k.append(", toSettingsTitle=");
        A0k.append(this.A07);
        A0k.append(", toSettingsText=");
        A0k.append(this.A06);
        A0k.append(", toSettingsOk=");
        A0k.append(this.A05);
        A0k.append(", toSettingsCancel=");
        return DKH.A0o(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }
}
