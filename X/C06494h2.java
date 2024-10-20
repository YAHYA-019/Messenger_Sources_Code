package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4h2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4h2.class */
public final class C06494h2 implements InterfaceC06504h3 {
    public final 1Br A00 = 1Bq.A00(33013);
    public final List A01 = new ArrayList();

    @Override // X.InterfaceC06504h3
    public void CcU(4Zq r302) {
        11T.A0F(r302, 0);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A00.A00.get();
        EnumC06514h4[] values = EnumC06514h4.values();
        int length = values.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                fbSharedPreferences.CcW(r302, 0QD.A0f(arrayList));
                return;
            } else {
                arrayList.add(values[i2].A00());
                i = i2 + 1;
            }
        }
    }

    @Override // X.InterfaceC06504h3
    public void D62(4Zq r302) {
        11T.A0F(r302, 0);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A00.A00.get();
        EnumC06514h4[] values = EnumC06514h4.values();
        int length = values.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                fbSharedPreferences.D64(r302, 0QD.A0f(arrayList));
                return;
            } else {
                arrayList.add(values[i2].A00());
                i = i2 + 1;
            }
        }
    }
}
