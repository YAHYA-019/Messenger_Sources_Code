package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbG;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.BM9;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: EvidencePage.class */
public final class EvidencePage implements Parcelable {
    public static volatile BM9 A0B;
    public static volatile Integer A0C;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(90);
    public final BM9 A00;
    public final User A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;

    public EvidencePage(BM9 bm9, User user, ImmutableList immutableList, ImmutableList immutableList2, Integer num, String str, String str2, String str3, Set set, boolean z, boolean z2) {
        this.A05 = str;
        this.A00 = bm9;
        this.A06 = str2;
        this.A07 = str3;
        this.A02 = immutableList;
        this.A09 = z;
        this.A0A = z2;
        this.A04 = num;
        this.A01 = user;
        C1pq.A08("topContactsList", immutableList2);
        this.A03 = immutableList2;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public EvidencePage(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        User user = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = BM9.values()[parcel.readInt()];
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
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            User[] userArr = new User[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, userArr, i2);
            }
            this.A02 = ImmutableList.copyOf(userArr);
        }
        this.A09 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0A = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AbI.A0z(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? (User) parcel.readParcelable(A0e) : user;
        int readInt2 = parcel.readInt();
        User[] userArr2 = new User[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, userArr2, i3);
        }
        this.A03 = ImmutableList.copyOf(userArr2);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public int A00() {
        Integer num;
        if (this.A08.contains("pageTitleResId")) {
            num = this.A04;
        } else {
            if (A0C == null) {
                synchronized (this) {
                    if (A0C == null) {
                        A0C = 2131960052;
                    }
                }
            }
            num = A0C;
        }
        return num.intValue();
    }

    public BM9 A01() {
        if (this.A08.contains("evidenceType")) {
            return this.A00;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = BM9.A05;
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
            if (!(obj instanceof EvidencePage)) {
                return false;
            }
            EvidencePage evidencePage = (EvidencePage) obj;
            if (!11T.A0O(this.A05, evidencePage.A05) || A01() != evidencePage.A01() || !11T.A0O(this.A06, evidencePage.A06) || !11T.A0O(this.A07, evidencePage.A07) || !11T.A0O(this.A02, evidencePage.A02) || this.A09 != evidencePage.A09 || this.A0A != evidencePage.A0A || A00() != evidencePage.A00() || !11T.A0O(this.A01, evidencePage.A01) || !11T.A0O(this.A03, evidencePage.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A05);
        return C1pq.A04(this.A03, C1pq.A04(this.A01, (C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A07, C1pq.A04(this.A06, (A03 * 31) + C3o5.A03(A01())))), this.A09), this.A0A) * 31) + A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable(AbG.A0t(A0Y), i);
            }
        }
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        C3o5.A0f(parcel, this.A04);
        C3o5.A0d(parcel, this.A01, i);
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            parcel.writeParcelable(AbG.A0t(A0b), i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
