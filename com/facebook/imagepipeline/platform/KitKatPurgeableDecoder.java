package com.facebook.imagepipeline.platform;

import X.1BK;
import X.2EU;
import X.2Gx;
import X.4dR;
import X.C0By;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* loaded from: KitKatPurgeableDecoder.class */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public final 2Gx A00;

    public KitKatPurgeableDecoder(2Gx r302) {
        this.A00 = r302;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(2EU r302, BitmapFactory.Options options) {
        4dR r0 = (4dR) r302.A09();
        int size = r0.size();
        2Gx r02 = this.A00;
        Object obj = r02.A01.get(size);
        2EU A00 = 2EU.A00(2EU.A05, r02.A00, obj);
        try {
            byte[] bArr = (byte[]) A00.A09();
            r0.read(0, bArr, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, options);
            C0By.A03(decodeByteArray, "BitmapFactory returned null");
            A00.close();
            return decodeByteArray;
        } catch (Throwable th) {
            2EU.A04(A00);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(2EU r302, int i, BitmapFactory.Options options) {
        4dR r0 = (4dR) r302.A09();
        boolean z = true;
        if (i < 2 || r0.read(i - 2) != -1 || r0.read(i - 1) != -39) {
            z = false;
        }
        byte[] bArr = z ? null : DalvikPurgeableDecoder.EOI;
        4dR r02 = (4dR) r302.A09();
        boolean z2 = false;
        if (i <= r02.size()) {
            z2 = true;
        }
        1BK.A1S(z2);
        2Gx r03 = this.A00;
        int i2 = i + 2;
        2EU A00 = 2EU.A00(2EU.A05, r03.A00, r03.A01.get(i2));
        try {
            byte[] bArr2 = (byte[]) A00.A09();
            r02.read(0, bArr2, 0, i);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            C0By.A03(decodeByteArray, "BitmapFactory returned null");
            A00.close();
            return decodeByteArray;
        } catch (Throwable th) {
            2EU.A04(A00);
            throw th;
        }
    }
}
