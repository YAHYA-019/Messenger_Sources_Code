package X;

import android.os.Bundle;
import android.text.Spannable;
import android.text.style.URLSpan;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.LinkShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.TextShareIntentModel;

/* loaded from: Csc.class */
public final class Csc implements DFq {
    public static final NavigationTrigger A01 = NavigationTrigger.A03("browser_share");
    public final 53A A00 = (53A) 1Bi.A03(49474);

    @Override // X.DFq
    public BroadcastFlowIntentModel AHz(Bundle bundle) {
        String string = bundle.getString("share_link_url");
        if (!1JF.A0B(string)) {
            return new LinkShareIntentModel(CJb.A00(bundle, CBd.A00(bundle, A01)), bundle.getString(AbstractC00603o4.A00(9)) != null ? BMK.A06 : BWC.A00(bundle), string, bundle.getString(AbstractC00603o4.A00(636)), BWF.A00(bundle.getString("attribution_id_v2")).shareType);
        }
        String string2 = bundle.getString("android.intent.extra.TEXT");
        LinkShareIntentModel linkShareIntentModel = null;
        if (!1JF.A0B(string2)) {
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string2);
            if (53W.A00(newSpannable, (C5um) null, (C5un) null, (C5n1) null, 1)) {
                URLSpan uRLSpan = ((URLSpan[]) newSpannable.getSpans(0, newSpannable.length(), URLSpan.class))[0];
                String str = !string2.equals(uRLSpan.getURL()) ? string2 : "";
                BMK A00 = BWC.A00(bundle);
                String url = uRLSpan.getURL();
                if (1JF.A0B(url) || !1JF.A0B(str)) {
                    return new TextShareIntentModel(CBd.A00(bundle, A01), A00, string2);
                }
                linkShareIntentModel = new LinkShareIntentModel(CBd.A00(bundle, A01), A00, url);
            }
        }
        return linkShareIntentModel;
    }
}
