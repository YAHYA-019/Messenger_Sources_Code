package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2vg, reason: invalid class name */
/* loaded from: 2vg.class */
public final class C2vg implements C2vh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2vg[] A01;
    public static final C2vg A02;
    public final String locationName = "Interstitials";

    static {
        C2vg c2vg = new C2vg();
        A02 = c2vg;
        C2vg[] c2vgArr = {c2vg};
        A01 = c2vgArr;
        A00 = C00t.A00(c2vgArr);
    }

    public static C2vg valueOf(String str) {
        return (C2vg) Enum.valueOf(C2vg.class, str);
    }

    public static C2vg[] values() {
        return (C2vg[]) A01.clone();
    }
}
