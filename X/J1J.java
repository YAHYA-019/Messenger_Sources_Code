package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: J1J.class */
public final class J1J implements Runnable {
    public static final String __redex_internal_original_name = "VideoPerformanceTracking$addVpsTransferEventDelegate$1";
    public final /* synthetic */ 6Dk A00;
    public final /* synthetic */ 6Tw A01;
    public final /* synthetic */ String A02;

    public J1J(6Dk r302, 6Tw r303, String str) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Dk r0 = this.A00;
        java.util.Map map = r0.A09;
        if (map == null) {
            map = AnonymousClass001.A0u();
            r0.A09 = map;
        }
        String str = this.A02;
        6Tw r02 = this.A01;
        if (!map.containsKey(str)) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(7zL.A14(r02));
            map.put(str, A0s);
        } else {
            List list = (List) map.get(str);
            if (list != null) {
                list.add(7zL.A14(r02));
            }
        }
    }
}
