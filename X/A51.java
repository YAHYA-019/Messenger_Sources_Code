package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: A51.class */
public final class A51 implements 74V {
    public final 9JK A00;
    public final 9hK A01;
    public final 76E A02;
    public final 7NH A03;
    public final 72H A04;

    public A51(Activity activity, Context context, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent, 9JK r306, 76E r307, 72H r308) {
        this.A02 = r307;
        this.A04 = r308;
        this.A00 = r306;
        1Bn.A0A(147969);
        this.A01 = new 9hK(context, fbUserSession, highlightsFeedContent);
        NavigationTrigger navigationTrigger = (NavigationTrigger) 7zN.A0r(C5bz.A00() ? 9GN.A00 : 9GP.A02, highlightsFeedContent.A05);
        this.A03 = 7zV.A0W(r306.A00, navigationTrigger == null ? 9GP.A01 : navigationTrigger, new A4w(activity, context, null, fbUserSession, highlightsFeedContent, null), r307);
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        9JK r0 = this.A00;
        if (r0 instanceof C8u7) {
            C8u7 c8u7 = (C8u7) r0;
            ThreadKey threadKey = ((9JK) c8u7).A00;
            Long l3 = c8u7.A00;
            if (l3 != null) {
                this.A01.A01(threadKey, str2, c8u7.A01, l3.longValue());
            }
        }
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        9JK r0 = this.A00;
        if (r0 instanceof C8u7) {
            C8u7 c8u7 = (C8u7) r0;
            ThreadKey threadKey = ((9JK) c8u7).A00;
            Long l2 = c8u7.A00;
            if (l2 != null) {
                9hK r02 = this.A01;
                String str3 = c8u7.A01;
                long longValue = l2.longValue();
                11T.A0F(str2, 0);
                9hK.A00(r02, threadKey, 0S2.A01, str2, str3, longValue);
            }
        }
    }
}
