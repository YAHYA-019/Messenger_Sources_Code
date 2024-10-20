package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: JXl.class */
public final class JXl extends View {
    public float A00;
    public DqH A01;
    public final List A02;
    public final int A03;
    public static final int A05 = Color.argb(127, 255, 255, 255);
    public static final int A04 = Color.argb(20, 255, 255, 255);

    public JXl(Context context) {
        super(context);
        this.A01 = new DqH(new PointF(0.5f, 0.5f), 0.5f);
        this.A03 = (int) (30.0f * 1.7777778f);
        07E r0 = new 07E(0, 30);
        ArrayList<03Y> A0s = AnonymousClass001.A0s();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            int A06 = 7zL.A06(it);
            07E r02 = new 07E(0, this.A03);
            ArrayList A1E = C1A3.A1E(r02);
            Iterator it2 = r02.iterator();
            while (it2.hasNext()) {
                7zU.A1Y(Integer.valueOf(A06), Integer.valueOf(7zL.A06(it2)), A1E);
            }
            0QU.A0t(A1E, A0s);
        }
        ArrayList A1E2 = C1A3.A1E(A0s);
        for (03Y r03 : A0s) {
            A1E2.add(new KhW(new PointF((AnonymousClass001.A03(r03.first) + 1) / 32.0f, (AnonymousClass001.A03(r03.second) + 1) / (this.A03 + 2)), C07y.A01.A06(0, 100)));
        }
        this.A02 = A1E2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ff, code lost:
    
        if (((float) java.lang.Math.sqrt(((float) java.lang.Math.pow(r0.x - r0.x, 2.0d)) + ((float) java.lang.Math.pow((r0.y / 0.5625f) - (r0.y / 0.5625f), 2.0d)))) >= r0.A00) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXl.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.11N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.0Pn, java.lang.Object] */
    @Override // android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1112218047);
        super.onAttachedToWindow();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        ofFloat.setDuration(20000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new LinearInterpolator());
        LF7.A00(ofFloat, this, 8);
        0K6.A00(ofFloat);
        ?? obj = new Object();
        ((0CL) obj).element = Kvz.A01((PointF) this.A01.A02);
        ?? obj2 = new Object();
        ((11N) obj2).element = Kvz.A00(this.A01.A00);
        ?? obj3 = new Object();
        ((0Pn) obj3).element = C07y.A01.A09(1200L, 1600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(((0Pn) obj3).element);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new LF6(0, obj, this, obj2));
        ofFloat2.addListener(new RiH(this, (11N) obj2, (0Pn) obj3, (0CL) obj));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(2.0f, 0.5f);
        ofFloat3.setDuration(1000L);
        LF7.A00(ofFloat3, this, 9);
        ofFloat3.addListener(new LEw(ofFloat2, 3));
        0K6.A00(ofFloat3);
        0FI.A0C(731979659, A06);
    }
}
