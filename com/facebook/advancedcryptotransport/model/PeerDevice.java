package com.facebook.advancedcryptotransport.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.4YV;
import X.7zO;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PeerDevice.class */
public final class PeerDevice implements Parcelable {
    public static volatile Integer A0E;
    public static final Parcelable.Creator CREATOR = new LGo(88);
    public final Double A00;
    public final Double A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final Integer A0B;
    public final String A0C;
    public final Set A0D;

    public PeerDevice(Parcel parcel) {
        Integer num = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = 7zO.A0j(parcel);
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        int i = 0;
        this.A0A = 4YV.A1U(parcel.readInt());
        this.A03 = 7zO.A0j(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A0B = parcel.readInt() != 0 ? 7zU.A0e(parcel, 4) : num;
        this.A04 = 7zO.A0j(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0D = Collections.unmodifiableSet(A0v);
    }

    public PeerDevice(Double d, Double d2, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, Set set, boolean z) {
        this.A05 = str;
        C1pq.A08("firstSeenTimestampMillis", l);
        this.A02 = l;
        C1pq.A08("instanceId", str2);
        this.A06 = str2;
        this.A07 = str3;
        this.A0A = z;
        C1pq.A08("lastSeenTimestampMillis", l2);
        this.A03 = l2;
        this.A00 = d;
        this.A08 = str4;
        this.A01 = d2;
        this.A0C = str5;
        this.A09 = str6;
        this.A0B = num;
        C1pq.A08("registrationTimestampMillis", l3);
        this.A04 = l3;
        this.A0D = Collections.unmodifiableSet(set);
    }

    public Integer A00() {
        if (this.A0D.contains("platform")) {
            return this.A0B;
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
            if (!(obj instanceof PeerDevice)) {
                return false;
            }
            PeerDevice peerDevice = (PeerDevice) obj;
            if (!11T.A0O(this.A05, peerDevice.A05) || !11T.A0O(this.A02, peerDevice.A02) || !11T.A0O(this.A06, peerDevice.A06) || !11T.A0O(this.A07, peerDevice.A07) || this.A0A != peerDevice.A0A || !11T.A0O(this.A03, peerDevice.A03) || !11T.A0O(this.A00, peerDevice.A00) || !11T.A0O(this.A08, peerDevice.A08) || !11T.A0O(this.A01, peerDevice.A01) || !11T.A0O(this.A0C, peerDevice.A0C) || !11T.A0O(this.A09, peerDevice.A09) || A00() != peerDevice.A00() || !11T.A0O(this.A04, peerDevice.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A09, C1pq.A04(this.A0C, C1pq.A04(this.A01, C1pq.A04(this.A08, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A03(this.A05)))), this.A0A)))))));
        return C1pq.A04(this.A04, (A04 * 31) + C3o5.A04(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        parcel.writeLong(this.A02.longValue());
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeLong(this.A03.longValue());
        Double d = this.A00;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        1BL.A13(parcel, this.A08);
        Double d2 = this.A01;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A09);
        C3o5.A0f(parcel, this.A0B);
        parcel.writeLong(this.A04.longValue());
        Iterator A0S = C3o5.A0S(parcel, this.A0D);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
