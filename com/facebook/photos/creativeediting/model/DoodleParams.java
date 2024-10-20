package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zM;
import X.C0A2;
import X.DKC;
import X.DKD;
import X.DKI;
import X.FKW;
import X.GK7;
import X.GOV;
import X.QpA;
import X.RUk;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DoodleParams.class */
public final class DoodleParams implements Parcelable, GOV {
    public static final Parcelable.Creator CREATOR = FKW.A00(16);
    public final String id;
    public final RelativeImageOverlayParams overlayParams;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.RUk] */
    public DoodleParams() {
        this.id = null;
        ?? obj = new Object();
        ((RUk) obj).A0A = null;
        ((RUk) obj).A08 = null;
        ((RUk) obj).A09 = null;
        obj.A01(0.0f);
        obj.A02(0.0f);
        obj.A03(0.0f);
        obj.A00(0.0f);
        ((RUk) obj).A02 = 0.0f;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.RUk] */
    public DoodleParams(Uri uri, Uri uri2, String str, float f, float f2, float f3, float f4, float f5) {
        this.id = str;
        ?? obj = new Object();
        ((RUk) obj).A09 = str;
        String str2 = null;
        ((RUk) obj).A0A = uri2 != null ? uri2.toString() : null;
        ((RUk) obj).A08 = uri != null ? uri.toString() : str2;
        obj.A01(f2);
        obj.A02(f4);
        obj.A03(f5);
        obj.A00(f);
        ((RUk) obj).A02 = f3;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.RUk] */
    public DoodleParams(Parcel parcel) {
        this.id = parcel.readString();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        float readFloat4 = parcel.readFloat();
        float readFloat5 = parcel.readFloat();
        ?? obj = new Object();
        ((RUk) obj).A0A = readString;
        ((RUk) obj).A08 = readString2;
        ((RUk) obj).A09 = this.id;
        obj.A01(readFloat);
        obj.A02(readFloat2);
        obj.A03(readFloat3);
        obj.A00(readFloat4);
        ((RUk) obj).A02 = readFloat5;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
    }

    public static final boolean A00(float f, float f2) {
        return DKD.A1U((DKC.A01(f, f2) > 0.001d ? 1 : (DKC.A01(f, f2) == 0.001d ? 0 : -1)));
    }

    public final Uri A01() {
        String str = this.overlayParams.A08;
        if (str != null) {
            return C0A2.A03(str);
        }
        return null;
    }

    @Override // X.GOV
    public boolean ADU() {
        return false;
    }

    @Override // X.GK7
    public GK7 AGB(PointF pointF, RectF rectF, float f, int i) {
        Uri BIM = BIM();
        Uri A01 = A01();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        String str = this.id;
        if (str == null || str.length() == 0) {
            str = 1BK.A0t();
        }
        return new DoodleParams(A01, BIM, str, height, f2, f, f3, width);
    }

    @Override // X.GOV
    public float Aoy() {
        return this.overlayParams.A00;
    }

    @Override // X.GK7
    public RectF AsO() {
        RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
        float f = relativeImageOverlayParams.A01;
        float f2 = relativeImageOverlayParams.A03;
        return new RectF(f, f2, f + relativeImageOverlayParams.A04, f2 + relativeImageOverlayParams.A00);
    }

    @Override // X.GK7
    public PointF AsV() {
        return DKI.A06(this.overlayParams);
    }

    @Override // X.GK7
    public QpA B0t() {
        return QpA.A02;
    }

    @Override // X.GK7
    public float B8G() {
        return this.overlayParams.A02;
    }

    @Override // X.GOV
    public String BHy() {
        return null;
    }

    @Override // X.GOV
    public Uri BIM() {
        String str = this.overlayParams.A0A;
        if (str != null) {
            return C0A2.A03(str);
        }
        return null;
    }

    @Override // X.GOV
    public float BKm() {
        return this.overlayParams.A04;
    }

    @Override // X.GOV
    public boolean BSn() {
        return false;
    }

    @Override // X.GOV
    public boolean BSw() {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof DoodleParams)) {
                return false;
            }
            RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
            float f = relativeImageOverlayParams.A01;
            DoodleParams doodleParams = (DoodleParams) obj;
            RelativeImageOverlayParams relativeImageOverlayParams2 = doodleParams.overlayParams;
            if (A00(f, relativeImageOverlayParams2.A01) && A00(relativeImageOverlayParams.A03, relativeImageOverlayParams2.A03) && A00(relativeImageOverlayParams.A04, relativeImageOverlayParams2.A04) && A00(relativeImageOverlayParams.A00, relativeImageOverlayParams2.A00) && A00(relativeImageOverlayParams.A02, relativeImageOverlayParams2.A02) && 11T.A0O(this.id, doodleParams.id) && 11T.A0O(BIM(), doodleParams.BIM()) && 11T.A0O(A01(), doodleParams.A01())) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.id;
        int A05 = str != null ? 7zM.A05(str, 527) : 17;
        RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
        String str2 = relativeImageOverlayParams.A0A;
        if (str2 != null) {
            A05 = 7zM.A05(str2, A05 * 31);
        }
        return 1BL.A00(1BL.A00(1BL.A00(1BL.A00(A05 * 31, relativeImageOverlayParams.A01), relativeImageOverlayParams.A03), relativeImageOverlayParams.A04), relativeImageOverlayParams.A00) + Float.floatToIntBits(relativeImageOverlayParams.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.id);
        parcel.writeString(this.overlayParams.A0A);
        parcel.writeString(this.overlayParams.A08);
        parcel.writeFloat(this.overlayParams.A01);
        parcel.writeFloat(this.overlayParams.A03);
        parcel.writeFloat(this.overlayParams.A04);
        parcel.writeFloat(this.overlayParams.A00);
        parcel.writeFloat(this.overlayParams.A02);
    }
}
