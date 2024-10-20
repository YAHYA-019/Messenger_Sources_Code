package com.facebook.drawee.fbpipeline;

import X.1BK;
import X.1Bi;
import X.2Dp;
import X.2EU;
import X.2EY;
import X.2Ea;
import X.2S2;
import X.4YU;
import X.4gJ;
import X.4gO;
import X.5BL;
import X.5BO;
import X.5Ba;
import X.5Bb;
import X.5Bc;
import X.5Bm;
import X.5By;
import X.5C1;
import X.5C4;
import X.5CC;
import X.5SA;
import X.5YB;
import X.C00i;
import X.C06974ih;
import X.C07004ik;
import X.C07014il;
import X.C1iM;
import X.C2545Ggt;
import X.C66o;
import X.C69f;
import X.C69o;
import X.C69q;
import X.C69s;
import X.C69v;
import X.C69w;
import X.C7uL;
import X.GSl;
import X.HFo;
import X.InterfaceC07034in;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.util.Map;

/* loaded from: FbDraweeView.class */
public class FbDraweeView extends 5YB implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A08(FbDraweeView.class, "unknown");
    public C00i A00;
    public final C69q A01;
    public final 2S2 A02;

    public FbDraweeView(Context context) {
        super(context);
        this.A02 = (2S2) 1Bi.A03(66368);
        this.A01 = new C69q();
        A01(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbDraweeView(Context context, C69f c69f) {
        super(context);
        A05(c69f);
        this.A02 = (2S2) 1Bi.A03(66368);
        this.A01 = new C69q();
        A01(context, null);
    }

    public FbDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = (2S2) 1Bi.A03(66368);
        this.A01 = new C69q();
        A01(context, attributeSet);
    }

    public FbDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = (2S2) 1Bi.A03(66368);
        this.A01 = new C69q();
        A01(context, attributeSet);
    }

    public FbDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = (2S2) 1Bi.A03(66368);
        this.A01 = new C69q();
        A01(context, attributeSet);
    }

    public static Bitmap A00(Drawable drawable) {
        Bitmap A00;
        while (drawable instanceof 5CC) {
            drawable = drawable.getCurrent();
        }
        if (!(drawable instanceof BitmapDrawable)) {
            if (!(drawable instanceof 5C1)) {
                return null;
            }
            5C1 r0 = (5C1) drawable;
            int length = r0.A04.length;
            for (int i = 0; i < length; i++) {
                A00 = A00(r0.A01(i));
                if (A00 == null) {
                }
            }
            return null;
        }
        A00 = ((BitmapDrawable) drawable).getBitmap();
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x038e, code lost:
    
        if (r0 == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a8, code lost:
    
        if (r0 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03c1, code lost:
    
        if (r0 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d1, code lost:
    
        if (r0 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03e5, code lost:
    
        if (r0 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ff, code lost:
    
        if (r0 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0418, code lost:
    
        if (r0 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0428, code lost:
    
        if (r0 != false) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.fbpipeline.FbDraweeView.A01(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap A07() {
        5By drawable = getDrawable();
        if (this.A01.A02()) {
            if (drawable instanceof 5By) {
                2EU r0 = drawable.A02;
                if (2EU.A06(r0)) {
                    2EY r02 = (2Ea) r0.A09();
                    if (r02 instanceof 2EY) {
                        return r02.A04;
                    }
                }
            } else if (drawable instanceof GSl) {
                HFo hFo = ((GSl) drawable).A0G.A05;
                if (hFo instanceof C2545Ggt) {
                    return ((C2545Ggt) hFo).A02;
                }
                return null;
            }
        }
        return A00(getDrawable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Animatable A08() {
        if (!this.A01.A02()) {
            C69w c69w = this.A00.A01;
            if (c69w != null) {
                return c69w.AWq();
            }
            return null;
        }
        5C4 drawable = getDrawable();
        if (!(drawable instanceof 5C4)) {
            return null;
        }
        Object AVe = drawable.AVe();
        if (AVe instanceof Animatable) {
            return (Animatable) AVe;
        }
        return null;
    }

    public C69s A09() {
        this.A01.A02();
        C00i c00i = this.A00;
        c00i.getClass();
        return (C69s) c00i.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0A(int i) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            c69q.A00().A03(i);
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        C69f.A02(c69f.A01.getDrawable(i), c69f, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0B(ColorFilter colorFilter) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            c69q.A00().A05 = colorFilter;
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        c69f.A04.setColorFilter(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0C(PointF pointF) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            ((C07014il) c69q.A00()).A01 = pointF;
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        C69f.A01(c69f, 2).A04(pointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0D(Drawable drawable) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            c69q.A00().A08 = drawable;
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        C69f.A02(drawable, c69f, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0E(Drawable drawable) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            C1iM.A01(this, null, c69q.A01(), drawable == null ? 5Bb.A00 : new 5Ba(drawable), A03);
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        drawable.getClass();
        c69f.A07(drawable, 1.0f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0F(Drawable drawable) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            c69q.A00().A06(drawable);
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        C69f.A02(drawable, c69f, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0G(Uri uri, CallerContext callerContext) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            C7uL.A00(uri, this, c69q.A01(), callerContext);
            return;
        }
        C00i c00i = this.A00;
        c00i.getClass();
        C69s c69s = (C69s) c00i.get();
        ((C69o) c69s).A02 = callerContext;
        ((C69o) c69s).A01 = this.A00.A01;
        c69s.A0A(uri);
        A06(c69s.A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0H(Uri uri, CallerContext callerContext, 4gJ r304) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            C1iM.A01(this, new 4gO(r304), c69q.A01(), 5Bm.A01(uri, (Map) null), callerContext);
            return;
        }
        C69s c69s = (C69s) 4YU.A0p(this.A00);
        ((C69o) c69s).A02 = callerContext;
        ((C69o) c69s).A00 = r304;
        ((C69o) c69s).A01 = this.A00.A01;
        c69s.A0A(uri);
        A06(c69s.A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0I(CallerContext callerContext, 4gJ r303, 2Dp r304) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            5BO A01 = 5BL.A01(r304);
            C1iM.A01(this, new 4gO(r303), c69q.A01(), A01, callerContext);
            return;
        }
        C00i c00i = this.A00;
        c00i.getClass();
        C69o c69o = (C69o) c00i.get();
        c69o.A01 = this.A00.A01;
        c69o.A03 = r304;
        c69o.A00 = r303;
        if (callerContext != null) {
            C00i c00i2 = this.A00;
            c00i2.getClass();
            ((C69o) c00i2.get()).A02 = callerContext;
        }
        C00i c00i3 = this.A00;
        c00i3.getClass();
        A06(((C69s) c00i3.get()).A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0J(CallerContext callerContext, 4gJ r303, 2Dp r304, boolean z) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            5BO A01 = 5BL.A01(r304);
            C06974ih A012 = c69q.A01();
            if (A012.A0J != z) {
                C07004ik c07004ik = new C07004ik(A012);
                c07004ik.A0J = z;
                A012 = new C06974ih(c07004ik);
            }
            C1iM.A01(this, r303 != null ? new 4gO(r303) : null, A012, A01, callerContext);
            return;
        }
        C00i c00i = this.A00;
        c00i.getClass();
        C69s c69s = (C69s) c00i.get();
        ((C69o) c69s).A02 = callerContext;
        ((C69o) c69s).A00 = r303;
        ((C69o) c69s).A01 = this.A00.A01;
        ((C69o) c69s).A03 = r304;
        ((C69o) c69s).A05 = z;
        A06(c69s.A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0K(CallerContext callerContext, 4gJ r303, 2Dp[] r304) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            5Bc A00 = 5BL.A00(r304);
            C1iM.A01(this, new 4gO(r303), c69q.A01(), A00, callerContext);
            return;
        }
        C69o c69o = (C69o) 4YU.A0p(this.A00);
        c69o.A02 = callerContext;
        c69o.A01 = this.A00.A01;
        c69o.A07(r304);
        c69o.A04 = null;
        c69o.A00 = r303;
        A06(((C69s) 4YU.A0p(this.A00)).A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0L(CallerContext callerContext, 2Dp r303) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            C1iM.A01(this, null, c69q.A01(), 5BL.A01(r303), callerContext);
            return;
        }
        C69s c69s = (C69s) 4YU.A0p(this.A00);
        ((C69o) c69s).A02 = callerContext;
        ((C69o) c69s).A01 = this.A00.A01;
        ((C69o) c69s).A03 = r303;
        A06(c69s.A08());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M(InterfaceC07034in interfaceC07034in) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            c69q.A00().A00(interfaceC07034in);
            return;
        }
        C69f c69f = this.A00.A00;
        c69f.getClass();
        c69f.A09(interfaceC07034in);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0N(C69f c69f, C06974ih c06974ih) {
        C69q c69q = this.A01;
        if (!c69q.A02()) {
            super/*com.facebook.drawee.view.DraweeView*/.A05(c69f);
        } else {
            c69q.A00 = new C07004ik(c06974ih);
            c69q.A01 = c06974ih;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0O(5SA r302) {
        C69q c69q = this.A01;
        if (c69q.A02()) {
            C07004ik A00 = c69q.A00();
            ((C07014il) A00).A04 = C66o.A01(r302);
            ((C07014il) A00).A03 = C66o.A00(r302);
        } else {
            C69f c69f = this.A00.A00;
            c69f.getClass();
            c69f.A0A(r302);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        Object obj;
        try {
            super/*android.widget.ImageView*/.onDraw(canvas);
        } catch (Exception e) {
            C69w c69w = this.A00.A01;
            if (c69w != null && (c69w instanceof C69v) && (obj = ((C69v) c69w).A05) != null) {
                throw 1BK.A0s(String.format("Exception in onDraw, callerContext=%s", obj.toString()), e);
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageURI(Uri uri) {
        CallerContext A00 = 2S2.A00(this);
        if (A00 == null) {
            A00 = A03;
        }
        A0G(uri, A00);
    }
}
