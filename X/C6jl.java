package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: X.6jl, reason: invalid class name */
/* loaded from: 6jl.class */
public abstract class C6jl {
    public static final Set A00(long j) {
        Collection collection;
        String BCz = ((2yD) 1Bi.A03(16385)).BCz(j, "");
        11T.A0A(BCz);
        if (BCz.length() == 0) {
            return C0uA.A00;
        }
        List A0M = 0CU.A0M(BCz, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        if (!A0M.isEmpty()) {
            ListIterator listIterator = A0M.listIterator(A0M.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = 0QD.A0Y(A0M, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = C0ty.A00;
        return 0QD.A0f(collection);
    }
}
