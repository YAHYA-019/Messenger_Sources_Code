package com.facebook.messaging.photos.editing;

import X.1GS;
import X.AbE;
import X.H9d;
import X.HtI;
import X.I2u;
import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.photos.editing.layer.Layer;

/* loaded from: SmartStickerLayer.class */
public class SmartStickerLayer extends Layer {
    public 1GS A00;
    public Integer A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SmartStickerLayer(X.1GS r302, com.facebook.messaging.montage.model.art.ArtItem r303) {
        /*
            r301 = this;
            X.HA0 r0 = X.HA0.A01
            r304 = r0
            X.H9b r0 = X.H9b.CENTER
            r305 = r0
            X.H9c r0 = X.H9c.CENTER
            r306 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r307 = r0
            X.Hiu r0 = new X.Hiu
            r308 = r0
            r0 = r308
            r1 = r304
            r2 = r305
            r3 = r306
            r4 = r307
            r5 = r307
            r6 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            X.Hiu r0 = new X.Hiu
            r309 = r0
            r0 = r309
            r1 = r304
            r2 = r305
            r3 = r306
            r4 = r307
            r5 = r307
            r6 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r301
            r1 = r303
            r2 = r308
            r3 = r309
            r4 = 0
            r5 = 0
            r6 = r307
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r301
            r1 = 1
            r0.A05(r1)
            java.lang.Integer r0 = X.0S2.A00
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A01 = r1
            r0 = r302
            r308 = r0
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.editing.SmartStickerLayer.<init>(X.1GS, com.facebook.messaging.montage.model.art.ArtItem):void");
    }

    @Override // com.facebook.messaging.photos.editing.layer.Layer
    public boolean A07() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r0.equals(X.HB0.A01) != false) goto L8;
     */
    @Override // com.facebook.messaging.photos.editing.layer.Layer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.montage.model.art.ArtItem r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L23
            r0 = r302
            X.HB0 r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            X.HB0 r0 = X.HB0.A01
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L28
        L23:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L28:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.editing.SmartStickerLayer.A09():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0A(Integer num) {
        String str;
        I2u i2u;
        this.A01 = num;
        H9d h9d = H9d.BACKGROUND_CHANGE;
        HtI htI = this.A0I;
        htI.A02(htI);
        CompositionInfo compositionInfo = this.A07;
        if (compositionInfo == null) {
            new I2u();
        } else {
            new I2u(compositionInfo);
        }
        this.A01.intValue();
        if (1 - 1 != 0) {
            String A00 = AbE.A00(51);
            str = A00;
            i2u = A00;
        } else {
            str = "monochrome";
            i2u = "monochrome";
        }
        i2u.A0J = str;
        this.A07 = new CompositionInfo(i2u);
    }
}
