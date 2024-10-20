package X;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.aibot.footer.view.AiBotDisclosureView;
import com.facebook.xapp.messaging.aibot.logging.events.OnAINuxInlineDisclosureImpression;

/* renamed from: X.9ki, reason: invalid class name */
/* loaded from: 9ki.class */
public final class C9ki {
    public int A00;
    public AiBotDisclosureView A01;
    public C2a2 A02;
    public final Context A04;
    public final LifecycleOwner A05;
    public final 1Br A06;
    public final 1Br A08;
    public final ThreadKey A09;
    public final 1Va A0B;
    public final 1Br A07 = 1Bq.A00(66421);
    public final C01i A0A = C01g.A00(C03i.A02, AQT.A00(this, 48));
    public boolean A03 = true;

    public C9ki(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, ThreadKey threadKey, 1Va r306) {
        this.A04 = context;
        this.A05 = lifecycleOwner;
        this.A09 = threadKey;
        this.A0B = r306;
        this.A08 = 1Lm.A00(context, fbUserSession, 65869);
        this.A06 = 1Bu.A01(context, 68283);
    }

    public static final void A00(C9ki c9ki, long j) {
        AiBotDisclosureView aiBotDisclosureView = c9ki.A01;
        if (aiBotDisclosureView == null || !c9ki.A03 || c9ki.A00 == 0) {
            return;
        }
        aiBotDisclosureView.clearAnimation();
        ValueAnimator ofInt = ValueAnimator.ofInt(c9ki.A00, 0);
        ofInt.setDuration(250L);
        ofInt.setStartDelay(j);
        ofInt.addUpdateListener(new LF5(aiBotDisclosureView, ofInt, 1));
        ofInt.addListener(new 9nX(c9ki, aiBotDisclosureView, 2));
        0K6.A00(ofInt);
    }

    public static final void A01(C9ki c9ki, CharSequence charSequence) {
        AiBotDisclosureView aiBotDisclosureView = c9ki.A01;
        if (aiBotDisclosureView != null) {
            aiBotDisclosureView.A00(charSequence);
        }
        AiBotDisclosureView aiBotDisclosureView2 = c9ki.A01;
        if (aiBotDisclosureView2 != null) {
            C9dn.A01(aiBotDisclosureView2.A00, 0S2.A1G, 0S2.A0d);
        }
        AiBotDisclosureView aiBotDisclosureView3 = c9ki.A01;
        if (aiBotDisclosureView3 != null) {
            aiBotDisclosureView3.getViewTreeObserver().addOnGlobalLayoutListener(new LKk(aiBotDisclosureView3, c9ki, 1));
        }
        ((C77c) 1Br.A0B(c9ki.A06)).A0B(c9ki.A04);
        c9ki.A0B.CZm(OnAINuxInlineDisclosureImpression.A00);
    }
}
