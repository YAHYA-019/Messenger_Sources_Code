package X;

import android.net.Uri;
import com.facebook.bloks.messenger.implementations.plugins.core.opencamera.OpenCameraImplementation;
import com.facebook.bloks.messenger.implementations.plugins.core.openmediapicker.OpenMediaPickerImplementation;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Fjc.class */
public final class Fjc implements JJz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Fjc(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj3;
        this.A01 = obj2;
        this.A02 = obj4;
    }

    @Override // X.JJz
    public void Bn5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v2, types: [java.util.AbstractCollection] */
    @Override // X.JJz
    public void CBb(List list) {
        String A02;
        1Br r304;
        if (this.A00 != 0) {
            11T.A0F(list, 0);
            if (!1BK.A1Y(list)) {
                return;
            }
            ?? A0z = 1BL.A0z(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaResource mediaResource = (MediaResource) it.next();
                FGe fGe = FGe.A02;
                Uri uri = mediaResource.A0E;
                11T.A09(uri);
                1BK.A1N(F06.A00(uri), (AbstractCollection) A0z);
            }
            r304 = ((OpenMediaPickerImplementation) this.A04).A00;
            A02 = A0z;
        } else {
            11T.A0F(list, 0);
            if (!1BK.A1Y(list)) {
                return;
            }
            FGe fGe2 = FGe.A02;
            Uri uri2 = ((MediaResource) list.get(0)).A0E;
            11T.A09(uri2);
            A02 = 11T.A02(F06.A00(uri2));
            r304 = ((OpenCameraImplementation) this.A04).A00;
        }
        1Br.A0C(r304);
        GJj gJj = (GJj) this.A03;
        DKc dKc = new DKc(11T.A03(A02));
        FHh fHh = (FHh) this.A01;
        11T.A0F(dKc, 1);
        FEK.A00(fHh, dKc, gJj);
    }

    @Override // X.JJz
    public void onError() {
        1Br r304;
        int i = this.A00;
        GJj gJj = (GJj) this.A02;
        if (i != 0) {
            if (gJj == null) {
                return;
            } else {
                r304 = ((OpenMediaPickerImplementation) this.A04).A00;
            }
        } else if (gJj == null) {
            return;
        } else {
            r304 = ((OpenCameraImplementation) this.A04).A00;
        }
        1Br.A0C(r304);
        DKc dKc = DKc.A01;
        11T.A0B(dKc);
        FEK.A01(dKc, gJj, this.A01);
    }
}
