package com.facebook.chatheads.view;

import X.1BK;
import X.1Bi;
import X.1hM;
import X.4YU;
import X.C09s;
import X.C62j;
import X.C66h;
import X.C66i;
import X.C66n;
import X.JQy;
import X.JvZ;
import X.Kf6;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.mapbox.mapboxsdk.R;

/* loaded from: ChatHeadCloseTargetView.class */
public class ChatHeadCloseTargetView extends CustomFrameLayout {
    public float A00;
    public float A01;
    public PointF A02;
    public Kf6 A03;
    public SettableFuture A04;
    public boolean A05;
    public boolean A06;
    public C62j A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final View A0C;
    public final View A0D;
    public final C66i A0E;
    public final C66i A0F;
    public final C66i A0G;
    public final C66i A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final View A0M;
    public final View A0N;
    public static final C66h A0P = C66h.A01();
    public static final C66h A0O = C66h.A03(150.0d, 9.0d);

    public ChatHeadCloseTargetView(Context context) {
        this(context, null);
    }

    public ChatHeadCloseTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatHeadCloseTargetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new PointF();
        this.A08 = !1BK.A0K().AZk(36315769553823237L);
        this.A07 = (C62j) 1Bi.A03(66182);
        A0U(2132542860);
        this.A0M = C09s.A01(this, 2131362338);
        this.A0D = C09s.A01(this, 2131363045);
        this.A0C = C09s.A01(this, 2131363046);
        this.A0N = C09s.A01(this, 2131363048);
        C66n jvZ = new JvZ(this);
        C66i c66i = new C66i(this.A07);
        C66h c66h = A0P;
        c66i.A09(c66h);
        c66i.A0A(jvZ);
        this.A0G = c66i;
        C66i c66i2 = new C66i(this.A07);
        c66i2.A09(c66h);
        c66i2.A0A(jvZ);
        this.A0H = c66i2;
        C66i c66i3 = new C66i(this.A07);
        c66i3.A09(A0O);
        c66i3.A0A(jvZ);
        c66i3.A06(0.7d);
        c66i3.A07(0.7d);
        c66i3.A00 = 0.004999999888241291d;
        c66i3.A00 = 0.004999999888241291d;
        this.A0F = c66i3;
        C66i c66i4 = new C66i(this.A07);
        c66i4.A09(c66h);
        c66i4.A0A(jvZ);
        c66i4.A06(0.0d);
        c66i4.A07(0.0d);
        c66i4.A06 = true;
        c66i4.A00 = 0.004999999888241291d;
        c66i4.A00 = 0.004999999888241291d;
        this.A0E = c66i4;
        Resources resources = getResources();
        this.A0B = resources.getDimensionPixelOffset(2132279434);
        this.A0L = resources.getDimensionPixelOffset(2132279433);
        this.A0J = resources.getDimensionPixelSize(2132279412);
        this.A0I = resources.getDimensionPixelSize(2132279432);
        this.A09 = resources.getDimensionPixelSize(2132279349);
        this.A0A = resources.getDimensionPixelOffset(2132279369);
        resources.getDimensionPixelOffset(R.dimen.mapbox_minimum_scale_span_when_rotating);
        this.A0K = resources.getDimensionPixelOffset(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
        A0V();
        C66i c66i5 = this.A0G;
        c66i5.A06(c66i5.A01);
        C66i c66i6 = this.A0H;
        c66i6.A06(c66i6.A01);
        C66i c66i7 = this.A0F;
        c66i7.A06(c66i7.A01);
        C66i c66i8 = this.A0E;
        c66i8.A06(c66i8.A01);
        A00(this);
    }

    public static void A00(ChatHeadCloseTargetView chatHeadCloseTargetView) {
        SettableFuture settableFuture = chatHeadCloseTargetView.A04;
        if (settableFuture != null) {
            settableFuture.cancel(false);
            chatHeadCloseTargetView.A04 = null;
        }
    }

    public static void A01(ChatHeadCloseTargetView chatHeadCloseTargetView) {
        if (chatHeadCloseTargetView.A08) {
            chatHeadCloseTargetView.A0M.setAlpha((float) chatHeadCloseTargetView.A0E.A09.A00);
            return;
        }
        double d = 1.0d - chatHeadCloseTargetView.A0E.A09.A00;
        chatHeadCloseTargetView.A0M.setTranslationY((int) (d * r0.getHeight()));
    }

