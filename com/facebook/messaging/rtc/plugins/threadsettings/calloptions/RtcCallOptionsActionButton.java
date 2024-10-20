package com.facebook.messaging.rtc.plugins.threadsettings.calloptions;

import X.0CW;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Du;
import X.1Fj;
import X.1Lm;
import X.2MQ;
import X.5Uu;
import X.5yX;
import X.AbN;
import X.BHl;
import X.BY7;
import X.C1yg;
import X.C5V0;
import X.C7u;
import X.C8R;
import X.COp;
import X.CYq;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.rtc.interfaces.CallSurfaceLoggingParams;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: RtcCallOptionsActionButton.class */
public final class RtcCallOptionsActionButton {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final ThreadSummary A05;
    public final User A06;
    public final Capabilities A07;

    public RtcCallOptionsActionButton(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, User user, Capabilities capabilities) {
        1BL.A1H(context, fbUserSession, threadKey);
        11T.A0F(capabilities, 6);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = threadKey;
        this.A05 = threadSummary;
        this.A06 = user;
        this.A07 = capabilities;
        this.A02 = 1Bu.A01(context, 65938);
        this.A03 = 1Bu.A00(99984);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.COp, java.lang.Object] */
    public final C8R A00() {
        5yX r0 = (5yX) 1Lm.A06(this.A01, 66652);
        boolean A00 = BY7.A00.A00(this.A04, this.A05, this.A07, true);
        2MQ r306 = (r0.A01() && A00) ? 2MQ.A0f : 2MQ.A2R;
        ?? obj = new Object();
        ((COp) obj).A03 = new CYq(0, r0, this, A00);
        COp.A01(r306, (COp) obj);
        ((COp) obj).A01 = 2131967129;
        return COp.A00((COp) obj, 2131967128);
    }

    public final void A01(boolean z) {
        String str;
        Long A0e;
        String str2;
        Long A0e2;
        ThreadSummary threadSummary;
        ThreadKey threadKey = this.A04;
        C1yg c1yg = threadKey.A06;
        if (c1yg != null) {
            int ordinal = c1yg.ordinal();
            if (ordinal == 0 || ordinal == 3) {
                User user = this.A06;
                if (user == null || (str = user.A13) == null || (A0e = 0CW.A0e(str)) == null) {
                    return;
                }
                long longValue = A0e.longValue();
                FbUserSession fbUserSession = this.A01;
                Context context = this.A00;
                ((C5V0) 1Lm.A05(context, fbUserSession, 115765)).A0B(context, fbUserSession, new BHl(threadKey, (CallSurfaceLoggingParams) null, z ? "thread_settings_menu_video" : "thread_settings_menu", (String) null, "thread_details_header", 4001, longValue, z, false));
                return;
            }
            if (ordinal == 1) {
                ThreadSummary threadSummary2 = this.A05;
                if (threadSummary2 != null) {
                    ((C7u) 1Br.A0B(this.A03)).A01(this.A00, threadKey, threadSummary2, null, z ? "mulitway_call_thread_settings_menu_video" : "multiway_call_thread_settings_menu", null, z);
                    return;
                }
                return;
            }
            if (ordinal == 13) {
                User user2 = this.A06;
                if (user2 == null || (str2 = user2.A13) == null || (A0e2 = 0CW.A0e(str2)) == null) {
                    return;
                }
                ((5Uu) 1Br.A0B(this.A02)).A05(this.A00, threadKey, z ? "sc_thread_settings_menu_button_video" : "sc_thread_settings_menu_button", A0e2.longValue(), z);
                return;
            }
            if (ordinal != 14 || (threadSummary = this.A05) == null) {
                return;
            }
            5Uu r0 = (5Uu) 1Br.A0B(this.A02);
            Context context2 = this.A00;
            ImmutableList immutableList = threadSummary.A1L;
            11T.A0A(immutableList);
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbN.A1R(builder, it);
            }
            r0.A04(context2, threadKey, 1Fj.A01(builder), z ? "sc_thread_settings_menu_button_video" : "sc_thread_settings_menu_button", false, z);
        }
    }
}
