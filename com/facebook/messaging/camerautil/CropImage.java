package com.facebook.messaging.camerautil;

import X.0FI;
import X.1iF;
import X.AbF;
import X.AnonymousClass001;
import X.I4z;
import X.J2g;
import X.J4U;
import X.JL3;
import X.JLc;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.facebook.base.activity.FbFragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: CropImage.class */
public class CropImage extends FbFragmentActivity {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ContentResolver A04;
    public Bitmap.CompressFormat A05;
    public Bitmap A06;
    public Uri A07;
    public CropImageView A08;
    public I4z A09;
    public JLc A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public JL3 A0F;
    public final Handler A0G;
    public final ArrayList A0H;

    public CropImage() {
        this(0);
        this.A05 = Bitmap.CompressFormat.JPEG;
        this.A07 = null;
        this.A0G = new Handler();
        this.A0B = new J2g(this);
    }

    public CropImage(int i) {
        this.A0H = AnonymousClass001.A0s();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(547268189292507L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        JL3 jl3 = this.A0F;
        if (jl3 != null) {
            jl3.close();
        }
        super.A2l();
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            J4U j4u = (J4U) it.next();
            Runnable runnable = j4u.A03;
            runnable.run();
            j4u.A00.removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        if (r0 < 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0319, code lost:
    
        if ("mounted_ro".equals(r0) != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026d  */
    /* JADX WARN: Type inference failed for: r303v27, types: [java.lang.Object, com.facebook.messaging.camerautil.ImageManager$ImageListParam] */
    /* JADX WARN: Type inference failed for: r303v8, types: [java.lang.Object, com.facebook.messaging.camerautil.ImageManager$ImageListParam] */
    /* JADX WARN: Type inference failed for: r304v15, types: [X.Rps, X.JL3, java.lang.Object] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.camerautil.CropImage.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-4327033);
        super.onPause();
        0FI.A07(-940164817, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-1465999626);
        super.onStart();
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            ((J4U) it.next()).A01.show();
        }
        0FI.A07(1329181583, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1900099081);
        super.onStop();
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            ((J4U) it.next()).A01.hide();
        }
        0FI.A07(-1780557961, A00);
    }
}
