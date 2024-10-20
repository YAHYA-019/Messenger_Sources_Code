package X;

import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: Cny.class */
public final class Cny implements C5rt {
    public final int A00;
    public final Object A01;

    public Cny(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5rt
    public void Blg() {
        if (this.A00 == 0) {
            ((1FX) this.A01).setException(AnonymousClass001.A0T("bitmap fetched failed"));
            return;
        }
        D9s d9s = (D9s) this.A01;
        C04274ai.A00(d9s.A00, null, d9s.A01, d9s.A02);
    }

    @Override // X.C5rt
    public void BpW(List list) {
        if (this.A00 == 0) {
            AbF.A1W(this.A01, list);
            return;
        }
        D9s d9s = (D9s) this.A01;
        C04274ai c04274ai = d9s.A02;
        CallerContext callerContext = C04274ai.A0L;
        c04274ai.A0A.get();
        ArrayList arrayList = d9s.A03;
        CallerContext callerContext2 = 5bF.A0V;
        HashMap A0u = AnonymousClass001.A0u();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                C04274ai.A00(d9s.A00, (Bitmap) A0u.get(arrayList.get(0)), d9s.A01, c04274ai);
                return;
            }
            2EU r0 = (2EU) list.get(i2);
            Bitmap bitmap = null;
            try {
                2EY r02 = (2Ea) r0.A09();
                if (r02 instanceof 2EY) {
                    bitmap = r02.A04;
                }
                A0u.put((UserKey) arrayList.get(i2), bitmap);
                r0.close();
                i = i2 + 1;
            } catch (Throwable th) {
                2EU.A04(r0);
                throw th;
            }
        }
    }
}
