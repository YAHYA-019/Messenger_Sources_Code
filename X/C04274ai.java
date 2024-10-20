package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.business.bizrtc.model.PageMessageNotification;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Platform;
import java.util.ArrayList;

/* renamed from: X.4ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ai.class */
public final class C04274ai extends 1IG implements CallerContextable {
    public static final CallerContext A0L = CallerContext.A08(C04274ai.class, "pages_public_view");
    public static final String __redex_internal_original_name = "PageMessageNotificationHandler";
    public Context A00;
    public 1BY A01;
    public final C00i A02;
    public final C00i A04;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final 1PA A0B;
    public final 1I7 A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A05 = new 1BV((1BY) null, 68463);
    public final C04294ak A0K = (C04294ak) 1Bn.A0E((Context) null, (1BY) null, 66024);
    public final C00i A03 = new 1BQ(65609);

    public C04274ai(1BO r302) {
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A00 = context;
        1I6 r0 = (1I7) 1Hv.A02(context, 65728);
        this.A0C = r0;
        this.A0F = new 1BV((1BY) null, 49358);
        this.A0E = new 1BQ(83833);
        this.A07 = new 1BV((1BY) null, 82127);
        this.A08 = new 1BV((1BY) null, 83656);
        this.A0J = new 1BQ(17077);
        this.A0G = new 1BV((1BY) null, 49844);
        this.A0I = new 1BQ(49839);
        this.A0D = new 1BQ(49441);
        this.A0H = new 1BQ(49803);
        this.A04 = new 1BQ(66938);
        this.A06 = new 1HH(this.A00, 100188);
        this.A09 = new 1BV((1BY) null, 83577);
        this.A02 = new 1BQ(16457);
        this.A0A = new 1BQ(49797);
        this.A01 = new 1BY(r302);
        1P9 r02 = new 1P9(r0);
        r02.A05(new D0R(this, 9), "com.facebook.orca.ACTION_IN_APP_BROWSER_EXIT");
        r02.A05(new D0R(this, 8), "com.facebook.orca.ACTION_notification_direct_reply");
        1PA A02 = r02.A02();
        this.A0B = A02;
        A02.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x02c6, code lost:
    
        if (X.1BK.A0N(((X.C2ib) r304.A0J.get()).A00).AZk(36310834643993866L) == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v425, types: [X.0IT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.content.Context r301, android.graphics.Bitmap r302, com.facebook.messaging.business.bizrtc.model.PageMessageNotification r303, X.C04274ai r304) {
        /*
            Method dump skipped, instructions count: 2610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04274ai.A00(android.content.Context, android.graphics.Bitmap, com.facebook.messaging.business.bizrtc.model.PageMessageNotification, X.4ai):void");
    }

    public void A05() {
        1PA r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A06(Context context, FbUserSession fbUserSession, PageMessageNotification pageMessageNotification) {
        C50c A00;
        if (!((C2ib) this.A0J.get()).A09() || ((5pC) this.A0I.get()).A01(fbUserSession, (ThreadKey) null, pageMessageNotification, 10051)) {
            return;
        }
        50V r0 = (50V) this.A0D.get();
        String str = pageMessageNotification.A01;
        50V.A01(r0);
        synchronized (r0.A02) {
            A00 = 50V.A00(r0, str);
        }
        if (A00.A02 || A00.A06 || A00.A05 || A00.A04 || A00.A01) {
            return;
        }
        A00.A02();
        String str2 = pageMessageNotification.A08;
        if (Platform.stringIsNullOrEmpty(str2)) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(1BK.A0X(pageMessageNotification.A06));
            1BK.A1E(this.A02).execute(new D9s(context, pageMessageNotification, this, A0s));
        } else {
            2Dp A01 = 2Dp.A01(str2);
            if (A01 == null) {
                A00(context, null, pageMessageNotification, this);
            } else {
                ((2Ff) this.A03.get()).A0A(A01, A0L).D3K(new ArM(0, context, pageMessageNotification, this), 1JU.A01);
            }
        }
        ((C5dx) this.A0H.get()).A01(pageMessageNotification);
    }
}
