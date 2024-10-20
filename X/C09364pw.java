package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4pw.class */
public final class C09364pw implements MobileConfigCxxChangeListener {
    public final java.util.Map A00 = new HashMap();
    public final C15h A01;
    public final ExecutorService A02;

    public C09364pw(Set set, ExecutorService executorService, C15h c15h) {
        this.A02 = executorService;
        this.A01 = c15h;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            1Nq r0 = (1Nq) it.next();
            int Adi = r0.Adi();
            java.util.Map map = this.A00;
            Integer valueOf = Integer.valueOf(Adi);
            List list = (List) map.get(valueOf);
            if (list == null) {
                list = new ArrayList();
                this.A00.put(valueOf, list);
            }
            list.add(r0);
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public void onConfigChanged(final String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        this.A02.execute(new Runnable() { // from class: X.3h8
            public static final String __redex_internal_original_name = "MobileConfigChangeRegistry$1";

            @Override // java.lang.Runnable
            public void run() {
                int parseInt;
                C09364pw c09364pw = C09364pw.this;
                String[] strArr2 = strArr;
                int length = strArr2.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        return;
                    }
                    String str = strArr2[i2];
                    try {
                        parseInt = Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
                    }
                    if (parseInt > 0) {
                        java.util.Map map = c09364pw.A00;
                        List<1Nq> list = (List) map.get(Integer.valueOf(parseInt));
                        if (list != null) {
                            for (1Nq r0 : list) {
                                try {
                                    r0.BqJ(r0.Adi());
                                } catch (Exception e) {
                                    ((C01s) c09364pw.A01.get()).D13(r0.getClass().toString(), e);
                                }
                            }
                        }
                        List<1Nq> list2 = (List) map.get(-1);
                        if (list2 != null) {
                            for (1Nq r02 : list2) {
                                try {
                                    r02.BqJ(parseInt);
                                } catch (Exception e2) {
                                    ((C01s) c09364pw.A01.get()).D13(AnonymousClass001.A0e(", config: ", AnonymousClass001.A0n(r02.getClass().toString()), parseInt), e2);
                                }
                            }
                        }
                        i = i2 + 1;
                    }
                    0fH.A17("MobileConfigChangeRegistry", "dispatchConfigsChanged received non_config_key change: %s", new Object[]{str});
                    i = i2 + 1;
                }
            }
        });
    }
}
