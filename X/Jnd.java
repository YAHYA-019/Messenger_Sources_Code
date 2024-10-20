package X;

import android.os.Bundle;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Jnd.class */
public final class Jnd extends L5Y implements MNr, MNt, MNs {
    public AbstractC3252Jnp A00;
    public boolean A01;
    public boolean A03;
    public final KmZ A05;
    public final LiF A06;
    public final String A07;
    public final MessageDigest A08;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final java.util.Map A0H;
    public final java.util.Map A0I;
    public final java.util.Map A0J;
    public final List A0G = AnonymousClass001.A0s();
    public final List A09 = AnonymousClass001.A0s();
    public final java.util.Map A0B = AnonymousClass001.A0u();
    public final java.util.Map A0A = AnonymousClass001.A0u();
    public final L2C A04 = new L2C();
    public boolean A02 = false;
    public final java.util.Map A0C = AnonymousClass001.A0u();

    public Jnd(LiF liF, String str, String str2, boolean z, boolean z2, boolean z3) {
        MessageDigest messageDigest;
        boolean z4 = false;
        KmZ kmZ = new KmZ();
        this.A05 = kmZ;
        this.A0H = AnonymousClass001.A0u();
        this.A0J = AnonymousClass001.A0u();
        this.A0I = AnonymousClass001.A0u();
        0fH.A0j("IntegrityLoggingController", "initIntegrityLogging");
        kmZ.A06 = str;
        11T.A0F(str2, 0);
        kmZ.A02 = str2;
        this.A07 = str2;
        this.A01 = false;
        this.A0E = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A06 = liF;
        this.A03 = liF != null ? true : z4;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        this.A08 = messageDigest;
    }

    public static void A00(Jnd jnd) {
        HashMap hashMap;
        HashSet hashSet;
        HashSet hashSet2;
        Bundle bundle;
        if (jnd.A02) {
            return;
        }
        HashMap A0u = AnonymousClass001.A0u();
        L2C l2c = jnd.A04;
        Set set = l2c.A02;
        synchronized (set) {
            hashMap = new HashMap(l2c.A00);
        }
        Iterator A0y = AnonymousClass001.A0y(hashMap);
        while (A0y.hasNext()) {
            GOn.A1Y(AnonymousClass001.A0z(A0y).getKey(), A0u, AnonymousClass001.A03(r0.getValue()));
        }
        KmZ kmZ = jnd.A05;
        List list = jnd.A0G;
        11T.A0F(list, 0);
        kmZ.A08 = list;
        List list2 = jnd.A09;
        11T.A0F(list2, 0);
        kmZ.A07 = list2;
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        kmZ.A0G = hashSet;
        kmZ.A0E = A0u;
        synchronized (set) {
            hashSet2 = new HashSet(l2c.A01);
        }
        kmZ.A0F = hashSet2;
        kmZ.A0H = jnd.A01;
        java.util.Map map = jnd.A0B;
        11T.A0F(map, 0);
        kmZ.A09 = map;
        java.util.Map map2 = jnd.A0A;
        11T.A0F(map2, 0);
        kmZ.A0A = map2;
        kmZ.A0B = jnd.A0H;
        kmZ.A0D = jnd.A0J;
        kmZ.A0C = jnd.A0I;
        jnd.A02 = true;
        0fH.A0j("IntegrityLoggingController", "Sending integrity data to main process");
        LDF A00 = LDF.A00();
        java.util.Map singletonMap = Collections.singletonMap("INTEGRITY_LOGGER", new LiH(kmZ));
        JgX jgX = ((L5Y) jnd).A03;
        ZonePolicy zonePolicy = null;
        if (jgX == null) {
            bundle = null;
        } else {
            bundle = jgX.A09;
            zonePolicy = jgX.A0d;
        }
        A00.A09(bundle, zonePolicy, "INTEGRITY_LOGGER", singletonMap);
    }
}
