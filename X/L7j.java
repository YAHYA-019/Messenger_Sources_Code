package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.vesta.VestaClient;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: L7j.class */
public final class L7j {
    public final C1x8 A03;
    public final Ke7 A04;
    public final Integer A05;
    public boolean A01 = false;
    public boolean A02 = false;
    public int A00 = 10;

    public L7j(C1x8 c1x8, 1Ve r303, Integer num, Executor executor) {
        this.A04 = new Ke7(new KlO(r303, executor, VestaClient.getApiVersionNative()));
        this.A03 = c1x8;
        this.A05 = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.Ffl] */
    public static final 1xH A00(L4G l4g, Ke6 ke6, L7j l7j, String str, String str2) {
        0fH.A0j("VestaRegistrationClient", "Starting Vesta Registration");
        1xH r0 = new 1xH();
        Ke7 ke7 = l7j.A04;
        Integer num = l7j.A05;
        String str3 = ke6.A00;
        L1x l1x = new L1x(l4g, r0);
        1BK.A1K(num, 0, l4g);
        UUID A00 = C04I.A00();
        11T.A0A(A00);
        String A02 = 11T.A02(A00);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = l4g.A02;
        int i = l4g.A00;
        int i2 = l4g.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "request_uuid", A02);
        lightweightQuickPerformanceLogger.markerPoint(i, i2, "init_register_network_start");
        KlO klO = ke7.A00;
        String A002 = KVX.A00(num);
        Kqd kqd = new Kqd(l4g, ke7, l1x, num, str3, str, str2, A02);
        07S A0V = JQy.A0V(A002, str);
        07S.A00(A0V, Integer.valueOf(klO.A03), "vesta_client_api_version");
        07S.A00(A0V, A02, "request_uuid");
        ?? r02 = F1f.class;
        try {
            r02 = (Ffl) DKE.A0p((Class) r02, "create", 0);
            4YV.A1A(A0V, r02.A01, "request");
            r02.A02 = true;
            C3s4 ACe = r02.ACe();
            11T.A0A(ACe);
            try {
                if (klO.A01) {
                    ACe.setRequestPurpose(2);
                }
            } catch (UnsupportedOperationException unused) {
            }
            try {
                if (klO.A02) {
                    ACe.setRetryPolicy(1);
                    ACe.setNetworkTimeoutSeconds(klO.A00);
                }
            } catch (UnsupportedOperationException unused2) {
            }
            0fH.A0j("VestaRegisterServerProvider", "[INIT] Issuing GraphQL query");
            klO.A04.ARJ(new LW3(kqd, 5), new LW5(klO, kqd, 5), ACe, klO.A05);
            return r0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
            throw AnonymousClass001.A0U(r02);
        }
    }

    public static final 1xH A01(L4G l4g, L7j l7j, String str) {
        0fH.A0j("VestaRegistrationClient", "Starting virtual device creation");
        1xH r0 = new 1xH();
        C1x9 c1x9 = l7j.A03.A00;
        1xH r02 = new 1xH();
        if (c1x9.A03.A00()) {
            1xA r03 = c1x9.A04;
            LXL lxl = new LXL(c1x9, r02, 0);
            1Um A0R = 1BL.A0R(r03);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0R, lxl);
            1Um.A02(A0R, new LXE(r03, A0Q, str, 0), A0Q, false);
        } else {
            C1x9.A02(r02);
        }
        r02.A03(new LVD(r0, l4g, 0));
        return r0;
    }
}
