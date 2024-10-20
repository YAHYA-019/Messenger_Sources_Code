package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.video.plugins.LoadingSpinnerPlugin;

/* loaded from: He2.class */
public final class He2 {
    public final Context A00;
    public final CallerContext A01;
    public final RichVideoPlayer A02;

    public He2(Context context, View view, CallerContext callerContext) {
        2Wo A0w = GOq.A0w(view, 2131368381);
        A0w.A03();
        RichVideoPlayer richVideoPlayer = (RichVideoPlayer) A0w.A01();
        this.A02 = richVideoPlayer;
        this.A00 = context;
        this.A01 = callerContext;
        richVideoPlayer.A0P(new LoadingSpinnerPlugin(context));
        GOo.A17(context, richVideoPlayer);
        richVideoPlayer.A0M(new PlayerOrigin(6TL.A15, 7zK.A00(299)));
        richVideoPlayer.A0J(6TN.A09);
    }
}
