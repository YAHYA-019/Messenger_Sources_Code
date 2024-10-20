package X;

import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Gl0, reason: case insensitive filesystem */
/* loaded from: Gl0.class */
public final class C2682Gl0 extends LithoView implements JFq {
    public Gqn A00;
    public MigColorScheme A01;

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        RrB rrB = (RrB) jdb;
        11T.A0F(rrB, 0);
        EffectItem effectItem = rrB.A00;
        if (effectItem != null) {
            1Iw r0 = ((LithoView) this).A09;
            Parcelable.Creator creator = VideoDataSource.CREATOR;
            6A9 r02 = new 6A9();
            r02.A03 = effectItem.A0B;
            6TA A0X = AbstractC2326GOr.A0X(6AB.A05, r02);
            A0X.A1h = true;
            A0X.A0k = true;
            A0X.A0i = "DEEPLINK_EFFECT_SHARE_VIDEO_PREVIEW";
            VideoPlayerParams videoPlayerParams = new VideoPlayerParams(A0X);
            FbUserSession A01 = 1Fw.A01(r0.A0D);
            HashMap A0u = AnonymousClass001.A0u();
            HashSet A0v = AnonymousClass001.A0v();
            CallerContext callerContext = CallerContext.A08;
            1Fz r03 = FbUserSession.A00;
            6TI A00 = 6TF.A00(A01, callerContext, videoPlayerParams, A0u, (java.util.Map) null, A0v, effectItem.A04 / effectItem.A03, false);
            MigColorScheme migColorScheme = this.A01;
            if (migColorScheme == null) {
                11T.A0L("colorScheme");
                throw 0Q8.createAndThrow();
            }
            A0x(new QH1(effectItem, migColorScheme, A00, rrB.A01));
        }
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(918849554);
        super.onAttachedToWindow();
        Gqn gqn = this.A00;
        if (gqn == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqn.A0Y(this);
        0FI.A0C(455044002, A06);
    }

    @Override // com.facebook.litho.BaseMountingView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(309266877);
        Gqn gqn = this.A00;
        if (gqn == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        gqn.A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-748344036, A06);
    }
}
