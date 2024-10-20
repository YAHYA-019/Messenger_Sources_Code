package com.facebook.ipc.facecast.config;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pages.common.brandedcontent.model.PageUnit;
import com.facebook.privacy.model.SelectablePrivacyData;

/* loaded from: FacecastConfiguration.class */
public final class FacecastConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(25);
    public final PageUnit A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final SelectablePrivacyData A0C;

    public FacecastConfiguration(Parcel parcel) {
        SelectablePrivacyData selectablePrivacyData = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
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
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (PageUnit) PageUnit.CREATOR.createFromParcel(parcel);
        }
        this.A0C = parcel.readInt() != 0 ? (SelectablePrivacyData) SelectablePrivacyData.CREATOR.createFromParcel(parcel) : selectablePrivacyData;
    }

    public FacecastConfiguration(PageUnit pageUnit, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = str8;
        this.A09 = str9;
        this.A0A = str10;
        this.A0B = str11;
        this.A00 = pageUnit;
        this.A0C = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FacecastConfiguration)) {
                return false;
            }
            FacecastConfiguration facecastConfiguration = (FacecastConfiguration) obj;
            if (!11T.A0O(this.A01, facecastConfiguration.A01) || !11T.A0O(this.A02, facecastConfiguration.A02) || !11T.A0O(this.A03, facecastConfiguration.A03) || !11T.A0O(this.A04, facecastConfiguration.A04) || !11T.A0O(this.A05, facecastConfiguration.A05) || !11T.A0O(this.A06, facecastConfiguration.A06) || !11T.A0O(this.A07, facecastConfiguration.A07) || !11T.A0O(this.A08, facecastConfiguration.A08) || !11T.A0O(this.A09, facecastConfiguration.A09) || !11T.A0O(this.A0A, facecastConfiguration.A0A) || !11T.A0O(this.A0B, facecastConfiguration.A0B) || !11T.A0O(this.A00, facecastConfiguration.A00) || !11T.A0O(this.A0C, facecastConfiguration.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0C, C1pq.A04(this.A00, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        PageUnit pageUnit = this.A00;
        if (pageUnit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageUnit.writeToParcel(parcel, i);
        }
        SelectablePrivacyData selectablePrivacyData = this.A0C;
        if (selectablePrivacyData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectablePrivacyData.writeToParcel(parcel, i);
        }
    }
}
