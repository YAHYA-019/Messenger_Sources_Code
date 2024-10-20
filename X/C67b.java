package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Arrays;

/* renamed from: X.67b, reason: invalid class name */
/* loaded from: 67b.class */
public final class C67b {
    public String A00;
    public String A01;
    public C67a A02;

    public C67b() {
        this("", new C67a());
    }

    public C67b(String str, C67a c67a) {
        this.A02 = c67a;
        this.A00 = str;
        this.A01 = ConstantsKt.CAMERA_ID_FRONT;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C67b) {
            C67b c67b = (C67b) obj;
            if (this.A02.equals(c67b.A02) && this.A00.equals(c67b.A00)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A02, this.A00});
    }
}
