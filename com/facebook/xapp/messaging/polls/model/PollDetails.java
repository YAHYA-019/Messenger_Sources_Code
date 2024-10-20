package com.facebook.xapp.messaging.polls.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zO;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PollDetails.class */
public final class PollDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(55);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public PollDetails(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        boolean z = true;
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = parcel.readInt() != 1 ? false : z;
        this.A02 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A07 = parcel.readInt() != 0 ? 7zO.A0j(parcel) : null;
        this.A09 = C3o5.A0O(parcel);
        this.A03 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            strArr[i] = parcel.readString();
        }
        this.A04 = ImmutableList.copyOf(strArr);
        int readInt2 = parcel.readInt();
        String[] strArr2 = new String[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            strArr2[i2] = parcel.readString();
        }
        this.A05 = ImmutableList.copyOf(strArr2);
        int readInt3 = parcel.readInt();
        Uri[] uriArr = new Uri[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            uriArr[i3] = parcel.readParcelable(A0e);
        }
        this.A06 = ImmutableList.copyOf(uriArr);
    }

    public PollDetails(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, Long l, String str, String str2, int i, int i2, long j, long j2, boolean z, boolean z2) {
        this.A0A = z;
        this.A0B = z2;
        this.A02 = j;
        C1pq.A08("optionText", str);
        this.A08 = str;
        this.A07 = l;
        this.A09 = str2;
        this.A03 = j2;
        this.A00 = i;
        this.A01 = i2;
        C1pq.A08("voterIds", immutableList);
        this.A04 = immutableList;
        C1pq.A08("voterNames", immutableList2);
        this.A05 = immutableList2;
        C1pq.A08("voterUris", immutableList3);
        this.A06 = immutableList3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollDetails)) {
                return false;
            }
            PollDetails pollDetails = (PollDetails) obj;
            if (this.A0A != pollDetails.A0A || this.A0B != pollDetails.A0B || this.A02 != pollDetails.A02 || !11T.A0O(this.A08, pollDetails.A08) || !11T.A0O(this.A07, pollDetails.A07) || !11T.A0O(this.A09, pollDetails.A09) || this.A03 != pollDetails.A03 || this.A00 != pollDetails.A00 || this.A01 != pollDetails.A01 || !11T.A0O(this.A04, pollDetails.A04) || !11T.A0O(this.A05, pollDetails.A05) || !11T.A0O(this.A06, pollDetails.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, (((C1pq.A01(C1pq.A04(this.A09, C1pq.A04(this.A07, C1pq.A04(this.A08, C1pq.A01(C1pq.A02(C1pq.A05(this.A0A), this.A0B), this.A02)))), this.A03) * 31) + this.A00) * 31) + this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        C3o5.A0g(parcel, this.A07);
        1BL.A13(parcel, this.A09);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A05);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A06);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((Uri) A0b3.next(), i);
        }
    }
}
