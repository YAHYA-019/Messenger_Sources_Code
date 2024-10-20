package com.facebook.messaging.gbgsolutions.plugins.automation.supporthintcard;

import X.06Z;
import X.0CU;
import X.0Dc;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.2yD;
import X.4YT;
import X.4YU;
import X.6IV;
import X.7sN;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.8Br;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import X.C6m2;
import X.C6m3;
import X.CP0;
import X.DKT;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Iterator;
import java.util.List;

/* loaded from: AutomationSupportHintCardPluginImplementation.class */
public final class AutomationSupportHintCardPluginImplementation {
    public static final String BLOKS_SCREEN_APP_ID = "com.bloks.www.lbo.bo.in_thread_form";
    public static final int DEFAULT_HEIGHT_PCT = 80;
    public static final String IN_THREAD_FORM_ID_PARAM = "in_thread_form_id";
    public static final int PEEK_HEIGHT_PCT = 80;
    public final String TAG;
    public final 1Br bloksLauncher$delegate;
    public final 1Br colorScheme$delegate;
    public final Context context;
    public final FbUserSession fbUserSession;
    public final 06Z fragmentManager;
    public final 6IV hintCardUpdateHandler;
    public final Capabilities threadCapabilities;
    public final ThreadSummary threadSummary;
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(AutomationSupportHintCardPluginImplementation.class, "colorScheme", "getColorScheme()Lcom/facebook/mig/scheme/interfaces/MigColorScheme;", 0), new C06w(AutomationSupportHintCardPluginImplementation.class, "bloksLauncher", "getBloksLauncher()Lcom/facebook/bloks/messenger/launcher/MSGBloksLauncher;", 0)};
    public static final C6m2 Companion = new Object();

    public AutomationSupportHintCardPluginImplementation(Context context, ThreadSummary threadSummary, FbUserSession fbUserSession, 06Z r305, 6IV r306, Capabilities capabilities) {
        1BL.A11(1, context, fbUserSession, r305);
        this.context = context;
        this.threadSummary = threadSummary;
        this.fbUserSession = fbUserSession;
        this.fragmentManager = r305;
        this.hintCardUpdateHandler = r306;
        this.threadCapabilities = capabilities;
        this.TAG = "GuidedFlowsHintCardPluginImplementation";
        this.colorScheme$delegate = 7zM.A0f(context);
        this.bloksLauncher$delegate = 1Bu.A00(98520);
    }

    private final CharSequence getAutomationSupportText() {
        String A0u = 1BK.A0u(this.context, 2131957550);
        String A0u2 = 1BK.A0u(this.context, 2131957548);
        String A0u3 = 1BK.A0u(this.context, 2131957549);
        0Dc A0P = 7zP.A0P(this.context);
        A0P.A04(7zQ.A0m(this.colorScheme$delegate), 18);
        A0P.A02(A0u);
        A0P.A02("\n");
        A0P.A02(A0u2);
        A0P.A00();
        A0P.A05(new 8Br(this, 5), "[[link]]", A0u3, 18);
        return 7zM.A0E(A0P);
    }

    private final DKT getBloksLauncher() {
        return (DKT) 1Br.A0B(this.bloksLauncher$delegate);
    }

    private final MigColorScheme getColorScheme() {
        return 7zQ.A0m(this.colorScheme$delegate);
    }

    public static final boolean isNeeded(ThreadSummary threadSummary, ThreadViewParams threadViewParams, Capabilities capabilities) {
        return C6m2.A00(threadSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequestSupportClick() {
        ThreadKey threadKey;
        String A0q;
        ThreadSummary threadSummary = this.threadSummary;
        if (threadSummary == null || (threadKey = threadSummary.A0n) == null || (A0q = 7zO.A0q(threadKey.A02)) == null) {
            return;
        }
        try {
            Iterator it = 0CU.A0M(2yD.A02(((7sN) 1Bi.A03(67990)).A00, 72904024717852907L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).iterator();
            while (it.hasNext()) {
                List A0M = 0CU.A0M(AnonymousClass001.A0i(it), new String[]{":"}, 0);
                if (A0M.size() == 2 && 11T.A0O(A0M.get(0), A0q)) {
                    String A13 = 4YU.A13(1BK.A14(A0M, 1));
                    if (A13 != null) {
                        CP0 cp0 = new CP0(BLOKS_SCREEN_APP_ID);
                        cp0.A05(IN_THREAD_FORM_ID_PARAM, A13);
                        DKT.A05(this.context, this.fragmentManager, getBloksLauncher(), cp0.A03(), 80, 80);
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
            0fH.A0r(4YT.A00(629), "Failed to get form id from page id", e);
        }
    }

    public final C6m3 getHintCard() {
        7zS.A0C(this.context).hideSoftInputFromWindow(new View(this.context).getWindowToken(), 0);
        return new C6m3(null, null, null, null, null, getAutomationSupportText(), null, 0S2.A0J, 0.0f, 0.0f, 524238, true, false, false);
    }
}
