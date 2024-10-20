package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.List;

/* loaded from: D2m.class */
public final class D2m implements Function {
    public final /* synthetic */ 5Ht A00;
    public final /* synthetic */ MediaResource A01;
    public final /* synthetic */ String A02;

    public D2m(5Ht r302, MediaResource mediaResource, String str) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = mediaResource;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        MediaResource mediaResource = (MediaResource) ((OperationResult) obj).A08();
        if (mediaResource == null) {
            String str = this.A02;
            if (str == null) {
                return null;
            }
            ((5Et) this.A00.A0F.get()).A05(str, (List) null, 4, 1108);
            return null;
        }
        5Ht r0 = this.A00;
        5HQ r02 = (5HQ) r0.A09.get();
        MediaResource mediaResource2 = this.A01;
        r02.A03(mediaResource2, mediaResource);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(String.valueOf(mediaResource2.A04));
        A0s.add(String.valueOf(mediaResource2.A00));
        A0s.add(String.valueOf(mediaResource.A04));
        A0s.add(String.valueOf(mediaResource.A00));
        A0s.add(String.valueOf(mediaResource2.A08));
        A0s.add(String.valueOf(mediaResource2.A07));
        if (this.A02 == null) {
            return null;
        }
        r0.A0F.get();
        return null;
    }
}
