package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6en, reason: invalid class name */
/* loaded from: 6en.class */
public final class C6en {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6en[] A01;
    public static final C6en A02;
    public static final C6en A03;

    static {
        C6en c6en = new C6en("DISCOVERABLE_PUBLIC_SOCIAL_CHAT", 0);
        A03 = c6en;
        C6en c6en2 = new C6en("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 1);
        A02 = c6en2;
        C6en[] c6enArr = {c6en, c6en2};
        A01 = c6enArr;
        A00 = C00t.A00(c6enArr);
    }

    public C6en(String str, int i) {
    }

    public static C6en valueOf(String str) {
        return (C6en) Enum.valueOf(C6en.class, str);
    }

    public static C6en[] values() {
        return (C6en[]) A01.clone();
    }
}
