package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import kotlin.jvm.functions.Function1;

/* loaded from: Chz.class */
public final class Chz implements DIP {
    public final /* synthetic */ BHc A00;

    public Chz(BHc bHc) {
        this.A00 = bHc;
    }

    public void Bqa() {
    }

    public void BzM() {
        C00m c00m = this.A00.A00;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void BzN() {
        C00m c00m = this.A00.A01;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void CKF(MediaResource mediaResource) {
        Function1 function1 = this.A00.A02;
        if (function1 != null) {
            function1.invoke(mediaResource);
        }
    }
}
