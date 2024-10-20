package com.facebook.messaging.rtc.incall.impl.notification;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1YC;
import X.AnonymousClass001;
import X.C1Y6;
import X.DKC;
import X.GOn;
import X.GfT;
import X.Gpg;
import X.Gr7;
import X.HBr;
import X.HEt;
import X.HG7;
import X.HVq;
import X.I8a;
import X.IDw;
import X.IFk;
import X.IYG;
import X.JOI;
import X.JPV;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions.PromotionNotificationFeature;
import com.facebook.widget.CustomFrameLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: NotificationView.class */
public final class NotificationView extends CustomFrameLayout implements JPV {
    public float A00;
    public GestureDetector A01;
    public 1Iw A02;
    public LithoView A03;
    public Gr7 A04;
    public boolean A05;
    public boolean A06;
    public final Rect A07;
    public final 1Br A08;
    public final int[] A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A08 = 1Bu.A01(getContext(), 16980);
        int[] A1b = GOn.A1b();
        A1b[0] = 0;
        A1b[1] = 0;
        this.A09 = A1b;
        this.A07 = DKC.A0C();
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A08 = 1Bu.A01(getContext(), 16980);
        int[] A1b = GOn.A1b();
        A1b[0] = 0;
        A1b[1] = 0;
        this.A09 = A1b;
        this.A07 = DKC.A0C();
        A00();
    }

    private final void A00() {
        1Bn.A0A(85163);
        FbUserSession A01 = IDw.A01(this, "NotificationView");
        Context context = getContext();
        this.A04 = new Gr7(A01, context);
        this.A02 = new 1Iw(context);
        float dimension = context.getResources().getDimension(2132279412);
        this.A00 = dimension;
        this.A01 = new GestureDetector(context, (GestureDetector.OnGestureListener) new GfT(this, dimension));
    }

    public static final void A01(NotificationView notificationView) {
        Gr7 gr7 = notificationView.A04;
        if (gr7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        HVq hVq = gr7.A01;
        if (hVq != null) {
            IFk iFk = hVq.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = iFk.A0Y;
            r0.A08("com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDismiss", andIncrement);
            Exception e = null;
            try {
                if (IFk.A0B(iFk)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement2, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDismiss");
                    try {
                        try {
                            PromotionNotificationFeature promotionNotificationFeature = iFk.A0A;
                            IYG iyg = (JOI) 1Br.A0B(promotionNotificationFeature.A02);
                            HBr hBr = promotionNotificationFeature.A01;
                            IYG iyg2 = iyg;
                            11T.A0F(hBr, 0);
                            for (HG7 hg7 : iyg2.A0B) {
                                if (hg7 instanceof Gpg) {
                                    Gpg gpg = (Gpg) hg7;
                                    if (7 - gpg.A00 == 0) {
                                        I8a i8a = ((HEt) gpg.A01).A00;
                                        if (i8a != null && i8a.A03(hBr)) {
                                            i8a.A00.A0d();
                                        }
                                    }
                                }
                            }
                            r0.A09("messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDismiss", andIncrement2);
                        } catch (Exception e2) {
                            e = e2;
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04(e, "messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDismiss", andIncrement2);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDismiss", andIncrement);
            } catch (Throwable th2) {
                r0.A02(e, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDismiss", andIncrement);
                throw th2;
            }
        }
        Gr7 gr72 = notificationView.A04;
        if (gr72 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        gr72.A0d();
    }

    public final void A0V(long j) {
        animate().setDuration(j).alpha(1.0f).translationY(0.0f).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x02a6, code lost:
    
        if (r317 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x035a, code lost:
    
        if (r313 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.notification.NotificationView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1792205576);
        super.onAttachedToWindow();
        Gr7 gr7 = this.A04;
        if (gr7 != null) {
            gr7.A0Y(this);
            0FI.A0C(1607299493, A06);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A0C(931073712, A06);
            throw A0h;
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1540986263);
        Gr7 gr7 = this.A04;
        if (gr7 == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A0C(2038987535, A06);
            throw A0h;
        }
        gr7.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(506921080, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        if (r0.onTouchEvent(r302) != true) goto L30;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.notification.NotificationView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
