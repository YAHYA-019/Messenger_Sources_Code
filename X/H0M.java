package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: H0M.class */
public final class H0M extends H65 implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A06(H0M.class);
    public static final String __redex_internal_original_name = "StickerItemDefaultViewHolder";
    public Hpv A00;
    public 1BY A01;
    public final Context A02;
    public final FbDraweeView A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public H0M(View view, 1BO r303, String str) {
        super(view);
        this.A06 = 1BV.A01((1BY) null, 50201);
        this.A05 = 1BV.A01((1BY) null, 492);
        this.A01 = 7zL.A0Q(r303);
        Context context = view.getContext();
        this.A02 = context;
        ?? r0 = (FbDraweeView) C09s.A01(view, 2131367600);
        this.A03 = r0;
        r0.setOnLongClickListener(new FY3(str, this, 1));
        IKB.A00((View) r0, this, 60);
        r0.setOnTouchListener(new IKf(str, this, 0));
        this.A04 = AbF.A0Q(context, 84088);
    }
}
