package X;

import org.json.JSONObject;

/* loaded from: Ho7.class */
public final class Ho7 {
    public final int A00;
    public final boolean A01;

    public Ho7(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public String toString() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("interactive", this.A01);
            A12.put("importance", this.A00);
        } catch (Exception unused) {
        }
        return 11T.A02(A12);
    }
}
