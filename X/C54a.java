package X;

import android.content.Context;
import android.view.WindowManager;
import com.facebook.inject.FbInjector;

/* renamed from: X.54a, reason: invalid class name */
/* loaded from: 54a.class */
public final class C54a {
    public Context A00;
    public final WindowManager A03;
    public volatile int A05;
    public volatile int A06;
    public volatile int A07;
    public volatile int A08;
    public volatile int A09;
    public final Context A01 = FbInjector.A00();
    public final C54b A04 = (C54b) 1Bn.A0A(67189);
    public final 1Br A02 = 1Bq.A00(16385);

    public C54a() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        11T.A0F(context, 1);
        this.A03 = (WindowManager) 1Hv.A02(context, 100186);
    }

    public static final int A00(C54a c54a) {
        if (((2BQ) c54a.A04.A00.A00.get()).A04("messenger_photo_size_limit")) {
            return 960;
        }
        return (int) ((2yD) c54a.A02.A00.get()).Auy(36592670393172902L);
    }

    public final int A01() {
        if (this.A05 == 0) {
            Context context = this.A01;
            11T.A09(context);
            this.A05 = C0A8.A00(context, 280.0f);
        }
        return this.A05;
    }

    public final int A02() {
        if (this.A06 == 0) {
            Context context = this.A01;
            11T.A09(context);
            this.A06 = C0A8.A00(context, 320.0f);
            this.A06 = Math.min(this.A06, context.getResources().getDisplayMetrics().widthPixels - C0A8.A00(context, 120.0f));
        }
        return this.A06;
    }

    public final int A03() {
        if (this.A07 == 0) {
            Context context = this.A01;
            11T.A09(context);
            this.A07 = C0A8.A00(context, 320.0f);
            this.A07 = Math.min(this.A07, context.getResources().getDisplayMetrics().widthPixels - C0A8.A00(context, 120.0f));
        }
        return this.A07;
    }

    public final int A04() {
        if (this.A08 == 0) {
            Context context = this.A01;
            11T.A09(context);
            this.A08 = C0A8.A00(context, 130.0f);
        }
        return this.A08;
    }

    public final int A05() {
        if (this.A09 == 0) {
            Context context = this.A01;
            11T.A09(context);
            this.A09 = C0A8.A00(context, 175.0f);
        }
        return this.A09;
    }

    public final int A06() {
        int A02;
        synchronized (this) {
            A02 = A02();
        }
        return A02;
    }

    public final int A07() {
        int A05;
        synchronized (this) {
            A05 = A05();
        }
        return A05;
    }

    public final int A08() {
        int A04;
        synchronized (this) {
            A04 = A04();
        }
        return A04;
    }
}
