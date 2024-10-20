package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.48w, reason: invalid class name */
/* loaded from: 48w.class */
public final class C48w implements 1UN {
    public final C00i A01 = FbInjector.A00;
    public final C00i A02 = new 1BV(32922);
    public final C00i A03 = new 1BQ(66655);
    public long A00 = 0;

    public C48w() {
        ((1UP) 1Bi.A03(66348)).A00(this);
    }

    public static ArrayList A00(C48w c48w) {
        try {
            ArrayList A01 = 4iS.A01((Context) c48w.A01.get());
            ArrayList arrayList = new ArrayList(A01.size());
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                4iO r0 = (4iO) it.next();
                Set set = r0.A0F;
                if (set != null && set.contains("com.facebook.messaging.directshare.SHARE_TARGET_SHORTCUT")) {
                    arrayList.add(r0.A0D);
                }
            }
            return arrayList;
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException unused) {
            return AnonymousClass001.A0t(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d2, code lost:
    
        if (X.1BK.A0N(((X.C48x) r0.get()).A00).AZk(36316469633493222L) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A02
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.48x r0 = (X.C48x) r0
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r303 = r0
            r0 = r303
            r1 = 36597944610262860(0x8205a300010f4c, double:3.208025767400036E-306)
            long r0 = r0.Auy(r1)
            r304 = r0
            r0 = r304
            int r0 = X.1NS.A01(r0)
            r306 = r0
            r0 = 0
            r1 = r306
            int r0 = java.lang.Math.max(r0, r1)
            r307 = r0
            r0 = r301
            X.00i r0 = r0.A03
            r308 = r0
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.1fF r0 = (X.1fF) r0
            r309 = r0
            r0 = r309
            boolean r0 = r0.A06()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Laf
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.1fF r0 = (X.1fF) r0
            r309 = r0
            r0 = r309
            X.1CO r0 = X.1fF.A00(r0)
            r303 = r0
            r0 = 36605679846497518(0x820cac00031cee, double:3.21291756194213E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            long r0 = r0.Auy(r1)
            r310 = r0
            r0 = r310
            int r0 = (int) r0
            r306 = r0
            r0 = 0
            r1 = r306
            int r0 = java.lang.Math.max(r0, r1)
            r307 = r0
        L7c:
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r308 = r0
            r0 = r308
            java.lang.Class r0 = r0.getClass()
            r0 = r308
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r0.getSystemService(r1)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r309 = r0
            r0 = r309
            int r0 = r0.getMaxShortcutCountPerActivity()
            r306 = r0
            r0 = r307
            r1 = r306
            int r0 = java.lang.Math.min(r0, r1)
            r307 = r0
        Lac:
            r0 = r307
            return r0
        Laf:
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.48x r0 = (X.C48x) r0
            X.00i r0 = r0.A00
            r309 = r0
            r0 = r309
            X.2yD r0 = X.1BK.A0N(r0)
            r303 = r0
            r0 = 36316469633493222(0x8105a3000028e6, double:3.0300198586821596E-306)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lac
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48w.A01():int");
    }

    public void AFz() {
        ArrayList A00 = A00(this);
        if (A00.isEmpty()) {
            return;
        }
        4iS.A06((Context) this.A01.get(), A00);
    }
}
