package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: E7c.class */
public final class E7c extends EwU {
    public final AbR A00;
    public final AnonymousClass244 A01;

    public E7c() {
        super(QRw.class, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG");
        AbR abR = (AbR) 1Bn.A0B(982);
        AnonymousClass244 A0s = AbI.A0s();
        this.A00 = abR;
        this.A01 = A0s;
    }

    public /* bridge */ /* synthetic */ QyB A00(Activity activity, RfD rfD) {
        QRw qRw = (QRw) rfD;
        AbR abR = this.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            QyB qpv = new QPV(activity, qRw);
            1Bn.A0K();
            FbInjector.A04(A01);
            return qpv;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ RfD A01() {
        return new QRw(this.A01);
    }
}
