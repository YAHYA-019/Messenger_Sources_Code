package com.facebookpay.logging;

import X.11T;
import X.1BL;
import X.AbstractC11504wo;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EvO;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FBPayLoggerData.class */
public final class FBPayLoggerData implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = new LGn(0);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    public FBPayLoggerData(EvO evO) {
        this.A05 = null;
        this.A00 = evO.A00;
        this.A01 = evO.A01;
        this.A06 = null;
        this.A02 = evO.A02;
        this.A03 = evO.A03;
        this.A07 = evO.A04;
        this.A04 = evO.A05;
        this.A08 = Collections.unmodifiableSet(evO.A06);
    }

    public FBPayLoggerData(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
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
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public String A00() {
        if (this.A08.contains("sessionId")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = AbstractC11504wo.A01();
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
            if (!(obj instanceof FBPayLoggerData)) {
                return false;
            }
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
            if (!11T.A0O(this.A05, fBPayLoggerData.A05) || !11T.A0O(this.A00, fBPayLoggerData.A00) || !11T.A0O(this.A01, fBPayLoggerData.A01) || !11T.A0O(this.A06, fBPayLoggerData.A06) || !11T.A0O(this.A02, fBPayLoggerData.A02) || !11T.A0O(this.A03, fBPayLoggerData.A03) || !11T.A0O(A00(), fBPayLoggerData.A00()) || !11T.A0O(this.A04, fBPayLoggerData.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A05))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
