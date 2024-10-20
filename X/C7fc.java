package X;

import android.content.res.ColorStateList;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;

/* renamed from: X.7fc, reason: invalid class name */
/* loaded from: 7fc.class */
public final class C7fc extends C1rj {
    public 5AG A00;

    public C7fc() {
        super("TextInputAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5AG r0 = this.A00;
        7ZF A01 = 6rU.A01(r302, 0);
        A01.A01.A0b = A01.A02.A0D(2131959084);
        MigColorScheme migColorScheme = r0.A01;
        A01.A2b(ColorStateList.valueOf(migColorScheme.B9Q()));
        A01.A2f(r0.A00);
        A01.A2Y(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        A01.A1H(0);
        2KE r02 = r0.A02;
        A01.A2X(2KK.A03(r02).textSizeSp);
        A01.A01.A0B = 2KK.A04(r02).A00(r302.A0D);
        A01.A2c(ColorStateList.valueOf(migColorScheme.B9Q()));
        A01.A01.A01 = 8388613;
        A01.A1W(2132279349);
        7ZF.A06(A01);
        A01.A0J();
        return A01.A01;
    }
}
