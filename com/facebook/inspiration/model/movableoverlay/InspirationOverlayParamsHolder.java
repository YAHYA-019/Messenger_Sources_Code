package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationOverlayParamsHolder.class */
public final class InspirationOverlayParamsHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(32);
    public final InspirationStickerParams A00;
    public final InspirationTextParams A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InspirationOverlayParamsHolder(X.RIS r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            com.facebook.inspiration.model.movableoverlay.InspirationStickerParams r0 = r0.A00
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r302
            com.facebook.inspiration.model.movableoverlay.InspirationTextParams r0 = r0.A01
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = 0
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L29
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            if (r0 == 0) goto L2c
        L29:
            r0 = 1
            r306 = r0
        L2c:
            r0 = r306
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r303
            if (r0 == 0) goto L40
            r0 = r301
            com.facebook.inspiration.model.movableoverlay.InspirationTextParams r0 = r0.A01
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L43
        L40:
            r0 = 1
            r305 = r0
        L43:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder.<init>(X.RIS):void");
    }

    public InspirationOverlayParamsHolder(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationTextParams inspirationTextParams = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationStickerParams) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (InspirationTextParams) parcel.readParcelable(A0e) : inspirationTextParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InspirationOverlayParamsHolder(com.facebook.inspiration.model.movableoverlay.InspirationStickerParams r302, com.facebook.inspiration.model.movableoverlay.InspirationTextParams r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L21
        L1e:
            r0 = 1
            r305 = r0
        L21:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r301
            com.facebook.inspiration.model.movableoverlay.InspirationTextParams r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L37
        L35:
            r0 = 1
            r304 = r0
        L37:
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder.<init>(com.facebook.inspiration.model.movableoverlay.InspirationStickerParams, com.facebook.inspiration.model.movableoverlay.InspirationTextParams):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayParamsHolder)) {
                return false;
            }
            InspirationOverlayParamsHolder inspirationOverlayParamsHolder = (InspirationOverlayParamsHolder) obj;
            if (!11T.A0O(this.A00, inspirationOverlayParamsHolder.A00) || !11T.A0O(this.A01, inspirationOverlayParamsHolder.A01)) {
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
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
    }
}
