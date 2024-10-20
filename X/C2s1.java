package X;

import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataProvider;
import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataSnapshot;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.2s1, reason: invalid class name */
/* loaded from: 2s1.class */
public final class C2s1 extends 2Lg {
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 17105);

    public C2s1(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        Future future = (Future) obj;
        Future future2 = (Future) obj2;
        if (future != null && future2 != null) {
            try {
                MsysQPLMetadataSnapshot msysQPLMetadataSnapshot = (MsysQPLMetadataSnapshot) future.get();
                MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2 = (MsysQPLMetadataSnapshot) future2.get();
                if (msysQPLMetadataSnapshot != null && msysQPLMetadataSnapshot2 != null) {
                    for (Map.Entry entry : MsysQPLMetadataProvider.generateAnnotationMap(msysQPLMetadataSnapshot, msysQPLMetadataSnapshot2).entrySet()) {
                        r302.AxQ().A06((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                0fH.A0q("MsysInfoProviderV2", "Failed to get MSYS metadata snapshots", e);
            }
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "msys_info";
    }

    public int B5R() {
        return 40;
    }

    public Class BBP() {
        return Future.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ("true".equals(X.0WL.A02("fb.running_sapienz")) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BS6(X.2Lc r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.A06
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            boolean r0 = com.facebook.endtoend.EndToEnd.A03()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            boolean r0 = com.facebook.endtoend.EndToEnd.A04()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            r0 = r302
            boolean r0 = r0.A07
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L44
            java.lang.String r0 = "fb.running_sapienz"
            java.lang.String r0 = X.0WL.A02(r0)
            r304 = r0
            java.lang.String r0 = "true"
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L47
        L44:
            r0 = 1
            r306 = r0
        L47:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2s1.BS6(X.2Lc):boolean");
    }

    public /* bridge */ /* synthetic */ Object D0r(final int i, final int i2) {
        return ((C2s4) this.A01.get()).A01(new Callable(i, i2) { // from class: X.3uf
            public static int A01;
            public static int A02;
            public final C00i A00 = new 1BQ(16385);

            {
                A02 = i;
                A01 = i2;
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                boolean AZk = ((2yD) this.A00.get()).AZk(36318939239691739L);
                int i3 = A02;
                int i4 = A01;
                long j = 0;
                if (AZk) {
                    j = 1;
                }
                return MsysQPLMetadataProvider.snapshot(j, i3, i4);
            }
        });
    }
}
