package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: A52.class */
public final class A52 implements 74V {
    public final Activity A00;
    public final Context A01;
    public final FbUserSession A02;
    public final HighlightsFeedContent A03;
    public final 9JK A04;
    public final 9hK A05;
    public final MkF A06 = (MkF) 1Bn.A0A(147969);
    public final NavigationTrigger A07;
    public final 76E A08;
    public final 7NH A09;
    public final 72H A0A;

    public A52(Activity activity, Context context, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent, 9JK r306, 76E r307, 72H r308) {
        this.A01 = context;
        this.A04 = r306;
        this.A03 = highlightsFeedContent;
        this.A02 = fbUserSession;
        this.A08 = r307;
        this.A0A = r308;
        this.A00 = activity;
        this.A05 = new 9hK(context, fbUserSession, highlightsFeedContent);
        NavigationTrigger navigationTrigger = (NavigationTrigger) 7zN.A0r(C5bz.A00() ? 9GN.A00 : 9GP.A02, highlightsFeedContent.A05);
        this.A07 = navigationTrigger;
        this.A09 = 7zV.A0W(r306.A00, navigationTrigger == null ? 9GP.A01 : navigationTrigger, new A4w(activity, context, null, fbUserSession, highlightsFeedContent, null), r307);
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        11T.A0F(str2, 1);
        9JK r0 = this.A04;
        if (!(r0 instanceof C8u7)) {
            0fH.A0j("HighlightsClassicContentListener", "No operation due to unsupported QuickReactionTarget");
            return;
        }
        C8u7 c8u7 = (C8u7) r0;
        Long l3 = c8u7.A00;
        if (l3 != null) {
            0fH.A0j("HighlightsClassicContentListener", "addRemoveReactions to SnippetMessageTarget");
            this.A05.A01(r0.A00, str2, c8u7.A01, l3.longValue());
        }
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        11T.A0F(str2, 1);
        9JK r0 = this.A04;
        if (!(r0 instanceof C8u7)) {
            0fH.A0j("HighlightsClassicContentListener", "No operation due to unsupported QuickReactionTarget");
            return;
        }
        C8u7 c8u7 = (C8u7) r0;
        Long l2 = c8u7.A00;
        if (l2 != null) {
            9hK.A00(this.A05, r0.A00, 0S2.A01, str2, c8u7.A01, l2.longValue());
        }
    }
}
