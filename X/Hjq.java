package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: Hjq.class */
public final class Hjq {
    public 1BY A00;
    public final View A01;
    public final CallerContext A02;
    public final FbDraweeView A03;
    public final HRh A09;
    public final C00i A04 = 7zN.A0D(49976);
    public final C00i A07 = 1BQ.A02(49322);
    public final C00i A06 = AbH.A0E();
    public final C00i A08 = 1BQ.A02(16472);
    public final C00i A05 = 1BQ.A02(49958);

    public Hjq(View view, CallerContext callerContext, 1BO r304, HRh hRh) {
        this.A00 = 7zL.A0Q(r304);
        2Wo A0w = GOq.A0w(view, 2131366458);
        A0w.A03();
        this.A03 = (FbDraweeView) A0w.A01().requireViewById(2131366455);
        this.A01 = A0w.A01().requireViewById(2131365315);
        this.A02 = callerContext;
        this.A09 = hRh;
    }
}
