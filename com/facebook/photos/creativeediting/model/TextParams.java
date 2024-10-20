package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.7zM;
import X.7zS;
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
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;

/* loaded from: TextParams.class */
public final class TextParams implements Parcelable, GOV {
    public static final Parcelable.Creator CREATOR = FKW.A00(25);
    public final String id;
    public final boolean isFrameItem;
    public final boolean isSelectable;
    public final RelativeImageOverlayParams overlayParams;
    public final int textColor;
    public final String textString;
    public final String uniqueId;

    public TextParams() {
        this(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, false);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.RUk] */
    public TextParams(Uri uri, InspirationTimedElementParams inspirationTimedElementParams, String str, String str2, String str3, float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        this.id = str;
        this.uniqueId = str3;
        this.textString = str2;
        this.textColor = i;
        this.isSelectable = true;
        this.isFrameItem = z;
        ?? obj = new Object();
        ((RUk) obj).A0A = 4YV.A0u(uri);
        ((RUk) obj).A09 = str3;
        obj.A01(f2);
        obj.A02(f4);
        obj.A03(f5);
        obj.A00(f);
        ((RUk) obj).A02 = f3;
        ((RUk) obj).A07 = inspirationTimedElementParams;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.RUk] */
    public TextParams(Parcel parcel) {
        this.id = parcel.readString();
        this.uniqueId = parcel.readString();
        String readString = parcel.readString();
        this.textString = parcel.readString();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        float readFloat4 = parcel.readFloat();
        float readFloat5 = parcel.readFloat();
        this.textColor = parcel.readInt();
        this.isSelectable = 7zS.A1Z(parcel);
        this.isFrameItem = 7zS.A1Z(parcel);
        InspirationTimedElementParams inspirationTimedElementParams = parcel.readInt() != 0 ? (InspirationTimedElementParams) 1BL.A0C(parcel, InspirationTimedElementParams.class) : null;
        ?? obj = new Object();
        ((RUk) obj).A0A = readString;
        ((RUk) obj).A09 = this.uniqueId;
        obj.A01(readFloat);
        obj.A02(readFloat2);
        obj.A03(readFloat3);
        obj.A00(readFloat4);
        ((RUk) obj).A02 = readFloat5;
        ((RUk) obj).A07 = inspirationTimedElementParams;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
    }

    public static final boolean A00(float f, float f2) {
        return DKD.A1U((DKC.A01(f, f2) > 0.001d ? 1 : (DKC.A01(f, f2) == 0.001d ? 0 : -1)));
    }

    @Override // X.GOV
    public boolean ADU() {
        return false;
    }

    @Override // X.GK7
    public GK7 AGB(PointF pointF, RectF rectF, float f, int i) {
        String str = this.textString;
        if (str == null) {
            throw 1BK.A0h();
        }
        Uri BIM = BIM();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        int i2 = this.textColor;
        String str2 = this.id;
        String str3 = this.uniqueId;
        boolean z = this.isFrameItem;
        if (str2 == null || str2.length() == 0) {
            str2 = 1BK.A0t();
        }
        if (str3 == null || str3.length() == 0) {
            str3 = 1BK.A0t();
        }
        return new TextParams(BIM, null, str2, str, str3, height, f2, f, f3, width, i2, z);
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
        return QpA.A04;
    }

    @Override // X.GK7
    public float B8G() {
        return this.overlayParams.A02;
    }

    @Override // X.GOV
    public String BHy() {
        return this.uniqueId;
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
    public /* bridge */ /* synthetic */ boolean BSw() {
        return this.isFrameItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof TextParams)) {
                return false;
            }
            RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
            float f = relativeImageOverlayParams.A01;
            TextParams textParams = (TextParams) obj;
            RelativeImageOverlayParams relativeImageOverlayParams2 = textParams.overlayParams;
            if (A00(f, relativeImageOverlayParams2.A01) && A00(relativeImageOverlayParams.A03, relativeImageOverlayParams2.A03) && A00(relativeImageOverlayParams.A04, relativeImageOverlayParams2.A04) && A00(relativeImageOverlayParams.A00, relativeImageOverlayParams2.A00) && A00(relativeImageOverlayParams.A02, relativeImageOverlayParams2.A02) && 11T.A0O(this.id, textParams.id) && 11T.A0O(this.uniqueId, textParams.uniqueId) && this.textColor == textParams.textColor && 11T.A0O(this.textString, textParams.textString) && 11T.A0O(BIM(), textParams.BIM())) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
        int A00 = 1BL.A00(1BL.A00(1BL.A00((527 + Float.floatToIntBits(relativeImageOverlayParams.A01)) * 31, relativeImageOverlayParams.A03), relativeImageOverlayParams.A04), relativeImageOverlayParams.A00) + Float.floatToIntBits(relativeImageOverlayParams.A02);
        String str = this.textString;
        if (str != null) {
            A00 = 7zM.A05(str, A00 * 31);
        }
        String str2 = relativeImageOverlayParams.A0A;
        if (str2 != null) {
            A00 = 7zM.A05(str2, A00 * 31);
        }
        return A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.id);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.overlayParams.A0A);
        parcel.writeString(this.textString);
        parcel.writeFloat(this.overlayParams.A01);
        parcel.writeFloat(this.overlayParams.A03);
        parcel.writeFloat(this.overlayParams.A04);
        parcel.writeFloat(this.overlayParams.A00);
        parcel.writeFloat(this.overlayParams.A02);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.isSelectable ? 1 : 0);
        parcel.writeInt(this.isFrameItem ? 1 : 0);
        if (this.overlayParams.A07 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.overlayParams.A07, i);
        }
    }
}
