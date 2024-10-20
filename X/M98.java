package X;

import android.os.Bundle;
import java.util.Set;

/* loaded from: M98.class */
public final class M98 extends C00q implements 0Be {
    public final /* synthetic */ KuS $bloksPerf;
    public final /* synthetic */ Set $cachedLayers;
    public final /* synthetic */ C11444wi $logger;
    public final /* synthetic */ String $promptSessionId;
    public final /* synthetic */ Bundle $tracking;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M98(Bundle bundle, KuS kuS, C11444wi c11444wi, String str, Set set) {
        super(4);
        this.$bloksPerf = kuS;
        this.$logger = c11444wi;
        this.$cachedLayers = set;
        this.$promptSessionId = str;
        this.$tracking = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean A1V = AnonymousClass001.A1V(obj3);
        java.util.Map map = (java.util.Map) obj4;
        11T.A0F(str, 0);
        1BK.A1J(str2, 1, map);
        if (0CV.A0b(str2, "PROMPTED_", false)) {
            this.$bloksPerf.A04(true);
        }
        C11444wi c11444wi = this.$logger;
        03W A0G = 04R.A0G();
        Set set = this.$cachedLayers;
        c11444wi.A03(this.$tracking, str2, "usage", str, this.$promptSessionId, A0G, map, set, A1V);
        return 04S.A00;
    }
}
