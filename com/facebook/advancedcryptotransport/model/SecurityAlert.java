package com.facebook.advancedcryptotransport.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.7zO;
import X.7zU;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SecurityAlert.class */
public final class SecurityAlert implements Parcelable {
    public static volatile Integer A07;
    public static volatile Integer A08;
    public static final Parcelable.Creator CREATOR = new LGo(89);
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final Integer A04;
    public final Integer A05;
    public final Set A06;

    public SecurityAlert(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = 7zO.A0j(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = 7zU.A0e(parcel, 4);
        }
        this.A00 = AbI.A0z(parcel);
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
        this.A05 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 4) : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public SecurityAlert(Integer num, Integer num2, Integer num3, Long l, String str, String str2, Set set) {
        C1pq.A08("createdTimestampMillis", l);
        this.A01 = l;
        this.A04 = num;
        C1pq.A08("deviceId", num2);
        this.A00 = num2;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = num3;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public Integer A00() {
        if (this.A06.contains("deviceChangeType")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 0S2.A00;
                }
            }
        }
        return A07;
    }

    public Integer A01() {
        if (this.A06.contains("platform")) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = 0S2.A00;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SecurityAlert)) {
                return false;
            }
            SecurityAlert securityAlert = (SecurityAlert) obj;
            if (!11T.A0O(this.A01, securityAlert.A01) || A00() != securityAlert.A00() || !11T.A0O(this.A00, securityAlert.A00) || !11T.A0O(this.A02, securityAlert.A02) || !11T.A0O(this.A03, securityAlert.A03) || A01() != securityAlert.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, (C1pq.A03(this.A01) * 31) + C3o5.A04(A00()))));
        Integer A01 = A01();
        if (A01 != null) {
            i = A01.intValue();
        }
        return (A04 * 31) + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01.longValue());
        C3o5.A0f(parcel, this.A04);
        parcel.writeInt(this.A00.intValue());
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        C3o5.A0f(parcel, this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
