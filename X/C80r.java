package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.80r, reason: invalid class name */
/* loaded from: 80r.class */
public final class C80r {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final Context A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C15h A08;

    public C80r(FbUserSession fbUserSession) {
        Context A00 = FbInjector.A00();
        this.A04 = A00;
        this.A06 = 1Bn.A09(C5rq.class, (Class) null);
        this.A05 = 1Bn.A09(C5ye.class, (Class) null);
        this.A02 = 1Bn.A06(A00, C12104yr.class, (Class) null);
        this.A01 = 1Bi.A02(C00653oY.class, (Class) null);
        this.A00 = 1Bi.A02(C12114ys.class, (Class) null);
        this.A08 = new AHe(this, 46);
        this.A03 = 1Bi.A02(1Ih.class, (Class) null);
        this.A07 = 1Lo.A01(A00, fbUserSession, 23F.class);
    }

    public static int A00(ThreadSummary threadSummary, C80r c80r, MigColorScheme migColorScheme) {
        ThreadThemeInfo threadThemeInfo;
        C5rq c5rq = (C5rq) c80r.A06.get();
        11T.A0F(migColorScheme, 1);
        if (threadSummary != null) {
            CompositeThreadThemeInfo AdX = threadSummary.AdX();
            11T.A0A(AdX);
            threadThemeInfo = c5rq.A00(migColorScheme, AdX, threadSummary.A1S);
        } else {
            threadThemeInfo = null;
        }
        return ((C5ye) c80r.A05.get()).A03(migColorScheme, threadThemeInfo);
    }

    public static FrameLayout.LayoutParams A01(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int A00 = C0A8.A00(context, 50.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = A00;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = A00;
        layoutParams.gravity = 49;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C0A8.A00(context, 4.0f);
        return layoutParams;
    }

    public static String A02(ParticipantInfo participantInfo, C80r c80r) {
        String str;
        UserKey userKey = participantInfo.A0F;
        if (userKey != null) {
            str = ((C28o) c80r.A08.get()).A03(((23F) c80r.A07.get()).A00(userKey));
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = participantInfo.A09.A00;
        }
        return str;
    }
}
