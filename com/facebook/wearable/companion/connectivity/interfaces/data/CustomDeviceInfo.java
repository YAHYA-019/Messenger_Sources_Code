package com.facebook.wearable.companion.connectivity.interfaces.data;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01g;
import X.C01i;
import X.C03i;
import X.DKH;
import X.FKb;
import X.JQz;
import X.Lvs;
import X.M2k;
import X.M2l;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CustomDeviceInfo.class */
public abstract class CustomDeviceInfo implements Parcelable {
    public static final Companion Companion = new Object();
    public static final C01i A00 = C01g.A00(C03i.A03, M2k.A00);

    /* loaded from: CustomDeviceInfo$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(CustomDeviceInfo.A00);
        }
    }

    /* loaded from: CustomDeviceInfo$MockDevice.class */
    public final class MockDevice extends CustomDeviceInfo {
        public static final MockDevice A00 = new Object();
        public static final /* synthetic */ C01i A01 = C01g.A00(C03i.A03, M2l.A00);
        public static final Parcelable.Creator CREATOR = new FKb(29);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(1);
        }
    }

    /* loaded from: CustomDeviceInfo$WiredDevice.class */
    public final class WiredDevice extends CustomDeviceInfo {
        public final int A00;
        public final String A01;
        public final boolean A02;
        public static final Companion Companion = new Object();
        public static final Parcelable.Creator CREATOR = new FKb(30);

        /* loaded from: CustomDeviceInfo$WiredDevice$Companion.class */
        public final class Companion {
            public final 5Yu serializer() {
                return Lvs.A00;
            }
        }

        public /* synthetic */ WiredDevice(String str, int i, int i2, boolean z) {
            if (7 != (i & 7)) {
                7mU.A00(Lvs.A01, i, 7);
                throw 0Q8.createAndThrow();
            }
            this.A01 = str;
            this.A00 = i2;
            this.A02 = z;
        }

        public WiredDevice(String str, int i, boolean z) {
            11T.A0F(str, 1);
            this.A01 = str;
            this.A00 = i;
            this.A02 = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof WiredDevice)) {
                    return false;
                }
                WiredDevice wiredDevice = (WiredDevice) obj;
                if (!11T.A0O(this.A01, wiredDevice.A01) || this.A00 != wiredDevice.A00 || this.A02 != wiredDevice.A02) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return ((4YV.A02(this.A01) + this.A00) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("WiredDevice(address=");
            A0k.append(this.A01);
            A0k.append(", port=");
            A0k.append(this.A00);
            A0k.append(", secure=");
            return DKH.A0q(A0k, this.A02);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A02 ? 1 : 0);
        }
    }
}
