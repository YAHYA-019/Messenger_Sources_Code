package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.Locale;

/* renamed from: X.2z0, reason: invalid class name */
/* loaded from: 2z0.class */
public abstract class C2z0 extends 1EJ {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2sT, java.lang.Object] */
    public static final C2sT A00() {
        Locale A06 = ((1GS) 1Bi.A03(16504)).A06();
        Context A00 = FbInjector.A00();
        ?? obj = new Object();
        obj.A00 = new 2sU(A00, A06);
        if (A00 != null) {
            09X.A00();
            09X.A03(A00, new 0CM(new C08j[]{new 2sV((C2sT) obj, A06)}));
        }
        return obj;
    }

    public static final C2qq A01() {
        Context A00 = FbInjector.A00();
        C2qp c2qp = new C15h() { // from class: X.2qp
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Bn.A0E((Context) null, (1BY) null, 99932);
            }
        };
        11T.A0D(A00);
        return new C2qq(A00, c2qp);
    }

    public static final C2qr A02() {
        return new C2qr((C2qq) 1Bn.A0A(67516));
    }
}
