package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AjW, reason: case insensitive filesystem */
/* loaded from: AjW.class */
public final class C1509AjW extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$75";
    public final /* synthetic */ Ezc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1509AjW(Ezc ezc, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "AfterLogout", "ProactiveWarningDataCleaner", "clearDataForRemovedAccounts", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699337, true);
        this.A00 = ezc;
    }

    public void A02() {
        BlU blU = (BlU) this.A00.A0p.get();
        C00i c00i = blU.A01.A00;
        FbSharedPreferences A09 = 1Br.A09(((6QI) c00i.get()).A01);
        1G2 r0 = 6QJ.A00;
        Set Asu = A09.Asu(r0);
        HashSet A0v = AnonymousClass001.A0v();
        Iterator it = Asu.iterator();
        while (it.hasNext()) {
            String A092 = ((1G3) it.next()).A09(r0);
            11T.A0A(A092);
            A0v.add(7zM.A1C(0, 0CU.A00(A092, '/', 0), A092));
        }
        Set A0e = 0QD.A0e(A0v);
        if (A0e.isEmpty()) {
            return;
        }
        Iterator it2 = ((InterfaceC09434q3) 1Br.A0B(blU.A00)).AVB().iterator();
        while (it2.hasNext()) {
            C0B7.A00(A0e).remove(AbF.A0W(it2).A0A);
        }
        Iterator it3 = A0e.iterator();
        while (it3.hasNext()) {
            String A0i = AnonymousClass001.A0i(it3);
            6QI r02 = (6QI) c00i.get();
            11T.A0F(A0i, 0);
            1Ql A08 = 1Br.A08(r02.A01);
            A08.CfI(1G3.A00(r0, A0i));
            A08.commit();
        }
    }
}
