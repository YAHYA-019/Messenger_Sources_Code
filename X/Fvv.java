package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.accountswitch.protocol.SwitchAccountFetchResult;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Fvv.class */
public final class Fvv implements 1K9 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public Fvv(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void onFailure(Throwable th) {
        String str;
        switch (this.A00) {
            case 0:
                str = Fck.A0z;
                0fH.A0r(str, "Prefetching DBL credentials failed", th);
                return;
            case 1:
                ((Eww) ((Eod) this.A02).A03.get()).A00(this.A01, -1, th.getMessage());
                return;
            default:
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        TreeJNI A0L;
        AtomicInteger atomicInteger;
        AtomicReference atomicReference;
        SwitchAccountFetchResult switchAccountFetchResult;
        switch (this.A00) {
            case 0:
                Fck fck = (Fck) this.A02;
                atomicInteger = fck.A0u;
                if (atomicInteger.get() == this.A01) {
                    atomicReference = fck.A0v;
                    atomicReference.set(obj);
                    return;
                }
                return;
            case 1:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                ((Eww) ((Eod) this.A02).A03.get()).A00(this.A01, (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0L = ((2JY) obj2).A0L(1058926442, 2JX.class, 851298678)) == null) ? 0 : A0L.getIntValue(-891699686), null);
                return;
            default:
                OperationResult operationResult = (OperationResult) obj;
                Ceq ceq = (Ceq) this.A02;
                int i = this.A01;
                if (operationResult == null || (switchAccountFetchResult = (SwitchAccountFetchResult) operationResult.A08()) == null) {
                    return;
                }
                ((C11) ceq.A01.get()).A00(i, switchAccountFetchResult.A00, AbE.A00(237));
                return;
        }
    }
}
