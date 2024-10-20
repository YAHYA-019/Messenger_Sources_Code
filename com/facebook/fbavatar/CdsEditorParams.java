package com.facebook.fbavatar;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CdsEditorParams.class */
public final class CdsEditorParams implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = FKX.A00(71);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    public CdsEditorParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        int i = 0;
        this.A05 = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A00 = parcel.readInt();
        this.A04 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public CdsEditorParams(String str, String str2, String str3, String str4, String str5, Set set, int i, boolean z) {
        this.A06 = null;
        this.A01 = str;
        this.A05 = z;
        this.A07 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = i;
        this.A04 = str5;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A08.contains("postSaveShareOption")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = "unspecified";
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CdsEditorParams)) {
                return false;
            }
            CdsEditorParams cdsEditorParams = (CdsEditorParams) obj;
            if (!11T.A0O(this.A06, cdsEditorParams.A06) || !11T.A0O(this.A01, cdsEditorParams.A01) || this.A05 != cdsEditorParams.A05 || !11T.A0O(A00(), cdsEditorParams.A00()) || !11T.A0O(this.A02, cdsEditorParams.A02) || !11T.A0O(this.A03, cdsEditorParams.A03) || this.A00 != cdsEditorParams.A00 || !11T.A0O(this.A04, cdsEditorParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, (C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(A00(), C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A06)), this.A05)))) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