    public static void A02(ChatHeadCloseTargetView chatHeadCloseTargetView, float f, float f2) {
        A00(chatHeadCloseTargetView);
        chatHeadCloseTargetView.A06 = false;
        chatHeadCloseTargetView.A05 = true;
        float width = (f - (chatHeadCloseTargetView.getWidth() / 2)) * 0.1f;
        float max = Math.max(-chatHeadCloseTargetView.A0K, (f2 - ((chatHeadCloseTargetView.getHeight() + chatHeadCloseTargetView.A0B) - (chatHeadCloseTargetView.A0D.getHeight() / 2))) * 0.1f);
        C66i c66i = chatHeadCloseTargetView.A0G;
        c66i.A07(width);
        c66i.A06 = false;
        C66i c66i2 = chatHeadCloseTargetView.A0H;
        c66i2.A07(max);
        c66i2.A06 = false;
        double d = chatHeadCloseTargetView.A0X(f, f2) ? 1.0d : 0.7d;
        chatHeadCloseTargetView.A0N.setVisibility(8);
        boolean z = chatHeadCloseTargetView.A08;
        C66i c66i3 = chatHeadCloseTargetView.A0F;
        if (z) {
            c66i3.A06 = false;
            c66i3.A07(d);
            chatHeadCloseTargetView.A0E.A06 = false;
        } else {
            c66i3.A06(d);
            c66i3.A02();
        }
        chatHeadCloseTargetView.A0E.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r301.A0E.A0C() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(com.facebook.chatheads.view.ChatHeadCloseTargetView r301) {
        /*
            r0 = r301
            X.66i r0 = r0.A0G
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0C()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r301
            X.66i r0 = r0.A0H
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0C()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r301
            X.66i r0 = r0.A0F
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0C()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r301
            X.66i r0 = r0.A0E
            r302 = r0
            r0 = r302
            boolean r0 = r0.A0C()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L3e
        L3a:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L3e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.chatheads.view.ChatHeadCloseTargetView.A03(com.facebook.chatheads.view.ChatHeadCloseTargetView):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.google.common.util.concurrent.ListenableFuture] */
    public ListenableFuture A0V() {
        if (this.A06) {
            Object obj = this.A04;
            if (obj == null) {
                obj = 1hM.A01;
            }
            return obj;
        }
        A00(this);
        this.A05 = false;
        this.A06 = true;
        this.A04 = 4YU.A0j();
        C66i c66i = this.A0G;
        c66i.A07(0.0d);
        c66i.A06 = true;
        C66i c66i2 = this.A0H;
        c66i2.A07(this.A0L);
        c66i2.A06 = true;
        if (this.A08) {
            C66i c66i3 = this.A0F;
            c66i3.A06 = true;
            c66i3.A07(0.7d);
        }
        C66i c66i4 = this.A0E;
        c66i4.A06 = true;
        c66i4.A07(0.0d);
        if (A03(this)) {
            this.A04.set((Object) null);
        }
        return this.A04;
    }

    public void A0W(PointF pointF) {
        pointF.getClass();
        View view = this.A0D;
        pointF.set(JQy.A06(view), view.getTop() + (view.getHeight() / 2));
        pointF.offset(view.getTranslationX(), view.getTranslationY());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (r0 < 0.0f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0X(float r302, float r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.getWidth()
            r1 = 2
            int r0 = r0 / r1
            r304 = r0
            r0 = r304
            float r0 = (float) r0
            r305 = r0
            r0 = r302
            r1 = r305
            float r0 = r0 - r1
            r302 = r0
            r0 = r301
            int r0 = r0.getHeight()
            r306 = r0
            r0 = r301
            int r0 = r0.A0I
            r307 = r0
            r0 = r306
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
            r0 = r306
            float r0 = (float) r0
            r305 = r0
            r0 = r303
            r1 = r305
            float r0 = r0 - r1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L5d
            r0 = r302
            float r0 = java.lang.Math.abs(r0)
            r308 = r0
            r0 = r301
            int r0 = r0.A0J
            r1 = 2
            int r0 = r0 / r1
            float r0 = (float) r0
            r305 = r0
            r0 = r308
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 >= 0) goto L5d
            r0 = r303
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 >= 0) goto L63
        L5d:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L63:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.chatheads.view.ChatHeadCloseTargetView.A0X(float, float):boolean");
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            A01(this);
        }
    }
}
