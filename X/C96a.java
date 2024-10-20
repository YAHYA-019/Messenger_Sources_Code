package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96a, reason: invalid class name */
/* loaded from: 96a.class */
public final class C96a {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96a[] A01;
    public static final C96a A02;
    public static final C96a A03;
    public static final C96a A04;
    public static final C96a A05;
    public final int decisionVal;

    static {
        C96a c96a = new C96a("FAILURE", 0, -1);
        A03 = c96a;
        C96a c96a2 = new C96a("NO_DECISION_MADE", 1, 0);
        A05 = c96a2;
        C96a c96a3 = new C96a("BACKUP_CREATED", 2, 1);
        A02 = c96a3;
        C96a c96a4 = new C96a("LOCAL_DEVICE_ONLY", 3, 2);
        A04 = c96a4;
        C96a[] c96aArr = {c96a, c96a2, c96a3, c96a4};
        A01 = c96aArr;
        A00 = C00t.A00(c96aArr);
    }

    public C96a(String str, int i, int i2) {
        this.decisionVal = i2;
    }

    public static C96a valueOf(String str) {
        return (C96a) Enum.valueOf(C96a.class, str);
    }

    public static C96a[] values() {
        return (C96a[]) A01.clone();
    }
}
