package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Ne, reason: invalid class name */
/* loaded from: 4Ne.class */
public final class C4Ne {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4Ne[] A01;
    public static final C4Ne A02;
    public static final C4Ne A03;
    public final String text;

    static {
        C4Ne c4Ne = new C4Ne("NORMAL", 0, "NORMAL");
        A03 = c4Ne;
        C4Ne c4Ne2 = new C4Ne("LARGE_BUTTON", 1, "LARGE_BUTTON");
        A02 = c4Ne2;
        C4Ne[] c4NeArr = {c4Ne, c4Ne2};
        A01 = c4NeArr;
        A00 = C00t.A00(c4NeArr);
    }

    public C4Ne(String str, int i, String str2) {
        this.text = str2;
    }

    public static C4Ne valueOf(String str) {
        return (C4Ne) Enum.valueOf(C4Ne.class, str);
    }

    public static C4Ne[] values() {
        return (C4Ne[]) A01.clone();
    }
}
