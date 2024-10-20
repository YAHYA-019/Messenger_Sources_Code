package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.AbstractCollection;
import java.util.function.Predicate;

/* loaded from: J5g.class */
public final class J5g implements Predicate {
    public final int A00;
    public final Object A01;

    public J5g(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.function.Predicate
    public /* bridge */ /* synthetic */ boolean test(Object obj) {
        if (this.A00 != 0) {
            return ((AbstractCollection) this.A01).add(obj);
        }
        MediaResource mediaResource = (MediaResource) obj;
        11T.A0F(mediaResource, 0);
        return AnonymousClass001.A1W(mediaResource.A0E, this.A01);
    }
}
