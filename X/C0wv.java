package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.0wv, reason: invalid class name */
/* loaded from: 0wv.class */
public final class C0wv implements C06d {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ 06Z A03;

    public C0wv(06Z r302, String str, int i, int i2) {
        this.A03 = r302;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.C06d
    public boolean AU4(ArrayList arrayList, ArrayList arrayList2) {
        06Z r0 = this.A03;
        Fragment fragment = r0.A02;
        if (fragment == null || this.A01 >= 0 || this.A02 != null || !fragment.getChildFragmentManager().A1V()) {
            return r0.A1d(this.A02, arrayList, arrayList2, this.A01, this.A00);
        }
        return false;
    }
}
