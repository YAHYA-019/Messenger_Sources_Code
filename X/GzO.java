package X;

import android.content.Context;
import com.facebook.messaging.montage.composer.MontageComposerActivity;

/* loaded from: GzO.class */
public final class GzO extends GzQ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ MontageComposerActivity A01;

    public GzO(Context context, MontageComposerActivity montageComposerActivity) {
        this.A01 = montageComposerActivity;
        this.A00 = context;
    }

    @Override // X.Frf
    public void onPermissionsGranted() {
        MontageComposerActivity.A16(this.A01);
    }
}
