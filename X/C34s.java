package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.resources.ui.FbView;
import com.facebook.widget.FbImageView;
import java.util.List;
import java.util.Random;

/* renamed from: X.34s, reason: invalid class name */
/* loaded from: 34s.class */
public final class C34s extends 1pK implements 1lN, C2vj, 1vZ {
    public static final java.util.Map A0x;
    public static final java.util.Map A0y;
    public static final java.util.Map A0z;
    public static final java.util.Map A10;
    public static final String __redex_internal_original_name = "EmojiPongFragment";
    public float A00;
    public float A01;
    public float A03;
    public int A04;
    public Vibrator A05;
    public FbUserSession A06;
    public 1pI A07;
    public LithoView A08;
    public LithoView A09;
    public LithoView A0A;
    public LithoView A0B;
    public LithoView A0C;
    public LithoView A0D;
    public LithoView A0E;
    public LithoView A0F;
    public LithoView A0G;
    public LithoView A0H;
    public ThreadSummary A0I;
    public 64W A0J;
    public MigColorScheme A0K;
    public MigColorScheme A0L;
    public MigColorScheme A0M;
    public FbFrameLayout A0N;
    public FbFrameLayout A0O;
    public FbTextView A0P;
    public FbTextView A0Q;
    public FbTextView A0R;
    public FbTextView A0S;
    public FbView A0T;
    public FbImageView A0U;
    public FbImageView A0V;
    public 2Of A0W;
    public String A0Y;
    public String A0Z;
    public boolean A0d;
    public 3EW A0f;
    public final ValueAnimator A0g;
    public final ValueAnimator A0h;
    public final ValueAnimator A0i;
    public final ValueAnimator A0j;
    public final ValueAnimator A0k;
    public final C01i A0t;
    public final C01i A0u;
    public final C01i A0v;
    public final C01i A0w;
    public final 1Br A0m = 1BK.A0E();
    public final 1Br A0n = 1Bq.A00(16839);
    public final 1Br A0q = 1Bq.A00(49322);
    public final 1Br A0o = 1Bq.A00(16766);
    public final 1Br A0p = 1Bq.A00(16973);
    public final 1Br A0l = 1Bu.A00(68449);
    public final Random A0s = new Random();
    public String A0a = "";
    public String A0b = "";
    public float A02 = 1.0f;
    public float A0e = -1.0f;
    public List A0c = C0ty.A00;
    public final List A0r = AnonymousClass001.A0s();
    public Integer A0X = 0;

