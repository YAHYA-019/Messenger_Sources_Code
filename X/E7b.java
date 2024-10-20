package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: E7b.class */
public final class E7b extends EwU {
    public final AbR A00;

    public E7b() {
        super(QRv.class, "com.facebook.platform.action.request.MESSAGE_DIALOG");
        this.A00 = (AbR) 1Bn.A0B(981);
    }

    public /* bridge */ /* synthetic */ QyB A00(Activity activity, RfD rfD) {
        QRv qRv = (QRv) rfD;
        AbR abR = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            QyB qpw = new QPW(activity, abR, qRv);
            1Bn.A0K();
            FbInjector.A04(A01);
            return qpw;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ RfD A01() {
        return (RfD) new Object();
    }
}
