package X;

import com.facebook.common.network.FbNetworkManager;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/* renamed from: X.4VK, reason: invalid class name */
/* loaded from: 4VK.class */
public final class C4VK {
    public static final Set A0A = ImmutableSet.A06("started_playing", "unpaused", "entered_hd", "exited_hd", "paused", "finished_playing", "stall_detail", "heart_beat", "representation_ended");
    public final int A00;
    public final C00i A06;
    public final java.util.Map A07;
    public final java.util.Map A08;
    public final Random A09;
    public final C00i A04 = 1BQ.A02(49776);
    public final C00i A01 = 1BQ.A02(16918);
    public final C00i A02 = 1BQ.A02(131081);
    public final C00i A03 = 1BQ.A02(16687);
    public final C00i A05 = 1BQ.A02(16616);

    public C4VK() {
        1BQ A02 = 1BQ.A02(16385);
        this.A06 = A02;
        this.A07 = Collections.synchronizedMap(AnonymousClass001.A0u());
        this.A09 = new Random();
        this.A08 = Collections.synchronizedMap(AnonymousClass001.A0u());
        this.A00 = (int) ((2yD) A02.get()).Auy(36607603991650090L);
    }

    public static String A00(C4VK c4vk, String str) {
        java.util.Map map;
        if (str == null || str.isEmpty() || (map = c4vk.A07) == null) {
            return "";
        }
        if (map.containsKey(str)) {
            return AnonymousClass001.A0b(str, map);
        }
        if (map.size() > 1000) {
            map.clear();
        }
        String obj = C04I.A00().toString();
        map.put(str, obj);
        return obj;
    }

    public static HashMap A01(C4VK c4vk) {
        String A03;
        HashMap A0u = AnonymousClass001.A0u();
        if ("wifi".equalsIgnoreCase(((FbNetworkManager) c4vk.A03.get()).A0H()) && (A03 = ((5YL) c4vk.A04.get()).A00().A03()) != null) {
            A0u.put("hardware_address", A03);
        }
        ((2Ar) c4vk.A01.get()).A00().A0m(A0u);
        return A0u;
    }

    public static boolean A02(C4VK c4vk) {
        if (((1Od) c4vk.A05.get()).A0E()) {
            return false;
        }
        try {
            C00i c00i = c4vk.A02;
            if (((C5ez) c00i.get()).A01.isProviderEnabled("network")) {
                return true;
            }
            return ((C5ez) c00i.get()).A01.isProviderEnabled("gps");
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean A03(C4VK c4vk, String str) {
        java.util.Map map;
        int i = c4vk.A00;
        boolean z = false;
        if (i > 0 && (map = c4vk.A08) != null) {
            if (!map.containsKey(str)) {
                if (map.size() > 1000) {
                    map.clear();
                }
                if (c4vk.A09.nextInt(i) == 0) {
                    z = true;
                }
                map.put(str, Boolean.valueOf(z));
                return z;
            }
            Boolean bool = (Boolean) map.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }
}
