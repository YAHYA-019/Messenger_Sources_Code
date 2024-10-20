package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zL;
import X.7zN;
import X.AbI;
import X.AnonymousClass001;
import X.BLN;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: EvidenceSearchPage.class */
public final class EvidenceSearchPage implements Parcelable {
    public static volatile Integer A05;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(91);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final Integer A03;
    public final Set A04;

    public EvidenceSearchPage(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? AbI.A0z(parcel) : num;
        int readInt = parcel.readInt();
        BLN[] blnArr = new BLN[readInt];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= readInt) {
                break;
            }
            blnArr[i3] = BLN.values()[parcel.readInt()];
            i2 = i3 + 1;
        }
        this.A00 = ImmutableList.copyOf(blnArr);
        this.A02 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public EvidenceSearchPage(ImmutableList immutableList, String str, Set set) {
        this.A01 = null;
        this.A03 = null;
        C1pq.A08("searchDataSourceTypes", immutableList);
        this.A00 = immutableList;
        this.A02 = str;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public int A00() {
        Integer num;
        if (this.A04.contains("pageTitleResId")) {
            num = this.A03;
        } else {
            if (A05 == null) {
                synchronized (this) {
                    if (A05 == null) {
                        A05 = 2131960045;
                    }
                }
            }
            num = A05;
        }
        return num.intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EvidenceSearchPage)) {
                return false;
            }
            EvidenceSearchPage evidenceSearchPage = (EvidenceSearchPage) obj;
            if (!11T.A0O(this.A01, evidenceSearchPage.A01) || A00() != evidenceSearchPage.A00() || !11T.A0O(this.A00, evidenceSearchPage.A00) || !11T.A0O(this.A02, evidenceSearchPage.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, (C1pq.A03(this.A01) * 31) + A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        C3o5.A0f(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (BLN) A0b.next());
        }
        1BL.A13(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
