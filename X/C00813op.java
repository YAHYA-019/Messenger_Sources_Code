package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3op, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3op.class */
public final class C00813op extends View {
    public 8Lu A00;
    public ScheduledFuture A01;
    public final C2mT A02;
    public final Ecv A03;
    public final Ehj A04;
    public final 1Br A05;
    public final 1Br A06;
    public final int[] A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00813op(Context context, C2mT c2mT) {
        super(context);
        11T.A0F(context, 1);
        11T.A0F(c2mT, 2);
        setTag(2131364167, true);
        this.A02 = c2mT;
        this.A06 = 1Bu.A01(context, 16428);
        this.A05 = 1Bq.A00(16465);
        this.A04 = new Ehj(context);
        this.A03 = new Ecv(this);
        this.A07 = new int[2];
        this.A00 = new 8Lu(new F4B(), C0ty.A00);
    }

    public static Layout A00(Context context, 2Kp r302, CharSequence charSequence, float f, int i) {
        r302.A08(i);
        r302.A09(EVV.A00(context, f));
        r302.A02(EVV.A00(context, f));
        r302.A0G(charSequence);
        return r302.A00();
    }

    public static final void A01(Canvas canvas, Layout layout, Layout layout2, boolean z) {
        int save = canvas.save();
        try {
            float height = layout.getHeight();
            float A00 = EVU.A00(layout);
            float f = 0.0f;
            canvas.translate(z ? canvas.getWidth() - A00 : 0.0f, canvas.getHeight() - height);
            Paint paint = RDT.A02;
            paint.setColor(-1);
            paint.setAlpha(200);
            canvas.drawRect(0.0f, 0.0f, A00, height, paint);
            layout.draw(canvas);
            float height2 = layout2.getHeight();
            float A002 = EVU.A00(layout2);
            if (z) {
                f = A00 - A002;
            }
            canvas.translate(f, -height2);
            paint.setColor(-1);
            paint.setAlpha(200);
            canvas.drawRect(0.0f, 0.0f, A002, height2, paint);
            layout2.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1084828552);
        super.onAttachedToWindow();
        this.A01 = ((ScheduledExecutorService) 1Br.A0B(this.A05)).scheduleAtFixedRate(new G26(1Br.A03(this.A06), this), 0L, 1L, TimeUnit.SECONDS);
        0FI.A0C(-809540881, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2025386418);
        super.onDetachedFromWindow();
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        invalidate();
        0FI.A0C(1558916176, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01b0, code lost:
    
        if (r305 == null) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00813op.onDraw(android.graphics.Canvas):void");
    }
}
