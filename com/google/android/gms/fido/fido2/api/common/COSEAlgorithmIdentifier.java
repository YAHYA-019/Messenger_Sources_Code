package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.DKD;
import X.KPS;
import X.KPT;
import X.LGm;
import X.MGE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: COSEAlgorithmIdentifier.class */
public final class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(21);
    public final MGE A00;

    public COSEAlgorithmIdentifier(MGE mge) {
        this.A00 = mge;
    }

    public static COSEAlgorithmIdentifier A00(int i) {
        KPS kps;
        if (i == KPT.A01.zzb) {
            kps = KPT.A02;
        } else {
            KPS[] values = KPT.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    KPS[] values2 = KPS.values();
                    int length2 = values2.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        kps = values2[i3];
                        if (kps.zzb != i) {
                        }
                    }
                    throw new Exception(0Pz.A0d("Algorithm with COSE value ", " not supported", i));
                }
                kps = values[i2];
                if (((KPT) kps).zzb == i) {
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(kps);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof COSEAlgorithmIdentifier) && this.A00.AWD() == ((COSEAlgorithmIdentifier) obj).A00.AWD()) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    public final String toString() {
        return 0Pz.A0j("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.A00), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.AWD());
    }
}
