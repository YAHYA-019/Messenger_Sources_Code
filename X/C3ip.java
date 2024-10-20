package X;

import android.util.Pair;
import com.facebook.msys.mci.FileManager;
import java.util.Comparator;

/* renamed from: X.3ip, reason: invalid class name */
/* loaded from: 3ip.class */
public final class C3ip implements Comparator {
    public final int A00;
    public final Object A01;

    public C3ip(int i, java.util.Map map) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = map;
        } else {
            this.A01 = map;
        }
    }

    public C3ip(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                2PP r0 = (2PP) this.A01;
                return r0.A02.AYt(obj2.getClass()) - r0.A02.AYt(obj.getClass());
            case 1:
                java.util.Map map = (java.util.Map) this.A01;
                Number A0o = 1BK.A0o(obj, map);
                Number A0o2 = 1BK.A0o(obj2, map);
                if (A0o == null || A0o2 == null) {
                    return 0;
                }
                2xG r02 = 2xG.A00;
                return 2xH.A00(Float.compare(A0o2.floatValue(), A0o.floatValue())).A01();
            case 2:
                return ((Long) ((Pair) obj).second).compareTo((Long) ((Pair) obj2).second);
            case 3:
                java.util.Map map2 = (java.util.Map) this.A01;
                boolean z = FileManager.sInitialized;
                Object obj3 = map2.get(obj2);
                obj3.getClass();
                long A05 = AnonymousClass001.A05(obj3);
                Object obj4 = map2.get(obj);
                obj4.getClass();
                return (A05 > AnonymousClass001.A05(obj4) ? 1 : (A05 == AnonymousClass001.A05(obj4) ? 0 : -1));
            default:
                int CWV = ((1aQ) ((Pair) obj).second).CWV();
                int CWV2 = ((1aQ) ((Pair) obj2).second).CWV();
                if (CWV != CWV2) {
                    return CWV - CWV2;
                }
                throw AnonymousClass001.A0N("Two plugins with the same ordering provided");
        }
    }
}
