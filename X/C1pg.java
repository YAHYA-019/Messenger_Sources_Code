package X;

import android.content.Intent;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.1pg, reason: invalid class name */
/* loaded from: 1pg.class */
public final class C1pg implements C1ph {
    public final C00i A00 = new 1BV(16430);
    public final C00i A05 = new 1BQ(131273);
    public final C00i A01 = new 1BQ(68406);
    public final Runnable A02 = new Runnable() { // from class: X.1pi
        public static final String __redex_internal_original_name = "FirstFrameTracker$1";

        @Override // java.lang.Runnable
        public void run() {
            C1pg.A01(C1pg.this, 44826634);
        }
    };
    public final C1pl A06 = new 3AH(this, 0);
    public final Runnable A03 = new Runnable() { // from class: X.1pm
        public static final String __redex_internal_original_name = "FirstFrameTracker$3";

        @Override // java.lang.Runnable
        public void run() {
            C1pg.A01(C1pg.this, 44826636);
        }
    };
    public final C1pl A07 = new 3AH(this, 1);
    public final Runnable A04 = new Runnable() { // from class: X.1pn
        public static final String __redex_internal_original_name = "FirstFrameTracker$5";

        @Override // java.lang.Runnable
        public void run() {
            C1pg.A01(C1pg.this, 44826635);
        }
    };

    public static void A00(View view, final C1pg c1pg, final Runnable runnable) {
        C00j.A05("FirstFrameTracker.setLayoutListener", 172338208);
        try {
            final View rootView = view.getRootView();
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1po
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ((Handler) c1pg.A00.get()).postAtFrontOfQueue(runnable);
                }
            });
            C00j.A01(-541398266);
        } catch (Throwable th) {
            C00j.A01(-1820079950);
            throw th;
        }
    }

    public static void A01(C1pg c1pg, int i) {
        C00i c00i = c1pg.A01;
        ((LightweightQuickPerformanceLogger) c00i.get()).markerAnnotate(i, ErrorReportingConstants.ENDPOINT, C0ft.A01());
        ((LightweightQuickPerformanceLogger) c00i.get()).markerEnd(i, (short) 2);
    }

    @Override // X.C1ph
    public void Bth(2Ov r302) {
    }

    @Override // X.C1ph
    public void Btk(2Ov r302) {
        View view;
        C00i c00i = this.A01;
        ((LightweightQuickPerformanceLogger) c00i.get()).markerStart(44826636);
        if (((LightweightQuickPerformanceLogger) c00i.get()).isMarkerOn(44826636, true)) {
            if (r302 == null || (view = r302.mView) == null) {
                ((C62l) this.A05.get()).CXz(this.A06);
            } else {
                A00(view, this, this.A03);
            }
        }
    }

    @Override // X.C1ph
    public void CR0(MotionEvent motionEvent) {
    }

    @Override // X.C1ph
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
