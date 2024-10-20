package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.xma.ui.XMALinearLayout;

/* loaded from: E2e.class */
public final class E2e extends XMALinearLayout implements CallerContextable {
    public static final String __redex_internal_original_name = "GameShareView";
    public final FbDraweeView A00;
    public final E2L A01;
    public final 2Wo A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2e(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        A0D(2132542363);
        setOrientation(1);
        E2L e2l = new E2L(this);
        this.A01 = e2l;
        this.A00 = DKC.A0M(this, 2131368295);
        e2l.A01.setVisibility(8);
        View A01 = C09s.A01(this, 2131366555);
        11T.A0I(A01, 1BJ.A00(14));
        this.A02 = 2Wo.A00((ViewStub) A01);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A00.getVisibility() == 0) {
            this.A01.A05.setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
    }
}
