package X;

import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.35a, reason: invalid class name */
/* loaded from: 35a.class */
public final class C35a extends 20A {
    public WeakReference A00;
    public WeakReference A01;
    public WeakReference A02;
    public final SimpleDateFormat A07 = new SimpleDateFormat("mm:ss.SSS", Locale.US);
    public final Date A08 = new Date();
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final C00i A03 = 1BQ.A02(84488);
    public final C62l A04 = (C62l) 1Bi.A03(131273);
    public final C1pl A05 = new Jvr(this, 1);
    public final Runnable A0A = new S73(this);
    public final Runnable A06 = new S74(this);

    public static final C35a A00() {
        return new C35a();
    }

    public static void A01(C35a c35a) {
        WeakReference weakReference;
        WeakReference weakReference2 = c35a.A00;
        if (weakReference2 == null || weakReference2.get() == null || (weakReference = c35a.A02) == null || weakReference.get() == null) {
            return;
        }
        ((TextView) weakReference2.get()).setText(" ");
        ((View) c35a.A00.get()).setVisibility(8);
        WindowManager windowManager = ((20A) c35a).A03;
        windowManager.removeView((View) c35a.A02.get());
        View view = (View) c35a.A02.get();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, 24, -3);
        layoutParams.gravity = 51;
        windowManager.addView(view, layoutParams);
    }

    public void A03(C1cm c1cm, String str) {
        this.A04.CXz(this.A05);
        super.A03(c1cm, str);
    }

    public void A06(C1cm c1cm, String str, long j) {
        Date date = this.A08;
        if (j <= 0) {
            j = 1BL.A09(this.A03);
        }
        date.setTime(j);
        String format = this.A07.format(date);
        if (str != null) {
            format = 0Pz.A0j(format, " ", str);
        }
        super.A04(c1cm, format);
    }

    public void A07(boolean z) {
        this.A09.set(z);
        ((20A) this).A02.post(this.A0A);
    }
}
