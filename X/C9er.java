package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.9er, reason: invalid class name */
/* loaded from: 9er.class */
public final class C9er {
    public final 1Br A00 = 1BK.A0C();

    public static final void A00(C9er c9er, ThreadKey threadKey, Long l, String str, String str2, boolean z) {
        if (ThreadKey.A0k(threadKey) && 2yD.A03(1Br.A07(c9er.A00), 36317547670285679L)) {
            PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, "FBLegacyBroker");
            11T.A0A(newPrivacyContextWithTransportKeyNative);
            ArrayList arrayList = new ArrayList(1);
            Collections.addAll(arrayList, "");
            C9ea.A00(newPrivacyContextWithTransportKeyNative, false, 1L, 0L, 1233456L, 1L, 0L, 0L, Long.valueOf(3), str2, str, arrayList, 0L, z ? 0L : 1L, l != null ? l.longValue() : 1L);
        }
    }
}
