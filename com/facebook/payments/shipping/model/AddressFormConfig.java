package com.facebook.payments.shipping.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKd;
import X.RGx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: AddressFormConfig.class */
public final class AddressFormConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(91);
    public final ImmutableMap A00;
    public final String A01;

    public AddressFormConfig(RGx rGx) {
        this.A00 = rGx.A00;
        this.A01 = null;
    }

    public AddressFormConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableMap immutableMap = null;
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                A0u.put(parcel.readString(), parcel.readParcelable(A0e));
                i = i2 + 1;
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A00 = immutableMap;
        this.A01 = C3o5.A0O(parcel);
    }

    public AddressFormConfig(ImmutableMap immutableMap, String str) {
        this.A00 = immutableMap;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddressFormConfig)) {
                return false;
            }
            AddressFormConfig addressFormConfig = (AddressFormConfig) obj;
            if (!11T.A0O(this.A00, addressFormConfig.A00) || !11T.A0O(this.A01, addressFormConfig.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0g);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                parcel.writeParcelable((Parcelable) A0z.getValue(), i);
            }
        }
        1BL.A13(parcel, this.A01);
    }
}
