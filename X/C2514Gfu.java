package X;

import android.graphics.drawable.Animatable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.media.editing.MultimediaEditorDraweeView;
import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;

/* renamed from: X.Gfu, reason: case insensitive filesystem */
/* loaded from: Gfu.class */
public final class C2514Gfu extends 4gL {
    public final /* synthetic */ MultimediaEditorDraweeView A00;

    public C2514Gfu(MultimediaEditorDraweeView multimediaEditorDraweeView) {
        this.A00 = multimediaEditorDraweeView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.media.editing.MultimediaEditorDraweeView, android.view.View] */
    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        ?? r0 = this.A00;
        r0.requestLayout();
        CallerContext callerContext = FbDraweeView.A03;
        HRb hRb = r0.A00;
        if (hRb != null) {
            MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer = hRb.A00;
            CallerContext callerContext2 = MultimediaEditorPhotoImageViewer.A0B;
            HTX htx = multimediaEditorPhotoImageViewer.A06;
            if (htx != null) {
                IWi iWi = htx.A00;
                Integer num = IWi.A0b;
                iWi.A0W.A00((2EU) null);
            }
        }
    }
}
