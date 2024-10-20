package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* renamed from: X.4kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kb.class */
public final class C07654kb extends AbstractC07504k2 {
    public C5nh A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final java.util.Map A04;
    public final boolean A05;

    public C07654kb(ThreadKey threadKey, boolean z) {
        11T.A0F(threadKey, 1);
        this.A03 = threadKey;
        this.A02 = 1Bq.A00(65723);
        this.A01 = 1Bq.A00(16385);
        this.A04 = new HashMap();
        this.A05 = z;
    }

    public static final String A00(C07654kb c07654kb) {
        String BCy = ((2yD) c07654kb.A01.A00.get()).BCy(36885746074650201L);
        11T.A0A(BCy);
        return BCy;
    }

    public static final void A01(C07654kb c07654kb) {
        java.util.Map map = c07654kb.A04;
        int size = map.size();
        1Fg.A00(size, "expectedSize");
        ImmutableMap.Builder builder = new ImmutableMap.Builder(size);
        synchronized (map) {
            builder.putAll(map);
        }
        c07654kb.A05(builder.build());
    }
}
