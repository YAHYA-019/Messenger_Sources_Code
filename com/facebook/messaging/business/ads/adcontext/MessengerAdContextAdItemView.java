package com.facebook.messaging.business.ads.adcontext;

import X.1BY;
import X.1Bn;
import X.6TL;
import X.C09s;
import X.C52j;
import X.DKC;
import X.F4u;
import X.FXr;
import X.H31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.video.plugins.CoverImagePlugin;
import com.facebook.video.plugins.LoadingSpinnerPlugin;
import com.facebook.video.plugins.common.VideoPlugin;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;
import com.google.common.collect.ImmutableList;

/* loaded from: MessengerAdContextAdItemView.class */
public class MessengerAdContextAdItemView extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A06(MessengerAdContextAdItemView.class);
    public F4u A00;
    public String A01;
    public final FbDraweeView A02;
    public final RichVideoPlayer A03;
    public final BetterTextView A04;

    public MessengerAdContextAdItemView(Context context) {
        this(context, null, 0);
        this.A00 = (F4u) 1Bn.A0E(context, (1BY) null, 82309);
    }

    public MessengerAdContextAdItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.facebook.video.player.RichVideoPlayer, android.view.View] */
    public MessengerAdContextAdItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = (F4u) 1Bn.A0E(context, (1BY) null, 82309);
        A0D(2132541496);
        setOrientation(1);
        this.A02 = DKC.A0M(this, 2131361919);
        this.A03 = (RichVideoPlayer) C09s.A01(this, 2131361922);
        this.A04 = DKC.A0g(this, 2131361921);
        ?? r0 = this.A03;
        Context context2 = getContext();
        r0.A0Q(ImmutableList.of((Object) new VideoPlugin(context2), (Object) new CoverImagePlugin(context2, A05), (Object) new LoadingSpinnerPlugin(context2), (Object) new H31(context2)));
        r0.A0M(new PlayerOrigin(6TL.A1I, "ad_context"));
        r0.CrU(C52j.A09, true);
        FXr.A03((View) r0, this, 64);
    }
}
