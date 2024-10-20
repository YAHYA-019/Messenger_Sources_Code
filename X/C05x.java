package X;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.05x, reason: invalid class name */
/* loaded from: 05x.class */
public final class C05x {
    public static C05x A04;
    public static final boolean A05;
    public final C05z A00;
    public final 0jH A01;
    public final java.util.Map A02 = new HashMap();
    public final 01G A03;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A05 = z;
    }

    public C05x(Context context, 0jH r303) {
        01G r0 = new 01G() { // from class: X.05y
            /* JADX WARN: Multi-variable type inference failed */
            public void Bwx(Object obj, String str, Method method, Object[] objArr, long j) {
                if (str.equals("activity")) {
                    try {
                        if (!method.getName().equals("getContentProvider") || obj == null) {
                            if (method.getName().equals("removeContentProvider")) {
                                C05x c05x = C05x.this;
                                Object obj2 = objArr[0];
                                if (obj2 != null) {
                                    IBinder.DeathRecipient deathRecipient = (0Er) c05x.A02.remove(obj2);
                                    if (deathRecipient != null) {
                                        ((0Er) deathRecipient).A00.unlinkToDeath(deathRecipient, 0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C05x c05x2 = C05x.this;
                        boolean z = C05x.A05;
                        byte b = 4;
                        if (z) {
                            b = 3;
                        }
                        if (((Boolean) objArr[b == true ? 1 : 0]).booleanValue()) {
                            byte b2 = 2;
                            if (z) {
                                b2 = true;
                            }
                            String str2 = (String) objArr[b2 == true ? 1 : 0];
                            C05z c05z = c05x2.A00;
                            IBinder iBinder = (IBinder) c05z.A01("connection", obj);
                            IInterface iInterface = (IInterface) c05z.A01("provider", obj);
                            if (iBinder == null || iInterface == null) {
                                return;
                            }
                            java.util.Map map = c05x2.A02;
                            if (map.containsKey(iBinder)) {
                                return;
                            }
                            map.put(iBinder, new 0Er(iBinder, iInterface.asBinder(), c05x2, str2));
                        }
                    } catch (Throwable th) {
                        C0iy.A00().Bwu("getContentProvider", th, null);
                    }
                }
            }
        };
        this.A03 = r0;
        this.A00 = C05z.A00(context.getApplicationContext());
        this.A01 = r303;
        01Q.A00(context, "activity");
        01Q.A01(r0);
    }
}
