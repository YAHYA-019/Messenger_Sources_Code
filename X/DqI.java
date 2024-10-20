package X;

import org.json.JSONObject;

/* loaded from: DqI.class */
public final class DqI extends C04v {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DqI(String str, int i, java.util.Map map) {
        this(str, (i & 2) != 0 ? 04R.A0G() : map, false);
        this.A00 = 0;
    }

    public DqI(String str, java.util.Map map, boolean z) {
        this.A00 = 0;
        1BL.A1F(str, map);
        this.A02 = str;
        this.A01 = map;
        this.A03 = z;
    }

    public DqI(JSONObject jSONObject) {
        this.A00 = 1;
        this.A02 = "com.bloks.www.bloks.caa.login.process_client_data_and_redirect";
        this.A01 = jSONObject;
        this.A03 = false;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof DqI)) {
            return false;
        }
        DqI dqI = (DqI) obj;
        return dqI.A00 == i && 11T.A0O(this.A02, dqI.A02) && 11T.A0O(this.A01, dqI.A01) && this.A03 == dqI.A03;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, 4YV.A02(this.A02)) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
