package X;

import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;
import com.facebook.user.tiles.UserTileView;

/* loaded from: H00.class */
public final class H00 extends C66m {
    public final /* synthetic */ MontageViewerReplyStatusView A00;

    public H00(MontageViewerReplyStatusView montageViewerReplyStatusView) {
        this.A00 = montageViewerReplyStatusView;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = (float) c66i.A09.A00;
        UserTileView userTileView = this.A00.A0B;
        userTileView.setScaleX(f);
        userTileView.setScaleY(f);
    }
}
