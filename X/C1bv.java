package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.1bv, reason: invalid class name */
/* loaded from: 1bv.class */
public final class C1bv extends 1Km {
    public static final UserFlowConfig.UserFlowConfigBuilder A01;
    public UserFlowLogger A00;

    static {
        UserFlowConfig.UserFlowConfigBuilder userFlowConfigBuilder = new UserFlowConfig.UserFlowConfigBuilder("arfx", false);
        userFlowConfigBuilder.mTtlMs = 3600000L;
        A01 = userFlowConfigBuilder;
    }

    public C02S Au6() {
        return this.A00 == null ? C02S.A03 : new C02S(new int[]{16321564}, null);
    }

    public void C5Z(C03b c03b) {
        11T.A0F(c03b, 0);
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            boolean equals = c03b.At1().equals("cp_low_on_memory");
            long generateFlowId = userFlowLogger.generateFlowId(16323880, c03b.ArT());
            String At1 = c03b.At1();
            String At2 = c03b.At2();
            if (equals) {
                if (At2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, At1, At2);
            } else {
                if (At2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                userFlowLogger.flowAnnotate(generateFlowId, At1, At2);
            }
        }
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            long generateFlowId = userFlowLogger.generateFlowId(16323880, c03b.ArT());
            short Asy = c03b.Asy();
            if (Asy == 2 || Asy == 10294) {
                userFlowLogger.flowEndSuccess(generateFlowId);
                return;
            }
            if (Asy == 3) {
                String AWx = c03b.AWx(AbstractC00603o4.A00(29));
                if (AWx == null) {
                    AWx = "AR_SESSION Failed";
                }
                userFlowLogger.flowEndFail(generateFlowId, AWx, null);
                return;
            }
            if (Asy == 4 || Asy == 4340 || Asy == 630) {
                String AWx2 = c03b.AWx("cancel_reason");
                if (AWx2 == null) {
                    AWx2 = "AR_SESSION Cancelled";
                }
                userFlowLogger.flowEndCancel(generateFlowId, AWx2);
            }
        }
    }

    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 0);
        this.A00 = new UserFlowLoggerImpl(quickPerformanceLogger, true);
    }

    public String getName() {
        return "ar_sys_resource";
    }
}
