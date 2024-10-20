package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ajd, reason: case insensitive filesystem */
/* loaded from: Ajd.class */
public final class C1516Ajd extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$60";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516Ajd(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "SearchCacheDb", "clearSearchCacheItems", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        CQk cQk = (CQk) this.A00.A0v.get();
        1GU.A00(cQk.A02);
        try {
            0fH.A0m("SearchCacheDb", "Deleting all items in local search db before logout");
            CQk.A08(cQk, 0L);
        } catch (Exception e) {
            0fH.A0w("SearchCacheDb", "Exception when clearing local search db before logout", e);
        }
    }
}
