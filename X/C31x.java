package X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.RoundedCornersFrameLayout;

/* renamed from: X.31x, reason: invalid class name */
/* loaded from: 31x.class */
public abstract class C31x extends RoundedCornersFrameLayout implements ML5 {
    public C03903zR A00;
    public KeU A01;
    public boolean A02;

    @Override // X.ML5
    public int Azb() {
        boolean z = this instanceof 37K;
        Context context = getContext();
        return z ? ((MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979)).BDl() : 0NA.A01(context, 2130969051, 0);
    }

    @Override // X.ML5
    public void Bl5() {
    }

    @Override // X.ML5
    public void BrA() {
    }

    @Override // X.ML5
    public void BrC() {
        this.A02 = false;
        this.A00.CQz(null, null);
    }

    @Override // X.ML5
    public void BrF() {
        if (this instanceof 37J) {
            37J r0 = (37J) this;
            if (r0.A02 != null) {
                37J.A03(r0);
            }
            if (r0.A03) {
                r0.A03 = false;
                37J.A02(r0);
            }
        }
    }

    @Override // X.ML5
    public void BrG() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r305 != null) goto L8;
     */
    @Override // X.ML5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BrK() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.37J
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r301
            r303 = r0
            r0 = r301
            X.37J r0 = (X.37J) r0
            r303 = r0
            r0 = r303
            com.facebook.messaging.threadview.params.ThreadViewParams r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L69
            r0 = r304
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A05
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L69
        L24:
            r0 = r303
            android.content.Context r0 = r0.getContext()
            r306 = r0
            r0 = r306
            com.facebook.auth.usersession.FbUserSession r0 = X.1Fw.A01(r0)
            r304 = r0
            r0 = r306
            r1 = r304
            X.2dU.A00(r0, r1)
            r0 = r305
            int r0 = X.1BK.A01(r0)
            r302 = r0
            com.facebook.messaging.analytics.perf.events.events.ChatHeadThreadViewFragmentBubbleContentViewOnContentShown r0 = new com.facebook.messaging.analytics.perf.events.events.ChatHeadThreadViewFragmentBubbleContentViewOnContentShown
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            X.6Bw r0 = X.C6iY.A00()
            r306 = r0
            r0 = r305
            X.1yg r0 = r0.A06
            java.lang.String r0 = r0.name()
            r304 = r0
            r0 = r306
            r1 = r304
            r0.A09 = r1
            java.lang.String r0 = "chat_head"
            r304 = r0
            r0 = r306
            r1 = r304
            r0.A06 = r1
            r0 = r306
            r1 = r303
            X.2dU.A01(r0, r1)
        L68:
            return
        L69:
            r0 = r303
            androidx.fragment.app.Fragment r0 = X.37J.A00(r0)
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof X.2Oe
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r306
            X.2Oe r0 = (X.2Oe) r0
            r306 = r0
            r0 = r306
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.threadKey
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L68
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31x.BrK():void");
    }

    @Override // X.ML5
    public boolean C6g() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.A00.CQz(null, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1243105109);
        super.onAttachedToWindow();
        0FI.A0C(-2094452909, A06);
    }
}
