package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;

/* renamed from: X.4qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qm.class */
public final /* synthetic */ class RunnableC09604qm implements Runnable {
    public static final String __redex_internal_original_name = "PushServiceSelector$$ExternalSyntheticLambda0";
    public final /* synthetic */ 45J A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Class[] A02;

    public /* synthetic */ RunnableC09604qm(45J r302, String str, Class[] clsArr) {
        this.A00 = r302;
        this.A02 = clsArr;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        45J r0 = this.A00;
        Class[] clsArr = this.A02;
        String str = this.A01;
        int length = clsArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            ComponentName componentName = new ComponentName((Context) r0.A02.get(), (Class<?>) clsArr[i2]);
            05L r02 = 05L.A02;
            C00i c00i = r0.A08;
            try {
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    throw e;
                }
                C01s c01s = r02.A01;
                if (c01s != null) {
                    c01s.softReport(AnonymousClass000.A00(79), "getComponentEnabledSetting DeadObjectException", e);
                }
            }
            if (1 == ((PackageManager) c00i.get()).getComponentEnabledSetting(componentName)) {
                0fH.A07(45J.class, componentName.toString(), "Component: %s state was already enabled");
                i = i2 + 1;
            }
            if (str == null || 0Kh.A03(((C0B5) r0.A01.get()).A01, str)) {
                try {
                    ((PackageManager) c00i.get()).setComponentEnabledSetting(componentName, 1, 1);
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof DeadObjectException)) {
                        throw e2;
                    }
                    C01s c01s2 = r02.A01;
                    if (c01s2 != null) {
                        c01s2.softReport(AnonymousClass000.A00(79), "setComponentEnabledSetting DeadObjectException", e2);
                    }
                }
                0fH.A07(45J.class, componentName.toString(), "Enabling Component: %s");
            }
            0fH.A0T(45J.class, "Component: %s bypass update to state enabled", new Object[]{componentName.toString()});
            i = i2 + 1;
        }
    }
}
