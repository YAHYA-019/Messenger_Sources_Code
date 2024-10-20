package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Dpq.class */
public final class Dpq extends AbstractC2603Gio implements Drawable.Callback {
    public float A00;
    public Drawable A01;
    public 2EU A02;
    public boolean A03;
    public int A04;
    public Bitmap A05;
    public Canvas A06;
    public StaticLayout A07;
    public StaticLayout A08;
    public final int A09;
    public final Context A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final Drawable A0K;
    public final Uri A0L;
    public final SettableFuture A0M;
    public final Runnable A0N;
    public final C07a A0O;

    public Dpq(Context context, Uri uri, String str, String str2, int i) {
        7zR.A1O(uri, str);
        this.A0A = context;
        this.A0L = uri;
        this.A04 = (-1) >>> 1;
        this.A0M = 4YU.A0j();
        this.A0O = new C07a();
        this.A0B = 1Bq.A00(65630);
        this.A0C = 1Bq.A00(65609);
        this.A0D = 7zM.A0O();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279336);
        this.A0J = dimensionPixelSize;
        this.A09 = context.getResources().getDimensionPixelSize(2132279682);
        this.A0E = (dimensionPixelSize - r0) / 2.0f;
        this.A0I = dimensionPixelSize;
        this.A0N = new G04(this);
        Drawable drawable = context.getDrawable(2132347252);
        if (drawable == null) {
            throw 1BK.A0h();
        }
        this.A0K = drawable;
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i);
        textPaint.setTextSize(7zL.A01(context.getResources(), 2132279348));
        Typeface typeface = Typeface.SANS_SERIF;
        textPaint.setTypeface(Typeface.create(typeface, 1));
        this.A08 = A00(textPaint, str);
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTypeface(Typeface.create(typeface, 0));
        this.A07 = A00(textPaint2, str2);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2132279310);
        int i2 = dimensionPixelSize + dimensionPixelSize2;
        this.A0H = i2 + DKE.A05(this.A08) + context.getResources().getDimensionPixelSize(2132279379) + DKE.A05(this.A07);
        this.A0G = i2;
        this.A0F = r0 + r0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Dpq(android.content.Context r302, com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r303
            java.lang.String r0 = r0.A0C
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L46
            r0 = r305
            android.net.Uri r0 = X.7zU.A0C(r0)
            r306 = r0
            r0 = r303
            java.lang.String r0 = r0.A0I
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = r303
            java.lang.String r0 = r0.A0B
            r308 = r0
            r0 = r308
            X.11T.A0A(r0)
            r0 = r303
            int r0 = r0.A05
            r309 = r0
            r0 = r301
            r305 = r0
            r0 = r301
            r1 = r302
            r2 = r306
            r3 = r307
            r4 = r308
            r5 = r309
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L46:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dpq.<init>(android.content.Context, com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo):void");
    }

    private final StaticLayout A00(TextPaint textPaint, String str) {
        int i = this.A0I;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i, alignment, 1.0f, 0.0f, false);
        while (staticLayout.getLineCount() > 2) {
            staticLayout = new StaticLayout(0Pz.A0J(7zM.A1C(0, staticLayout.getLineEnd(2) - 1, str), (char) 8230), textPaint, i, alignment, 1.0f, 0.0f, false);
        }
        return staticLayout;
    }

    private final void A01() {
        if (this.A04 == ((-1) >>> 1)) {
            this.A04 = 0;
            5Gh r0 = this.A0K;
            if (r0 instanceof 5OF) {
                r0.A03(new C2126Def(this));
                r0.setVisible(true, false);
            } else {
                A04(this, 1);
            }
            2IA A01 = 2IA.A01(this.A0L);
            A01.A05 = 2rC.A02;
            ((2Ff) 1Br.A0B(this.A0C)).A0A(A01.A04(), CallerContext.A0B("VinylStickerDrawable")).D3K(new GiC(this, 0), 4YV.A11(this.A0D));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A02(Canvas canvas, float f) {
        canvas.save();
        float f2 = this.A0J / 2.0f;
        canvas.rotate(f, getBounds().left + f2, getBounds().top + f2);
        this.A0K.draw(canvas);
        float f3 = this.A0E;
        canvas.translate(f3, f3);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(0.0f, this.A0G);
        this.A08.draw(canvas);
        canvas.translate(0.0f, this.A0F);
        this.A07.draw(canvas);
        canvas.restore();
    }

    public static final void A03(Dpq dpq) {
        dpq.A04 = -1;
        AbG.A1W(dpq.A0M, false);
        while (true) {
            C07a c07a = dpq.A0O;
            if (!7zM.A1b(c07a)) {
                return;
            } else {
                ((GHt) c07a.removeFirst()).C4C();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A04(Dpq dpq, int i) {
        int i2 = i | dpq.A04;
        dpq.A04 = i2;
        if (i2 != 3) {
            return;
        }
        dpq.A0M.A04();
        dpq.invalidateSelf();
        while (true) {
            C07a c07a = dpq.A0O;
            if (!7zM.A1b(c07a)) {
                return;
            } else {
                ((GHt) c07a.removeFirst()).C4b(dpq);
            }
        }
    }

    public void A07() {
        this.A0O.clear();
        this.A0K.setVisible(false, false);
        2EU.A04(this.A02);
        Bitmap bitmap = this.A05;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final void A08(GHt gHt) {
        int i = this.A04;
        if (i == -1) {
            gHt.C4C();
            return;
        }
        if (i == 3) {
            gHt.C4b(this);
            return;
        }
        int i2 = (-1) >>> 1;
        C07a c07a = this.A0O;
        if (i != i2) {
            c07a.add(gHt);
        } else {
            c07a.add(gHt);
            A01();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JGn
    public Bitmap AOU(int i) {
        float f = 0.0f / 0.0f;
        if (this.A04 == ((-1) >>> 1)) {
            A01();
        }
        Bitmap bitmap = this.A05;
        if (bitmap == null || this.A06 == null) {
            int i2 = this.A0I;
            int i3 = this.A0H;
            bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            11T.A0A(bitmap);
            this.A05 = bitmap;
            this.A06 = new Canvas(bitmap);
            setBounds(new Rect(0, 0, i2, i3));
        }
        Object obj = this.A0M.get();
        11T.A0A(obj);
        if (AnonymousClass001.A1V(obj)) {
            bitmap.eraseColor(0);
            Canvas canvas = this.A06;
            if (canvas == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A02(canvas, (i * 360.0f) / 10000.0f);
        }
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        11T.A0F(canvas, 0);
        int i = this.A04;
        if (i != 3) {
            float f = 0.0f / 0.0f;
            if (i == ((-1) >>> 1)) {
                A01();
                return;
            }
            return;
        }
        A02(canvas, this.A00);
        if (this.A03) {
            return;
        }
        this.A03 = true;
        scheduleSelf(this.A0N, SystemClock.uptimeMillis() + 30);
    }

    public final void finalize() {
        int A03 = 0FI.A03(1462031415);
        2EU.A04(this.A02);
        Bitmap bitmap = this.A05;
        if (bitmap != null) {
            bitmap.recycle();
        }
        0FI.A09(1263556301, A03);
    }

    public int getIntrinsicHeight() {
        return this.A0H;
    }

    public int getIntrinsicWidth() {
        return this.A0I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        11T.A0F(runnable, 1);
        scheduleSelf(runnable, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        11T.A0F(runnable, 1);
        unscheduleSelf(runnable);
    }
}
