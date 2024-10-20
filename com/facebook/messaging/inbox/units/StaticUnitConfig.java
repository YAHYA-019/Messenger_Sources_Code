package com.facebook.messaging.inbox.units;

import X.0S2;
import X.11T;
import X.1BL;
import X.4oB;
import X.C1pq;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StaticUnitConfig.class */
public final class StaticUnitConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(21);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public StaticUnitConfig(4oB r302) {
        this.A01 = r302.A01;
        this.A02 = r302.A02;
        this.A05 = r302.A05;
        String str = r302.A03;
        C1pq.A08("unitId", str);
        this.A03 = str;
        this.A04 = r302.A04;
        Integer num = r302.A00;
        C1pq.A08("unitType", num);
        this.A00 = num;
    }

    public StaticUnitConfig(Parcel parcel) {
        getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 1 ? false : true;
        this.A03 = parcel.readString();
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A00 = 0S2.A00(31)[parcel.readInt()];
    }

    public StaticUnitConfig(Integer num, String str, String str2, boolean z) {
        this.A01 = null;
        this.A02 = null;
        this.A05 = z;
        C1pq.A08("unitId", str);
        this.A03 = str;
        this.A04 = str2;
        C1pq.A08("unitType", num);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StaticUnitConfig)) {
                return false;
            }
            StaticUnitConfig staticUnitConfig = (StaticUnitConfig) obj;
            if (!11T.A0O(this.A01, staticUnitConfig.A01) || !11T.A0O(this.A02, staticUnitConfig.A02) || this.A05 != staticUnitConfig.A05 || !11T.A0O(this.A03, staticUnitConfig.A03) || !11T.A0O(this.A04, staticUnitConfig.A04) || this.A00 != staticUnitConfig.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A03(this.A01)), this.A05)));
        Integer num = this.A00;
        return (A04 * 31) + (num == null ? -1 : num.intValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A00.intValue());
    }
}
