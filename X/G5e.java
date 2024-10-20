package X;

import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.smartcapture.logging.MC;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: G5e.class */
public final class G5e implements Runnable {
    public static final String __redex_internal_original_name = "FBPaymentMethodsAPI$fetchPaymentMethods$1$1";
    public final /* synthetic */ FvH A00;
    public final /* synthetic */ EpP A01;
    public final /* synthetic */ ListenableFuture A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public G5e(FvH fvH, EpP epP, ListenableFuture listenableFuture, String str, String str2) {
        this.A02 = listenableFuture;
        this.A01 = epP;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = fvH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        List list = (List) this.A02.get();
        KjJ kjJ = (KjJ) list.get(0);
        KjJ kjJ2 = (KjJ) list.get(1);
        String str = "";
        String str2 = (!AnonymousClass001.A1U(kjJ.A02) || (obj2 = kjJ.A01) == null) ? str : (String) obj2;
        if (kjJ2.A02 == null && (obj = kjJ2.A01) != null) {
            str = (String) obj;
        }
        try {
            GraphQlQueryParamSet A0M = 7zL.A0M();
            11T.A0F(str2, 0);
            A0M.A05("legacy_dev_pub_key", str2);
            11T.A0F(str, 0);
            A0M.A05("shared_dev_pub_key", str);
            A0M.A05("family_device_id", ((1Oe) 1Br.A0B(this.A01.A03)).A04(C1fe.A0f));
            A0M.A05("iab_session_id", this.A04);
            A0M.A05("ad_id", this.A03);
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(DhK.class, (Class) null, "PaymentMethodsRetrieve", (String) null, "fbandroid", -256273593, 0, 1297627864L, 1297627864L, false, true));
            11T.A0D(A0L);
            A0L.A0A(TimeUnit.HOURS.toSeconds(1L));
            A0L.A09(TimeUnit.SECONDS.toSeconds(15));
            Object obj3 = C05974fg.A00.get();
            11T.A0A(obj3);
            if (1Br.A06(((DLb) obj3).A02).AZk(MC.android_payment.use_payments_subdomain_autofill_main)) {
                A0L.A06 = 0S2.A0Y;
            }
            S4r s4r = this.A00.A00;
            synchronized (s4r) {
                java.util.Map map = s4r.A02;
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    s4r.A01.A0K(1BK.A16(AnonymousClass001.A0z(A0y)));
                }
                s4r.A00 = A0L;
                Iterator A0y2 = AnonymousClass001.A0y(map);
                while (A0y2.hasNext()) {
                    S4r.A00(s4r, (GGw) AnonymousClass001.A0z(A0y2).getKey());
                }
            }
        } catch (RuntimeException e) {
            0fH.A0k("FBPaymentMethodsAPI", AnonymousClass001.A0Z(e, "Failed to update graphql request. Observers will not receive any updates due to ", AnonymousClass001.A0k()));
        }
    }
}
