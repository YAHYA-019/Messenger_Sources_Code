package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.7zM;
import X.7zS;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0A2;
import X.DKC;
import X.DKD;
import X.DKI;
import X.F25;
import X.FIK;
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
import com.facebook.inspiration.model.movableoverlay.caption.InspirationCaptionStickerInfo;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.google.common.collect.ImmutableList;

/* loaded from: StickerParams.class */
public final class StickerParams implements Parcelable, GOV {
    public static final Parcelable.Creator CREATOR = FKW.A00(22);
    public final String frameCreditText;
    public final String id;
    public final boolean isFlipped;
    public final boolean isFrameItem;
    public final boolean isSelectable;
    public final RelativeImageOverlayParams overlayParams;
    public final String stickerType;
    public final String uniqueId;

    public StickerParams() {
        this(null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, false, true);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.RUk] */
    public StickerParams(Uri uri, InspirationCaptionStickerInfo inspirationCaptionStickerInfo, InspirationMusicStickerInfo inspirationMusicStickerInfo, InspirationTimedElementParams inspirationTimedElementParams, String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.id = str2;
        this.uniqueId = str4;
        this.frameCreditText = str;
        this.isFlipped = z2;
        this.isSelectable = z4;
        this.isFrameItem = z3;
        ?? obj = new Object();
        ((RUk) obj).A0A = 4YV.A0u(uri);
        ((RUk) obj).A09 = str4;
        obj.A01(f2);
        obj.A02(f4);
        obj.A03(f5);
        obj.A00(f);
        ((RUk) obj).A02 = f3;
        ((RUk) obj).A0B = z;
        ((RUk) obj).A06 = inspirationMusicStickerInfo;
        ((RUk) obj).A05 = inspirationCaptionStickerInfo;
        ((RUk) obj).A07 = inspirationTimedElementParams;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
        this.stickerType = str3;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.RUk] */
    public StickerParams(Parcel parcel) {
        this.id = parcel.readString();
        this.uniqueId = parcel.readString();
        this.frameCreditText = parcel.readString();
        float readFloat = parcel.readFloat();
        String readString = parcel.readString();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        float readFloat4 = parcel.readFloat();
        float readFloat5 = parcel.readFloat();
        boolean A1Z = 7zS.A1Z(parcel);
        this.isFlipped = 7zS.A1Z(parcel);
        this.isSelectable = 7zS.A1Z(parcel);
        this.isFrameItem = 7zS.A1Z(parcel);
        InspirationTimedElementParams inspirationTimedElementParams = null;
        InspirationMusicStickerInfo inspirationMusicStickerInfo = AnonymousClass001.A1N(parcel.readInt()) ? (InspirationMusicStickerInfo) 1BL.A0C(parcel, InspirationMusicStickerInfo.class) : null;
        InspirationCaptionStickerInfo inspirationCaptionStickerInfo = parcel.readInt() != 0 ? (InspirationCaptionStickerInfo) 1BL.A0C(parcel, InspirationCaptionStickerInfo.class) : null;
        inspirationTimedElementParams = parcel.readInt() != 0 ? (InspirationTimedElementParams) 1BL.A0C(parcel, InspirationTimedElementParams.class) : inspirationTimedElementParams;
        ?? obj = new Object();
        ((RUk) obj).A0A = readString;
        ((RUk) obj).A09 = this.uniqueId;
        obj.A01(readFloat2);
        obj.A02(readFloat3);
        obj.A03(readFloat4);
        obj.A00(readFloat5);
        ((RUk) obj).A02 = readFloat;
        ((RUk) obj).A0B = A1Z;
        ((RUk) obj).A06 = inspirationMusicStickerInfo;
        ((RUk) obj).A05 = inspirationCaptionStickerInfo;
        ((RUk) obj).A07 = inspirationTimedElementParams;
        this.overlayParams = new RelativeImageOverlayParams((RUk) obj);
        this.stickerType = parcel.readString();
    }

    public static final boolean A00(float f, float f2) {
        return DKD.A1U((DKC.A01(f, f2) > 0.001d ? 1 : (DKC.A01(f, f2) == 0.001d ? 0 : -1)));
    }

