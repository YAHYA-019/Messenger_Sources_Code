package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.46x, reason: invalid class name */
/* loaded from: 46x.class */
public final class C46x {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C46x[] A01;
    public static final C46x A02;
    public static final C46x A03;
    public final String inboxItemViewType;
    public final 2hJ itemType;

    static {
        C46x c46x = new C46x(2hJ.A0U, "MARKETPLACE", "MARKETPLACE_FOLDER", 0);
        A02 = c46x;
        C46x c46x2 = new C46x(2hJ.A0X, "MESSAGE_REQUEST", "MESSAGE_REQUEST_FOLDER", 1);
        A03 = c46x2;
        C46x[] c46xArr = {c46x, c46x2};
        A01 = c46xArr;
        A00 = C00t.A00(c46xArr);
    }

    public C46x(2hJ r302, String str, String str2, int i) {
        this.itemType = r302;
        this.inboxItemViewType = str2;
    }

    public static C46x valueOf(String str) {
        return (C46x) Enum.valueOf(C46x.class, str);
    }

    public static C46x[] values() {
        return (C46x[]) A01.clone();
    }
}
