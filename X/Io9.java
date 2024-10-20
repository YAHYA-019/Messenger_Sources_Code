package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.Serializable;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: Io9.class */
public final class Io9 implements Comparable, C29M, Serializable, Cloneable {
    public static final java.util.Map A00;
    public BitSet __isset_bit_vector = 1BK.A18(1);
    public List floorParticipants;
    public String session_id;
    public long session_start_time_ms;
    public static final C29O A04 = new Object();
    public static final C29Q A01 = AbF.A0t("floorParticipants", (byte) 15, 1);
    public static final C29Q A02 = AbF.A0t("session_id", (byte) 11, 2);
    public static final C29Q A03 = AbF.A0t("session_start_time_ms", (byte) 10, 3);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.29O] */
    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(1, new Inz(new H0Q(new H0R()), "floorParticipants", (byte) 3));
        Io0.A00("session_id", A0u, (byte) 2, (byte) 11);
        Io0.A01("session_start_time_ms", A0u, (byte) 10, (byte) 2, 3);
        java.util.Map unmodifiableMap = Collections.unmodifiableMap(A0u);
        A00 = unmodifiableMap;
        Inz.A00.put(Io9.class, unmodifiableMap);
    }

    @Override // X.C29M
    public String D4Y(int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        if (z) {
            str = CQq.A03(i);
            str2 = "\n";
            str4 = " ";
        } else {
            str = str4;
            str2 = str4;
        }
        StringBuilder A0o = AnonymousClass001.A0o("ScreenshareFloorControlOutputState");
        A0o.append(str4);
        AnonymousClass001.A1D("(", str2, str, A0o);
        String A0V = AbstractC2327GOs.A0V("floorParticipants", str4, A0o);
        List list = this.floorParticipants;
        str3 = "null";
        if (list == null) {
            A0o.append(str3);
        } else {
            AbstractC2326GOr.A1Q(list, A0o, i + 1, z);
        }
        String str5 = this.session_id;
        if (AnonymousClass001.A1T(str5)) {
            4YU.A1S(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, A0o);
            A0o.append(str);
            AnonymousClass001.A1D("session_id", str4, A0V, A0o);
            A0o.append(str4);
            A0o.append(str5 != null ? CQq.A07(str5, i + 1, z) : "null");
        }
        if (this.__isset_bit_vector.get(0)) {
            4YU.A1S(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2, A0o);
            A0o.append(str);
            AnonymousClass001.A1D("session_start_time_ms", str4, A0V, A0o);
            A0o.append(str4);
            AbstractC2326GOr.A1Q(Long.valueOf(this.session_start_time_ms), A0o, i + 1, z);
        }
        4YU.A1S(str2, CQq.A08(str), A0o);
        return AnonymousClass001.A0d(")", A0o);
    }

    @Override // X.C29M
    public void DAs(2An r302) {
        r302.A0O();
        if (this.floorParticipants != null) {
            r302.A0V(A01);
            r302.A0W(new 2Aq((byte) 12, this.floorParticipants.size()));
            Iterator it = this.floorParticipants.iterator();
            while (it.hasNext()) {
                ((IoA) it.next()).DAs(r302);
            }
        }
        if (this.session_id != null) {
            r302.A0V(A02);
            r302.A0Z(this.session_id);
        }
        if (this.__isset_bit_vector.get(0)) {
            r302.A0V(A03);
            r302.A0U(this.session_start_time_ms);
        }
        r302.A0N();
        r302.A0P();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Io9 io9 = (Io9) obj;
        io9.getClass();
        if (io9 == this) {
            return 0;
        }
        int A06 = AbstractC2326GOr.A06(Boolean.valueOf(AnonymousClass001.A1T(this.floorParticipants)), AnonymousClass001.A1T(io9.floorParticipants));
        if (A06 == 0) {
            A06 = CQq.A02(this.floorParticipants, io9.floorParticipants);
            if (A06 == 0) {
                A06 = AbstractC2326GOr.A06(Boolean.valueOf(AnonymousClass001.A1T(this.session_id)), AnonymousClass001.A1T(io9.session_id));
                if (A06 == 0) {
                    A06 = CQq.A01(this.session_id, io9.session_id);
                    if (A06 == 0) {
                        A06 = AbstractC2326GOr.A06(Boolean.valueOf(this.__isset_bit_vector.get(0)), io9.__isset_bit_vector.get(0));
                        if (A06 == 0) {
                            long j = this.session_start_time_ms;
                            long j2 = io9.session_start_time_ms;
                            if (j >= j2) {
                                return j2 < j ? 1 : 0;
                            }
                            A06 = -1;
                        }
                    }
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
            if (!(obj instanceof Io9)) {
                return false;
            }
            Io9 io9 = (Io9) obj;
            List list = this.floorParticipants;
            boolean A1T = AnonymousClass001.A1T(list);
            List list2 = io9.floorParticipants;
            if (!CQq.A0I(list, list2, A1T, AnonymousClass001.A1T(list2))) {
                return false;
            }
            String str = this.session_id;
            boolean A1T2 = AnonymousClass001.A1T(str);
            String str2 = io9.session_id;
            if (!CQq.A0H(str, str2, A1T2, AnonymousClass001.A1T(str2))) {
                return false;
            }
            boolean z = this.__isset_bit_vector.get(0);
            boolean z2 = io9.__isset_bit_vector.get(0);
            long j = this.session_start_time_ms;
            long j2 = io9.session_start_time_ms;
            if (z2 ^ z) {
                return false;
            }
            if (z && j != j2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.floorParticipants, this.session_id, Long.valueOf(this.session_start_time_ms)});
    }

    public String toString() {
        return D4Y(1, true);
    }
}
