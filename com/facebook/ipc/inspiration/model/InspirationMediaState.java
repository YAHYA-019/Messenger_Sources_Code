package com.facebook.ipc.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKF;
import X.EMG;
import X.Qp4;
import X.Ran;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationMediaState.class */
public final class InspirationMediaState implements Parcelable {
    public static volatile EMG A0F;
    public static final Parcelable.Creator CREATOR = new CSR(41);
    public final int A00;
    public final int A01;
    public final int A02;
    public final EMG A03;
    public final Qp4 A04;
    public final SmartTrimTrimmerBackupData A05;
    public final String A06;
    public final String A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public InspirationMediaState(Ran ran) {
        this.A00 = ran.A00;
        this.A01 = ran.A01;
        this.A09 = ran.A09;
        this.A0A = ran.A0A;
        this.A0B = ran.A0B;
        this.A0C = ran.A0C;
        this.A0D = ran.A0D;
        this.A0E = ran.A0E;
        String str = ran.A06;
        C1pq.A08("mediaContentPath", str);
        this.A06 = str;
        this.A07 = ran.A07;
        this.A03 = ran.A03;
        this.A05 = ran.A05;
        this.A02 = ran.A02;
        this.A04 = ran.A04;
        this.A08 = Collections.unmodifiableSet(ran.A08);
        EMG A01 = A01();
        if (A01 == EMG.A07 || A01 == EMG.A09 || A01 == EMG.A08) {
            Preconditions.checkState(this.A0A, "Capture media source must be in-app capture originated!", new Object[0]);
        }
    }

    public InspirationMediaState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        int i = 0;
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0A = 1BM.A07(parcel);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        this.A0E = AbJ.A1V(parcel);
        this.A06 = parcel.readString();
        Qp4 qp4 = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = EMG.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (SmartTrimTrimmerBackupData) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt() != 0 ? Qp4.values()[parcel.readInt()] : qp4;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public static Ran A00(InspirationMediaState inspirationMediaState) {
        return inspirationMediaState != null ? new Ran(inspirationMediaState) : new Ran();
    }

    public EMG A01() {
        if (this.A08.contains("mediaSource")) {
            return this.A03;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = EMG.A07;
                }
            }
        }
        return A0F;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMediaState)) {
                return false;
            }
            InspirationMediaState inspirationMediaState = (InspirationMediaState) obj;
            if (this.A00 != inspirationMediaState.A00 || this.A01 != inspirationMediaState.A01 || this.A09 != inspirationMediaState.A09 || this.A0A != inspirationMediaState.A0A || this.A0B != inspirationMediaState.A0B || this.A0C != inspirationMediaState.A0C || this.A0D != inspirationMediaState.A0D || this.A0E != inspirationMediaState.A0E || !11T.A0O(this.A06, inspirationMediaState.A06) || !11T.A0O(this.A07, inspirationMediaState.A07) || A01() != inspirationMediaState.A01() || !11T.A0O(this.A05, inspirationMediaState.A05) || this.A02 != inspirationMediaState.A02 || this.A04 != inspirationMediaState.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(((this.A00 + 31) * 31) + this.A01, this.A09), this.A0A), this.A0B), this.A0C), this.A0D), this.A0E)));
        int A042 = (C1pq.A04(this.A05, (A04 * 31) + C3o5.A03(A01())) * 31) + this.A02;
        return (A042 * 31) + DKF.A04(this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        C3o5.A0e(parcel, this.A03);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeInt(this.A02);
        C3o5.A0e(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
