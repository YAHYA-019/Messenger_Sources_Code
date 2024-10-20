package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadPreviewParams;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* renamed from: X.3So, reason: invalid class name */
/* loaded from: 3So.class */
public final class C3So {
    public final 2OO A00;
    public final Context A01;
    public final FbUserSession A02;

    public C3So(Context context, FbUserSession fbUserSession, 2OO r304) {
        this.A01 = context;
        this.A00 = r304;
        this.A02 = fbUserSession;
    }

    public static final ThreadViewParams A00(ThreadKey threadKey, NavigationTrigger navigationTrigger, Boolean bool, String str, String str2, boolean z) {
        C6el A0H;
        String str3 = navigationTrigger.A05;
        11T.A0A(str3);
        if (threadKey.A11()) {
            C6en c6en = threadKey.A1D() ? C6en.A02 : C6en.A03;
            5SW r0 = 5SW.A0p;
            EnumC3499Mfu enumC3499Mfu = EnumC3499Mfu.A0f;
            C6el c6el = new C6el();
            A0H = 1BM.A02(threadKey, navigationTrigger, c6el, r0);
            c6el.A0B = c6en;
            if (str2 != null) {
                c6el.A07 = new MessageDeepLinkInfo(null, null, str2, "", AnonymousClass001.A0v(), 1L, -1, false);
            }
            if (!z) {
                boolean equals = str3.equals(4YT.A00(27));
                c6el.A09 = new ThreadPreviewParams(enumC3499Mfu, "", 2oI.A00(c6en, equals), equals);
            }
            if (str != null) {
                c6el.A0D = str;
                c6el.A0P = bool != null ? bool.booleanValue() : false;
            }
        } else {
            A0H = 1BK.A0H(threadKey);
            A0H.A06 = navigationTrigger;
            A0H.A02(5SW.A0V);
        }
        return new ThreadViewParams(A0H);
    }

    public static final void A01(C3So c3So, ThreadViewParams threadViewParams) {
        7QK r0 = (7QK) 1Bn.A0A(68383);
        if (!7QK.A02()) {
            c3So.A00.CWL(threadViewParams);
            return;
        }
        Context context = c3So.A01;
        FbUserSession fbUserSession = c3So.A02;
        ThreadKey threadKey = threadViewParams.A05;
        11T.A09(threadKey);
        r0.A03(context, fbUserSession, threadKey, C3kb.A00, new AQd(threadViewParams, c3So, 11));
    }
}
