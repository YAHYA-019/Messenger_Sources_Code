package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8ll, reason: invalid class name */
/* loaded from: 8ll.class */
public final class C8ll extends C1rj {
    public static final CallerContext A01 = CallerContext.A0B("PaymentsUriIconPileSpec");
    public ImmutableList A00;

    public C8ll() {
        super("PaymentsUriIconPile");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList immutableList = this.A00;
        boolean A1X = 1BL.A1X(r302, immutableList);
        C1rq A00 = C1rg.A00(r302);
        A00.A2b();
        A00.A0K();
        A00.A0z((Math.min(immutableList.size(), 5) * 24.0f) + 8.0f);
        A00.A00.A05 = A1X;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = 0QD.A0Y(immutableList, 5).iterator();
        while (it.hasNext()) {
            A0s.add(7zU.A0C(AnonymousClass001.A0i(it)));
        }
        if (!A0s.isEmpty()) {
            MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(r302.A0D.getApplicationContext(), 16979);
            C07004ik A0J = 7zR.A0J();
            ((C07014il) A0J).A03 = new C5em(4.0f, 0.0f, migColorScheme.AYp(), false);
            C06974ih A0Q = 7zO.A0Q(InterfaceC07034in.A08, A0J);
            0QF.A0q(A0s);
            int i = 0;
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    C0s8.A18();
                    throw 0Q8.createAndThrow();
                }
                Uri uri = (Uri) next;
                5BH A012 = 5BG.A01(r302);
                A012.A2b(A01);
                A012.A2Z(A0Q);
                A012.A0k(0.0f);
                7zP.A11(A012);
                A012.A27(C26z.END, i * (-8.0f));
                A012.A2X(uri);
                A00.A2f(7zO.A0O(A012));
                i = i2;
            }
        }
        return A00.A00;
    }
}
