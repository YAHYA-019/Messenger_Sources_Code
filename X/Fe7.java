package X;

import android.os.Bundle;
import com.facebook.drawee.view.DraweeView;

/* loaded from: Fe7.class */
public final class Fe7 implements C4YP {
    @Override // X.C4YP
    public /* bridge */ /* synthetic */ void AMv(Bundle bundle, Object obj) {
        DraweeView draweeView = (DraweeView) obj;
        bundle.putString("drawee_view_info", String.valueOf(draweeView));
        bundle.putString("drawee_controller", String.valueOf(draweeView.A00.A01));
    }

    @Override // X.C4YP
    public Class AW7() {
        return DraweeView.class;
    }
}
