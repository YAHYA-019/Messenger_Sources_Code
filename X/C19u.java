package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: X.19u, reason: invalid class name */
/* loaded from: 19u.class */
public final class C19u {
    public final Context A00;
    public final AnonymousClass094 A01;
    public final AnonymousClass097 A02;

    public C19u(Context context, AnonymousClass094 anonymousClass094, AnonymousClass097 anonymousClass097, 09O r305) {
        this.A02 = anonymousClass097;
        this.A00 = context;
        this.A01 = anonymousClass094;
        09C A01 = 0Pz.A01(context, anonymousClass094, "fbns_state");
        String string = A01.getString("mqtt_version", "");
        String str = r305.A00;
        if (string.equals(str)) {
            return;
        }
        A02();
        0Mi AP6 = A01.AP6();
        AP6.CaM("mqtt_version", str);
        AP6.AGo("RegistrationState", "PreferencesManager failed to store current mqtt build number.");
    }

    public static boolean A00(C09D c09d, C19s c19s, String str) {
        try {
            String A01 = c19s.A01();
            0Mi AP6 = c09d.AP6();
            AP6.CaM(str, A01);
            AP6.AGo("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
            return true;
        } catch (JSONException e) {
            0fH.A0s("RegistrationState", "RegistrationCacheEntry serialization failed", e);
            return false;
        }
    }

    public LinkedList A01() {
        CountDownLatch A11 = AnonymousClass001.A11();
        LinkedList linkedList = new LinkedList();
        java.util.Map all = 0Pz.A01(this.A00, this.A01, "registrations").getAll();
        LinkedList linkedList2 = new LinkedList();
        Iterator A0y = AnonymousClass001.A0y(all);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            try {
                0fH.A0d(A0z.getKey(), A0z.getValue(), "RegistrationState", "getRegisteredApps retrieving %s:%s");
                C19s A00 = C19s.A00(A0z.getValue().toString());
                if (!A00.A04) {
                    linkedList2.add(A00);
                }
            } catch (JSONException e) {
                0fH.A0s("RegistrationState", "Parse failed", e);
            }
        }
        linkedList.addAll(linkedList2);
        A11.countDown();
        try {
            A11.await();
            return linkedList;
        } catch (InterruptedException e2) {
            0fH.A0z("RegistrationState", "Waiting for latch was interrupted", e2, new Object[]{e2});
            return linkedList;
        }
    }

    public void A02() {
        0fH.A0j("RegistrationState", "invalidateAllTokenCache");
        09C A01 = 0Pz.A01(this.A00, this.A01, "registrations");
        09C r0 = A01;
        java.util.Map all = r0.getAll();
        0Mi AP6 = A01.AP6();
        Iterator it = all.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            11T.A0F(A0i, 0);
            String string = r0.getString(A0i, "");
            if (TextUtils.isEmpty(string)) {
                0fH.A14("RegistrationState", "invalid value for %s", new Object[]{A0i});
            } else {
                try {
                    C19s A00 = C19s.A00(string);
                    A00.A03 = "";
                    A00.A00 = AnonymousClass002.A0G();
                    try {
                        AP6.CaM(A0i, A00.A01());
                    } catch (JSONException e) {
                        0fH.A0s("RegistrationState", "RegistrationCacheEntry serialization failed", e);
                    }
                } catch (JSONException e2) {
                    0fH.A0s("RegistrationState", "Parse failed", e2);
                    0fH.A14("RegistrationState", "invalid value for %s", new Object[]{A0i});
                }
            }
        }
        AP6.AGo("RegistrationState", "PreferencesManager failed to store RegistrationCacheEntry");
    }

    public void A03(C19t c19t, String str) {
        16Q.A00(str);
        String string = 0Pz.A01(this.A00, this.A01, "registrations").getString(str, "");
        if (TextUtils.isEmpty(string)) {
            c19t.BjE(null);
            return;
        }
        try {
            c19t.BjE(C19s.A00(string).A01);
        } catch (JSONException e) {
            0fH.A0s("RegistrationState", "Parse failed", e);
            c19t.BjE(null);
        }
    }
}
