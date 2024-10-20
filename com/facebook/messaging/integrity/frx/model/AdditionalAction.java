package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.2MQ;
import X.7zL;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.BLo;
import X.C1pq;
import X.C3o5;
import X.CIO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AdditionalAction.class */
public final class AdditionalAction implements Parcelable {
    public static volatile 2MQ A0A;
    public static volatile BLo A0B;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(86);
    public final 2MQ A00;
    public final BLo A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Set A07;
    public final boolean A08;
    public final boolean A09;

    public AdditionalAction(CIO cio) {
        this.A01 = cio.A01;
        this.A02 = cio.A02;
        String str = cio.A03;
        C1pq.A08("completedTitle", str);
        this.A03 = str;
        this.A08 = cio.A08;
        this.A09 = cio.A09;
        this.A00 = cio.A00;
        this.A04 = cio.A04;
        String str2 = cio.A05;
        AbF.A1V(str2);
        this.A05 = str2;
        this.A06 = cio.A06;
        this.A07 = Collections.unmodifiableSet(cio.A07);
    }

    public AdditionalAction(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = BLo.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readString();
        int i = 0;
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = 2MQ.values()[parcel.readInt()];
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = parcel.readString();
        this.A06 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public 2MQ A00() {
        if (this.A07.contains("m4MIGIconName")) {
            return this.A00;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = 2MQ.A1i;
                }
            }
        }
        return A0A;
    }

    public BLo A01() {
        if (this.A07.contains("actionType")) {
            return this.A01;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = BLo.A0M;
                }
            }
        }
        return A0B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdditionalAction)) {
                return false;
            }
            AdditionalAction additionalAction = (AdditionalAction) obj;
            if (A01() != additionalAction.A01() || !11T.A0O(this.A02, additionalAction.A02) || !11T.A0O(this.A03, additionalAction.A03) || this.A08 != additionalAction.A08 || this.A09 != additionalAction.A09 || A00() != additionalAction.A00() || !11T.A0O(this.A04, additionalAction.A04) || !11T.A0O(this.A05, additionalAction.A05) || !11T.A0O(this.A06, additionalAction.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A02 = C1pq.A02(C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C3o5.A03(A01()) + 31)), this.A08), this.A09);
        2MQ A00 = A00();
        if (A00 != null) {
            i = A00.ordinal();
        }
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, (A02 * 31) + i)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
        1BL.A13(parcel, this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
