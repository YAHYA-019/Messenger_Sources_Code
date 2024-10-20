package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpResponse;

/* loaded from: Fvs.class */
public final class Fvs implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FHi A01;

    public Fvs(FHi fHi, int i) {
        this.A01 = fHi;
        this.A00 = i;
    }

    public void onFailure(Throwable th) {
        FHi fHi = this.A01;
        UserFlowLogger userFlowLogger = fHi.A08;
        int i = this.A00;
        userFlowLogger.flowEndFail(userFlowLogger.generateFlowId(342900598, i), "", "");
        FHi.A03(fHi, "end", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, i);
        FHi.A00(EQs.A01, fHi, i);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        HttpResponse httpResponse = (HttpResponse) obj;
        FHi fHi = this.A01;
        synchronized (fHi.A09) {
            if (httpResponse != null) {
                if (httpResponse.getStatusLine() != null && httpResponse.getStatusLine().getStatusCode() < 400) {
                    UserFlowLogger userFlowLogger = fHi.A08;
                    int i = this.A00;
                    userFlowLogger.flowEndSuccess(userFlowLogger.generateFlowId(342900598, i));
                    AtomicBoolean atomicBoolean = fHi.A0A;
                    if (!atomicBoolean.get()) {
                        FHi.A03(fHi, "end", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, i);
                        atomicBoolean.set(true);
                        userFlowLogger.flowEndSuccess(fHi.A00);
                    }
                    FHi.A00(EQs.A02, fHi, i);
                }
            }
            onFailure(null);
        }
    }
}
