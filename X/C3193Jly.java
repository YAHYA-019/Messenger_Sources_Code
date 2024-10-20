package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Jly, reason: case insensitive filesystem */
/* loaded from: Jly.class */
public final class C3193Jly extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$68";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3193Jly(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "FbQPLAuthListener", "beforeLogout", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        Kj7 kj7 = (Kj7) this.A00.A0M.get();
        ((C3m6) kj7.A02.get()).Adl().CTN();
        if (((1Hl) kj7.A01.get()).A03()) {
            1BK.A0U(kj7.A00).markEvent(46333953, "afterUserLogout", 7);
        }
    }
}
