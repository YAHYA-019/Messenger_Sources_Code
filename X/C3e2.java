package X;

import android.os.Bundle;
import com.facebook.graphql.executor.OfflineMutationsManager;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.3e2, reason: invalid class name */
/* loaded from: 3e2.class */
public final class C3e2 implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ 1Ho A04;
    public final /* synthetic */ 3La A05;
    public final /* synthetic */ SettableFuture A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C3e2(1Ho r302, 3La r303, SettableFuture settableFuture, String str, int i, int i2, long j, long j2, boolean z) {
        this.A05 = r303;
        this.A08 = z;
        this.A04 = r302;
        this.A07 = str;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = settableFuture;
    }

    public void onFailure(Throwable th) {
        3La r0 = this.A05;
        if (!((5Dp) r0.A00.get()).A02(th)) {
            this.A06.setException(th);
            return;
        }
        1Ho r02 = this.A04;
        String str = r02.A0N;
        Bundle bundle = new Bundle(r02.A0D);
        String str2 = this.A07;
        long j = this.A03;
        C38d c38d = new C38d(bundle, str2, null, str, this.A00 + 1, this.A01, this.A02, j);
        OfflineMutationsManager offlineMutationsManager = (OfflineMutationsManager) r0.A01.get();
        1Xn r03 = offlineMutationsManager.A02;
        String str3 = ((5Dn) c38d).A05;
        if (r03.contains(str3)) {
            r03.remove(str3);
        } else {
            offlineMutationsManager.A06.A04(c38d);
            ((5Dp) offlineMutationsManager.A08.get()).A00(c38d);
            OfflineMutationsManager.A00(offlineMutationsManager, true);
        }
        this.A06.setException(new Exception(0Pz.A0j("An operation of type ", str, " was attempted while offline"), th));
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (!this.A08) {
            1Ho r0 = this.A04;
            String str = r0.A0N;
            Bundle bundle = new Bundle(r0.A0D);
            String str2 = this.A07;
            long j = this.A03;
            ((5Dp) this.A05.A00.get()).A01(new C38d(bundle, str2, null, str, this.A00, this.A01, this.A02, j), (Integer) null, AbstractC00603o4.A00(264));
        }
        this.A06.set(obj);
    }
}
