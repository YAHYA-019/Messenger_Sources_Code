package com.facebook.xapp.messaging.capability.vector;

import X.11T;
import X.1M7;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.BitSet;

/* loaded from: Capabilities.class */
public final class Capabilities implements Parcelable {
    public final BitSet A00;
    public static final 1M7 A01 = new Object();
    public static final Parcelable.Creator CREATOR = new C2xc(63);
    public static final Capabilities A02 = new Capabilities(new BitSet());

    public Capabilities(BitSet bitSet) {
        this.A00 = bitSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Capabilities)) {
            return false;
        }
        return 11T.A0O(this.A00, ((Capabilities) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Capabilities(");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        11T.A0F(parcel, 0);
        BitSet bitSet = this.A00;
        byte[] bArr = new byte[(bitSet.length() + 7) / 8];
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i2);
            if (nextSetBit < 0) {
                parcel.writeByteArray(bArr);
                return;
            } else {
                int i3 = nextSetBit / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (nextSetBit % 8)));
                i2 = nextSetBit + 1;
            }
        }
    }
}
