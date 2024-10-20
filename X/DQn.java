package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: DQn.class */
public final class DQn extends RelativeLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A06(DQn.class);
    public static final String __redex_internal_original_name = "CreateShortcutDialogView";
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public FbDraweeView A04;

    public DQn(Context context) {
        super(context, null, 0);
        View.inflate(getContext(), 2132542118, this);
        Object findViewById = findViewById(2131364282);
        11T.A0I(findViewById, "null cannot be cast to non-null type com.facebook.drawee.fbpipeline.FbDraweeView");
        this.A04 = (FbDraweeView) findViewById;
        View findViewById2 = findViewById(2131363465);
        11T.A0I(findViewById2, JQw.A00(1));
        this.A03 = (TextView) findViewById2;
        this.A00 = findViewById(2131362859);
        this.A01 = findViewById(2131363464);
        this.A02 = findViewById(2131364527);
        View view = this.A00;
        View view2 = this.A01;
        if (view != null) {
            C2rp.A01(view);
        }
        if (view2 != null) {
            C2rp.A01(view2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(818563586, 0FI.A05(1309505255));
        return true;
    }
}
