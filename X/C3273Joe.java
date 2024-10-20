package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.CancellationException;

/* renamed from: X.Joe, reason: case insensitive filesystem */
/* loaded from: Joe.class */
public final class C3273Joe extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C3273Joe(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A00(X.1qC r301) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3273Joe.A00(X.1qC):java.util.List");
    }

    private void A05() {
        DZe dZe = (DZe) this.A01;
        if (DZe.A0F(dZe)) {
            return;
        }
        if (this.A02 == ELO.A01) {
            dZe.A0T.A00(dZe.A0U);
        }
        DZe.A0A(dZe, this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0709, code lost:
    
        if (r0.A03.A00() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
    
        if (r0.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v362, types: [X.Gbm, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3273Joe.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                LVA lva = (LVA) this.A02;
                CallerContext callerContext = LVA.A0Q;
                ((C01s) lva.A0C.get()).softReport("foreground_location_framework", "Request future failed", th);
                ((LD9) lva.A09.get()).A06((KmM) null, (Throwable) null, (Throwable) null);
                lva.A02 = null;
                L05.A00((L05) lva.A0K.get(), "FOREGROUND_LOCATION_CHECK_FAILED");
                return;
            case 1:
                IPo iPo = (IPo) this.A01;
                CallerContext callerContext2 = IPo.A06;
                Hlz hlz = iPo.A01;
                if (hlz != null) {
                    hlz.A00(this.A03);
                    return;
                }
                return;
            default:
                A05();
                if (this.A02 == ELO.A01) {
                    DZe.A09((DZe) this.A01, (Integer) null, th.getMessage());
                    return;
                }
                return;
        }
    }

    public void A04(CancellationException cancellationException) {
        if (2 - this.A00 != 0) {
            super.A04(cancellationException);
        } else {
            A05();
        }
    }
}
