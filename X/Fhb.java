package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Fhb.class */
public final class Fhb implements 1Ro {
    public static final String __redex_internal_original_name = "BugReporterUploadMethod";
    public 1BY A00;
    public final C00i A01 = 7zN.A0D(16428);

    public Fhb(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        int i;
        RLP rlp = (RLP) obj;
        String str = 1Fw.A04((1EZ) this.A01.get()).A02;
        07S A02 = C03z.A00().A02();
        07S.A00(A02, AnonymousClass001.A12().put("description", 0Pz.A0W("[rt_rageshake] ", rlp.A00)).put("category_id", "611916125932567").toString(), "metadata");
        07S.A00(A02, str, "user_identifier");
        07S.A00(A02, String.valueOf(4YU.A06(System.currentTimeMillis())), OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME);
        07S.A00(A02, "624618737631578", FalcoACSProvider.CONFIG_ID);
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        for (Object obj2 : rlp.A01) {
            try {
                File A0n = DKE.A0n(obj2.toString());
                i = i2 + 1;
                try {
                    String A0T = 0Pz.A0T("screenshot", i2);
                    A0s.add(new C4C4(new DpJ(A0n, "image/png", A0T), A0T));
                } catch (URISyntaxException e) {
                    e = e;
                    0fH.A0z(__redex_internal_original_name, "Ignoring invalid screenshot attachment: %s", e, new Object[]{obj2.toString()});
                    i2 = i;
                }
            } catch (URISyntaxException e2) {
                e = e2;
                i = i2;
            }
            i2 = i;
        }
        Iterator A0y = AnonymousClass001.A0y(rlp.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            try {
                File A0n2 = DKE.A0n(A0z.getValue().toString());
                if (A0n2.length() < 100000) {
                    A0s.add(new C4C4(new C2584Ghx(A0n2, "text/plain", A0j, 0L, A0n2.length()), A0j));
                }
            } catch (URISyntaxException e3) {
                0fH.A0z(__redex_internal_original_name, "Ignoring invalid debug attachment: %s", e3, new Object[]{A0j});
            }
        }
        C04083zw A0T2 = DKC.A0T();
        AbF.A1Q(A0T2, "rtBugReportUpload");
        A0T2.A0F = 0Pz.A0W(str, "/bugs");
        A0T2.A01 = A02;
        A0T2.A06 = 0S2.A01;
        A0T2.A0I = A0s;
        return A0T2.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        String str;
        int i = anonymousClass439.A00;
        if (i != 200 || anonymousClass439.A01().A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
            0fH.A14(__redex_internal_original_name, "Bug report upload failed, error code: %d, msg: %s", DKG.A1b(anonymousClass439.A02, Integer.valueOf(i)));
            str = "N/A";
        } else {
            str = AbH.A1A(anonymousClass439.A01(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        return new RGA(str);
    }
}
