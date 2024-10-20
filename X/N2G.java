package X;

import com.facebook.fbshorts.sharesheet.coverphotoselector.model.CoverPhotoSelectionResultDataModel;
import com.facebook.ipc.composer.model.MetaGalleryMediaPublishingData;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N2G.class */
public final class N2G {
    public CoverPhotoSelectionResultDataModel A01;
    public MT4 A02;
    public EnumC3479Mex A03;
    public MetaGalleryMediaPublishingData A04;
    public EnumC3480Mey A05;
    public EnumC3475Met A06;
    public EMo A07;
    public ImmutableList A0C;
    public ImmutableList A0D;
    public ImmutableList A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public Set A0Q = AnonymousClass001.A0v();
    public ImmutableList A08 = ImmutableList.of();
    public ImmutableList A09 = ImmutableList.of();
    public String A0J = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
    public ImmutableList A0A = ImmutableList.of();
    public int A00 = -1;
    public ImmutableList A0B = ImmutableList.of();

    public static void A00(N2G n2g, String str) {
        if (n2g.A0Q.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n2g.A0Q);
        n2g.A0Q = A1E;
        A1E.add(str);
    }
}
