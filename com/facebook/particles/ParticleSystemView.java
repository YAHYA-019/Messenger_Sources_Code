package com.facebook.particles;

import X.0FI;
import X.1BY;
import X.1Bn;
import X.JVU;
import X.LXb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: ParticleSystemView.class */
public class ParticleSystemView extends View {
    public JVU A00;
    public boolean A01;

    public ParticleSystemView(Context context) {
        super(context);
        A00();
    }

    public ParticleSystemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ParticleSystemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        JVU jvu = (JVU) 1Bn.A0E(getContext(), (1BY) null, 131271);
        this.A00 = jvu;
        jvu.getClass();
        setBackgroundDrawable(jvu);
        this.A01 = true;
        setTag(2131364167, true);
    }

    public void A01() {
        JVU jvu = this.A00;
        jvu.getClass();
        jvu.A06.CeK(jvu.A07);
        jvu.A04 = false;
        jvu.A0A.clear();
        jvu.A09.clear();
        jvu.A08.clear();
        jvu.invalidateSelf();
    }

    public void A02(LXb lXb) {
        JVU jvu = this.A00;
        jvu.getClass();
        JVU.A00(lXb, jvu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r0.A0A.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.JVU r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            java.util.Deque r0 = r0.A09
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r302
            java.util.Queue r0 = r0.A0A
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L30
        L2e:
            r0 = 1
            r304 = r0
        L30:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.particles.ParticleSystemView.A03():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (super.onTouchEvent(r302) == false) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 623705698(0x252cfe62, float:1.500481E-16)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r301
            boolean r0 = r0.A01
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L78
            r0 = r301
            X.JVU r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Class r0 = r0.getClass()
            r0 = 1
            r307 = r0
            r0 = r306
            android.view.GestureDetector r0 = r0.A02
            r1 = r302
            boolean r0 = r0.onTouchEvent(r1)
            r308 = r0
            r0 = r306
            X.KTA r0 = r0.A03
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L4d
            r0 = r302
            int r0 = r0.getActionMasked()
            r310 = r0
            r0 = r310
            r1 = r307
            if (r0 == r1) goto L6a
            r0 = 3
            r304 = r0
            r0 = r310
            r1 = r304
            if (r0 == r1) goto L6a
        L4d:
            r0 = r308
            if (r0 != 0) goto L5c
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5f
        L5c:
            r0 = 1
            r305 = r0
        L5f:
            r0 = 446278369(0x1a99aae1, float:6.3555387E-23)
            r304 = r0
        L62:
            r0 = r304
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r305
            return r0
        L6a:
            r0 = 0
            r304 = r0
            r0 = 0
            r309 = r0
            r0 = r306
            r1 = 0
            r0.A03 = r1
            goto L5c
        L78:
            r0 = -2109809743(0xffffffff823edbb1, float:-1.4022044E-37)
            r304 = r0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.particles.ParticleSystemView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        int A06 = 0FI.A06(-1667276125);
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            A03();
        }
        0FI.A0C(548040423, A06);
    }
}
