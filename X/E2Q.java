package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.graphql.enums.GraphQLMessengerPlatformWebviewPerformanceOption;
import com.facebook.messaging.business.attachments.generic.model.PlatformGenericAttachmentItem;
import com.facebook.messaging.business.attachments.generic.views.PlatformGenericAttachmentItemView;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: E2Q.class */
public final class E2Q extends C6eO {
    public final Context A00;
    public final 1H2 A01;

    public E2Q() {
        Context A0J = 7zP.A0J();
        1H2 A0R = DKE.A0R();
        this.A00 = A0J;
        this.A01 = A0R;
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ void A01(5zD r302, 6Az r303, EeO eeO, 7Wh r305) {
        Uri uri;
        PlatformGenericAttachmentItem platformGenericAttachmentItem;
        2JY A0B;
        PlatformGenericAttachmentItemView platformGenericAttachmentItemView = (PlatformGenericAttachmentItemView) eeO.A00;
        String A02 = this.A01.A02();
        ArE BEO = r303.BEO();
        if (BEO == null) {
            platformGenericAttachmentItem = null;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            ImmutableList Aaw = BEO.Aaw();
            11T.A0A(Aaw);
            1Du it = Aaw.iterator();
            while (it.hasNext()) {
                DKH.A1U(A0s, it);
            }
            Uri uri2 = null;
            CallToAction callToAction = null;
            String A0k = BEO.A0k();
            String A0r = BEO.A0r(-1110335448);
            String A0r2 = BEO.A0r(1582230244);
            String A0r3 = BEO.A0r(179637073);
            String A0r4 = BEO.A0r(-84827089);
            String A0r5 = BEO.A0r(-877823861);
            if (TextUtils.isEmpty(A0r5)) {
                uri = null;
            } else {
                try {
                    uri = C0A2.A03(A0r5);
                } catch (SecurityException unused) {
                    uri = null;
                }
            }
            float doubleValue = (float) BEO.getDoubleValue(804991432);
            String A0j = BEO.A0j();
            GraphQLMessengerPlatformWebviewPerformanceOption graphQLMessengerPlatformWebviewPerformanceOption = (GraphQLMessengerPlatformWebviewPerformanceOption) BEO.A0g(GraphQLMessengerPlatformWebviewPerformanceOption.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -867919397);
            2JY A0B2 = 1BK.A0B(BEO, 2JX.class, 1554253136, 774234602);
            String A0l = (A0B2 == null || (A0B = 1BK.A0B(A0B2, 2JX.class, -667550521, 1583864102)) == null) ? null : A0B.A0l();
            if (!TextUtils.isEmpty(A0l)) {
                try {
                    uri2 = C0A2.A03(A0l);
                } catch (SecurityException unused2) {
                }
            }
            AcH A0L = BEO.A0L(1624984052, AcH.class, 423528630);
            if (A0L != null) {
                callToAction = AbstractC08734ns.A00(A0L);
            }
            platformGenericAttachmentItem = new PlatformGenericAttachmentItem(uri2, uri, graphQLMessengerPlatformWebviewPerformanceOption, callToAction, null, A02, null, A0k, A0r, A0r2, A0r3, A0r4, A0j, A0s, doubleValue, 0);
        }
        platformGenericAttachmentItemView.A0G(null, platformGenericAttachmentItem, null);
    }

    @Override // X.C6eO
    public /* bridge */ /* synthetic */ EeO A02(ViewGroup viewGroup) {
        return new EeO(new PlatformGenericAttachmentItemView(this.A00, null));
    }
}