    static {
        Float valueOf = Float.valueOf(1.3f);
        A0z = 04R.A09(new 03Y[]{1BK.A1G("��", valueOf), 1BK.A1G("��", valueOf), 1BK.A1G("��", Float.valueOf(1.2f)), 1BK.A1G("��", Float.valueOf(0.8f))});
        A0y = 04R.A09(new 03Y[]{1BK.A1G("��", Float.valueOf(3.0f)), 1BK.A1G("��", Float.valueOf(5.0f)), 1BK.A1G("��", Float.valueOf(2.0f))});
        03Y[] r0 = new 03Y[30];
        boolean A1W = 1BK.A1W(new 03Y[]{1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��️", "⛈️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��")}, r0);
        System.arraycopy(new 03Y[]{1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��")}, A1W ? 1 : 0, r0, 27, 3);
        A0x = 04R.A09(r0);
        03Y[] r02 = new 03Y[ActionId.MISSED_EVENT];
        System.arraycopy(new 03Y[]{1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("⛹️", "��"), 1BK.A1G("⛹��", "��"), 1BK.A1G("⛹��", "��"), 1BK.A1G("⛹��", "��"), 1BK.A1G("⛹��", "��"), 1BK.A1G("⛹��", "��"), 1BK.A1G("⛹️\u200d♀️", "��"), 1BK.A1G("⛹��\u200d♀️", "��"), 1BK.A1G("⛹��\u200d♀️", "��"), 1BK.A1G("⛹��\u200d♀️", "��"), 1BK.A1G("⛹��\u200d♀️", "��"), 1BK.A1G("⛹��\u200d♀️", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��")}, A1W ? 1 : 0, r02, A1W ? 1 : 0, 27);
        System.arraycopy(new 03Y[]{new 03Y("��", "��"), 1BK.A1G("��️", "��"), 1BK.A1G("��", "❤️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "⚙️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "❄️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��")}, A1W ? 1 : 0, r02, 27, 27);
        System.arraycopy(new 03Y[]{1BK.A1G("��\u200d��", "��"), 1BK.A1G("��\u200d��", "��"), 1BK.A1G("��\u200d��", "��"), 1BK.A1G("��\u200d��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "��"), 1BK.A1G("��\u200d♀️", "��"), 1BK.A1G("��\u200d♂️", "��"), 1BK.A1G("��", "⚡"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), new 03Y("❄️", "❄️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✨"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "•")}, A1W ? 1 : 0, r02, 54, 27);
        System.arraycopy(new 03Y[]{1BK.A1G("☠️", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��\u200d��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "⭐️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "❤️"), 1BK.A1G("��", "❤️"), 1BK.A1G("��", "��"), 1BK.A1G("��", "✦"), 1BK.A1G("����\u200d��", "��"), 1BK.A1G("����\u200d��", "��"), 1BK.A1G("����\u200d��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "龙"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��\u200d��", "��"), 1BK.A1G("��", "��")}, A1W ? 1 : 0, r02, 81, 27);
        System.arraycopy(new 03Y[]{1BK.A1G("��", "❤️"), 1BK.A1G("����", "��"), 1BK.A1G("��", "��"), 1BK.A1G("��", "��")}, A1W ? 1 : 0, r02, 108, 4);
        A10 = 04R.A09(r02);
    }

    public C34s() {
        C03i c03i = C03i.A02;
        this.A0w = C01g.A00(c03i, new AKJ(this, 30));
        this.A0t = C01g.A00(c03i, new AKJ(this, 23));
        this.A0v = C01g.A00(c03i, new AKJ(this, 27));
        this.A0u = C01g.A00(c03i, new AKJ(this, 26));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        11T.A0A(duration);
        duration.setInterpolator(new LinearInterpolator());
        A06(duration, this, 7);
        duration.addListener(new 9nX(this, new AKJ(this, 28), 1));
        this.A0i = duration;
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        11T.A0A(duration2);
        duration2.setInterpolator(new AccelerateInterpolator());
        A06(duration2, this, 8);
        this.A0j = duration2;
        ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        11T.A0A(duration3);
        duration3.setInterpolator(new LinearInterpolator());
        A06(duration3, this, 2);
        duration3.addListener(new 9nX(this, new AKJ(this, 24), 1));
        this.A0g = duration3;
        ValueAnimator duration4 = ValueAnimator.ofFloat(-2.0f, 2.0f).setDuration(400L);
        11T.A0A(duration4);
        duration4.setInterpolator(new CycleInterpolator(4.0f));
        A06(duration4, this, 10);
        duration4.addListener(new 9nX(this, new AKJ(this, 29), 1));
        this.A0k = duration4;
        ValueAnimator duration5 = ValueAnimator.ofFloat(1.0f, 0.5f).setDuration(200L);
        11T.A0A(duration5);
        duration5.setStartDelay(1200L);
        A06(duration5, this, 3);
        duration5.addListener(new 9nX(this, new AKJ(this, 25), 1));
        this.A0h = duration5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34s.A03():void");
    }

    public static void A06(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new LF5(new C9ne(obj, i), obj, 0));
    }

    public static final void A07(View view) {
        if (view != null) {
            view.setAlpha(0.0f);
            view.setScaleX(0.5f);
            view.setScaleY(0.5f);
            view.setVisibility(0);
            view.animate().setDuration(300L).setInterpolator(new OvershootInterpolator()).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
        }
    }

    public static void A08(LithoView lithoView, C2yv c2yv, 2KF r303, int i) {
        c2yv.A2X(i);
        r303.A0D = Layout.Alignment.ALIGN_CENTER;
        lithoView.A0x(c2yv.A2W());
    }

    public static final void A09(C34s c34s) {
        C3Ss c3Ss = (C3Ss) 1Br.A0B(c34s.A0l);
        C3Ss.A00(98G.A02, c3Ss.A00, 98A.A01, c3Ss, c3Ss.A01, c3Ss.A02);
        A0C(c34s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0A(C34s c34s) {
        View view;
        FbView fbView;
        2OB r0;
        2OB r02;
        2OB r03;
        2OB r04;
        if (c34s.getContext() == null || (view = c34s.mView) == null || (fbView = c34s.A0T) == null || (r0 = c34s.A0P) == null) {
            return;
        }
        float f = c34s.A00;
        float f2 = c34s.A02;
        java.util.Map map = A0z;
        c34s.A00 = f + (f2 * ((int) ((20.0f * (1BK.A0o(c34s.A0a, map) != null ? r0.floatValue() : 1.0f)) + c34s.A04)));
        c34s.A01 = c34s.A01 + (c34s.A0e * ((int) ((20.0f * (1BK.A0o(c34s.A0a, map) != null ? r0.floatValue() : 1.0f)) + c34s.A04)));
        float width = c34s.A00 - (r0.getWidth() / 2);
        float width2 = c34s.A00 + (r0.getWidth() / 2);
        if (width < 0.0f || width2 > view.getWidth()) {
            c34s.A02 *= -1.0f;
            c34s.A00 = width < 0.0f ? r0.getWidth() / 2 : view.getWidth() - (r0.getWidth() / 2);
        }
        if (c34s.A01 - (r0.getHeight() / 2) < 0.0f) {
            c34s.A0e *= -1.0f;
        }
        if (c34s.A01 > fbView.getY()) {
            if (c34s.getContext() != null) {
                2OB r05 = c34s.A0P;
                if (r05 != null) {
                    r05.setVisibility(8);
                }
                if (A0H(c34s) && 1Br.A07(C65h.A02).AZk(36322001553343498L)) {
                    int i = c34s.A04;
                    Integer num = c34s.A0X;
                    if (i <= (num != null ? num.intValue() : 0)) {
                        0K6.A00(c34s.A0k);
                    }
                }
                if (c34s.getContext() != null && (r03 = c34s.A0Q) != null && (r04 = c34s.A0P) != null) {
                    c34s.A03 = r04.getRotation();
                    r03.setX(r04.getX());
                    r03.setY(r04.getY());
                    r03.setAlpha(1.0f);
                    r03.setRotation(c34s.A03);
                    r03.setVisibility(0);
                    0K6.A00(c34s.A0g);
                }
                Vibrator vibrator = c34s.A05;
                if (vibrator != null) {
                    float f3 = 0.0f / 0.0f;
                    I9i.A00(vibrator, -1, 100);
                    return;
                }
                return;
            }
            return;
        }
        if (c34s.A01 + r0.getHeight() >= fbView.getY()) {
            RectF rectF = new RectF(fbView.getX(), fbView.getY(), fbView.getX() + fbView.getWidth(), fbView.getY() + fbView.getHeight());
            RectF rectF2 = new RectF(c34s.A00 - (r0.getWidth() / 2), c34s.A01 - (r0.getHeight() / 2), c34s.A00 + (r0.getWidth() / 2), c34s.A01 + (r0.getHeight() / 2));
            if (c34s.A0e > 0.0f && RectF.intersects(rectF, rectF2)) {
                c34s.A0e *= -1.0f;
                c34s.A04++;
                c34s.A03();
                Vibrator vibrator2 = c34s.A05;
                if (vibrator2 != null) {
                    float f4 = 0.0f / 0.0f;
                    I9i.A00(vibrator2, -1, 30);
                }
                int i2 = c34s.A04;
                if (i2 > 0 && i2 % 5 == 0) {
                    List list = c34s.A0c;
                    A0D(c34s, AnonymousClass001.A03(list.get((i2 / 5) % list.size())));
                }
                2OB r06 = c34s.A0S;
                if (r06 != null) {
                    CharSequence text = r06.getText();
                    11T.A0A(text);
                    if (!0CU.A0O(text)) {
                        r06.setX(c34s.A00 - (r06.getWidth() / 2));
                        r06.setY(c34s.A01 - (r06.getHeight() / 2));
                        r06.setAlpha(1.0f);
                        r06.setVisibility(0);
                        0K6.A00(c34s.A0i);
                        0K6.A00(c34s.A0j);
                    }
                }
                String A0b = AnonymousClass001.A0b(c34s.A0a, A0x);
                if (A0b != null && c34s.A0s.nextFloat() < 0.1f) {
                    c34s.A0a = A0b;
                    2OB r07 = c34s.A0P;
                    if (r07 != null) {
                        r07.setText(A0b);
                    }
                    2OB r08 = c34s.A0Q;
                    if (r08 != null) {
                        r08.setText(c34s.A0a);
                    }
                    CharSequence A0b2 = AnonymousClass001.A0b(c34s.A0a, A10);
                    if (A0b2 != null && (r02 = c34s.A0S) != null) {
                        r02.setText(A0b2);
                    }
                }
                if (11T.A0O(c34s.A0a, "��")) {
                    if (c34s.A0s.nextBoolean()) {
                        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
                        11T.A0A(duration);
                        duration.addUpdateListener(new LF5(new C9ne(c34s, 4), c34s, 0));
                        0K6.A00(duration);
                        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
                        11T.A0A(duration2);
                        duration2.setStartDelay(r0.nextInt(2000) + 500);
                        A06(duration2, c34s, 5);
                        0K6.A00(duration2);
                    }
                }
                if (11T.A0O(c34s.A0a, "��")) {
                    List list2 = c34s.A0c;
                    int A03 = AnonymousClass001.A03(list2.get((c34s.A04 / 5) % list2.size()));
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    Integer valueOf = Integer.valueOf(A03);
                    ValueAnimator duration3 = ValueAnimator.ofObject(argbEvaluator, valueOf, Integer.valueOf(1BL.A07(c34s.A0w)), valueOf).setDuration(200L);
                    11T.A0A(duration3);
                    duration3.addUpdateListener(new LF5(new C9ne(c34s, 6), c34s, 0));
                    0K6.A00(duration3);
                }
            }
        }
        2OB r09 = c34s.A0P;
        if (r09 != null) {
            r09.setX(c34s.A00 - (r09.getWidth() / 2));
            r09.setY(c34s.A01 - (r09.getHeight() / 2));
            r09.setRotation(r09.getRotation() + ((int) ((5.0f * (1BK.A0o(c34s.A0a, A0y) != null ? r0.floatValue() : 1.0f)) + (c34s.A04 * 0.5f))));
        }
        view.postDelayed(new 3fB(c34s), 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.getVisibility() != 8) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0B(X.C34s r301) {
        /*
            r0 = r301
            com.facebook.resources.ui.FbView r0 = r0.A0T
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            int r0 = r0.getVisibility()
            r303 = r0
            r0 = 8
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L1e
        L19:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L1e:
            r0 = r305
            r1 = 1
            r0 = r0 ^ r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L70
            r0 = r301
            java.util.List r0 = r0.A0c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            int r0 = X.AnonymousClass001.A03(r0)
            r304 = r0
            r0 = r301
            java.util.List r0 = r0.A0c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r302 = r0
            r0 = r302
            int r0 = X.AnonymousClass001.A03(r0)
            r305 = r0
        L46:
            r0 = r301
            r1 = r303
            r0.A0F(r1)
            r0 = r301
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6f
            r0 = r306
            android.view.Window r0 = r0.getWindow()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6f
            r0 = r306
            r1 = r304
            X.1tJ.A06(r0, r1)
            r0 = r306
            r1 = r305
            X.C2yk.A00(r0, r1)
        L6f:
            return
        L70:
            r0 = r301
            X.01i r0 = r0.A0u
            int r0 = X.1BL.A07(r0)
            r304 = r0
            r0 = r301
            X.01i r0 = r0.A0v
            r302 = r0
            r0 = r302
            int r0 = X.1BL.A07(r0)
            r305 = r0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34s.A0B(X.34s):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(C34s c34s) {
        View view;
        LithoView lithoView;
        Drawable drawable;
        if (c34s.getContext() == null || (view = c34s.mView) == null) {
            return;
        }
        c34s.A0c = C13m.A1A(c34s.A0c);
        c34s.A04 = 0;
        c34s.A03();
        LithoView lithoView2 = c34s.A0B;
        if (lithoView2 != null) {
            lithoView2.setVisibility(0);
        }
        Random random = c34s.A0s;
        float f = 1.0f;
        float nextFloat = ((random.nextFloat() * 0.5f) + 1.0f) - 0.25f;
        if (!random.nextBoolean()) {
            f = -1.0f;
        }
        c34s.A02 = nextFloat * f;
        c34s.A0e = ((random.nextFloat() * 0.5f) - 1.0f) - 0.25f;
        c34s.A00 = ((view.getWidth() / 2.0f) + random.nextInt(10)) - 5.0f;
        c34s.A01 = ((view.getHeight() / 2.0f) + random.nextInt(10)) - 5.0f;
        2OB r0 = c34s.A0P;
        if (r0 != null) {
            r0.setVisibility(0);
        }
        FbView fbView = c34s.A0T;
        if (fbView != null) {
            fbView.setVisibility(0);
        }
        FbImageView fbImageView = c34s.A0V;
        if (fbImageView != null) {
            fbImageView.setVisibility(8);
        }
        LithoView lithoView3 = c34s.A0G;
        if (lithoView3 != null) {
            lithoView3.setVisibility(8);
        }
        LithoView lithoView4 = c34s.A08;
        if (lithoView4 != null) {
            lithoView4.setVisibility(8);
        }
        LithoView lithoView5 = c34s.A0H;
        if (lithoView5 != null) {
            lithoView5.setVisibility(8);
        }
        LithoView lithoView6 = c34s.A0C;
        if (lithoView6 != null) {
            lithoView6.setVisibility(8);
        }
        LithoView lithoView7 = c34s.A0F;
        if (lithoView7 != null) {
            lithoView7.setVisibility(8);
        }
        LithoView lithoView8 = c34s.A0H;
        if (lithoView8 != null) {
            lithoView8.setVisibility(8);
        }
        LithoView lithoView9 = c34s.A09;
        if (lithoView9 != null) {
            lithoView9.setVisibility(8);
        }
        LithoView lithoView10 = c34s.A0H;
        if (lithoView10 != null) {
            lithoView10.A0x(null);
        }
        A0D(c34s, AnonymousClass001.A03(c34s.A0c.get(0)));
        FbImageView fbImageView2 = c34s.A0U;
        if (fbImageView2 != null && (drawable = fbImageView2.getDrawable()) != null) {
            drawable.setTint(1BL.A07(c34s.A0t));
        }
        A0E(c34s, C1u7.A08);
        if (A0H(c34s) && (lithoView = c34s.A0A) != null) {
            C2yv A00 = 2KF.A00(lithoView.A09);
            A00.A2Y(1BK.A0v(lithoView.getContext(), c34s.A0X, 2131956388));
            2KE r02 = 2KE.A0C;
            1Iw r03 = lithoView.A09;
            11T.A0A(r03);
            MigColorScheme migColorScheme = c34s.A0K;
            if (migColorScheme != null) {
                Typeface A002 = 2KK.A00(r03, migColorScheme, r02);
                2KF r04 = A00.A01;
                r04.A0C = A002;
                r04.A02 = 22.0f;
                MigColorScheme migColorScheme2 = c34s.A0K;
                if (migColorScheme2 != null) {
                    int B4i = migColorScheme2.B4i();
                    if (c34s.A0K != null) {
                        A08(lithoView, A00, r04, 1tG.A05(B4i, (int) (0.25f * ((r0.B4i() >> 24) & 255))));
                        lithoView.setAlpha(1.0f);
                        lithoView.setVisibility(0);
                    }
                }
            }
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        String str = c34s.A0b;
        c34s.A0a = str;
        2OB r05 = c34s.A0P;
        if (r05 != null) {
            r05.setText(str);
        }
        A0B(c34s);
        if (c34s.mView != null) {
            ValueAnimator duration = ValueAnimator.ofFloat(r0.getWidth() / 4.0f, r0.getWidth() / 2.0f).setDuration(500L);
            11T.A0A(duration);
            duration.setInterpolator(new OvershootInterpolator());
            duration.addUpdateListener(new LF5(new C9ne(c34s, 9), c34s, 0));
            0K6.A00(duration);
        }
        Vibrator vibrator = c34s.A05;
        if (vibrator != null) {
            float f2 = 0.0f / 0.0f;
            I9i.A00(vibrator, -1, 100);
        }
        view.postDelayed(new 3fC(c34s), 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0D(C34s c34s, int i) {
        Window window;
        View view = c34s.mView;
        if (view != null) {
            view.setBackground(new ColorDrawable(i));
        }
        FragmentActivity activity = c34s.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        1tJ.A06(window, i);
        C2yk.A00(window, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0E(C34s c34s, C1p8 c1p8) {
        LithoView lithoView = c34s.A0E;
        if (lithoView != null) {
            2KD A01 = 2K3.A01(lithoView.A09, 0);
            String string = c34s.getString(2131956376, StringFormatUtil.formatStrLocaleSafe("%03d", Integer.valueOf(1Br.A09(c34s.A0m).ArU(1NK.A4e, 0))));
            11T.A0A(string);
            A01.A2z(string);
            A01.A2g();
            A01.A2w(c1p8);
            MigColorScheme migColorScheme = c34s.A0K;
            if (migColorScheme == null) {
                11T.A0L("colorScheme");
                throw 0Q8.createAndThrow();
            }
            A01.A2x(migColorScheme);
            lithoView.A0x(A01.A2W());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A0F(boolean z) {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        C0T0 c0t0 = new C0T2(window.getDecorView(), window).A00;
        c0t0.A04(z);
        c0t0.A03(z);
    }

    private final boolean A0G() {
        boolean z = false;
        if (!C65h.A04.A09() && ((this.A0d && 1Br.A07(C65h.A02).AZk(36322001552884739L)) || (!this.A0d && 1Br.A07(C65h.A02).AZk(36322001552950276L)))) {
            z = true;
        }
        return z;
    }

    public static final boolean A0H(C34s c34s) {
        String str = c34s.A0Y;
        boolean z = false;
        if (str != null && str.length() != 0 && 3EW.A01 == c34s.A0f) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r308 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34s.A1S(android.os.Bundle):void");
    }

    public String AWg() {
        return 3EW.A01 == this.A0f ? "emoji_pong_grid_messenger" : "emoji_pong_messenger";
    }

    public Long Am7() {
        return 184570512895732L;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(559501789);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542033, viewGroup, false);
        11T.A0A(inflate);
        0FI.A08(1183655456, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(427911079);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        MigColorScheme migColorScheme = this.A0M;
        if (migColorScheme == null) {
            11T.A0L("colorSchemeSelected");
            throw 0Q8.createAndThrow();
        }
        A0F(migColorScheme instanceof LightColorScheme);
        this.A0T = null;
        this.A0P = null;
        this.A0S = null;
        this.A0B = null;
        this.A0E = null;
        this.A0Q = null;
        FbFrameLayout fbFrameLayout = this.A0O;
        if (fbFrameLayout != null) {
            fbFrameLayout.removeAllViews();
        }
        this.A0O = null;
        FbFrameLayout fbFrameLayout2 = this.A0N;
        if (fbFrameLayout2 != null) {
            fbFrameLayout2.removeAllViews();
        }
        this.A0N = null;
        this.A0R = null;
        this.A0U = null;
        this.A0V = null;
        this.A0G = null;
        this.A08 = null;
        this.A0H = null;
        this.A0D = null;
        this.A0C = null;
        this.A0F = null;
        this.A0W = null;
        this.A0A = null;
        this.A09 = null;
        0FI.A08(1383584226, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1168084827);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A0B(this);
        0FI.A08(684792524, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0646, code lost:
    
        if (r307 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0b33, code lost:
    
        if (r307 == null) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05e9  */
    /* JADX WARN: Type inference failed for: r0v600, types: [com.facebook.litho.LithoView] */
    /* JADX WARN: Type inference failed for: r0v620, types: [com.facebook.litho.LithoView] */
    /* JADX WARN: Type inference failed for: r0v625, types: [com.facebook.litho.LithoView] */
    /* JADX WARN: Type inference failed for: r1v135, types: [com.facebook.litho.LithoView] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r1v47, types: [com.facebook.resources.ui.FbTextView] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.34s, androidx.fragment.app.Fragment, java.lang.Object, X.1pK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 3121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34s.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
