package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

/* renamed from: X.1dF, reason: invalid class name */
/* loaded from: 1dF.class */
public final class C1dF extends 1Km implements C0mi {
    @Override // X.C0mi
    public C02S Au6() {
        if (!ClassTracingLogger.A00) {
            return C02S.A03;
        }
        0fH.A0C(C1dF.class, "QPL markers will now be logged in class usage traces");
        return new C02S(new int[]{-1}, null);
    }

    @Override // X.C0mi
    public void C5i(C03b c03b) {
        int markerId = c03b.getMarkerId();
        if (ClassTracingLogger.A02) {
            ClassTracingLogger.A03(1215735889, markerId);
        }
    }

    @Override // X.C0mi
    public String getName() {
        return "dead_code";
    }
}
