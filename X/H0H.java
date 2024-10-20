package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.ui.searchbar.ExpressionSearchBarView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: H0H.class */
public final class H0H extends HGH {
    public 06Z A00;
    public LifecycleOwner A01;
    public ThreadKey A02;
    public MigColorScheme A03;
    public H4x A04;
    public Capabilities A05;
    public String A06;
    public final JMq A07;
    public final String A08;

    public H0H(JMq jMq, String str) {
        this.A08 = str;
        this.A07 = jMq;
    }

    public void A05() {
        ((HGH) this).A00 = false;
        H4x h4x = this.A04;
        if (h4x != null) {
            h4x.A0a.A0Y();
            h4x.A0b.A0Y();
            IA5 ia5 = (IA5) 1Br.A0B(h4x.A0Q);
            ExpressionSearchBarView expressionSearchBarView = h4x.A0X;
            String A0u = AbM.A0u(expressionSearchBarView.A02);
            11T.A0F(A0u, 0);
            String str = ia5.A00;
            if (str != null) {
                1UG A08 = 1BK.A08(1Br.A02(((HQD) 1Br.A0B(ia5.A02)).A00), 1BJ.A00(1025));
                0DA r0 = new 0DA();
                r0.A07("search_query", A0u);
                AbstractC2326GOr.A18(r0, A08, str);
            }
            ia5.A05.clear();
            ia5.A00 = null;
            if (expressionSearchBarView.getVisibility() != 0 || h4x.A0L.getVisibility() == 0) {
                return;
            }
            h4x.A0Y.BdD();
        }
    }
}
