package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zM;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: GradientParams.class */
public final class GradientParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(72);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;

    public GradientParams(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        for (int i = 0; i < A01; i++) {
            strArr[i] = parcel.readString();
        }
        this.A05 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        int readInt = parcel.readInt();
        Float[] fArr = new Float[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            fArr[i2] = Float.valueOf(parcel.readFloat());
        }
        this.A06 = ImmutableList.copyOf(fArr);
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A07 = parcel.readString();
    }

    public GradientParams(ImmutableList immutableList, ImmutableList immutableList2, String str, float f, float f2, float f3, float f4, float f5) {
        C1pq.A08("colors", immutableList);
        this.A05 = immutableList;
        this.A00 = f;
        this.A01 = f2;
        C1pq.A08("positions", immutableList2);
        this.A06 = immutableList2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        this.A07 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GradientParams)) {
                return false;
            }
            GradientParams gradientParams = (GradientParams) obj;
            if (!11T.A0O(this.A05, gradientParams.A05) || this.A00 != gradientParams.A00 || this.A01 != gradientParams.A01 || !11T.A0O(this.A06, gradientParams.A06) || this.A02 != gradientParams.A02 || this.A03 != gradientParams.A03 || this.A04 != gradientParams.A04 || !11T.A0O(this.A07, gradientParams.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A07, (((((C1pq.A04(this.A06, (((C1pq.A03(this.A05) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A05);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        1Du A0b2 = 1BL.A0b(parcel, this.A06);
        while (A0b2.hasNext()) {
            parcel.writeFloat(7zM.A00(A0b2.next()));
        }
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeString(this.A07);
    }
}
