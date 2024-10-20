package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: D9m.class */
public final class D9m implements Runnable {
    public static final String __redex_internal_original_name = "ContactMutationHandler$handleAddContactInternal$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ Bvt A02;
    public final /* synthetic */ String A03;

    public D9m(FbUserSession fbUserSession, Bvt bvt, String str, long j) {
        this.A02 = bvt;
        this.A01 = fbUserSession;
        this.A00 = j;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bvt bvt = this.A02;
        FbUserSession fbUserSession = this.A01;
        long j = this.A00;
        2xP A02 = ((2Tw) 1Br.A0B(bvt.A05)).A02(fbUserSession, ((2eT) 1Br.A0B(bvt.A01)).A01("ContactMutationHandler: query_contact_by_id", String.valueOf(j)));
        try {
            boolean A0B = A02.hasNext() ? ((User) A02.next()).A0B() : false;
            C00i c00i = bvt.A03.A00;
            C00i c00i2 = ((C0d) c00i.get()).A00.A00;
            if (1BK.A0V(c00i2).isMarkerOn(431690632)) {
                1BK.A0V(c00i2).markerAnnotate(431690632, "is_existing_contact", A0B);
                if (A0B) {
                    1BK.A0V(c00i2).markerEnd(431690632, (short) 2);
                    return;
                }
            } else if (A0B) {
                return;
            }
            try {
                MailboxFeature mailboxFeature = (MailboxFeature) ((C2eo) 4YU.A0n(fbUserSession, bvt.A00, 33132)).A04.get();
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(2);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                if (!AQV.Cj2(Czf.A00(mailboxFeature, A0P, 18, j))) {
                    A0P.cancel(false);
                }
                A0P.get();
                C00i c00i3 = ((C0d) c00i.get()).A00.A00;
                if (1BK.A0V(c00i3).isMarkerOn(431690632)) {
                    1BK.A0V(c00i3).markerEnd(431690632, (short) 2);
                }
                Bbx bbx = (Bbx) 1Br.A0B(bvt.A02);
                if (this.A03.equals("RTC")) {
                    1UG A08 = 1BK.A08(1Br.A02(bbx.A00), "graph_contact_creation");
                    if (A08.isSampled()) {
                        AbF.A1N(A08, 1BK.A0t());
                        A08.A0B(Property.SYMBOL_Z_ORDER_SOURCE);
                        A08.BZL();
                    }
                }
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                throw new RuntimeException("Error during orca contact add: ", e);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass127.A00(A02, th);
                throw th2;
            }
        }
    }
}
