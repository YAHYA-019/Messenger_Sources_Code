package com.facebook.messaging.integrity.frx.proactivewarning.model;

import X.11T;
import X.1BL;
import X.AbE;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: ProactiveWarningInfo.class */
public final class ProactiveWarningInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(4);
    public final int A00;
    public final QuickPromotionDefinition A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public ProactiveWarningInfo(Parcel parcel) {
        getClass().getClassLoader();
        this.A02 = parcel.readString();
        QuickPromotionDefinition quickPromotionDefinition = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A05 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? (QuickPromotionDefinition) QuickPromotionDefinition.CREATOR.createFromParcel(parcel) : quickPromotionDefinition;
        this.A06 = C3o5.A0O(parcel);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public ProactiveWarningInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        C1pq.A08(AbE.A00(683), str4);
        this.A05 = str4;
        this.A01 = null;
        this.A06 = str5;
        C1pq.A08("subtitle", str6);
        this.A07 = str6;
        C1pq.A08("title", str7);
        this.A08 = str7;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProactiveWarningInfo)) {
                return false;
            }
            ProactiveWarningInfo proactiveWarningInfo = (ProactiveWarningInfo) obj;
            if (!11T.A0O(this.A02, proactiveWarningInfo.A02) || !11T.A0O(this.A03, proactiveWarningInfo.A03) || !11T.A0O(this.A04, proactiveWarningInfo.A04) || !11T.A0O(this.A05, proactiveWarningInfo.A05) || !11T.A0O(this.A01, proactiveWarningInfo.A01) || !11T.A0O(this.A06, proactiveWarningInfo.A06) || !11T.A0O(this.A07, proactiveWarningInfo.A07) || !11T.A0O(this.A08, proactiveWarningInfo.A08) || this.A00 != proactiveWarningInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A03(this.A02)))))))) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        QuickPromotionDefinition quickPromotionDefinition = this.A01;
        if (quickPromotionDefinition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quickPromotionDefinition.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
    }
}
