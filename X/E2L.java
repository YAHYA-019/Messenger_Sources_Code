package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.xma.ui.XMALinearLayout;

/* loaded from: E2L.class */
public final class E2L extends EeO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final FbDraweeView A04;
    public final XMALinearLayout A05;

    public E2L(View view) {
        super(view);
        View view2 = ((EeO) this).A00;
        this.A05 = (XMALinearLayout) C09s.A01(view2, 2131365478);
        this.A04 = DKC.A0M(view2, 2131368303);
        this.A02 = AbG.A09(view2, 2131363300);
        this.A03 = AbG.A09(view2, 2131368301);
        this.A00 = AbG.A09(view2, 2131363354);
        this.A01 = AbG.A09(view2, 2131365659);
    }
}
