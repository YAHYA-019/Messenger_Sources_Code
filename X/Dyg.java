package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* loaded from: Dyg.class */
public final class Dyg extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("MessageReplyAttachmentComponentSpec");
    public int A00;

    public Dyg() {
        super("MessageReplyAttachmentComponent");
    }

    public final Object[] A0k() {
        return AnonymousClass001.A1a(this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        11T.A0F(r302, 0);
        SpannableString spannableString = new SpannableString(4YU.A0E(r302).getString(2131959733));
        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 0);
        C1rq A00 = C1rg.A00(r302);
        C2152Dfg c2152Dfg = new C2152Dfg(r302);
        c2152Dfg.A05 = spannableString;
        FAa A05 = AbstractC2178Dg6.A05(c2152Dfg, EP4.A08);
        A05.A05(i);
        AbstractC2178Dg6.A0G(c2152Dfg, A05);
        c2152Dfg.A0k(C26z.VERTICAL, 2132279305);
        AbstractC2178Dg6.A09(A01, c2152Dfg, A00);
        A00.A0a();
        A00.A1Z(R.dimen.mapbox_eight_dp);
        return A00.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
