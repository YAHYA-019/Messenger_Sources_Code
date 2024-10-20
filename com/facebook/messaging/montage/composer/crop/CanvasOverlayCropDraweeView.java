package com.facebook.messaging.montage.composer.crop;

import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Dp;
import X.2IA;
import X.5HV;
import X.7zL;
import X.C00i;
import X.C2515Gfv;
import X.C2591Gia;
import X.C2rD;
import X.C4s1;
import X.C69e;
import X.C69o;
import X.C69s;
import X.DKF;
import X.DKG;
import X.GOo;
import X.HSa;
import X.InterfaceC07034in;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.ipc.media.data.MimeType;
import com.facebook.messaging.montage.composer.CanvasOverlayCropViewFragment;
import com.mapbox.mapboxsdk.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CanvasOverlayCropDraweeView.class */
public final class CanvasOverlayCropDraweeView extends FbDraweeView {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public HSa A04;
    public int A05;
    public Bitmap A06;
    public boolean A07;
    public final 1Br A08;
    public final 1Br A09;
    public final C2515Gfv A0A;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CanvasOverlayCropDraweeView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CanvasOverlayCropDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CanvasOverlayCropDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A08 = 1Bu.A01(context, 49976);
        this.A09 = 1Bq.A00(49642);
        this.A0A = new C2515Gfv(this);
        C69e c69e = new C69e(getResources());
        c69e.A02(InterfaceC07034in.A04);
        A05(c69e.A01());
    }

    public /* synthetic */ CanvasOverlayCropDraweeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.fbpipeline.FbDraweeView
    public void A0G(Uri uri, CallerContext callerContext) {
        11T.A0F(callerContext, 1);
        if (uri != null) {
            C00i c00i = this.A08.A00;
            C69s c69s = (C69s) c00i.get();
            c69s.A09();
            ((C69o) c69s).A02 = callerContext;
            ((C69o) c69s).A00 = this.A0A;
            ((C69o) c69s).A03 = 2Dp.A00(uri);
            A06(((C69s) c00i.get()).A08());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0P(int i, Bitmap bitmap) {
        11T.A0F(bitmap, 0);
        this.A06 = bitmap;
        this.A05 = i;
        if (this.A07) {
            int width = getWidth();
            int height = getHeight();
            if (width == 0 || height == 0) {
                C4s1 c4s1 = new C4s1(getContext().getApplicationContext());
                int A08 = c4s1.A08();
                Resources resources = getResources();
                width = A08 - (resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp) * 2);
                height = ((c4s1.A03() - resources.getDimensionPixelSize(2132279326)) - GOo.A01(resources)) - i;
            }
            float width2 = width / bitmap.getWidth();
            float height2 = height / bitmap.getHeight();
            if (width2 > height2) {
                width2 = height2;
            }
            this.A03 = (int) (bitmap.getWidth() * width2);
            this.A02 = (int) (bitmap.getHeight() * width2);
            Resources resources2 = getResources();
            this.A00 = 7zL.A01(resources2, R.dimen.mapbox_eight_dp) + ((width - this.A03) * 0.5f);
            float A01 = 7zL.A01(resources2, 2132279326);
            int i2 = this.A02;
            float f = A01 + ((height - i2) * 0.5f);
            this.A01 = f;
            HSa hSa = this.A04;
            if (hSa != null) {
                float f2 = this.A00;
                int i3 = this.A03;
                CanvasOverlayCropViewFragment canvasOverlayCropViewFragment = hSa.A00;
                CallerContext callerContext = CanvasOverlayCropViewFragment.A0I;
                Rect rect = canvasOverlayCropViewFragment.A03;
                int i4 = (int) f2;
                int i5 = (int) f;
                rect.set(i4, i5, i3 + i4, i2 + i5);
                CanvasOverlayCropOverlayView canvasOverlayCropOverlayView = canvasOverlayCropViewFragment.A0C;
                int i6 = rect.left;
                canvasOverlayCropOverlayView.A06 = i6;
                int i7 = rect.top;
                canvasOverlayCropOverlayView.A08 = i7;
                int i8 = rect.right;
                canvasOverlayCropOverlayView.A07 = i8;
                int i9 = rect.bottom;
                canvasOverlayCropOverlayView.A03 = i9;
                int i10 = i8 - i6;
                canvasOverlayCropOverlayView.A05 = i10;
                int i11 = i9 - i7;
                canvasOverlayCropOverlayView.A04 = i11;
                canvasOverlayCropOverlayView.A0B = i10 > i11 ? 0S2.A01 : 0S2.A00;
                canvasOverlayCropOverlayView.A0H.set(rect);
                canvasOverlayCropOverlayView.invalidate();
                Rect rect2 = canvasOverlayCropViewFragment.A04;
                if (rect2 != null) {
                    CanvasOverlayCropOverlayView canvasOverlayCropOverlayView2 = canvasOverlayCropViewFragment.A0C;
                    canvasOverlayCropOverlayView2.A0H.set(rect2);
                    canvasOverlayCropOverlayView2.invalidate();
                }
                CanvasOverlayCropViewFragment.A05(canvasOverlayCropViewFragment.A04, canvasOverlayCropViewFragment);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0Q(Uri uri, CallerContext callerContext, int i) {
        11T.A0F(callerContext, 1);
        if (uri != null) {
            2IA A01 = 2IA.A01(uri);
            if (11T.A0O(MimeType.A05.toString(), ((5HV) 1Br.A0B(this.A09)).A09(uri))) {
                A01.A07 = new C2rD(i, false);
            } else {
                A01.A0C = new C2591Gia(i);
            }
            C00i c00i = this.A08.A00;
            C69s c69s = (C69s) c00i.get();
            c69s.A09();
            ((C69o) c69s).A02 = callerContext;
            ((C69o) c69s).A00 = this.A0A;
            ((C69o) c69s).A03 = A01.A04();
            A06(((C69s) c00i.get()).A08());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r303 == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSizeChanged(int r302, int r303, int r304, int r305) {
        /*
            r301 = this;
            r0 = 1221829271(0x48d3a297, float:433428.72)
            r306 = r0
            r0 = r306
            int r0 = X.0FI.A06(r0)
            r307 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            super/*android.view.View*/.onSizeChanged(r1, r2, r3, r4)
            r0 = r302
            if (r0 == 0) goto L20
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 != 0) goto L23
        L20:
            r0 = 0
            r306 = r0
        L23:
            r0 = r301
            r1 = r306
            r0.A07 = r1
            r0 = r301
            android.graphics.Bitmap r0 = r0.A06
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L42
            r0 = r301
            int r0 = r0.A05
            r306 = r0
            r0 = r301
            r1 = r306
            r2 = r308
            r0.A0P(r1, r2)
        L42:
            r0 = 1264960167(0x4b65c2a7, float:1.5057575E7)
            r1 = r307
            X.0FI.A0C(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.crop.CanvasOverlayCropDraweeView.onSizeChanged(int, int, int, int):void");
    }
}
