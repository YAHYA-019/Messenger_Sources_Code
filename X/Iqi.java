package X;

import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;
import com.facebook.messaging.montage.composer.CanvasEditorView;

/* loaded from: Iqi.class */
public final class Iqi implements Runnable {
    public static final String __redex_internal_original_name = "PostCaptureEffectViewController$PostCaptureEffectCallback$onEffectRenderingStarted$1";
    public final /* synthetic */ ICe A00;

    public Iqi(ICe iCe) {
        this.A00 = iCe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CanvasEditorView canvasEditorView = this.A00.A0B;
        CanvasEditorView.A00(canvasEditorView);
        MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = canvasEditorView.A02;
        if (multimediaEditorPhotoImageViewer != null) {
            multimediaEditorPhotoImageViewer.A0A.A01().setVisibility(8);
        }
    }
}
