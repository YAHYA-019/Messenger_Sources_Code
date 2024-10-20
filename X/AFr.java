package X;

import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: AFr.class */
public final class AFr implements Runnable {
    public static final String __redex_internal_original_name = "OneLineComposerView$InsertMediaItemFromKeyboardRunnable";
    public final ThreadKey A00;
    public final MediaResource A01;
    public final WeakReference A02;

    public AFr(6Qf r302, ThreadKey threadKey, MediaResource mediaResource) {
        this.A01 = mediaResource;
        this.A02 = 7zL.A14(r302);
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.A02;
        if (weakReference.get() != null) {
            6Qe r0 = (6Qf) weakReference.get();
            MediaResource mediaResource = this.A01;
            6QS r02 = r0.A00;
            ArrayList A17 = 1BK.A17(((OneLineComposerView) r02.A0A).A0v);
            A17.add(mediaResource);
            r02.A0A.CrB(A17);
        }
    }
}
