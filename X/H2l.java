package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.acra.constants.ActionId;
import com.facebook.widget.CustomRelativeLayout;

/* loaded from: H2l.class */
public abstract class H2l extends 6dL {
    public long A00;
    public HA9 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final GTJ A0B;
    public final GestureDetector A0C;
    public final Hh6 A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H2l(Context context, boolean z) {
        super(context);
        11T.A0F(context, 1);
        Hh6 hh6 = new Hh6();
        this.A0D = hh6;
        this.A0B = new GTJ(this);
        this.A09 = 1Bq.A00(115814);
        this.A08 = 1Bu.A00(99563);
        this.A0A = 1Bq.A00(115867);
        this.A01 = HA9.A04;
        this.A00 = 3000L;
        this.A07 = true;
        A0h(GPl.A00(this, ActionId.ON_VIEW_CREATED_END), GPl.A00(this, 99), GPl.A00(this, ActionId.LEGACY_MARKER), GPl.A00(this, 100), GPl.A00(this, ActionId.DATA_LOAD_START));
        ((CustomRelativeLayout) this).A0C((z && (this instanceof H2j)) ? 2132542154 : A0k());
        this.A06 = true;
        hh6.A03 = ViewConfiguration.get(((View) this).getContext()).getScaledTouchSlop();
        this.A0C = new GestureDetector(context, new GTj(this), AnonymousClass001.A07());
        ((View) this).setAccessibilityDelegate(new GUE(this, this instanceof H2k ? 1 : 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.6UR A00(X.H2l r301) {
        /*
            r0 = r301
            X.6ce r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1a
            r0 = r302
            X.6UR r0 = r0.B3e()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L18
        L14:
            X.6UR r0 = X.6UR.A0B
            r302 = r0
        L18:
            r0 = r302
            return r0
        L1a:
            r0 = r301
            X.GRX r0 = r0.A09
            r303 = r0
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A03
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.A0A
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L14
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r304
            if (r0 == 0) goto L14
            r0 = r303
            r1 = r304
            r2 = r302
            X.6UR r0 = r0.A06(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2l.A00(X.H2l):X.6UR");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r302 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.6U2 A01(X.H2l r301) {
        /*
            r0 = r301
            X.6U2 r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L45
            r0 = r301
            X.6cT r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            com.facebook.video.player.RichVideoPlayer r0 = (com.facebook.video.player.RichVideoPlayer) r0
            X.6U2 r0 = r0.A0I
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L45
        L1e:
            r0 = r301
            X.GRX r0 = r0.A09
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L49
            r0 = r301
            X.6TI r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L47
            r0 = r302
            java.lang.String r0 = r0.A03()
            r304 = r0
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L47
            r0 = r303
            r1 = r302
            r2 = r304
            X.6U2 r0 = r0.A07(r1, r2)
            r302 = r0
        L45:
            r0 = r302
            return r0
        L47:
            r0 = 0
            return r0
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2l.A01(X.H2l):X.6U2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0K() {
        6TN A04;
        6Tu r0 = this.A08;
        if (r0 != null) {
            A04 = r0.B3f();
        } else {
            GRX grx = this.A09;
            A04 = (grx == null || this.A0A == null || this.A03 == null) ? null : grx.A04();
        }
        if ((A04 == 6TN.A09 || A04 == 6TN.A0K || A04 == 6TN.A06) && !A00(this).A00() && this.A01 == HA9.A04) {
            A0n(0L);
            this.A0B.removeMessages(1);
        }
    }

    public void A0M() {
        super.A0M();
        this.A0B.removeMessages(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        if (r0.A0U == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.A0e(r1, r2)
            r0 = r303
            if (r0 == 0) goto L8f
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L99
            java.lang.String r0 = "PlayerBehaviors"
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            r304 = r0
        L23:
            r0 = r304
            boolean r0 = r0 instanceof X.GRI
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L90
            r0 = r304
            X.GRI r0 = (X.GRI) r0
            r304 = r0
            X.I2H r0 = X.I2H.A07
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.Object r0 = r0.A00(r1)
            r305 = r0
            r0 = r305
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r306 = r0
        L47:
            r0 = r301
            r1 = r306
            r0.A03 = r1
            r0 = r301
            r1 = 0
            r0.A02 = r1
            r0 = 0
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r301
            r1 = r307
            r2 = r306
            r0.A0o(r1, r2)
            X.HA9 r0 = X.HA9.A04
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A01 = r1
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L83
            r0 = r305
            com.facebook.spherical.video.model.SphericalVideoParams r0 = r0.A0U
            r304 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            if (r0 != 0) goto L89
        L83:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L89:
            r0 = r301
            r1 = r306
            r0.A05 = r1
        L8f:
            return
        L90:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L47
        L99:
            r0 = 0
            r304 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2l.A0e(X.6TI, boolean):void");
    }

    public int A0k() {
        return this instanceof H2k ? 2132541799 : 2132542153;
    }

    public void A0l() {
        HA9 ha9 = this.A01;
        if (ha9 == HA9.A04 || ha9 == HA9.A03) {
            GTJ gtj = this.A0B;
            gtj.removeMessages(1);
            gtj.sendEmptyMessageDelayed(1, this.A00);
        }
    }

    public final void A0m() {
        HA9 ha9 = this.A01;
        if (ha9 != HA9.A04 && ha9 != HA9.A03) {
            throw AnonymousClass001.A0N("State should be AUTO or ALWAYS_VISIBLE_UNTIL_CLICKED");
        }
        this.A0B.removeMessages(1);
        A0n(500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0n(long j) {
        if (this.A06 || this.A03) {
            return;
        }
        this.A06 = true;
        GOq.A0P(this).setDuration(j).setInterpolator(((GQX) 1Br.A0B(this.A09)).A00).setListener(new GSD(this, 20)).start();
        6U2 r0 = this.A06;
        if (r0 != null) {
            r0.A06(new C6dz(0S2.A01));
            r0.A06(new C6cl(this.A06, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0o(long j, boolean z) {
        if (this.A06) {
            this.A06 = false;
            GOq.A0O(this).setDuration(j).setInterpolator(((GQX) 1Br.A0B(this.A09)).A00).setStartDelay(0L).setListener(new GS7(this, 0)).start();
            6U2 r0 = this.A06;
            if (r0 != null) {
                r0.A06(new C6dz(0S2.A00));
                r0.A06(new C6cl(this.A06));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        if (this.A06) {
            return super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        boolean dispatchTouchEvent = super/*android.view.ViewGroup*/.dispatchTouchEvent(motionEvent);
        if (A00(this) != 6UR.A06) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if ((action == 1 || action == 3) && this.A06) {
                    A0l();
                    return dispatchTouchEvent;
                }
            } else if (dispatchTouchEvent && this.A06) {
                this.A0B.removeMessages(1);
                return dispatchTouchEvent;
            }
        }
        return dispatchTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        if (this.A06) {
            return super/*android.view.ViewGroup*/.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y;
        int i;
        int A05 = 0FI.A05(-163110255);
        int i2 = 0;
        11T.A0F(motionEvent, 0);
        Hh6 hh6 = this.A0D;
        MotionEvent motionEvent2 = motionEvent;
        if ((!hh6.A04) && motionEvent.getAction() != 0) {
            motionEvent2 = MotionEvent.obtain(motionEvent);
            motionEvent2.setAction(0);
        }
        int action = motionEvent2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent2.findPointerIndex(hh6.A02);
                    if (findPointerIndex >= 0 && findPointerIndex < motionEvent2.getPointerCount()) {
                        motionEvent2.getX(findPointerIndex);
                        motionEvent2.getY(findPointerIndex);
                    }
                } else if (action != 3) {
                    if (action == 6) {
                        int actionIndex = motionEvent2.getActionIndex();
                        if (motionEvent2.getPointerId(actionIndex) == hh6.A02) {
                            i2 = AnonymousClass001.A1O(actionIndex) ? 1 : 0;
                            hh6.A00 = motionEvent2.getX(i2);
                            y = motionEvent2.getY(i2);
                        }
                    }
                }
                this.A0C.onTouchEvent(motionEvent);
                0FI.A0B(-571213227, A05);
                return true;
            }
            hh6.A04 = false;
            i = -1;
            float f = 0.0f / 0.0f;
            hh6.A02 = i;
            this.A0C.onTouchEvent(motionEvent);
            0FI.A0B(-571213227, A05);
            return true;
        }
        hh6.A04 = true;
        hh6.A00 = motionEvent2.getX();
        y = motionEvent2.getY();
        hh6.A01 = y;
        i = motionEvent2.getPointerId(i2);
        hh6.A02 = i;
        this.A0C.onTouchEvent(motionEvent);
        0FI.A0B(-571213227, A05);
        return true;
    }
}
