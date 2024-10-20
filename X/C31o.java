package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.31o, reason: invalid class name */
/* loaded from: 31o.class */
public final class C31o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C31o[] A01;
    public static final C31o A02;
    public static final C31o A03;
    public static final C31o A04;
    public final String value;

    static {
        C31o c31o = new C31o("INBOX", 0, "inbox_ads");
        A03 = c31o;
        C31o c31o2 = new C31o("DETAIL_VIEW", 1, "ads_details_extension");
        A02 = c31o2;
        C31o c31o3 = new C31o("MEDIA_VIEWER", 2, "media_viewer");
        A04 = c31o3;
        C31o[] c31oArr = {c31o, c31o2, c31o3};
        A01 = c31oArr;
        A00 = C00t.A00(c31oArr);
    }

    public C31o(String str, int i, String str2) {
        this.value = str2;
    }

    public static C31o valueOf(String str) {
        return (C31o) Enum.valueOf(C31o.class, str);
    }

    public static C31o[] values() {
        return (C31o[]) A01.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
