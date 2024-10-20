package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: ARh.class */
public final class ARh extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A05 = obj;
        this.A07 = z;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A06 = str;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [X.5fq, X.5qu] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        if (this.A00 != 0) {
            11T.A0F(obj, 0);
            9PW r0 = (9PW) this.A04;
            if (r0 != null) {
                String str = this.A06;
                boolean z = this.A07;
                11T.A0F(str, 1);
                i = r0.A01.incrementAndGet();
                QuickPerformanceLogger quickPerformanceLogger = r0.A00;
                quickPerformanceLogger.markerStart(16267571, i);
                quickPerformanceLogger.markerAnnotate(16267571, i, AnonymousClass000.A00(206), str);
                quickPerformanceLogger.markerAnnotate(16267571, i, "is_sync", z);
            } else {
                i = -1;
            }
            5Vt r02 = (5Vt) this.A05;
            ((Executor) r02.A04.getValue()).execute(new AHS(r02, r0, obj, (List) this.A02, (AtomicInteger) this.A01, (Function1) this.A03, i));
            if (r0 != null) {
                r0.A00.markerPoint(16267571, i, "dispatch_method_return");
            }
            return obj;
        }
        ThreadKey threadKey = (ThreadKey) obj;
        11T.A0F(threadKey, 0);
        C2k6 c2k6 = (C2k6) this.A05;
        11T.A0F(c2k6, 0);
        Object A01 = 3vP.A01(c2k6, 9G3.A00);
        if (A01 == null) {
            throw 1BK.A0h();
        }
        9O8 r03 = (9O8) A01;
        r03.A00.A0Q(r03.A01);
        Context context = (Context) this.A01;
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) this.A03;
        String str2 = this.A06;
        FbUserSession fbUserSession = (FbUserSession) this.A02;
        AaX aaX = (AaX) this.A04;
        Object A06 = 1Bu.A06(context, 68357);
        72H r04 = (72H) 1Bu.A06(context, 65954);
        1Ih r05 = (1Ih) 7zM.A19();
        C5fv A00 = C9el.A00(highlightsFeedContent);
        C5fv A6V = A00.A6V(C5lx.A00, new 5uW(0S2.A0Y, "", true, false));
        ?? c5fq = new C5fq();
        c5fq.A03 = true;
        c5fq.A02 = str2;
        NavigationTrigger navigationTrigger = (NavigationTrigger) 7zN.A0r(C82h.A00(r05, A00, A6V, c5fq, 4YU.A0s()), highlightsFeedContent.A05);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("navigationTrigger baseTag:");
        A0k.append(navigationTrigger != null ? navigationTrigger.A05 : null);
        A0k.append(", msgSendEntryPoint:");
        0fH.A0j("HTImmersiveTextOnlyInlineReplyBarListener", AnonymousClass001.A0a(navigationTrigger != null ? navigationTrigger.A01 : null, A0k));
        r04.A00((C5fq) c5fq);
        if (navigationTrigger == null) {
            navigationTrigger = 9GP.A01;
        }
        7zV.A0W(threadKey, navigationTrigger, new A4w(null, context, null, fbUserSession, highlightsFeedContent, aaX), A06).Ckr((AnonymousClass539) null, new 5gC((C5qu) c5fq), "composer_text_tab", (String) null);
        return 04S.A00;
    }
}
