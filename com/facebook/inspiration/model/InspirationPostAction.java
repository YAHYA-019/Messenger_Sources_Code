package com.facebook.inspiration.model;

import X.1BM;
import X.AbJ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.FKf;
import X.QqK;
import X.Qus;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationPostAction.class */
public final class InspirationPostAction implements Parcelable {
    public static volatile Qus A09;
    public static volatile QqK A0A;
    public static final Parcelable.Creator CREATOR = new FKf(61);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final Qus A06;
    public final QqK A07;
    public final Set A08;

    public InspirationPostAction(Qus qus, QqK qqK, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A07 = qqK;
        this.A06 = qus;
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public InspirationPostAction(Parcel parcel) {
        Qus qus = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A07 = null;
        } else {
            this.A07 = QqK.values()[parcel.readInt()];
        }
        this.A06 = parcel.readInt() != 0 ? Qus.values()[parcel.readInt()] : qus;
        int i = 0;
        this.A00 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = 1BM.A07(parcel);
        this.A03 = 1BM.A07(parcel);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public Qus A00() {
        if (this.A08.contains("reason")) {
            return this.A06;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = Qus.A02;
                }
            }
        }
        return A09;
    }

    public QqK A01() {
        if (this.A08.contains("action")) {
            return this.A07;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = QqK.A09;
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
            if (!(obj instanceof InspirationPostAction)) {
                return false;
            }
            InspirationPostAction inspirationPostAction = (InspirationPostAction) obj;
            if (A01() != inspirationPostAction.A01() || A00() != inspirationPostAction.A00() || this.A00 != inspirationPostAction.A00 || this.A01 != inspirationPostAction.A01 || this.A02 != inspirationPostAction.A02 || this.A03 != inspirationPostAction.A03 || this.A04 != inspirationPostAction.A04 || this.A05 != inspirationPostAction.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C3o5.A03(A01()) + 31;
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((A03 * 31) + DKF.A04(A00()), this.A00), this.A01), this.A02), this.A03), this.A04), this.A05);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationPostAction{action=");
        A0k.append(A01());
        A0k.append(", reason=");
        A0k.append(A00());
        A0k.append(", shouldAutoTrimAndAutoZoomCrop=");
        A0k.append(this.A00);
        A0k.append(", shouldDeferPrivacySetting=");
        A0k.append(this.A01);
        A0k.append(", shouldFinishCallSiteAfterPosting=");
        A0k.append(this.A02);
        A0k.append(", shouldPostFromCamera=");
        A0k.append(this.A03);
        A0k.append(", shouldSkipShareSheet=");
        A0k.append(this.A04);
        A0k.append(", shouldUseBottomShareSheet=");
        return AbstractC2327GOs.A0X(A0k, this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A07);
        C3o5.A0e(parcel, this.A06);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
