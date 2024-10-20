package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2rx, reason: invalid class name */
/* loaded from: 2rx.class */
public final class C2rx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2rx[] A01;
    public static final C2rx A02;
    public static final C2rx A03;
    public static final C2rx A04;

    static {
        C2rx c2rx = new C2rx("MAIN", 0);
        A04 = c2rx;
        C2rx c2rx2 = new C2rx("CHAT_HEADS", 1);
        A03 = c2rx2;
        C2rx c2rx3 = new C2rx("BUBBLES", 2);
        A02 = c2rx3;
        C2rx[] c2rxArr = {c2rx, c2rx2, c2rx3};
        A01 = c2rxArr;
        A00 = C00t.A00(c2rxArr);
    }

    public C2rx(String str, int i) {
    }

    public static C2rx valueOf(String str) {
        return (C2rx) Enum.valueOf(C2rx.class, str);
    }

    public static C2rx[] values() {
        return (C2rx[]) A01.clone();
    }
}
