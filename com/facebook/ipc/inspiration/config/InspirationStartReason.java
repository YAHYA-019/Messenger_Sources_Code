package com.facebook.ipc.inspiration.config;

import X.11T;
import X.1BL;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKF;
import X.EPQ;
import X.EQv;
import X.GOq;
import X.NA5;
import X.RUK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationStartReason.class */
public final class InspirationStartReason implements Parcelable, NA5 {
    public static volatile EQv A06;
    public static volatile EPQ A07;
    public static final Parcelable.Creator CREATOR = new CSR(34);
    public final EQv A00;
    public final EPQ A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;

    public InspirationStartReason(RUK ruk) {
        String str = ruk.A02;
        C1pq.A08("composerEntryPointName", str);
        this.A02 = str;
        this.A01 = ruk.A01;
        String str2 = ruk.A03;
        C1pq.A08("reasonName", str2);
        this.A03 = str2;
        this.A00 = ruk.A00;
        this.A04 = ruk.A04;
        this.A05 = Collections.unmodifiableSet(ruk.A05);
    }

    public InspirationStartReason(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        EQv eQv = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = EPQ.values()[parcel.readInt()];
        }
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt() != 0 ? EQv.values()[parcel.readInt()] : eQv;
        this.A04 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public EQv A00() {
        if (this.A05.contains("reasonNameEnum")) {
            return this.A00;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = EQv.A0Q;
                }
            }
        }
        return A06;
    }

    public EPQ A01() {
        if (this.A05.contains("composerSourceScreen")) {
            return this.A01;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = EPQ.A14;
                }
            }
        }
        return A07;
    }

    @Override // X.NA5
    public String B6H() {
        return this.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStartReason)) {
                return false;
            }
            InspirationStartReason inspirationStartReason = (InspirationStartReason) obj;
            if (!11T.A0O(this.A02, inspirationStartReason.A02) || A01() != inspirationStartReason.A01() || !11T.A0O(this.A03, inspirationStartReason.A03) || A00() != inspirationStartReason.A00() || !11T.A0O(this.A04, inspirationStartReason.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A02);
        int A04 = C1pq.A04(this.A03, (A03 * 31) + C3o5.A03(A01()));
        return C1pq.A04(this.A04, (A04 * 31) + DKF.A04(A00()));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationStartReason{composerEntryPointName=");
        A0k.append(this.A02);
        A0k.append(", composerSourceScreen=");
        A0k.append(A01());
        A0k.append(", reasonName=");
        A0k.append(this.A03);
        A0k.append(", reasonNameEnum=");
        A0k.append(A00());
        A0k.append(", reelsComposerLandingActionName=");
        return GOq.A12(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A01);
        parcel.writeString(this.A03);
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
