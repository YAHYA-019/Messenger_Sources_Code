package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.52e, reason: invalid class name */
/* loaded from: 52e.class */
public final class C52e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C52e[] A01;
    public static final C52e A02;
    public static final C52e A03;
    public static final C52e A04;

    static {
        C52e c52e = new C52e("ON", 0);
        A03 = c52e;
        C52e c52e2 = new C52e("OFF", 1);
        A02 = c52e2;
        C52e c52e3 = new C52e(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 2);
        A04 = c52e3;
        C52e[] c52eArr = {c52e, c52e2, c52e3};
        A01 = c52eArr;
        A00 = C00t.A00(c52eArr);
    }

    public C52e(String str, int i) {
    }

    public static C52e valueOf(String str) {
        return (C52e) Enum.valueOf(C52e.class, str);
    }

    public static C52e[] values() {
        return (C52e[]) A01.clone();
    }
}
