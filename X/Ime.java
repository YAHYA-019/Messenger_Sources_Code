package X;

import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: Ime.class */
public final class Ime implements Function {
    public final /* synthetic */ IfG A00;
    public final /* synthetic */ java.util.Map A01;
    public final /* synthetic */ boolean A02;

    public Ime(IfG ifG, java.util.Map map, boolean z) {
        this.A00 = ifG;
        this.A01 = map;
        this.A02 = z;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        IXv iXv = (JNm) obj;
        IfG ifG = this.A00;
        ConcurrentMap concurrentMap = ifG.A07;
        java.util.Map map = this.A01;
        if (11T.A0O(concurrentMap, map) && ifG.A00 == this.A02) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            int A03 = AnonymousClass001.A03(A0z.getValue());
            A0s2.add(key);
            AnonymousClass001.A1J(A0s, A03);
        }
        if (iXv != null) {
            boolean z = this.A02;
            IXv iXv2 = iXv;
            if (A0s2.size() != A0s.size()) {
                throw 1BK.A0g();
            }
            int i = z ? 4 : 0;
            HashMap A0u = AnonymousClass001.A0u();
            int size = A0s2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = A0s2.get(i2);
                int A032 = AnonymousClass001.A03(A0s.get(i2));
                int intValue = IXv.A09[A032].intValue();
                int i3 = 3;
                if (intValue == 0) {
                    i3 = 1;
                } else if (intValue == 1) {
                    i3 = 2;
                } else if (intValue != 2) {
                    throw 0Pz.A04("Unknown legacy quality: ", A032);
                }
                AnonymousClass001.A1A(obj2, A0u, i3);
            }
            iXv2.A00.D88(new VideoSubscriptions(A0u, i, 1Br.A07(((HUj) 1Bn.A0A(115630)).A00).AZk(36320227729882282L)));
        }
        4zI.A03.A05("SourcedConferenceCallImpl", "Subscribing to multiple streams", new Object[0]);
        concurrentMap.clear();
        ifG.A00 = false;
        concurrentMap.putAll(map);
        ifG.A00 = this.A02;
        return null;
    }
}
