package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.messaging.montage.composer.CanvasEditorView;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.montage.composer.model.MentionReshareModel;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.photos.editing.MediaOverlayLayer;
import com.facebook.user.tiles.UserTileView;

/* loaded from: Iqc.class */
public final class Iqc implements Runnable {
    public static final String __redex_internal_original_name = "MontageComposerFragment$3";
    public final /* synthetic */ MontageComposerFragment A00;

    public Iqc(MontageComposerFragment montageComposerFragment) {
        this.A00 = montageComposerFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaOverlayLayer mediaOverlayLayer;
        MontageComposerFragment montageComposerFragment = this.A00;
        MentionReshareModel mentionReshareModel = montageComposerFragment.A0B.A0B;
        if (mentionReshareModel != null) {
            IFl iFl = montageComposerFragment.A03.A1C;
            IQ0 iq0 = iFl.A0J;
            GpB gpB = iq0.A05;
            if (gpB == null) {
                mediaOverlayLayer = new MediaOverlayLayer();
                iq0.A0c.A05(mediaOverlayLayer);
            } else {
                mediaOverlayLayer = (MediaOverlayLayer) ((IDq) gpB).A06;
            }
            CanvasEditorView canvasEditorView = iFl.A0j;
            View A08 = AbG.A08(DKD.A0A(canvasEditorView), canvasEditorView, 2132543169);
            TextView A06 = AbF.A06(A08, 2131366698);
            UserTileView userTileView = (UserTileView) A08.findViewById(2131366699);
            MontageUser montageUser = mentionReshareModel.A01;
            A06.setText(montageUser.A02);
            userTileView.A03(2qZ.A04(montageUser.A01));
            mediaOverlayLayer.A00 = mentionReshareModel.A02;
            mediaOverlayLayer.A01.add(A08);
            mediaOverlayLayer.A02(mentionReshareModel.A00);
            GpB gpB2 = iFl.A0J.A05;
            if (gpB2 != null) {
                gpB2.A0L();
            }
        }
    }
}
