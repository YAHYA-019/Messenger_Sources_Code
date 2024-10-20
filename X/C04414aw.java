package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4aw.class */
public final class C04414aw implements 2IE {
    public final C00i A00 = 1Bi.A02(QuickPerformanceLogger.class, (Class) null);
    public final C00i A01 = 1Bi.A02(2DN.class, (Class) null);

    private void A00(String str, String str2, short s) {
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        if (str2 != null) {
            i = str2.hashCode();
        }
        ((QuickPerformanceLogger) this.A00.get()).markerEnd(33357825, hashCode + i, s);
    }

    private boolean A01(String str) {
        boolean z = false;
        if (((2DN) this.A01.get()).A03 && ("DecodeProducer".equals(str) || "PostprocessorProducer".equals(str))) {
            z = true;
        }
        return z;
    }

    public void CE3(String str, String str2, String str3) {
    }

    public void CE5(String str, String str2, java.util.Map map) {
        if (A01(str2)) {
            A00(str, str2, (short) 4);
        }
    }

    public void CE7(String str, String str2, Throwable th, java.util.Map map) {
        if (A01(str2)) {
            A00(str, str2, (short) 3);
        }
    }

    public void CE9(String str, String str2, java.util.Map map) {
        if (A01(str2)) {
            A00(str, str2, (short) 2);
        }
    }

    public void CEB(String str, String str2) {
        if (A01(str2)) {
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = hashCode + i;
            C00i c00i = this.A00;
            ((QuickPerformanceLogger) c00i.get()).markerStart(33357825, i2);
            ((QuickPerformanceLogger) c00i.get()).markerAnnotate(33357825, i2, "producer-name", str2);
        }
    }

    public void CGn(String str) {
    }

    public void CGx(2Dp r302, String str, Throwable th, boolean z) {
    }

    public void CH5(2Dp r302, Object obj, String str, boolean z) {
    }

    public void CH7(2Dp r302, String str, boolean z) {
    }

    public void CS7(String str, String str2, boolean z) {
    }

    public boolean ChK(String str) {
        return false;
    }
}
