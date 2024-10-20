package X;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.108, reason: invalid class name */
/* loaded from: 108.class */
public final class AnonymousClass108 implements C51o {
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ 0BJ A01;
    public final /* synthetic */ List A02;

    public AnonymousClass108(1xH r302, 0BJ r303, List list) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = list;
    }

    @Override // X.C51o
    public final void Bpv(final C4Ez c4Ez) {
        11T.A0F(c4Ez, 0);
        final 0BJ r0 = this.A01;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r0.A01;
        final 1xH r02 = this.A00;
        final List list = this.A02;
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: X.13e
            public static final String __redex_internal_original_name = "BlockStoreBackupHelper$restoreByteArrayWithKey$1$1";

            @Override // java.lang.Runnable
            public final void run() {
                C4Ez c4Ez2 = c4Ez;
                boolean A0E = c4Ez2.A0E();
                1xH r03 = r02;
                if (!A0E) {
                    r03.A02();
                    return;
                }
                Object A05 = c4Ez2.A05();
                11T.A0A(A05);
                r03.A04(0BJ.A06((RetrieveBytesResponse) A05, list));
            }
        });
    }
}