    public final boolean A01() {
        InspirationMusicStickerInfo inspirationMusicStickerInfo = this.overlayParams.A06;
        if (inspirationMusicStickerInfo == null) {
            return false;
        }
        ImmutableList immutableList = FIK.A0B;
        int i = inspirationMusicStickerInfo.A06;
        return F25.A01(i) || i == 201;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0116, code lost:
    
        if (r0.A05 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0135, code lost:
    
        if (r0.A05 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x014c, code lost:
    
        if (r311 != r309) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02(com.facebook.photos.creativeediting.model.StickerParams r302) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.creativeediting.model.StickerParams.A02(com.facebook.photos.creativeediting.model.StickerParams):boolean");
    }

    @Override // X.GOV
    public boolean ADU() {
        return true;
    }

    @Override // X.GK7
    public GK7 AGB(PointF pointF, RectF rectF, float f, int i) {
        Uri BIM = BIM();
        String str = this.id;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width();
        float height = rectF.height();
        boolean z = this.isFlipped;
        boolean z2 = this.isFrameItem;
        return new StickerParams(BIM, null, null, null, "", str, null, 1BK.A0t(), height, f2, f, f3, width, this.overlayParams.A0B, z, z2, true);
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
        return QpA.A03;
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
    public /* bridge */ /* synthetic */ boolean BSn() {
        return this.isFlipped;
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
            if (!(obj instanceof StickerParams)) {
                return false;
            }
            StickerParams stickerParams = (StickerParams) obj;
            if (A02(stickerParams) && 11T.A0O(this.uniqueId, stickerParams.uniqueId)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        RelativeImageOverlayParams relativeImageOverlayParams = this.overlayParams;
        int A03 = 1BK.A03(Boolean.valueOf(relativeImageOverlayParams.A0B), 1BL.A00(1BL.A00(1BL.A00(1BL.A00((527 + Float.floatToIntBits(relativeImageOverlayParams.A01)) * 31, relativeImageOverlayParams.A03), relativeImageOverlayParams.A04), relativeImageOverlayParams.A00), relativeImageOverlayParams.A02));
        String str = relativeImageOverlayParams.A0A;
        if (str != null) {
            A03 = 7zM.A05(str, A03 * 31);
        }
        String str2 = this.id;
        if (str2 != null) {
            A03 = 7zM.A05(str2, A03 * 31);
        }
        String str3 = this.uniqueId;
        if (str3 != null) {
            A03 = 7zM.A05(str3, A03 * 31);
        }
        int A00 = (A03 * 31) + AnonymousClass002.A00(this.isFlipped ? 1 : 0);
        InspirationMusicStickerInfo inspirationMusicStickerInfo = relativeImageOverlayParams.A06;
        if (inspirationMusicStickerInfo != null) {
            A00 = 1BK.A03(inspirationMusicStickerInfo, A00 * 31);
        }
        InspirationCaptionStickerInfo inspirationCaptionStickerInfo = this.overlayParams.A05;
        if (inspirationCaptionStickerInfo != null) {
            A00 = 1BK.A03(inspirationCaptionStickerInfo, A00 * 31);
        }
        return A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.id);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.frameCreditText);
        parcel.writeFloat(this.overlayParams.A02);
        parcel.writeString(this.overlayParams.A0A);
        parcel.writeFloat(this.overlayParams.A01);
        parcel.writeFloat(this.overlayParams.A03);
        parcel.writeFloat(this.overlayParams.A04);
        parcel.writeFloat(this.overlayParams.A00);
        parcel.writeInt(this.overlayParams.A0B ? 1 : 0);
        parcel.writeInt(this.isFlipped ? 1 : 0);
        parcel.writeInt(this.isSelectable ? 1 : 0);
        parcel.writeInt(this.isFrameItem ? 1 : 0);
        if (this.overlayParams.A06 != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.overlayParams.A06, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.overlayParams.A05 != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.overlayParams.A05, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.overlayParams.A07 != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.overlayParams.A07, i);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.stickerType);
    }
}
