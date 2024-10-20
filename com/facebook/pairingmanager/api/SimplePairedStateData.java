package com.facebook.pairingmanager.api;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.FKY;
import X.LvM;
import X.Lvq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SimplePairedStateData.class */
public final class SimplePairedStateData implements Parcelable {
    public static final 5Yu[] A06;
    public final BluetoothDeviceState A00;
    public final BluetoothPairingType A01;
    public final PairingType A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new FKY(31);

    /* loaded from: SimplePairedStateData$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvq.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.pairingmanager.api.SimplePairedStateData$Companion, java.lang.Object] */
    static {
        PairingType[] values = PairingType.values();
        11T.A0F(values, 1);
        5Yu lvM = new LvM("com.facebook.pairingmanager.api.PairingType", values);
        BluetoothPairingType[] values2 = BluetoothPairingType.values();
        11T.A0F(values2, 1);
        5Yu lvM2 = new LvM("com.facebook.pairingmanager.api.BluetoothPairingType", values2);
        BluetoothDeviceState[] values3 = BluetoothDeviceState.values();
        11T.A0F(values3, 1);
        A06 = new 5Yu[]{null, lvM, null, null, lvM2, new LvM("com.facebook.pairingmanager.api.BluetoothDeviceState", values3)};
    }

    public /* synthetic */ SimplePairedStateData(BluetoothDeviceState bluetoothDeviceState, BluetoothPairingType bluetoothPairingType, PairingType pairingType, String str, int i, boolean z, boolean z2) {
        if (55 != (i & 55)) {
            7mU.A00(Lvq.A01, i, 55);
            throw 0Q8.createAndThrow();
        }
        this.A03 = str;
        this.A02 = pairingType;
        this.A05 = z;
        if ((i & 8) == 0) {
            this.A04 = false;
        } else {
            this.A04 = z2;
        }
        this.A01 = bluetoothPairingType;
        this.A00 = bluetoothDeviceState;
    }

    public SimplePairedStateData(BluetoothDeviceState bluetoothDeviceState, BluetoothPairingType bluetoothPairingType, PairingType pairingType, String str, boolean z, boolean z2) {
        1BL.A1F(str, pairingType);
        1BL.A1G(bluetoothPairingType, bluetoothDeviceState);
        this.A03 = str;
        this.A02 = pairingType;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = bluetoothPairingType;
        this.A00 = bluetoothDeviceState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SimplePairedStateData)) {
                return false;
            }
            SimplePairedStateData simplePairedStateData = (SimplePairedStateData) obj;
            if (!11T.A0O(this.A03, simplePairedStateData.A03) || this.A02 != simplePairedStateData.A02 || this.A05 != simplePairedStateData.A05 || this.A04 != simplePairedStateData.A04 || this.A01 != simplePairedStateData.A01 || this.A00 != simplePairedStateData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A01, (((AnonymousClass002.A05(this.A02, 4YV.A02(this.A03)) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SimplePairedStateData(address=");
        A0k.append(this.A03);
        A0k.append(", type=");
        A0k.append(this.A02);
        A0k.append(", pairingComplete=");
        A0k.append(this.A05);
        A0k.append(", grantedDozeExemption=");
        A0k.append(this.A04);
        A0k.append(", bluetoothPairingType=");
        A0k.append(this.A01);
        A0k.append(", bluetoothDeviceState=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        1BL.A12(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        1BL.A12(parcel, this.A01);
        1BL.A12(parcel, this.A00);
    }
}
