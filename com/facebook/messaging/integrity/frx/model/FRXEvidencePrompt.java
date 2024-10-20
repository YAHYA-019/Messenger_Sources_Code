package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zL;
import X.7zN;
import X.AnonymousClass001;
import X.BLN;
import X.BM9;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FRXEvidencePrompt.class */
public final class FRXEvidencePrompt implements Parcelable {
    public static volatile BM9 A05;
    public static final Parcelable.Creator CREATOR = 7zL.A0v(92);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final BM9 A03;
    public final Set A04;

    public FRXEvidencePrompt(BM9 bm9, ImmutableList immutableList, String str, String str2, Set set) {
        this.A03 = bm9;
        C1pq.A08("searchDataSourceTypes", immutableList);
        this.A00 = immutableList;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public FRXEvidencePrompt(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A03 = null;
        } else {
            this.A03 = BM9.values()[parcel.readInt()];
        }
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
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public BM9 A00() {
        if (this.A04.contains("fRXEvidenceType")) {
            return this.A03;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = BM9.A05;
                }
            }
        }
        return A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FRXEvidencePrompt)) {
                return false;
            }
            FRXEvidencePrompt fRXEvidencePrompt = (FRXEvidencePrompt) obj;
            if (A00() != fRXEvidencePrompt.A00() || !11T.A0O(this.A00, fRXEvidencePrompt.A00) || !11T.A0O(this.A01, fRXEvidencePrompt.A01) || !11T.A0O(this.A02, fRXEvidencePrompt.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C3o5.A03(A00()) + 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (BLN) A0b.next());
        }
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
