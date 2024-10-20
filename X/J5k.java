package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: J5k.class */
public final class J5k implements C15h {
    public static Ida A02;
    public final Context A00;
    public final boolean A01;

    public J5k(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C15h
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Ida get() {
        Ida ida = A02;
        if (ida == null) {
            Context context = this.A00;
            HashMap A18 = GOq.A18("messenger_camera");
            GOn.A1Z(JO1.A01, A18, true);
            ida = new Ida(I0y.A00.A00(context, new Hxy(A18), new Object(), new IdV()));
            ida.A0A(true);
            ida.A0B(true);
            A02 = ida;
        }
        if (this.A01) {
            if (ida != null) {
                ida.A02();
            }
            11T.A0L("aiBotController");
            throw 0Q8.createAndThrow();
        }
        Ida ida2 = A02;
        if (ida2 != null) {
            return ida2;
        }
        11T.A0L("aiBotController");
        throw 0Q8.createAndThrow();
    }
}
