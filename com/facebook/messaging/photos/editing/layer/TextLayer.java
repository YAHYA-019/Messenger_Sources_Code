package com.facebook.messaging.photos.editing.layer;

import X.0S2;
import X.11T;
import X.CSS;
import X.H9J;
import X.HA1;
import X.HAc;
import X.Hiu;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.messaging.font.FontAsset;
import com.facebook.messaging.montage.model.art.ArtItem;

/* loaded from: TextLayer.class */
public final class TextLayer extends Layer {
    public static final Parcelable.Creator CREATOR = new CSS(8);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public FontAsset A07;
    public CharSequence A08;
    public Integer A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public final H9J A0D;
    public final HA1 A0E;
    public final boolean A0F;
    public final boolean A0G;

    public TextLayer() {
        this.A04 = -1;
        this.A06 = 1;
        this.A0D = H9J.A01;
        this.A07 = null;
        this.A0F = false;
        this.A0G = true;
        this.A0B = false;
        this.A0E = HA1.REGULAR;
        this.A09 = 0S2.A00;
    }

    public TextLayer(Parcel parcel) {
        super(parcel);
        float f = 0.0f / 0.0f;
        this.A04 = -1;
        this.A06 = 1;
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        if (creator != null) {
            this.A08 = (CharSequence) creator.createFromParcel(parcel);
        }
        this.A05 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A0D = H9J.A01;
        this.A07 = null;
        this.A0F = false;
        this.A0G = true;
        this.A0B = false;
        this.A0E = HA1.REGULAR;
        this.A09 = 0S2.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayer(FontAsset fontAsset, ArtItem artItem, H9J h9j, HA1 ha1, Hiu hiu, Hiu hiu2, CharSequence charSequence, Integer num, String str, float f, float f2, int i, boolean z, boolean z2) {
        super(artItem, hiu, hiu2, str, f, f2);
        11T.A0F(h9j, 10);
        11T.A0F(ha1, 15);
        this.A06 = 1;
        this.A08 = charSequence;
        this.A04 = i;
        this.A03 = 0;
        this.A0D = h9j;
        this.A07 = fontAsset;
        this.A0F = z;
        this.A0G = z2;
        this.A0E = ha1;
        this.A09 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (X.GOq.A0z(r307, r308, r0).length() == 0) goto L23;
     */
    @Override // com.facebook.messaging.photos.editing.layer.Layer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            r301 = this;
            r0 = r301
            X.HA1 r0 = r0.A0E
            r302 = r0
            X.HA1 r0 = X.HA1.USER_PROMPT
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L8f
            r0 = r301
            java.lang.CharSequence r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8d
            r0 = r303
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r306 = r0
            r0 = r306
            int r0 = r0.length()
            r1 = r305
            int r0 = r0 - r1
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
        L34:
            r0 = r308
            r1 = r307
            if (r0 > r1) goto L78
            r0 = r307
            r309 = r0
            r0 = r305
            if (r0 != 0) goto L48
            r0 = r308
            r309 = r0
        L48:
            r0 = r306
            r1 = r309
            boolean r0 = X.7zT.A1Z(r0, r1)
            r309 = r0
            r0 = r305
            if (r0 != 0) goto L6a
            r0 = r309
            if (r0 != 0) goto L61
            r0 = 1
            r305 = r0
            goto L34
        L61:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L34
        L6a:
            r0 = r309
            if (r0 == 0) goto L78
            r0 = r307
            r1 = -1
            int r0 = r0 + r1
            r307 = r0
            goto L34
        L78:
            r0 = r307
            r1 = r308
            r2 = r306
            java.lang.String r0 = X.GOq.A0z(r0, r1, r2)
            r303 = r0
            r0 = r303
            int r0 = r0.length()
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L8f
        L8d:
            r0 = 1
            r304 = r0
        L8f:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.editing.layer.TextLayer.A06():boolean");
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public boolean A07() {
        return false;
    }

    public final void A0A(float f, float f2, float f3) {
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A0I.A02(HAc.A08);
    }

    public final void A0B(CharSequence charSequence) {
        this.A08 = charSequence;
        this.A0I.A02(HAc.A05);
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.A08, parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
    }
}
