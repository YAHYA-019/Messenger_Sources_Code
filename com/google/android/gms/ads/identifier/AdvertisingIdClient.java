package com.google.android.gms.ads.identifier;

import X.0FI;
import X.1BK;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.AnonymousClass518;
import X.C2B7;
import X.JQw;
import X.LxX;
import android.content.Context;
import android.util.Log;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.android.gms.internal.ads_identifier.zze;
import java.util.HashMap;

/* loaded from: AdvertisingIdClient.class */
public final class AdvertisingIdClient {
    public AnonymousClass518 A00;
    public zze A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = new Object();
    public final boolean A05;

    /* loaded from: AdvertisingIdClient$Info.class */
    public final class Info {
        public final String A00;
        public final boolean A01;

        public Info(String str, boolean z) {
            this.A00 = str;
            this.A01 = z;
        }

        public final String toString() {
            String str = this.A00;
            boolean z = this.A01;
            StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(str) + 7);
            A0l.append("{");
            A0l.append(str);
            A0l.append("}");
            A0l.append(z);
            return A0l.toString();
        }
    }

    public AdvertisingIdClient(Context context, boolean z, boolean z2) {
        Context applicationContext;
        AbstractC00481b7.A02(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A03 = context;
        this.A02 = false;
        this.A05 = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info A00(android.content.Context r301) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.A00(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    private final void A01(Info info, String str, Throwable th, float f, long j, boolean z) {
        if (Math.random() <= f) {
            HashMap A0u = AnonymousClass001.A0u();
            Object obj = ConstantsKt.CAMERA_ID_BACK;
            Object obj2 = ConstantsKt.CAMERA_ID_FRONT;
            if (z) {
                obj2 = obj;
            }
            A0u.put("app_context", obj2);
            if (info != null) {
                if (!info.A01) {
                    obj = ConstantsKt.CAMERA_ID_FRONT;
                }
                A0u.put("limit_ad_tracking", obj);
                String str2 = info.A00;
                if (str2 != null) {
                    A0u.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                A0u.put("error", AnonymousClass001.A0Y(th));
            }
            if (str != null && !str.isEmpty()) {
                A0u.put("experiment_id", str);
            }
            A0u.put(FalcoACSProvider.TAG, "AdvertisingIdClient");
            A0u.put(JQw.A00(32), Long.toString(j));
            new LxX(A0u).start();
        }
    }

    private final void A02() {
        AbstractC00481b7.A05("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (context != null && this.A00 != null) {
                try {
                    if (this.A02) {
                        C2B7.A00().A02(context, this.A00);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(1726643325);
        A02();
        0FI.A09(-1073748211, A03);
    }
}
