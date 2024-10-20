package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Adc, reason: case insensitive filesystem */
/* loaded from: Adc.class */
public abstract class AbstractC1299Adc {
    public static final 55E A00(DFj dFj, AdZ adZ, User user, HashMap hashMap, boolean z) {
        MontageBucketPreview montageBucketPreview;
        if (hashMap == null || (montageBucketPreview = (MontageBucketPreview) hashMap.get(user.A0k)) == null || Long.valueOf(montageBucketPreview.A02.A00) == null) {
            Integer num = 0S2.A00;
            11T.A0F(num, 2);
            adZ.A00 = z;
            return AdZ.A06(adZ, AdZ.A05(adZ), AdZ.A08(adZ, user, num));
        }
        Integer A0E = adZ.A0E(montageBucketPreview);
        11T.A0F(A0E, 2);
        adZ.A00 = z;
        return new 58R(new C1313Adr(montageBucketPreview, dFj), AdZ.A06(adZ, AdZ.A05(adZ), AdZ.A08(adZ, user, A0E)));
    }

    public static AnonymousClass557 A01(AeL aeL, 55A r302, 55B r303, 55E r304, AnonymousClass555 anonymousClass555, User user, long j, boolean z, boolean z2) {
        AnonymousClass557 anonymousClass557;
        if (r302 == null) {
            0fH.A14("UserSearchResult", "Could not create ListItemName for user with ID:%s", new Object[]{user.A13});
            anonymousClass557 = null;
        } else {
            anonymousClass557 = new AnonymousClass557();
            anonymousClass557.A05(aeL.A05);
            anonymousClass557.A00 = j;
            anonymousClass557.A05 = r304;
            anonymousClass557.A03(r302);
            if (z2) {
                anonymousClass557.A04 = r303;
            }
            if (user.A0D() && !user.A20) {
                anonymousClass557.A0C = false;
            }
            if (z && 02L.A0C(user.A0a, AeL.A06)) {
                anonymousClass557.A06(ImmutableList.of((Object) anonymousClass555));
                return anonymousClass557;
            }
        }
        return anonymousClass557;
    }
}
