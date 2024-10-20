package com.facebook.ipc.composer.model.richtext;

import X.11T;
import X.1Du;
import X.AbG;
import X.AbL;
import X.C1pq;
import X.CSR;
import X.DKG;
import X.DKH;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: OverlayAnimationStyle.class */
public final class OverlayAnimationStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(24);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;
    public final double A07;
    public final double A08;
    public final double A09;
    public final double A0A;
    public final double A0B;
    public final double A0C;
    public final double A0D;
    public final double A0E;
    public final double A0F;
    public final double A0G;
    public final double A0H;
    public final double A0I;
    public final double A0J;
    public final double A0K;
    public final ImmutableList A0L;
    public final ImmutableList A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;

    public OverlayAnimationStyle(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            int readInt = parcel.readInt();
            Double[] dArr = new Double[readInt];
            for (int i = 0; i < readInt; i++) {
                dArr[i] = DKG.A0x(parcel);
            }
            this.A0L = ImmutableList.copyOf(dArr);
        }
        this.A0N = parcel.readString();
        this.A0O = parcel.readString();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
        this.A05 = parcel.readDouble();
        this.A06 = parcel.readDouble();
        this.A07 = parcel.readDouble();
        this.A08 = parcel.readDouble();
        this.A09 = parcel.readDouble();
        this.A0A = parcel.readDouble();
        this.A0P = parcel.readString();
        this.A0B = parcel.readDouble();
        this.A0C = parcel.readDouble();
        this.A0D = parcel.readDouble();
        this.A0E = parcel.readDouble();
        this.A0F = parcel.readDouble();
        this.A0G = parcel.readDouble();
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            Double[] dArr2 = new Double[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                dArr2[i2] = DKG.A0x(parcel);
            }
            immutableList = ImmutableList.copyOf(dArr2);
        }
        this.A0M = immutableList;
        this.A0H = parcel.readDouble();
        this.A0I = parcel.readDouble();
        this.A0J = parcel.readDouble();
        this.A0K = parcel.readDouble();
    }

    public OverlayAnimationStyle(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        this.A0L = immutableList;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A0N = str;
        C1pq.A08("imageUri", str2);
        this.A0O = str2;
        this.A03 = d4;
        this.A04 = d5;
        this.A05 = d6;
        this.A06 = d7;
        this.A07 = d8;
        this.A08 = d9;
        this.A09 = d10;
        this.A0A = d11;
        C1pq.A08("repeatType", str3);
        this.A0P = str3;
        this.A0B = d12;
        this.A0C = d13;
        this.A0D = d14;
        this.A0E = d15;
        this.A0F = d16;
        this.A0G = d17;
        this.A0M = immutableList2;
        this.A0H = d18;
        this.A0I = d19;
        this.A0J = d20;
        this.A0K = d21;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OverlayAnimationStyle)) {
                return false;
            }
            OverlayAnimationStyle overlayAnimationStyle = (OverlayAnimationStyle) obj;
            if (this.A00 != overlayAnimationStyle.A00 || this.A01 != overlayAnimationStyle.A01 || this.A02 != overlayAnimationStyle.A02 || !11T.A0O(this.A0L, overlayAnimationStyle.A0L) || !11T.A0O(this.A0N, overlayAnimationStyle.A0N) || !11T.A0O(this.A0O, overlayAnimationStyle.A0O) || this.A03 != overlayAnimationStyle.A03 || this.A04 != overlayAnimationStyle.A04 || this.A05 != overlayAnimationStyle.A05 || this.A06 != overlayAnimationStyle.A06 || this.A07 != overlayAnimationStyle.A07 || this.A08 != overlayAnimationStyle.A08 || this.A09 != overlayAnimationStyle.A09 || this.A0A != overlayAnimationStyle.A0A || !11T.A0O(this.A0P, overlayAnimationStyle.A0P) || this.A0B != overlayAnimationStyle.A0B || this.A0C != overlayAnimationStyle.A0C || this.A0D != overlayAnimationStyle.A0D || this.A0E != overlayAnimationStyle.A0E || this.A0F != overlayAnimationStyle.A0F || this.A0G != overlayAnimationStyle.A0G || !11T.A0O(this.A0M, overlayAnimationStyle.A0M) || this.A0H != overlayAnimationStyle.A0H || this.A0I != overlayAnimationStyle.A0I || this.A0J != overlayAnimationStyle.A0J || this.A0K != overlayAnimationStyle.A0K) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A0K, C1pq.A00(this.A0J, C1pq.A00(this.A0I, C1pq.A00(this.A0H, C1pq.A04(this.A0M, C1pq.A00(this.A0G, C1pq.A00(this.A0F, C1pq.A00(this.A0E, C1pq.A00(this.A0D, C1pq.A00(this.A0C, C1pq.A00(this.A0B, C1pq.A04(this.A0P, C1pq.A00(this.A0A, C1pq.A00(this.A09, C1pq.A00(this.A08, C1pq.A00(this.A07, C1pq.A00(this.A06, C1pq.A00(this.A05, C1pq.A00(this.A04, C1pq.A00(this.A03, C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A0L, C1pq.A00(this.A02, C1pq.A00(this.A01, C1pq.A00(this.A00, 1))))))))))))))))))))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        ImmutableList immutableList = this.A0L;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                DKH.A14(parcel, A0Y);
            }
        }
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0O);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
        parcel.writeDouble(this.A05);
        parcel.writeDouble(this.A06);
        parcel.writeDouble(this.A07);
        parcel.writeDouble(this.A08);
        parcel.writeDouble(this.A09);
        parcel.writeDouble(this.A0A);
        parcel.writeString(this.A0P);
        parcel.writeDouble(this.A0B);
        parcel.writeDouble(this.A0C);
        parcel.writeDouble(this.A0D);
        parcel.writeDouble(this.A0E);
        parcel.writeDouble(this.A0F);
        parcel.writeDouble(this.A0G);
        ImmutableList immutableList2 = this.A0M;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                DKH.A14(parcel, A0Y2);
            }
        }
        parcel.writeDouble(this.A0H);
        parcel.writeDouble(this.A0I);
        parcel.writeDouble(this.A0J);
        parcel.writeDouble(this.A0K);
    }
}
