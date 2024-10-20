package com.google.android.gms.fido.common;

import X.0Q8;
import X.Kyx;
import X.LGn;
import X.LdI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: Transport.class */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USB("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator CREATOR = LGn.A00(86);
    public final String zzc;

    Transport(String str) {
        this.zzc = str;
    }

    public static Transport A00(String str) {
        if (str.equals("hybrid")) {
            LdI.A01.A00.DCA();
            Kyx.A02.DCA();
            throw 0Q8.createAndThrow();
        }
        Transport[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("Transport %s not supported", str));
            }
            Transport transport = values[i2];
            if (str.equals(transport.zzc)) {
                return transport;
            }
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzc);
    }
}
