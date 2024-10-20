package com.facebook.messaging.montage.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.82M;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C5b0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageBucketInfo.class */
public final class MontageBucketInfo implements Parcelable {
    public static volatile ImmutableList A06;
    public static final Parcelable.Creator CREATOR = new 82M(56);
    public final int A00;
    public final long A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Set A04;
    public final boolean A05;

    public MontageBucketInfo(C5b0 c5b0) {
        ImmutableList immutableList = c5b0.A02;
        C1pq.A08("cards", immutableList);
        this.A02 = immutableList;
        this.A05 = c5b0.A05;
        this.A01 = c5b0.A01;
        this.A00 = c5b0.A00;
        this.A03 = c5b0.A03;
        this.A04 = Collections.unmodifiableSet(c5b0.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MontageBucketInfo(Parcel parcel) {
        ImmutableList copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        MontageCard[] montageCardArr = new MontageCard[readInt];
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            montageCardArr[i2] = parcel.readParcelable(A0e);
        }
        this.A02 = ImmutableList.copyOf(montageCardArr);
        this.A05 = 4YV.A1U(parcel.readInt());
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            int readInt2 = parcel.readInt();
            MontageUser[] montageUserArr = new MontageUser[readInt2];
            for (int i3 = 0; i3 < readInt2; i3++) {
                montageUserArr[i3] = parcel.readParcelable(A0e);
            }
            copyOf = ImmutableList.copyOf(montageUserArr);
        }
        this.A03 = copyOf;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    public MontageBucketInfo(ImmutableList immutableList, ImmutableList immutableList2, Set set, int i, long j, boolean z) {
        C1pq.A08("cards", immutableList);
        this.A02 = immutableList;
        this.A05 = z;
        this.A01 = j;
        this.A00 = i;
        this.A03 = immutableList2;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A04.contains("seenByUserList")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = ImmutableList.of();
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageBucketInfo)) {
                return false;
            }
            MontageBucketInfo montageBucketInfo = (MontageBucketInfo) obj;
            if (!11T.A0O(this.A02, montageBucketInfo.A02) || this.A05 != montageBucketInfo.A05 || this.A01 != montageBucketInfo.A01 || this.A00 != montageBucketInfo.A00 || !11T.A0O(A00(), montageBucketInfo.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), (C1pq.A01(C1pq.A02(C1pq.A04(this.A02, 1), this.A05), this.A01) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MontageCard) A0b.next(), i);
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList);
            while (A0b2.hasNext()) {
                parcel.writeParcelable((MontageUser) A0b2.next(), i);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
