package com.facebook.messaging.polling.datamodels;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.7zU;
import X.AbF;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PollingDraftOption.class */
public final class PollingDraftOption implements Parcelable {
    public static volatile Integer A0A;
    public static final Parcelable.Creator CREATOR = new CSS(17);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public PollingDraftOption(Parcel parcel) {
        getClass().getClassLoader();
        this.A02 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        int i = 0;
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = 1BM.A07(parcel);
        this.A09 = AbJ.A1V(parcel);
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt() == 0 ? null : 7zU.A0e(parcel, 3);
        this.A01 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public PollingDraftOption(Integer num, String str, String str2, Set set, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = j;
        this.A00 = i;
        AbF.A1T(str);
        this.A04 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        C1pq.A08("text", str2);
        this.A05 = str2;
        this.A03 = num;
        this.A01 = i2;
        this.A06 = Collections.unmodifiableSet(set);
    }

    private Integer A00() {
        if (this.A06.contains("timeMode")) {
            return this.A03;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = 0S2.A00;
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollingDraftOption)) {
                return false;
            }
            PollingDraftOption pollingDraftOption = (PollingDraftOption) obj;
            if (this.A02 != pollingDraftOption.A02 || this.A00 != pollingDraftOption.A00 || !11T.A0O(this.A04, pollingDraftOption.A04) || this.A07 != pollingDraftOption.A07 || this.A08 != pollingDraftOption.A08 || this.A09 != pollingDraftOption.A09 || !11T.A0O(this.A05, pollingDraftOption.A05) || A00() != pollingDraftOption.A00() || this.A01 != pollingDraftOption.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A05, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A04, ((1BL.A01(this.A02) + 31) * 31) + this.A00), this.A07), this.A08), this.A09));
        return (((A04 * 31) + C3o5.A04(A00())) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        Integer num = this.A03;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeInt(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
