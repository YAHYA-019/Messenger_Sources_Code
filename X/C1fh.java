package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1fh, reason: invalid class name */
/* loaded from: 1fh.class */
public final class C1fh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1fh[] A01;
    public static final C1fh A02;
    public static final C1fh A03;
    public final String type;

    static {
        C1fh c1fh = new C1fh("NULL", 0, "null");
        A03 = c1fh;
        C1fh c1fh2 = new C1fh("DEVICEIDFALLBACK", 1, "deviceidfallback");
        A02 = c1fh2;
        C1fh[] c1fhArr = {c1fh, c1fh2};
        A01 = c1fhArr;
        A00 = C00t.A00(c1fhArr);
    }

    public C1fh(String str, int i, String str2) {
        this.type = str2;
    }

    public static C1fh valueOf(String str) {
        return (C1fh) Enum.valueOf(C1fh.class, str);
    }

    public static C1fh[] values() {
        return (C1fh[]) A01.clone();
    }
}
