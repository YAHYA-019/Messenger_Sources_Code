package X;

import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Lli.class */
public final class Lli implements Runnable {
    public static final String __redex_internal_original_name = "GiftBoxReleaseView$updateRunnable$1";
    public final /* synthetic */ JXj A00;

    public Lli(JXj jXj) {
        this.A00 = jXj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JXj jXj = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = jXj.A00;
        if (j == 0) {
            j = uptimeMillis - 16;
            jXj.A00 = j;
        }
        float f = ((float) (uptimeMillis - j)) / 1000.0f;
        jXj.A00 = uptimeMillis;
        List list = jXj.A07;
        int size = list.size() - 1;
        while (true) {
            int i = size;
            float f2 = 0.0f / 0.0f;
            if (-1 >= i) {
                break;
            }
            KkN kkN = (KkN) list.get(i);
            L3J l3j = kkN.A02;
            L2X l2x = kkN.A03;
            11T.A0A(kkN.A01.getBounds());
            float f3 = 0.5f;
            if (AnonymousClass001.A1O((kkN.A00 > 0.0f ? 1 : (kkN.A00 == 0.0f ? 0 : -1))) && jXj.getWidth() > 0) {
                float f4 = 1.0f;
                if (l2x.A05 + r0.centerX() > DKC.A02(jXj) * 0.5f) {
                    f4 = -1.0f;
                }
                kkN.A00 = f4;
            }
            l3j.A01(f);
            float f5 = kkN.A00;
            float f6 = l3j.A09;
            float f7 = f5 * (-f6);
            if (f6 >= 0.0f) {
                f3 = 0.125f;
            }
            l3j.A08 = f7 * f3;
            float f8 = kkN.A00;
            float f9 = l3j.A09;
            float f10 = f8 * (-f9);
            float f11 = 0.05f;
            if (f9 < 0.0f) {
                f11 = 0.1f;
            }
            l3j.A04 = f10 * f11;
            float f12 = l3j.A09 / jXj.A03;
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            l3j.A05 = f12;
            l3j.A06 = f12;
            l3j.A02(l2x, f);
            if (jXj.getHeight() != 0) {
                Rect bounds = kkN.A01.getBounds();
                11T.A0A(bounds);
                int max = Math.max(bounds.width(), bounds.height());
                L2X l2x2 = kkN.A03;
                if ((bounds.top + l2x2.A06) - (l2x2.A03 * max) > DKC.A03(jXj)) {
                    list.remove(i);
                    size = i - 1;
                }
            }
            JVX jvx = kkN.A01;
            float f13 = jvx.A02;
            float min = Math.min(f13 + (jXj.A04 * f), jXj.A05);
            if (f13 != min) {
                jvx.A02 = min;
                jvx.A05 = true;
                jvx.invalidateSelf();
            }
            float f14 = l3j.A09 / 260.0f;
            LQZ lqz = jvx.A03;
            if (lqz != null) {
                lqz.A02();
            }
            jvx.A03 = null;
            if (jvx.A00 != f14) {
                jvx.A00 = f14;
                jvx.invalidateSelf();
            }
            size = i - 1;
        }
        jXj.invalidate();
        if (1BK.A1Y(list)) {
            jXj.postOnAnimation(jXj.A06);
            return;
        }
        jXj.A00 = 0L;
        Function1 function1 = jXj.A01;
        if (function1 != null) {
            function1.invoke(jXj);
        }
    }
}
