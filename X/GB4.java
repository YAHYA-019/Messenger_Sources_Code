package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.jvm.functions.Function1;

/* loaded from: GB4.class */
public final class GB4 extends C00q implements Function1 {
    public static final GB4 A00 = new GB4();

    public GB4() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2hk, X.2hj, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Dq9 dq9 = (Dq9) ((C2i6) obj).A01;
        1LI r304 = dq9.A02;
        if (r304 == null) {
            C00m c00m = dq9.A04;
            if (c00m == null) {
                return null;
            }
            r304 = (1LI) c00m.invoke();
            if (r304 == null) {
                return null;
            }
        }
        ?? obj2 = new Object();
        boolean z = dq9.A05;
        if (z) {
            obj2.A01(Boolean.valueOf(z), "is_full_span");
        }
        obj2.A01(dq9.A03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        float f = dq9.A01;
        if (0.0f <= f && f <= 100.0f) {
            obj2.A01(Float.valueOf(f), "parent_width_percent");
        }
        float f2 = dq9.A00;
        if (0.0f <= f2 && f2 <= 100.0f) {
            obj2.A01(Float.valueOf(f2), "parent_height_percent");
        }
        return 7zM.A0t(r304, (C2hj) obj2);
    }
}
