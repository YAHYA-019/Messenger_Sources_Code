package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Locale;

/* renamed from: X.6ou, reason: invalid class name */
/* loaded from: 6ou.class */
public final class C6ou {
    public long A00 = 0;
    public long A01 = 0;
    public final UserFlowLogger A02;

    public C6ou(UserFlowLogger userFlowLogger) {
        this.A02 = userFlowLogger;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0099. Please report as an issue. */
    public void A00(ThreadKey threadKey) {
        int i;
        if (this.A00 == 0) {
            String lowerCase = "COMPOSER_FRAGMENT".toLowerCase(Locale.ROOT);
            String A0O = threadKey != null ? ThreadKey.A0O(threadKey) : "unknown_thread_type";
            UserFlowLogger userFlowLogger = this.A02;
            long generateNewFlowId = userFlowLogger.generateNewFlowId(60497832);
            userFlowLogger.flowStart(generateNewFlowId, new UserFlowConfig(lowerCase, false));
            userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId, "thread_type", A0O);
            userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId, "message_type", "text");
            this.A00 = generateNewFlowId;
            if (threadKey != null) {
                switch (threadKey.A06.ordinal()) {
                    case 3:
                    case 4:
                    case 10:
                        i = 60496000;
                        long generateNewFlowId2 = userFlowLogger.generateNewFlowId(i);
                        userFlowLogger.flowStart(generateNewFlowId2, new UserFlowConfig(lowerCase, false));
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId2, "thread_type", A0O);
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId2, "message_type", "text");
                        this.A01 = generateNewFlowId2;
                        return;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    default:
                        return;
                    case 11:
                    case 12:
                        i = 60495234;
                        long generateNewFlowId22 = userFlowLogger.generateNewFlowId(i);
                        userFlowLogger.flowStart(generateNewFlowId22, new UserFlowConfig(lowerCase, false));
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId22, "thread_type", A0O);
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId22, "message_type", "text");
                        this.A01 = generateNewFlowId22;
                        return;
                    case 13:
                    case 14:
                        i = 60491570;
                        long generateNewFlowId222 = userFlowLogger.generateNewFlowId(i);
                        userFlowLogger.flowStart(generateNewFlowId222, new UserFlowConfig(lowerCase, false));
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId222, "thread_type", A0O);
                        userFlowLogger.flowAnnotateWithCrucialData(generateNewFlowId222, "message_type", "text");
                        this.A01 = generateNewFlowId222;
                        return;
                }
            }
        }
    }
}
