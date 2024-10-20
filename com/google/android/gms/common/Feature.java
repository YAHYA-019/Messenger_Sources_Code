package com.google.android.gms.common;

import X.3OO;
import X.AbstractC01153q8;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: Feature.class */
public final class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(73);
    public final int A00;
    public final long A01;
    public final String A02;

    public Feature(String str, int i, long j) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
    }

    public Feature(String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        String str = this.A02;
        String str2 = feature.A02;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        long j = this.A01;
        long j2 = -1;
        if (j == j2) {
            j = this.A00;
        }
        long j3 = feature.A01;
        if (j3 == j2) {
            j3 = feature.A00;
        }
        return j == j3;
    }

    public final int hashCode() {
        String str = this.A02;
        long j = this.A01;
        if (j == -1) {
            j = this.A00;
        }
        return Arrays.hashCode(new Object[]{str, Long.valueOf(j)});
    }

    public final String toString() {
        3OO r0 = new 3OO(this);
        r0.A00(this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        long j = this.A01;
        if (j == -1) {
            j = this.A00;
        }
        r0.A00(Long.valueOf(j), DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A00 = AbstractC01153q8.A00(parcel);
        AbstractC01153q8.A08(parcel, this.A02, 1);
        int i2 = this.A00;
        AbstractC01153q8.A04(parcel, 2, i2);
        long j = this.A01;
        if (j == -1) {
            j = i2;
        }
        AbstractC01153q8.A05(parcel, 3, j);
        AbstractC01153q8.A03(parcel, A00);
    }
}
