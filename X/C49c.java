package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.push.annotations.FCMRegistrarService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.49c, reason: invalid class name */
/* loaded from: 49c.class */
public abstract class C49c extends C49d {
    public static final String __redex_internal_original_name = "FbRunJobLogic";
    public final Context A00;

    public C49c(Context context) {
        this.A00 = context;
    }

    public static void A00(C49c c49c, int i) {
        synchronized (c49c) {
            C49h.A00.A06(c49c.A00.getResources().getResourceEntryName(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r302 == 2131365118) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(int r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.C49i
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r301
            r304 = r0
            r0 = r301
            X.49i r0 = (X.C49i) r0
            r304 = r0
            r0 = 2131365119(0x7f0a0cff, float:1.8350094E38)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L27
            r0 = 2131365118(0x7f0a0cfe, float:1.8350092E38)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L29
        L27:
            r0 = 1
            r303 = r0
        L29:
            r0 = 0
            r307 = r0
            r0 = r303
            if (r0 != 0) goto L7b
            r0 = r304
            java.util.Map r0 = r0.A01
            r308 = r0
            r0 = r302
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r309 = r0
            r0 = r308
            r1 = r309
            java.lang.Object r0 = r0.get(r1)
            X.1OZ r0 = (X.1OZ) r0
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L7b
            r0 = r304
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4rF r0 = (X.4rF) r0
            r1 = r310
            X.1Oc r0 = r0.A00(r1)
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0E()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L76
            r0 = r308
            r1 = r309
            java.lang.Object r0 = r0.remove(r1)
        L76:
            r0 = r303
            r1 = 1
            r0 = r0 ^ r1
            r307 = r0
        L7b:
            r0 = r307
            return r0
        L7e:
            r0 = r301
            boolean r0 = r0 instanceof X.4PZ
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lbd
            java.lang.Class<X.4Ac> r0 = X.C4Ac.class
            java.lang.Object r0 = X.1Bi.A04(r0)
            X.4Ac r0 = (X.C4Ac) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.BWQ()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lbd
            java.lang.Class<X.4Ad> r0 = X.C4Ad.class
            java.lang.Class<com.facebook.push.annotations.FCMRegistrarService> r1 = com.facebook.push.annotations.FCMRegistrarService.class
            java.lang.Object r0 = X.1Bi.A05(r0, r1)
            X.4Ad r0 = (X.C4Ad) r0
            r306 = r0
            X.4rD r0 = X.4rD.A01
            r310 = r0
            r0 = r306
            X.4rD r0 = X.C4Ad.A00(r0)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r310
            r1 = r306
            if (r0 != r1) goto L7b
        Lbd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49c.A03(int):boolean");
    }

    public boolean A04(Bundle bundle, C49f c49f, int i) {
        String string;
        String str;
        Executor executor;
        Runnable runnable;
        String string2;
        4AN Aax;
        if (this instanceof C49i) {
            C49i c49i = (C49i) this;
            if (bundle != null && (string2 = bundle.getString("serviceType")) != null) {
                AtomicInteger atomicInteger = 1uD.A01;
                try {
                    1OZ valueOf = 1OZ.valueOf(string2);
                    if (valueOf != null && ((45J) 1Bi.A03(32901)).A05(valueOf)) {
                        if (((4rF) c49i.A00.get()).A00(valueOf).A0E()) {
                            1uD.A02();
                            return false;
                        }
                        c49i.A01.put(Integer.valueOf(i), valueOf);
                        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
                        4AG A00 = ((C4U9) 1Bi.A03(131221)).A00(valueOf);
                        if (A00 != null && (Aax = A00.Aax()) != null) {
                            C1F6 c1f6 = (C1F6) 1Bn.A0A(33260);
                            Context A01 = FbInjector.A01();
                            FbInjector.A04(c1f6.B92().Aqm());
                            1Bn.A0M(c1f6);
                            try {
                                C4QQ c4qq = new C4QQ(A04, c49f, c1f6, Aax, valueOf);
                                1Bn.A0K();
                                FbInjector.A04(A01);
                                1EK.A09(C4QQ.__redex_internal_original_name, 301578351120862L);
                                try {
                                    ((ExecutorService) c4qq.A05.get()).execute(C0jy.A02(c4qq, C4QQ.__redex_internal_original_name, 0));
                                    1EK.A03();
                                } catch (Throwable th) {
                                    1EK.A03();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                1Bn.A0K();
                                FbInjector.A04(A01);
                                throw th2;
                            }
                        }
                        1uD.A02();
                        return true;
                    }
                } catch (IllegalArgumentException unused) {
                    1uD.A01();
                    return false;
                }
            }
            1uD.A01();
            return false;
        }
        if (!(this instanceof C4PY)) {
            4PZ r0 = (4PZ) this;
            if (bundle == null || (string = bundle.getString("serviceType")) == null) {
                return false;
            }
            r0.A05(1Fw.A00(), string);
            return true;
        }
        String string3 = bundle == null ? null : bundle.getString("serviceType");
        str = "";
        str = bundle != null ? bundle.getString("reason", str) : "";
        1OX r02 = (1OX) 1Bi.A05(1OX.class, (Class) null);
        1OZ r03 = 1OZ.A04;
        1P5 A012 = r02.A01(r03);
        if (string3 != null) {
            try {
                if (1OZ.valueOf(string3) == r03 && ((C4Ac) 1Bi.A05(C4Ac.class, (Class) null)).BWQ()) {
                    C4Ad c4Ad = (C4Ad) 1Bi.A05(C4Ad.class, FCMRegistrarService.class);
                    if (i == 2131365116) {
                        FbUserSession A06 = 1Fw.A06(1Bn.A0F(FbInjector.A00(), 1EZ.class, (Class) null));
                        executor = 1BK.A1E(c4Ad.A04);
                        new 4XP(A06, c49f, c4Ad, str);
                    } else {
                        if (4rD.A01 == C4Ad.A00(c4Ad)) {
                            1uD.A02();
                            return false;
                        }
                        FbUserSession A042 = 1Fw.A04((1EZ) 1Bn.A0F(FbInjector.A00(), 1EZ.class, (Class) null));
                        executor = (Executor) c4Ad.A04.get();
                        new 4XO(A042, c49f, c4Ad, str);
                    }
                    executor.execute(runnable);
                    1uD.A02();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                String A0v = 0Pz.A0v("Got IllegalArgumentException serviceType: ", string3, ", ", e.getMessage());
                0fH.A0s(C4PY.__redex_internal_original_name, A0v, e);
                A012.A09(A0v, str);
                1uD.A01();
                return false;
            }
        }
        String A0W = 0Pz.A0W("serviceType is not FCM or FCM is not supported, serviceTypeString: ", string3);
        0fH.A0k(C4PY.__redex_internal_original_name, A0W);
        A012.A09(A0W, str);
        1uD.A00();
        return false;
    }
}
