package com.facebook.messaging.model.threads.ads;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C8g;
import X.CSV;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AdContextData.class */
public final class AdContextData implements Parcelable {
    public static volatile Integer A0E;
    public static final Parcelable.Creator CREATOR = new CSV(82);
    public final Uri A00;
    public final ImmutableList A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final Set A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AdContextData(C8g c8g) {
        this.A02 = c8g.A02;
        ImmutableList immutableList = c8g.A01;
        C1pq.A08("adContextMediaAttachments", immutableList);
        this.A01 = immutableList;
        this.A03 = c8g.A03;
        this.A04 = c8g.A04;
        this.A05 = c8g.A05;
        this.A06 = c8g.A06;
        this.A00 = c8g.A00;
        this.A07 = c8g.A07;
        this.A0B = c8g.A0B;
        this.A0C = c8g.A0C;
        this.A0D = c8g.A0D;
        this.A08 = c8g.A08;
        this.A09 = c8g.A09;
        this.A0A = Collections.unmodifiableSet(c8g.A0A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdContextData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 0S2.A00(6)[parcel.readInt()];
        }
        int readInt = parcel.readInt();
        AdContextMediaAttachmentData[] adContextMediaAttachmentDataArr = new AdContextMediaAttachmentData[readInt];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= readInt) {
                break;
            }
            adContextMediaAttachmentDataArr[i3] = parcel.readParcelable(classLoader);
            i2 = i3 + 1;
        }
        this.A01 = ImmutableList.copyOf(adContextMediaAttachmentDataArr);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        boolean z = true;
        this.A0B = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0C = 1BM.A07(parcel);
        this.A0D = parcel.readInt() != 1 ? false : z;
        this.A08 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A09 = C3o5.A0O(parcel);
        HashSet hashSet = new HashSet();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A0A = Collections.unmodifiableSet(hashSet);
    }

    public Integer A00() {
        if (this.A0A.contains("adContextInThreadWarningStatus")) {
            return this.A02;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = 0S2.A00;
                }
            }
        }
        return A0E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdContextData)) {
                return false;
            }
            AdContextData adContextData = (AdContextData) obj;
            if (A00() != adContextData.A00() || !11T.A0O(this.A01, adContextData.A01) || !11T.A0O(this.A03, adContextData.A03) || !11T.A0O(this.A04, adContextData.A04) || !11T.A0O(this.A05, adContextData.A05) || !11T.A0O(this.A06, adContextData.A06) || !11T.A0O(this.A00, adContextData.A00) || !11T.A0O(this.A07, adContextData.A07) || this.A0B != adContextData.A0B || this.A0C != adContextData.A0C || this.A0D != adContextData.A0D || !11T.A0O(this.A08, adContextData.A08) || !11T.A0O(this.A09, adContextData.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A07, C1pq.A04(this.A00, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, C3o5.A04(A00()) + 31))))))), this.A0B), this.A0C), this.A0D)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AdContextMediaAttachmentData) A0b.next(), i);
        }
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        C3o5.A0d(parcel, this.A00, i);
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        Iterator A0S = C3o5.A0S(parcel, this.A0A);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
