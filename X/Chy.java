package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import kotlin.jvm.functions.Function1;

/* loaded from: Chy.class */
public final class Chy implements DIP {
    public final /* synthetic */ BHd A00;

    public Chy(BHd bHd) {
        this.A00 = bHd;
    }

    public void Bqa() {
        C00m c00m = this.A00.A00;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void BzM() {
        C00m c00m = this.A00.A01;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void BzN() {
        C00m c00m = this.A00.A02;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void CKF(MediaResource mediaResource) {
        Function1 function1 = this.A00.A03;
        if (function1 != null) {
            function1.invoke(mediaResource);
        }
    }
}
