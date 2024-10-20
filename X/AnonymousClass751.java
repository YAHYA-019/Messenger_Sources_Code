package X;

import java.util.List;

/* renamed from: X.751, reason: invalid class name */
/* loaded from: 751.class */
public final class AnonymousClass751 implements AnonymousClass750 {
    @Override // X.AnonymousClass750
    public boolean Cyk(5vW r302, List list, int i) {
        5vV r0;
        5vV r02 = (5vV) r302;
        boolean z = true;
        if (r02.A01.A01.A00(5vX.A00) == null) {
            if (list.isEmpty()) {
                return false;
            }
            if (i < list.size() - 1 && (r0 = (5vW) list.get(i + 1)) != null) {
                C5fv c5fv = r02.A00;
                C5fv c5fv2 = r0.A00;
                long j = 5vG.A00;
                11T.A0F(c5fv, 0);
                11T.A0F(c5fv2, 1);
                if (Math.abs(((C5fu) c5fv).A02 - ((C5fu) c5fv2).A02) < 5vG.A00) {
                    z = false;
                }
            }
        }
        return z;
    }
}
