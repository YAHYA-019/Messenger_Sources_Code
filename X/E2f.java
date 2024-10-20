package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.business.attachments.media.model.PlatformMediaAttachmentItem;
import com.facebook.messaging.xma.ui.XMALinearLayout;

/* loaded from: E2f.class */
public final class E2f extends XMALinearLayout implements CallerContextable {
    public static final CallerContext A09 = CallerContext.A06(E2f.class);
    public static final String __redex_internal_original_name = "PlatformMediaAttachmentItemView";
    public TextView A00;
    public C00i A01;
    public PlatformMediaAttachmentItem A02;
    public final View A03;
    public final C00i A04;
    public final 2Wo A05;
    public final 2Wo A06;
    public final 2Wo A07;
    public final 2Wo A08;

    public E2f(Context context) {
        super(context, null, 0);
        this.A00 = null;
        this.A02 = null;
        this.A04 = 1BQ.A02(100034);
        this.A01 = 1BQ.A02(16520);
        DKG.A1S(this, 2132542953);
        this.A03 = C09s.A01(this, 2131366573);
        this.A07 = AbK.A0v(this, 2131366570);
        this.A08 = AbK.A0v(this, 2131366576);
        this.A05 = AbK.A0v(this, 2131366571);
        this.A06 = AbK.A0v(this, 2131366568);
        this.A01 = 1BQ.A02(16520);
        this.A01 = 1BQ.A02(16520);
    }
}
