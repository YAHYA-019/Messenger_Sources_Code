package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AjZ, reason: case insensitive filesystem */
/* loaded from: AjZ.class */
public final class C1512AjZ extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$50";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1512AjZ(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "BubblesShortcutsOnLogoutListener", "beforeLogout", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        Brb brb = (Brb) this.A00.A09.get();
        if (((C2j5) 1Br.A0B(brb.A01)).A01()) {
            1Br.A0C(brb.A02);
            Object obj = brb.A00.get();
            11T.A0A(obj);
            Context context = (Context) obj;
            11T.A0F(context, 0);
            ArrayList A01 = 4iS.A01(context);
            if (A01.isEmpty()) {
                return;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                4iO r0 = (4iO) it.next();
                String str = r0.A0D;
                11T.A0A(str);
                if (11T.A0P("thread_shortcut_", 1, str)) {
                    String str2 = r0.A0D;
                    11T.A0A(str2);
                    A0s.add(str2);
                }
            }
            if (A0s.isEmpty()) {
                return;
            }
            4iS.A06(context, A0s);
            0fH.A0j("BubblesShortcutsCleaner", "All bubble shortcuts were removed.");
        }
    }
}
