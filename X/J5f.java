package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.function.Consumer;

/* loaded from: J5f.class */
public final class J5f implements Consumer {
    public final int A00;
    public final Object A01;

    public J5f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.A00 != 0) {
            MediaResource mediaResource = (MediaResource) obj;
            11T.A0F(mediaResource, 0);
            GWj.A01((GWj) this.A01, mediaResource);
        } else {
            Jt1 jt1 = (Jt1) obj;
            ((LEJ) this.A01).A04.put(jt1.A05, jt1);
        }
    }
}
