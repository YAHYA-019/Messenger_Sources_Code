package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.tigon.TigonErrorException;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: InU.class */
public final class InU implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public InU(FbUserSession fbUserSession, IDT idt, ThreadKey threadKey, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = fbUserSession;
            this.A03 = idt;
        } else {
            this.A03 = idt;
            this.A01 = fbUserSession;
        }
        this.A02 = threadKey;
        this.A04 = str;
    }

    public void onFailure(Throwable th) {
        Hsa hsa;
        int i = this.A00;
        11T.A0F(th, 0);
        IDT idt = (IDT) this.A03;
        GP5 A0K = GOp.A0K(idt.A08);
        String obj = th.toString();
        if (i != 0) {
            GP5.A02(A0K, "error_living_room", "join", obj, null, null);
        } else {
            GP5.A02(A0K, "error_living_room", "create", obj, null, null);
            ListenableFuture listenableFuture = idt.A05;
            if (listenableFuture == null || listenableFuture.isCancelled()) {
                return;
            } else {
                0fH.A0H(IDT.class, "Failed to create living room: throwable: ", th);
            }
        }
        boolean z = th instanceof TigonErrorException;
        Hys hys = idt.A01;
        if (z) {
            if (hys != null) {
                Hys.A00(hys, 2131962057, 2131962122);
            }
            hsa = idt.A02;
            if (hsa == null) {
                throw 1BK.A0h();
            }
        } else {
            if (hys != null) {
                Hys.A00(hys, 2131962630, 2131962631);
            }
            hsa = idt.A02;
            if (hsa == null) {
                throw 1BK.A0h();
            }
        }
        hsa.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.InU.onSuccess(java.lang.Object):void");
    }
}
