package com.facebook.messaging.threadview.message.growthupsell;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GrowthGenericAdminMessageData.class */
public final class GrowthGenericAdminMessageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(77);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final ImmutableList A09;

    public GrowthGenericAdminMessageData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        boolean z = false;
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                strArr[i2] = parcel.readString();
                i = i2 + 1;
            }
            this.A09 = ImmutableList.copyOf(strArr);
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
            this.A00 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= readInt2) {
                    break;
                }
                strArr2[i4] = parcel.readString();
                i3 = i4 + 1;
            }
            this.A00 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A08 = parcel.readInt() == 1 ? true : z;
        this.A07 = C3o5.A0O(parcel);
    }

    public GrowthGenericAdminMessageData(ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A01 = str;
        this.A09 = null;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = immutableList;
        this.A05 = str5;
        this.A06 = str6;
        this.A08 = z;
        this.A07 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GrowthGenericAdminMessageData)) {
                return false;
            }
            GrowthGenericAdminMessageData growthGenericAdminMessageData = (GrowthGenericAdminMessageData) obj;
            if (!11T.A0O(this.A01, growthGenericAdminMessageData.A01) || !11T.A0O(this.A09, growthGenericAdminMessageData.A09) || !11T.A0O(this.A02, growthGenericAdminMessageData.A02) || !11T.A0O(this.A03, growthGenericAdminMessageData.A03) || !11T.A0O(this.A04, growthGenericAdminMessageData.A04) || !11T.A0O(this.A00, growthGenericAdminMessageData.A00) || !11T.A0O(this.A05, growthGenericAdminMessageData.A05) || !11T.A0O(this.A06, growthGenericAdminMessageData.A06) || this.A08 != growthGenericAdminMessageData.A08 || !11T.A0O(this.A07, growthGenericAdminMessageData.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, C1pq.A02(C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A09, C1pq.A03(this.A01)))))))), this.A08));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        ImmutableList immutableList = this.A09;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                C3o5.A0h(parcel, A0b);
            }
        }
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        ImmutableList immutableList2 = this.A00;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                C3o5.A0h(parcel, A0b2);
            }
        }
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A07);
    }
}
