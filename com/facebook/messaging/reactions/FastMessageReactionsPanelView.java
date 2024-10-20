package com.facebook.messaging.reactions;

import X.0FI;
import X.1BQ;
import X.1Br;
import X.1Wi;
import X.2oI;
import X.2yD;
import X.5II;
import X.5yJ;
import X.6JM;
import X.6nG;
import X.6qY;
import X.7Wd;
import X.AbK;
import X.AbR;
import X.AbstractC2326GOr;
import X.C00i;
import X.C2rY;
import X.C5a8;
import X.C5pl;
import X.C62j;
import X.C62n;
import X.C66i;
import X.DKC;
import X.GOn;
import X.Gzv;
import X.H03;
import X.HUg;
import X.HUh;
import X.HiK;
import X.Hnc;
import X.IgY;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: FastMessageReactionsPanelView.class */
public class FastMessageReactionsPanelView extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Paint A0C;
    public Drawable A0D;
    public Drawable A0E;
    public StaticLayout A0F;
    public TextPaint A0G;
    public AbR A0H;
    public C00i A0I;
    public C00i A0J;
    public C62n A0K;
    public ThreadKey A0L;
    public ThreadSummary A0M;
    public 6nG A0N;
    public Hnc A0O;
    public HUg A0P;
    public C5a8 A0Q;
    public Gzv A0R;
    public HUh A0S;
    public ReactionsSet A0T;
    public HiK A0U;
    public 7Wd A0V;
    public 6JM A0W;
    public IgY A0X;
    public C62j A0Y;
    public Capabilities A0Z;
    public String A0a;
    public Executor A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public float[] A0i;
    public Gzv[] A0j;
    public final C00i A0k;
    public final C00i A0l;
    public final H03 A0m;
    public final 5II A0n;
    public final C00i A0o;

    public FastMessageReactionsPanelView(Context context) {
        super(context);
        this.A0j = new Gzv[0];
        this.A0m = new H03(this);
        this.A0n = AbstractC2326GOr.A0O(this);
        this.A0k = 1BQ.A02(67771);
        this.A0l = 1BQ.A02(68549);
        this.A0o = 1BQ.A02(100038);
    }

    public FastMessageReactionsPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0j = new Gzv[0];
        this.A0m = new H03(this);
        this.A0n = AbstractC2326GOr.A0O(this);
        this.A0k = 1BQ.A02(67771);
        this.A0l = 1BQ.A02(68549);
        this.A0o = 1BQ.A02(100038);
    }

    public FastMessageReactionsPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0j = new Gzv[0];
        this.A0m = new H03(this);
        this.A0n = AbstractC2326GOr.A0O(this);
        this.A0k = 1BQ.A02(67771);
        this.A0l = 1BQ.A02(68549);
        this.A0o = 1BQ.A02(100038);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (X.1Br.A0B(r0.A03) == X.C0et.A0U) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v92, types: [X.Gzv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.reactions.FastMessageReactionsPanelView r302, java.lang.String[] r303) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.FastMessageReactionsPanelView.A00(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.reactions.FastMessageReactionsPanelView, java.lang.String[]):void");
    }

    public static void A01(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        Gzv[] gzvArr = fastMessageReactionsPanelView.A0j;
        int length = gzvArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Gzv gzv = gzvArr[i2];
            gzv.A0A.A07(gzv.equals(fastMessageReactionsPanelView.A0R) ? 1.5d : 1.0d);
            i = i2 + 1;
        }
    }

    public static void A02(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        IgY igY = fastMessageReactionsPanelView.A0X;
        igY.A00 = 0;
        CopyOnWriteArrayList copyOnWriteArrayList = igY.A05;
        if (copyOnWriteArrayList.get(0) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((C66i) it.next()).A09(igY.A01);
            }
            ((C66i) copyOnWriteArrayList.get(igY.A00)).A09(igY.A02);
        }
        Iterator it2 = fastMessageReactionsPanelView.A0X.A05.iterator();
        while (it2.hasNext()) {
            ((C66i) it2.next()).A06 = false;
        }
        IgY igY2 = fastMessageReactionsPanelView.A0X;
        ((C66i) igY2.A05.get(igY2.A00)).A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0053, code lost:
    
        if (r0.A00(r0.A0Y, r0, r301.A0Z, r0.A1T, java.lang.Boolean.valueOf(r0.A2i)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(com.facebook.messaging.reactions.FastMessageReactionsPanelView r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A0M
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L56
            r0 = r301
            X.00i r0 = r0.A0o
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.5pk r0 = (X.C5pk) r0
            r303 = r0
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0L
            r304 = r0
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A0M
            r305 = r0
            r0 = r305
            com.google.common.collect.ImmutableSet r0 = r0.A1T
            r306 = r0
            r0 = r301
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.A0Z
            r307 = r0
            r0 = r305
            boolean r0 = r0.A2i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r301 = r0
            r0 = r305
            com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType r0 = r0.A0Y
            r308 = r0
            r0 = r303
            r1 = r308
            r2 = r304
            r3 = r307
            r4 = r306
            r5 = r301
            boolean r0 = r0.A00(r1, r2, r3, r4, r5)
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 != 0) goto L5b
        L56:
            r0 = 0
            r310 = r0
            r0 = 0
            r302 = r0
        L5b:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.FastMessageReactionsPanelView.A03(com.facebook.messaging.reactions.FastMessageReactionsPanelView):boolean");
    }

    public static boolean A04(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        if (fastMessageReactionsPanelView.A0O != null) {
            return !((C5pl) fastMessageReactionsPanelView.A0l.get()).A01(fastMessageReactionsPanelView.A0M, fastMessageReactionsPanelView.A0Z) || A05(fastMessageReactionsPanelView) || A03(fastMessageReactionsPanelView);
        }
        return false;
    }

    public static boolean A05(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        2yD A0o;
        long j;
        C5pl c5pl = (C5pl) fastMessageReactionsPanelView.A0l.get();
        ThreadSummary threadSummary = fastMessageReactionsPanelView.A0M;
        if (threadSummary != null && ThreadKey.A0b(threadSummary.A0n) && !5yJ.A00(threadSummary)) {
            A0o = 1Br.A07(c5pl.A02);
            j = 36321395961184587L;
        } else if (2oI.A03(threadSummary)) {
            A0o = 1Wi.A00((1Wi) 1Br.A0B(c5pl.A00));
            j = 36320279272504549L;
        } else {
            A0o = AbK.A0o(c5pl.A01);
            j = 36315340066136863L;
        }
        return A0o.AZk(j);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (getVisibility() == 0 && verifyDrawable(drawable)) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(461218780);
        super.onAttachedToWindow();
        C62n c62n = this.A0K;
        if (c62n != null) {
            c62n.A00();
        }
        for (int i = 0; i < this.A0j.length; i++) {
        }
        0FI.A0C(-2046174876, A06);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-822787760);
        super.onDetachedFromWindow();
        this.A0K.A01();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A0j.length) {
                0FI.A0C(262246023, A06);
                return;
            }
            i = i2 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Drawable drawable;
        super.onDraw(canvas);
        this.A0D.draw(canvas);
        boolean A00 = C2rY.A00(getContext());
        Rect bounds = this.A0D.getBounds();
        if (A00) {
            i = (bounds.right - this.A08) - this.A06;
            i2 = -1;
        } else {
            i = bounds.left + this.A08;
            i2 = 1;
        }
        float f = (this.A0D.getBounds().bottom - this.A09) - this.A06;
        int i3 = this.A0D.getBounds().top + this.A02;
        if (!this.A0g && this.A0F != null) {
            canvas.save();
            canvas.translate(i, i3);
            this.A0F.draw(canvas);
            canvas.restore();
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            Gzv[] gzvArr = this.A0j;
            if (i5 >= gzvArr.length) {
                break;
            }
            Gzv gzv = gzvArr[i5];
            float f2 = gzv.A00;
            float f3 = gzv.A01;
            float f4 = (float) gzv.A0A.A09.A00;
            float f5 = f4 * f2;
            float f6 = 1.0f - f5;
            float f7 = this.A06;
            float f8 = f6 * f7 * 0.5f;
            float f9 = (i5 * r0 * i2) + i + (this.A0A * i5 * i2) + f8;
            float f10 = -f8;
            float f11 = f3 + ((-((f4 - 1.0f) * f7)) * 0.5f);
            float round = Math.round(f9);
            float round2 = Math.round(f11);
            canvas.save();
            canvas.translate(f10 + round, f);
            if (this.A0T.A01(gzv.A0C) && f == round2) {
                this.A0C.getClass();
                if (f5 > 0.8f && f5 < 1.2f) {
                    Path A0B = DKC.A0B();
                    int i6 = this.A04;
                    float f12 = -i6;
                    float f13 = this.A06 + i6;
                    RectF rectF = new RectF(f12, f12, f13, f13);
                    float[] fArr = new float[8];
                    Arrays.fill(fArr, this.A03);
                    A0B.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.drawPath(A0B, this.A0C);
                }
            }
            canvas.restore();
            canvas.save();
            canvas.translate(round, round2);
            int A03 = GOn.A03(f5, gzv.A02);
            Drawable drawable2 = gzv.A08;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, A03, A03);
            }
            Drawable drawable3 = gzv.A06;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, A03, A03);
            }
            Drawable drawable4 = gzv.A08;
            if (drawable4 != null) {
                drawable = drawable4;
            } else {
                drawable = gzv.A06;
                if (drawable == null) {
                    canvas.restore();
                    i4 = i5 + 1;
                }
            }
            drawable.draw(canvas);
            canvas.restore();
            i4 = i5 + 1;
        }
        if (!A04(this) || this.A0j.length <= 0) {
            return;
        }
        canvas.save();
        int length = this.A0j.length;
        canvas.translate(i + (this.A06 * length * i2) + (length * this.A0A * i2), f);
        Drawable drawable5 = this.A0E;
        int i7 = this.A06;
        drawable5.setBounds(0, 0, i7, i7);
        this.A0E.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A0j.length) {
                return;
            } else {
                i = i2 + 1;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        TextPaint textPaint;
        String str;
        super.onMeasure(i, i2);
        int length = ((6qY) this.A0I.get()).Ah3().length;
        if (A04(this)) {
            length++;
        }
        int i4 = (this.A06 * length) + (this.A0A * (length - 1));
        int i5 = this.A08 * 2;
        int i6 = i4 + i5;
        if (this.A0g || (textPaint = this.A0G) == null || (str = this.A0a) == null) {
            i3 = 0;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, textPaint, i6 - i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            this.A0F = staticLayout;
            i3 = staticLayout.getHeight() + this.A00;
        }
        this.A01 = i3;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A07 + this.A01, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(540794853);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0D.setBounds(0, this.A05, i, i2);
        int i5 = (this.A0D.getBounds().bottom - this.A09) - this.A06;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2132279369) + i5;
        int i6 = i5 - dimensionPixelSize;
        for (Gzv gzv : this.A0j) {
            if (gzv != null) {
                gzv.A03 = dimensionPixelSize;
                gzv.A04 = i6;
            }
        }
        invalidate();
        0FI.A0C(564696004, A06);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A0j.length) {
                return;
            } else {
                i = i2 + 1;
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        Gzv[] gzvArr = this.A0j;
        int length = gzvArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return super.verifyDrawable(drawable);
            }
            Gzv gzv = gzvArr[i2];
            if (gzv != null && (drawable == gzv.A08 || drawable == gzv.A06)) {
                return true;
            }
            i = i2 + 1;
        }
    }
}
