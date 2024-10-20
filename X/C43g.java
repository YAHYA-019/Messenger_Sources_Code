package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.43g, reason: invalid class name */
/* loaded from: 43g.class */
public final class C43g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C43g[] A01;
    public static final C43g A02;
    public static final C43g A03;
    public static final C43g A04;
    public static final C43g A05;

    static {
        C43g c43g = new C43g("AND", 0);
        A02 = c43g;
        C43g c43g2 = new C43g("OR", 1);
        A04 = c43g2;
        C43g c43g3 = new C43g("NOR", 2);
        A03 = c43g3;
        C43g c43g4 = new C43g(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 3);
        A05 = c43g4;
        C43g[] c43gArr = {c43g, c43g2, c43g3, c43g4};
        A01 = c43gArr;
        A00 = C00t.A00(c43gArr);
    }

    public C43g(String str, int i) {
    }

    public static C43g valueOf(String str) {
        return (C43g) Enum.valueOf(C43g.class, str);
    }

    public static C43g[] values() {
        return (C43g[]) A01.clone();
    }
}
