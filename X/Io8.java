package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Serializable;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: Io8.class */
public final class Io8 implements Comparable, C29M, Serializable, Cloneable {
    public static final java.util.Map A00;
    public BitSet __isset_bit_vector = 1BK.A18(1);
    public boolean used_avatars;
    public String userId;
    public static final C29O A03 = new Object();
    public static final C29Q A01 = AbF.A0t("used_avatars", (byte) 2, 1);
    public static final C29Q A02 = AbF.A0t("userId", (byte) 11, 2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.29O] */
    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(1, new Inz(new Io0((byte) 2), "used_avatars", (byte) 3));
        Io0.A00("userId", A0u, (byte) 2, (byte) 11);
        java.util.Map unmodifiableMap = Collections.unmodifiableMap(A0u);
        A00 = unmodifiableMap;
        Inz.A00.put(Io8.class, unmodifiableMap);
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        String str;
        String str2;
        String str3 = "";
        if (z) {
            str = CQq.A03(i);
            str2 = "\n";
            str3 = " ";
        } else {
            str = str3;
            str2 = str3;
        }
        StringBuilder A0o = AnonymousClass001.A0o("EnteredAvatarsModeInputState");
        A0o.append(str3);
        AnonymousClass001.A1D("(", str2, str, A0o);
        String A0V = AbstractC2327GOs.A0V("used_avatars", str3, A0o);
        int i2 = i + 1;
        AbstractC2326GOr.A1Q(Boolean.valueOf(this.used_avatars), A0o, i2, z);
        String str4 = this.userId;
        if (str4 != null) {
            4YU.A1S(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, A0o);
            A0o.append(str);
            AnonymousClass001.A1D("userId", str3, A0V, A0o);
            A0o.append(str3);
            AbstractC2326GOr.A1Q(str4, A0o, i2, z);
        }
        4YU.A1S(str2, CQq.A08(str), A0o);
        return AnonymousClass001.A0d(")", A0o);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        r302.A0V(A01);
        r302.A0b(this.used_avatars);
        if (this.userId != null) {
            r302.A0V(A02);
            r302.A0Z(this.userId);
        }
        r302.A0N();
        r302.A0P();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Io8 io8 = (Io8) obj;
        io8.getClass();
        if (io8 == this) {
            return 0;
        }
        int A06 = AbstractC2326GOr.A06(Boolean.valueOf(this.__isset_bit_vector.get(0)), io8.__isset_bit_vector.get(0));
        if (A06 == 0) {
            boolean z = this.used_avatars;
            if (z == io8.used_avatars) {
                A06 = AbstractC2326GOr.A06(Boolean.valueOf(AnonymousClass001.A1T(this.userId)), AnonymousClass001.A1T(io8.userId));
                if (A06 == 0) {
                    A06 = CQq.A01(this.userId, io8.userId);
                    if (A06 == 0) {
                        return 0;
                    }
                }
            } else {
                A06 = -1;
                if (z) {
                    return 1;
                }
            }
        }
        return A06;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof Io8)) {
                return false;
            }
            Io8 io8 = (Io8) obj;
            if (this.used_avatars != io8.used_avatars) {
                return false;
            }
            String str = this.userId;
            boolean A1T = AnonymousClass001.A1T(str);
            String str2 = io8.userId;
            if (!CQq.A0H(str, str2, A1T, AnonymousClass001.A1T(str2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Boolean.valueOf(this.used_avatars), this.userId});
    }

    public String toString() {
        return D4Y(1, true);
    }
}
