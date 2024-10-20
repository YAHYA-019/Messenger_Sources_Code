package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2vm, reason: invalid class name */
/* loaded from: 2vm.class */
public final class C2vm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2vm[] A01;
    public static final C2vm A02;
    public final String text;

    static {
        C2vm c2vm = new C2vm("BOOKMARK_PROMO", 0, "bookmark_promo");
        A02 = c2vm;
        C2vm[] c2vmArr = {c2vm, new C2vm("TAB_PROMO", 1, "tab_promo")};
        A01 = c2vmArr;
        A00 = C00t.A00(c2vmArr);
    }

    public C2vm(String str, int i, String str2) {
        this.text = str2;
    }

    public static C2vm valueOf(String str) {
        return (C2vm) Enum.valueOf(C2vm.class, str);
    }

    public static C2vm[] values() {
        return (C2vm[]) A01.clone();
    }
}
