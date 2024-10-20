package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.environment.events.OnSendMessage;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;

/* renamed from: X.6ho, reason: invalid class name */
/* loaded from: 6ho.class */
public final class C6ho implements 1Vf {
    public 5SW A00;
    public Integer A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 6Fz A09;
    public final 6G5 A0A;

    public C6ho(Context context, 6G5 r303, 6Fz r304) {
        11T.A0F(r304, 2);
        11T.A0F(r303, 3);
        this.A04 = context;
        this.A09 = r304;
        this.A0A = r303;
        this.A08 = 1Bu.A01(context, 16428);
        this.A07 = 1Bq.A00(33013);
        this.A05 = 1Bq.A00(66481);
        this.A06 = 1Bu.A01(context, 67982);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (X.1WY.A01((X.1WY) r301.A05.A00.get()).AZk(36323822617513209L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A00(com.facebook.messaging.model.threadkey.ThreadKey r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0a(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L55
            r0 = r301
            X.6G5 r0 = r0.A0A
            com.facebook.xapp.messaging.capability.vector.Capabilities r0 = r0.BF1()
            r304 = r0
            r0 = 199(0xc7, float:2.79E-43)
            r305 = r0
            r0 = r304
            java.util.BitSet r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.get(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L55
            r0 = r301
            X.1Br r0 = r0.A05
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1WY r0 = (X.1WY) r0
            r304 = r0
            r0 = r304
            X.1CO r0 = X.1WY.A01(r0)
            r306 = r0
            r0 = 36323822617513209(0x810c5300004cf9, double:3.0346699153844896E-306)
            r307 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L59
        L55:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L59:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ho.A00(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0025. Please report as an issue. */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        switch (str.hashCode()) {
            case -1787492718:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                    OnThreadClosed onThreadClosed = (OnThreadClosed) r302;
                    11T.A0F(onThreadClosed, 0);
                    ThreadKey threadKey = onThreadClosed.A00;
                    if (A00(threadKey)) {
                        1Ql.A01(1Br.A08(this.A07), 1NK.A06, false);
                        FbUserSession A0F = 4YV.A0F(this.A04);
                        C9hg c9hg = (C9hg) 1Br.A0B(this.A06);
                        11T.A0F(A0F, 0);
                        ((4fF) 4YU.A0o(A0F, c9hg.A00, 68127)).A0K(0Pz.A0W("admin_onboarding:", 1BK.A0w(threadKey)));
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case -1440551537:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                    OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
                    11T.A0F(onThreadOpened, 0);
                    if (A00(onThreadOpened.A00)) {
                        this.A03 = 1BK.A0t();
                        1Ql.A01(1Br.A08(this.A07), 1NK.A06, false);
                        2Sh r0 = onThreadOpened.A01;
                        this.A02 = String.valueOf(r0.A01("COMMUNITY_GROUP_ID", (Class) null));
                        5SW r02 = (5SW) r0.A01((String) null, 5SW.class);
                        this.A00 = r02;
                        this.A01 = r02 == 5SW.A0N ? 0S2.A00 : 0S2.A01;
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case 22507532:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
                    OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
                    11T.A0F(onThreadVisible, 0);
                    ThreadKey threadKey2 = onThreadVisible.A00;
                    if (!A00(threadKey2) || this.A02 == null) {
                        return;
                    }
                    C00i c00i = this.A07.A00;
                    FbSharedPreferences A0S = 1BK.A0S(c00i);
                    1G2 r03 = 1NK.A05;
                    boolean AZn = A0S.AZn(r03, false);
                    FbUserSession A03 = 1Br.A03(this.A08);
                    ((C9hg) 1Br.A0B(this.A06)).A01(this.A04, this.A09.BDe(), A03, threadKey2, this.A01, 4YU.A0l(threadKey2), this.A02, this.A03, AnonymousClass001.A1W(this.A00, 5SW.A0N), AZn);
                    1Ql.A03(r03, c00i.get(), false);
                    this.A00 = null;
                    return;
                }
                throw 4YV.A0f(str);
            case 479645728:
                if (str.equals("com.facebook.messaging.threadview.environment.events.OnSendMessage")) {
                    OnSendMessage onSendMessage = (OnSendMessage) r302;
                    11T.A0F(onSendMessage, 0);
                    ThreadKey threadKey3 = onSendMessage.A00.A0V;
                    if (A00(threadKey3)) {
                        1Br r04 = this.A07;
                        FbSharedPreferences A09 = 1Br.A09(r04);
                        1G2 r05 = 1NK.A06;
                        if (A09.AZn(r05, false)) {
                            1Ql.A01(1Br.A08(r04), r05, false);
                            FbUserSession A032 = 1Br.A03(this.A08);
                            C9hg c9hg2 = (C9hg) 1Br.A0B(this.A06);
                            Context context = this.A04;
                            if (threadKey3 == null) {
                                throw 1BK.A0h();
                            }
                            c9hg2.A01(context, this.A09.BDe(), A032, threadKey3, this.A01, 4YU.A0l(threadKey3), this.A02, this.A03, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
    }
}
