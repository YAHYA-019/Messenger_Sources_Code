package com.facebook.ipc.inspiration.config.platform;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: PlatformCameraShareConfiguration.class */
public final class PlatformCameraShareConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(37);
    public final ImmutableMap A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PlatformCameraShareConfiguration(Parcel parcel) {
        ImmutableMap immutableMap = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i = 0;
            while (i < readInt) {
                i = AbL.A01(parcel, A0u, i);
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A00 = immutableMap;
    }

    public PlatformCameraShareConfiguration(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PlatformCameraShareConfiguration)) {
                return false;
            }
            PlatformCameraShareConfiguration platformCameraShareConfiguration = (PlatformCameraShareConfiguration) obj;
            if (!11T.A0O(this.A01, platformCameraShareConfiguration.A01) || !11T.A0O(this.A02, platformCameraShareConfiguration.A02) || !11T.A0O(this.A03, platformCameraShareConfiguration.A03) || !11T.A0O(this.A00, platformCameraShareConfiguration.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        ImmutableMap immutableMap = this.A00;
        if (immutableMap == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        1Du A0g = DKH.A0g(parcel, immutableMap);
        while (A0g.hasNext()) {
            AbL.A0n(parcel, A0g);
        }
    }
}
