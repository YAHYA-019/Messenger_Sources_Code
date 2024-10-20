package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Aja, reason: case insensitive filesystem */
/* loaded from: Aja.class */
public final class C1513Aja extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$51";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513Aja(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "BubblesStateManager", "beforeLogout", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        5oO r0 = (5oO) this.A00.A0A.get();
        if (((C2j5) 1Br.A0B(r0.A03)).A01()) {
            r0.A0D.BPw();
            r0.A0E.BPw();
            5oO.A06(r0);
            r0.A01 = null;
            r0.A00 = null;
            0fH.A0j("BubblesStateManager", "Cleared all bubbles data before user gets logged out.");
        }
    }
}
