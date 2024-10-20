package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.Window;
import com.facebook.resources.ui.FbTextView;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.Set;

/* loaded from: H2z.class */
public final class H2z extends C6d6 {
    public static final Set A09 = 02H.A02(new String[]{"Stalls", "Streaming"});
    public Window.OnFrameMetricsAvailableListener A00;
    public final Activity A01;
    public final Handler A02;
    public final 1Br A03;
    public final 1Br A04;
    public final FbTextView A05;
    public final GTH A06;
    public final java.util.Map A07;
    public final java.util.Map A08;

    /* JADX WARN: Multi-variable type inference failed */
    public H2z(Context context) {
        super(context, null, 7zP.A1X(context) ? 1 : 0);
        this.A08 = AnonymousClass001.A0u();
        this.A07 = AnonymousClass001.A0u();
        this.A02 = AnonymousClass001.A07();
        this.A03 = 7zM.A0Q();
        this.A04 = 1Bu.A00(99953);
        A0C(2132541827);
        this.A01 = A00(context);
        this.A05 = GOo.A0X(this, 2131363564);
        GPl.A02(this, 79);
        GPl.A02(this, 78);
        this.A06 = new GTH(this);
    }

    private final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        11T.A0A(baseContext);
        return A00(baseContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r0.equals("RTC") == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.H2z r301) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2z.A01(X.H2z):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (X.11T.A0O(r302, "uumos_cs") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A02(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Br r0 = r0.A04
            r303 = r0
            r0 = r303
            boolean r0 = X.AbL.A1H(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L58
            java.lang.String r0 = "Format"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L58
            java.lang.String r0 = "mos"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L58
            java.lang.String r0 = "csvqm"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L58
            java.lang.String r0 = "uuMos"
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L58
            r0 = r302
            java.lang.String r1 = "uumos_cs"
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L5a
        L58:
            r0 = 1
            r304 = r0
        L5a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2z.A02(java.lang.String):boolean");
    }

    @Override // X.C6d6
    public String A0H() {
        return "DebugConsolePlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        Activity activity;
        Window window;
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.A00;
        if (onFrameMetricsAvailableListener != null && (activity = this.A01) != null && (window = activity.getWindow()) != null) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
        this.A00 = null;
        this.A08.clear();
        this.A07.clear();
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        Window window;
        11T.A0F(r302, 0);
        if (z) {
            java.util.Map map = this.A07;
            map.put("RVP", 0PP.A00(super.A07));
            try {
                C6ce c6ce = super.A08;
                if (c6ce != null) {
                    map.put("VP", 0PP.A00(Integer.valueOf(c6ce.BJY())));
                }
                VideoPlayerParams videoPlayerParams = r302.A03;
                map.put("vid", videoPlayerParams != null ? videoPlayerParams.A0k : null);
                6Tu r0 = super.A08;
                if (r0 != null) {
                    map.put("playerOrigin", r0.B3c().toString());
                }
            } catch (NullPointerException unused) {
            }
            7zP.A0N(this.A03).Ciz(new S9R(this));
        }
        if (this.A00 == null) {
            Window.OnFrameMetricsAvailableListener rkF = new RkF(this);
            this.A00 = rkF;
            Activity activity = this.A01;
            if (activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(rkF, this.A02);
        }
    }

    @Override // X.C6d6
    public void CgE(6TX r302) {
        11T.A0F(r302, 0);
        super.CgE(r302);
        C7lz.A00(this.A05, r302, "DebugConsole");
    }
}
