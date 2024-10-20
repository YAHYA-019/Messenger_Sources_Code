package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.rsys.state.gen.State;
import java.util.concurrent.Future;

/* renamed from: X.3zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zc.class */
public final class C03933zc implements 2wL {
    public int A00;
    public int A01;
    public Kqw A02;
    public Future A03;
    public boolean A04;
    public boolean A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 2JM A09;
    public final InterfaceC03913za A0A;
    public final 1BP A0B;
    public final 1De A0C;
    public final 1Br A0D;

    public C03933zc(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0C = r303;
        this.A0D = 1Bq.A00(16520);
        1BY r0 = r303.A00;
        this.A07 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A06 = 1Lm.A03(fbUserSession, r0, 33088);
        this.A08 = 1Bq.A00(16462);
        this.A0B = FbInjector.A00;
        this.A09 = new GPC(this);
        this.A0A = new InterfaceC03913za() { // from class: X.3zd
            @Override // X.InterfaceC03913za
            public final void C5d(int i, int i2) {
                C03933zc c03933zc = C03933zc.this;
                C00i c00i = c03933zc.A07.A00;
                if (!"".equals(((2QO) c00i.get()).A0r)) {
                    MarkerEditor withMarker = C03933zc.A00(c03933zc).withMarker(i, i2);
                    withMarker.annotate(AnonymousClass000.A00(206), ((2QO) c00i.get()).A0r);
                    withMarker.annotate(AbE.A00(26), ((2QO) c00i.get()).A0J);
                    withMarker.markerEditingCompleted();
                }
            }
        };
        this.A04 = true;
    }

    public static final QuickPerformanceLogger A00(C03933zc c03933zc) {
        return (QuickPerformanceLogger) c03933zc.A0D.A00.get();
    }

    public static final void A01(C03933zc c03933zc) {
        synchronized (c03933zc) {
            if (A00(c03933zc).isMarkerOn(16262483)) {
                A00(c03933zc).markerEnd(16262483, (short) 2);
            }
        }
    }

    public void CQz(Activity activity, MotionEvent motionEvent) {
        11T.A0F(motionEvent, 1);
        2JS A01 = ((2JN) this.A06.A00.get()).A01();
        2JQ r0 = State.CONVERTER;
        11T.A0B(r0);
        if (!((State) A01.A01(r0)).isActive || this.A04) {
            return;
        }
        Kqw kqw = this.A02;
        if (kqw == null) {
            Context context = FbInjector.A03;
            11T.A0A(context);
            kqw = new Kqw(context, new Handler(Looper.getMainLooper()), null, A00(this), this.A0A, 16261567, false, false);
            this.A02 = kqw;
            kqw.A05 = true;
        }
        kqw.A00(motionEvent);
    }
}
