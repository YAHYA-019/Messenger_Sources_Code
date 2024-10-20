package X;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.messaging.media.editing.MultimediaEditorDraweeView;
import com.facebook.messaging.media.editing.MultimediaEditorPhotoImageViewer;

/* renamed from: X.Ggf, reason: case insensitive filesystem */
/* loaded from: Ggf.class */
public final class C2532Ggf extends 7kB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ MultimediaEditorDraweeView A01;
    public final /* synthetic */ MultimediaEditorPhotoImageViewer A02;

    public C2532Ggf(Context context, MultimediaEditorDraweeView multimediaEditorDraweeView, MultimediaEditorPhotoImageViewer multimediaEditorPhotoImageViewer) {
        this.A02 = multimediaEditorPhotoImageViewer;
        this.A00 = context;
        this.A01 = multimediaEditorDraweeView;
    }

    public void A00(2EU r302) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A00.getResources(), 7zL.A0C(r302));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        this.A01.A0P(bitmapDrawable);
    }
}
