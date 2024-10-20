package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADM;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Jox, reason: case insensitive filesystem */
/* loaded from: Jox.class */
public final class C3279Jox extends C49c {
    public static final String __redex_internal_original_name = "AdmWorkJobLogic";
    public final ADM A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw r301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3279Jox() {
        /*
            r301 = this;
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.<init>(r1)
            r0 = 49152(0xc000, float:6.8877E-41)
            X.1BQ r0 = X.1BQ.A02(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A04 = r1
            r0 = 16448(0x4040, float:2.3049E-41)
            X.1BQ r0 = X.1BQ.A02(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A05 = r1
            r0 = 131216(0x20090, float:1.83873E-40)
            X.1BV r0 = X.1BV.A00(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = 131214(0x2008e, float:1.8387E-40)
            r303 = r0
            r0 = r303
            X.1BQ r0 = X.1BQ.A02(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A02 = r1
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            com.amazon.device.messaging.ADM r0 = new com.amazon.device.messaging.ADM     // Catch: java.lang.RuntimeException -> L50 java.lang.NoClassDefFoundError -> L60 java.lang.Throwable -> L70
            r302 = r0
            r0 = r302
            r1 = r304
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L50 java.lang.NoClassDefFoundError -> L60 java.lang.Throwable -> L70
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        L50:
            r305 = move-exception
            java.lang.Class<X.Jox> r0 = X.C3279Jox.class
            r304 = r0
            java.lang.String r0 = "ADM got RuntimeException"
            r302 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            X.0fH.A0H(r0, r1, r2)     // Catch: java.lang.Throwable -> L70
            return
        L60:
            r305 = move-exception
            java.lang.Class<X.Jox> r0 = X.C3279Jox.class
            r304 = r0
            java.lang.String r0 = "Device doesn't support ADM"
            r302 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            X.0fH.A0K(r0, r1, r2)     // Catch: java.lang.Throwable -> L70
            return
        L70:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3279Jox.<init>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if (X.4rD.A01 == X.LY1.A00((X.LY1) r0.get())) goto L11;
     */
    @Override // X.C49c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(int r302) {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A02
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.LY1 r0 = (X.LY1) r0
            r304 = r0
            r0 = r304
            monitor-enter(r0)
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = 0
            r0.A00 = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r304
            monitor-exit(r0)
            r0 = r301
            X.00i r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.4YX r0 = (X.4YX) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.BWQ()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L55
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.LY1 r0 = (X.LY1) r0
            r306 = r0
            X.4rD r0 = X.4rD.A01
            r303 = r0
            r0 = r306
            X.4rD r0 = X.LY1.A00(r0)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L5b
        L55:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L5b:
            r0 = r305
            return r0
        L5e:
            r306 = move-exception
            r0 = r304
            monitor-exit(r0)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3279Jox.A03(int):boolean");
    }

    @Override // X.C49c
    public boolean A04(Bundle bundle, C49f c49f, int i) {
        String str;
        str = "";
        String string = bundle == null ? str : bundle.getString(1BJ.A00(228), str);
        1OZ r307 = null;
        if (string != null) {
            try {
                if (!string.isEmpty()) {
                    r307 = 1OZ.valueOf(string);
                }
            } catch (IllegalArgumentException e) {
                0fH.A0N(C3279Jox.class, "Got IllegalArgumentException serviceType: %s", e, new Object[]{r307});
                return false;
            }
        }
        str = bundle != null ? bundle.getString("action", str) : "";
        if (r307 != 1OZ.A01 || !((4YX) this.A04.get()).BWQ()) {
            0fH.A0S(C3279Jox.class, "Not ADM or ADM is not supported or invalid action: %s, serviceTypeString: %s", new Object[]{str, string});
            return false;
        }
        LY1 ly1 = (LY1) this.A02.get();
        synchronized (ly1) {
            ly1.A00 = c49f;
        }
        1BK.A1E(this.A05).execute(new Lpf(4YU.A0A(str), 1Fw.A00(), this));
        return true;
    }

    public void A05(Intent intent, FbUserSession fbUserSession) {
        Class cls;
        String str;
        C1cx.A00(this.A01);
        String action = intent.getAction();
        if ("register_start".equals(action)) {
            cls = C3279Jox.class;
            0fH.A0E(cls, "Registering ADM token");
            ADM adm = this.A00;
            if (adm == null) {
                return;
            }
            try {
                adm.startRegister();
                return;
            } catch (IllegalStateException e) {
                e = e;
                str = "ADM register Exception";
            }
        } else {
            if (!"unregister_start".equals(action)) {
                if ("registration_response".equals(action)) {
                    ((Krw) this.A03.get()).A01(intent, fbUserSession);
                    return;
                } else {
                    if ("registration_error".equals(action)) {
                        ((Krw) this.A03.get()).A00(intent);
                        return;
                    }
                    return;
                }
            }
            cls = C3279Jox.class;
            0fH.A0E(cls, "Unregistering ADM token");
            ADM adm2 = this.A00;
            if (adm2 == null) {
                return;
            }
            try {
                if (adm2.getRegistrationId() != null) {
                    adm2.startUnregister();
                    return;
                }
                return;
            } catch (IllegalStateException e2) {
                e = e2;
                str = "ADM unregister Exception";
            }
        }
        0fH.A0H(cls, str, e);
    }
}
