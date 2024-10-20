package X;

import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ajc, reason: case insensitive filesystem */
/* loaded from: Ajc.class */
public final class C1515Ajc extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$59";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515Ajc(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "RecentSearchDb", "clearRecentSearchCacheItems", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        int i;
        AcZ acZ = (AcZ) this.A00.A0s.get();
        1GU.A00(acZ.A01);
        SQLiteDatabase AUF = acZ.A05.AUF();
        try {
            try {
                C01m.A01(AUF, -1270931941);
                0fH.A0m("RecentSearchDb", "Deleting all search cache items");
                0fH.A0i(Integer.valueOf(AUF.delete("recent_search_items", null, null)), "RecentSearchDb", "Deleted %d rows");
                AUF.setTransactionSuccessful();
                i = 355055894;
            } catch (Exception e) {
                0fH.A0w("RecentSearchDb", "Exception when clearing search cache items before logout", e);
                i = 1257512720;
            }
            C01m.A03(AUF, i);
            acZ.A04.A00();
        } catch (Throwable th) {
            C01m.A03(AUF, 556868705);
            acZ.A04.A00();
            throw th;
        }
    }
}
