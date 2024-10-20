package com.facebook.wearable.companion.connectivity.interfaces.data;

import X.0Q8;
import X.11T;
import X.1BL;
import X.4YV;
import X.5Yu;
import X.5ZL;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import X.JQz;
import X.Lvt;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pairingmanager.api.SimplePairedStateData;
import java.util.List;

/* loaded from: DeviceRecord.class */
public final class DeviceRecord extends C04v implements Parcelable {
    public SimplePairedStateData A00;
    public String A01;
    public List A02;
    public final int A03;
    public final CustomDeviceInfo A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new FKb(31);
    public static final 5Yu[] A08 = {null, null, null, new 5cI(5ZL.A01), null, null, null, JQz.A0x(CustomDeviceInfo.A00)};

    /* loaded from: DeviceRecord$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvt.A00;
        }
    }

    public /* synthetic */ DeviceRecord(SimplePairedStateData simplePairedStateData, CustomDeviceInfo customDeviceInfo, String str, String str2, String str3, List list, int i, int i2, boolean z) {
        if (31 != (i & 31)) {
            7mU.A00(Lvt.A01, i, 31);
            throw 0Q8.createAndThrow();
        }
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i2;
        this.A02 = list;
        this.A00 = simplePairedStateData;
        this.A07 = (i & 32) == 0 ? false : z;
        if ((i & 64) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str3;
        }
        if ((i & 128) == 0) {
            this.A04 = null;
        } else {
            this.A04 = customDeviceInfo;
        }
    }

    public DeviceRecord(SimplePairedStateData simplePairedStateData, CustomDeviceInfo customDeviceInfo, String str, String str2, String str3, List list, int i, boolean z) {
        1BL.A1F(str, str2);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i;
        this.A02 = list;
        this.A00 = simplePairedStateData;
        this.A07 = z;
        this.A01 = str3;
        this.A04 = customDeviceInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && 1BL.A1V(this, obj)) {
            DeviceRecord deviceRecord = (DeviceRecord) obj;
            if (11T.A0O(this.A05, deviceRecord.A05) && this.A03 == deviceRecord.A03) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YV.A02(this.A05) + this.A03;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DeviceRecord(identifier=");
        A0k.append(this.A05);
        A0k.append(", name=");
        A0k.append(this.A06);
        A0k.append(", type=");
        A0k.append(this.A03);
        A0k.append(", userData=");
        A0k.append(this.A02);
        A0k.append(", pairedStateData=");
        A0k.append(this.A00);
        A0k.append(", observingPresence=");
        A0k.append(this.A07);
        A0k.append(", customName=");
        A0k.append(this.A01);
        A0k.append(", customDeviceInfo=");
        return AnonymousClass002.A0K(this.A04, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A03);
        parcel.writeStringList(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A04, i);
    }
}
