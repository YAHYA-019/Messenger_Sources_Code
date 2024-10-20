package com.facebook.photos.creativeediting.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OverlayParamsHolder.class */
public final class OverlayParamsHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(19);
    public final StickerParams A00;
    public final TextParams A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OverlayParamsHolder(X.RJv r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            com.facebook.photos.creativeediting.model.StickerParams r0 = r0.A00
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r302
            com.facebook.photos.creativeediting.model.TextParams r0 = r0.A01
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r303
            if (r0 != 0) goto L23
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L26
        L23:
            r0 = 1
            r305 = r0
        L26:
            java.lang.String r0 = "Check failed."
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L3e
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r304
            if (r0 == 0) goto L3d
            r0 = r306
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        L3d:
            return
        L3e:
            r0 = r306
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.creativeediting.model.OverlayParamsHolder.<init>(X.RJv):void");
    }

    public OverlayParamsHolder(Parcel parcel) {
        TextParams textParams = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = (StickerParams) StickerParams.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? (TextParams) TextParams.CREATOR.createFromParcel(parcel) : textParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OverlayParamsHolder)) {
                return false;
            }
            OverlayParamsHolder overlayParamsHolder = (OverlayParamsHolder) obj;
            if (!11T.A0O(this.A00, overlayParamsHolder.A00) || !11T.A0O(this.A01, overlayParamsHolder.A01)) {
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
        StickerParams stickerParams = this.A00;
        if (stickerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickerParams.writeToParcel(parcel, i);
        }
        TextParams textParams = this.A01;
        if (textParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textParams.writeToParcel(parcel, i);
        }
    }
}
