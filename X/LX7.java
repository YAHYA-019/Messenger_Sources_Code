package X;

import android.view.View;
import com.facebook.chatheads.view.bubble.BubbleView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: LX7.class */
public final class LX7 implements C1t1 {
    public final int A00;
    public final Object A01;

    public LX7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View, X.JoO] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.JoQ, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v50, types: [android.view.View, X.JoP] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.34t, androidx.fragment.app.Fragment] */
    @Override // X.C1t1
    public void CIs() {
        String str;
        ML5 A0U;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            JU4 ju4 = (JU4) obj;
            int i2 = JU4.A1p;
            BubbleView bubbleView = ju4.A0G;
            if (bubbleView != null && (A0U = JQy.A0U(bubbleView)) != null) {
                bubbleView.A06.setColorFilter(A0U.Azb());
            }
            ?? r0 = ju4.A0O;
            if (r0 != 0) {
                r0.A00.setImageDrawable(JQy.A0X((View) r0).A00(2MQ.A0x));
            }
            ?? r02 = ju4.A0N;
            if (r02 != 0) {
                r02.A05.setImageDrawable(JQy.A0X((View) r02).A00(2MQ.A2W));
            }
            ?? r03 = ju4.A0M;
            if (r03 != 0) {
                r03.A04.setImageDrawable(JQy.A0X((View) r03).A00(2MQ.A1u));
                return;
            }
            return;
        }
        ?? r04 = (C34t) obj;
        2SI r05 = C34t.A0R;
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(r04.requireContext(), (1BY) null, 16979);
        MigColorScheme migColorScheme2 = r04.A0C;
        if (migColorScheme2 == null) {
            str = "colorScheme";
        } else {
            if (migColorScheme2.equals(migColorScheme)) {
                return;
            }
            r04.A0C = migColorScheme;
            AbH.A1K(r04.requireView(), migColorScheme.BDl());
            2Sc r06 = r04.A0A;
            if (r06 != null) {
                C34t.A06(r04, r06.A00());
                return;
            }
            str = "inboxViewData";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
