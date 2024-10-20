package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.SimpleVariableTextLayoutView;
import java.util.Random;

/* loaded from: H5l.class */
public final class H5l extends CustomRelativeLayout {
    public static final 1G2 A0h = 1G3.A00(1G0.A04, "youth_audio_recording_first_time_press");
    public static final C66h A0i = C66h.A03(100.0d, 7.0d);
    public static final Random A0j = new Random(1408665074);
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public Animation A06;
    public 1Im A07;
    public C66i A08;
    public C66i A09;
    public C66i A0A;
    public C66i A0B;
    public C66i A0C;
    public C66i A0D;
    public C1pl A0E;
    public Integer A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final 1Br A0T;
    public final 1Br A0U;
    public final 1Br A0V;
    public final 1Br A0W;
    public final FbTextView A0X;
    public final FbTextView A0Y;
    public final SimpleVariableTextLayoutView A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final float[] A0g;

    /* JADX WARN: Type inference failed for: r0v27, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View, com.facebook.widget.text.SimpleVariableTextLayoutView] */
    public H5l(Context context) {
        super(context);
        String str;
        this.A0U = 7zM.A0d();
        this.A0T = 1Bq.A00(131273);
        this.A0W = 1Bu.A00(49939);
        this.A0V = 1BK.A0E();
        this.A0F = 0S2.A00;
        this.A0g = new float[2];
        Resources resources = getResources();
        this.A02 = 7zL.A01(resources, 2132279381);
        this.A01 = 7zL.A01(resources, 2132279380);
        A0C(2132541533);
        ?? A0X = GOo.A0X(this, 2131362138);
        this.A0X = A0X;
        ?? A0X2 = GOo.A0X(this, 2131362157);
        this.A0Y = A0X2;
        this.A0R = C09s.A01(this, 2131362156);
        ?? r0 = (SimpleVariableTextLayoutView) C09s.A01(this, 2131362135);
        this.A0Z = r0;
        this.A0S = C09s.A01(this, 2131362154);
        this.A0Q = C09s.A01(this, 2131366874);
        this.A0P = C09s.A01(this, 2131362159);
        IKm.A00((View) r0, this, 15);
        C2rp.A01(r0);
        this.A0E = new H0T(this, 2);
        this.A0d = 1BK.A0u(context, 2131952951);
        this.A0a = 1BK.A0u(context, 2131952952);
        this.A0f = 1BK.A0u(context, 2131952935);
        this.A0c = 1BK.A0u(context, 2131952956);
        this.A0b = 1BK.A0u(context, 2131952957);
        this.A0e = 1BK.A0u(context, 2131952955);
        this.A0N = context.getColor(2132213811);
        this.A0O = -1;
        this.A0M = context.getColor(2132214412);
        C66i A0W = AbstractC2326GOr.A0W(this.A0W);
        C66h c66h = A0i;
        A0W.A09(c66h);
        this.A09 = A0W;
        C66i A0W2 = AbstractC2326GOr.A0W(this.A0W);
        A0W2.A09(c66h);
        this.A0D = A0W2;
        C66i A0W3 = AbstractC2326GOr.A0W(this.A0W);
        A0W3.A09(c66h);
        this.A08 = A0W3;
        C66i A0W4 = AbstractC2326GOr.A0W(this.A0W);
        A0W4.A09(c66h);
        this.A0C = A0W4;
        C66i A0W5 = AbstractC2326GOr.A0W(this.A0W);
        A0W5.A09(c66h);
        this.A0B = A0W5;
        C66i A0W6 = AbstractC2326GOr.A0W(this.A0W);
        A0W6.A09(c66h);
        this.A0A = A0W6;
        C66i c66i = this.A09;
        if (c66i == null) {
            str = "redSpring";
        } else {
            c66i.A0A(new QTn(this));
            C66i c66i2 = this.A0D;
            if (c66i2 != null) {
                c66i2.A0A(new QTq(this));
                C66i c66i3 = this.A08;
                if (c66i3 != null) {
                    c66i3.A0A(new QTm(this));
                    C66i c66i4 = this.A0C;
                    if (c66i4 == null) {
                        str = "volumeIndicatorSpring";
                    } else {
                        c66i4.A0A(new QTp(this));
                        C66i c66i5 = this.A0B;
                        if (c66i5 != null) {
                            c66i5.A0A(new QTs(this));
                            C66i c66i6 = this.A0A;
                            if (c66i6 != null) {
                                c66i6.A0A(new QTo(this));
                                C66i c66i7 = this.A0A;
                                if (c66i7 != null) {
                                    GOq.A1I(c66i7);
                                    C66i c66i8 = this.A08;
                                    if (c66i8 != null) {
                                        c66i8.A03();
                                        c66i8.A02();
                                        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);
                                        11T.A0A(loadAnimation);
                                        this.A06 = loadAnimation;
                                        A00((TextView) A0X2, this, 0);
                                        A00((TextView) A0X, this, 0);
                                        return;
                                    }
                                }
                            }
                            11T.A0L("timerSizeSpring");
                            throw 0Q8.createAndThrow();
                        }
                        str = "timerSpring";
                    }
                }
                11T.A0L("recordButtonSpring");
                throw 0Q8.createAndThrow();
            }
            str = "whiteSpring";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A00(TextView textView, H5l h5l, int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        textView.setText(StringFormatUtil.formatStrLocaleSafe("%d:%02d", valueOf, valueOf2));
        StringBuilder A0k = AnonymousClass001.A0k();
        if (i2 > 0) {
            AbG.A1F(h5l.getResources(), A0k, 2131952948);
            A0k.append(" ");
        }
        textView.setContentDescription(AnonymousClass001.A0d(h5l.getResources().getQuantityString(2131820563, i3, valueOf2), A0k));
    }

    public static final void A01(H5l h5l) {
        if (h5l.A00 == 0.0d) {
            int width = h5l.getWidth();
            int height = h5l.getHeight();
            h5l.A00 = (Math.sqrt((width * width) + (height * height)) / h5l.A0Z.getWidth()) + 1.0d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (((int) (X.1Br.A00(r301.A0U) - r301.A05)) > 2000) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(X.H5l r301) {
        /*
            r0 = r301
            boolean r0 = r0.A0G
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L30
            r0 = r301
            X.1Br r0 = r0.A0U
            r303 = r0
            r0 = r303
            long r0 = X.1Br.A00(r0)
            r304 = r0
            r0 = r301
            long r0 = r0.A05
            r306 = r0
            r0 = r304
            r1 = r306
            long r0 = r0 - r1
            r304 = r0
            r0 = r304
            int r0 = (int) r0
            r308 = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            r309 = r0
            r0 = 1
            r302 = r0
            r0 = r308
            r1 = r309
            if (r0 <= r1) goto L34
        L30:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L34:
            r0 = 8
            r308 = r0
            r0 = r301
            com.facebook.resources.ui.FbTextView r0 = r0.A0X
            r310 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r301
            int r0 = r0.A0M
            r302 = r0
            r0 = r310
            r1 = r302
            r0.setTextColor(r1)
            r0 = r301
            java.lang.String r0 = r0.A0e
            r303 = r0
            r0 = r310
            r1 = r303
            r0.setText(r1)
            r0 = r310
            r1 = 0
            r0.setVisibility(r1)
            r0 = r301
            android.view.View r0 = r0.A0R
            r1 = r308
            r0.setVisibility(r1)
            return
        L68:
            r0 = r301
            int r0 = r0.A0O
            r302 = r0
            r0 = r310
            r1 = r302
            r0.setTextColor(r1)
            r0 = r310
            r1 = r308
            r0.setVisibility(r1)
            r0 = r301
            android.view.View r0 = r0.A0R
            r1 = 0
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5l.A02(X.H5l):void");
    }

    public static final void A03(H5l h5l) {
        A05(h5l);
        A06(h5l);
        h5l.A0R.setVisibility(0);
        2OB r0 = h5l.A0X;
        r0.setTextColor(h5l.A0O);
        r0.setText(h5l.A0f);
        h5l.A0Y.setTextColor(h5l.A0N);
    }

    public static final void A04(H5l h5l) {
        String str;
        A05(h5l);
        A07(h5l);
        C66i c66i = h5l.A0B;
        if (c66i == null) {
            str = "timerSpring";
        } else {
            DP1 dp1 = h5l.A0Z;
            c66i.A07(dp1.getTop() + AbstractC2327GOs.A03(h5l.A0R, dp1.getHeight()));
            C66i c66i2 = h5l.A0A;
            if (c66i2 != null) {
                c66i2.A04();
                2OB r0 = h5l.A0X;
                r0.setVisibility(0);
                r0.setTextColor(h5l.A0N);
                r0.setText(h5l.A0a);
                h5l.A0Y.setTextColor(h5l.A0O);
                dp1.A07("");
                return;
            }
            str = "timerSizeSpring";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A05(H5l h5l) {
        C62l c62l = (C62l) 1Br.A0B(h5l.A0T);
        C1pl c1pl = h5l.A0E;
        if (c1pl == null) {
            11T.A0L("frameCallback");
            throw 0Q8.createAndThrow();
        }
        c62l.CeK(c1pl);
    }

    public static final void A06(H5l h5l) {
        String str;
        A01(h5l);
        h5l.A0R.setVisibility(0);
        C66i c66i = h5l.A0B;
        if (c66i == null) {
            str = "timerSpring";
        } else {
            DP1 dp1 = h5l.A0Z;
            c66i.A07(dp1.getTop() + AbstractC2327GOs.A03(r0, dp1.getHeight()));
            C66i c66i2 = h5l.A0A;
            if (c66i2 == null) {
                str = "timerSizeSpring";
            } else {
                c66i2.A04();
                dp1.setVisibility(4);
                h5l.A0Q.setVisibility(0);
                C66i c66i3 = h5l.A09;
                str = "redSpring";
                if (c66i3 != null) {
                    c66i3.A06 = false;
                    c66i3.A07(h5l.A00);
                    h5l.A0S.setVisibility(0);
                    C66i c66i4 = h5l.A0D;
                    if (c66i4 != null) {
                        c66i4.A04();
                        2OB r0 = h5l.A0X;
                        r0.setTextColor(h5l.A0O);
                        CharSequence charSequence = h5l.A0f;
                        r0.setText(charSequence);
                        r0.setVisibility(0);
                        C2cd.A05(h5l, charSequence);
                        return;
                    }
                    str = "whiteSpring";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.facebook.widget.text.SimpleVariableTextLayoutView] */
    public static final void A07(H5l h5l) {
        ?? r0 = h5l.A0Z;
        r0.setVisibility(0);
        r0.A08(h5l.A0d);
        C66i c66i = h5l.A09;
        String str = "redSpring";
        if (c66i != null) {
            c66i.A06 = true;
            c66i.A07(0.0d);
            C66i c66i2 = h5l.A0D;
            if (c66i2 == null) {
                str = "whiteSpring";
            } else {
                c66i2.A07(0.0d);
                C66i c66i3 = h5l.A0B;
                if (c66i3 == null) {
                    str = "timerSpring";
                } else {
                    c66i3.A07(AbstractC2327GOs.A03(h5l.A0R, r0.getTop()));
                    C66i c66i4 = h5l.A0A;
                    if (c66i4 != null) {
                        c66i4.A07(0.0d);
                        A02(h5l);
                        return;
                    }
                    str = "timerSizeSpring";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final boolean A08(MotionEvent motionEvent, View view, H5l h5l) {
        Rect A0C = DKC.A0C();
        int[] A1b = GOn.A1b();
        view.getHitRect(A0C);
        view.getLocationOnScreen(A1b);
        A0C.offsetTo(A1b[0], A1b[1]);
        if (!h5l.A0H) {
            return A0C.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        9hB r0 = (9hB) 1Bi.A03(67771);
        float[] fArr = h5l.A0g;
        r0.A00(motionEvent, view, fArr);
        return A0C.contains((int) fArr[0], (int) fArr[1]);
    }

    public final void A0D(double d) {
        C66i c66i = this.A0C;
        if (c66i == null) {
            11T.A0L("volumeIndicatorSpring");
            throw 0Q8.createAndThrow();
        }
        double nextDouble = d >= 250.0d ? 0.25d * (0.10000000149011612d + ((0.5d - A0j.nextDouble()) * 0.05000000074505806d)) : 0.0d;
        c66i.A07(Math.min(Math.max(nextDouble, 1.0d), Math.max(Math.min(nextDouble, 1.0d), d / 12000.0d)));
    }
}
