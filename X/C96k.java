package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96k, reason: invalid class name */
/* loaded from: 96k.class */
public final class C96k {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96k[] A01;
    public static final C96k A02;
    public static final C96k A03;
    public static final C96k A04;
    public static final C96k A05;
    public static final C96k A06;
    public static final C96k A07;
    public static final C96k A08;
    public static final C96k A09;
    public final int value;

    static {
        C96k c96k = new C96k("UNSPECIFIED", 0, 0);
        A08 = c96k;
        C96k c96k2 = new C96k("LLM_OUTPUT", 1, 1);
        A02 = c96k2;
        C96k c96k3 = new C96k("SEND_QUERY", 2, 2);
        A05 = c96k3;
        C96k c96k4 = new C96k("START_TYPING", 3, 3);
        A06 = c96k4;
        C96k c96k5 = new C96k("STOP_TYPING", 4, 4);
        A07 = c96k5;
        C96k c96k6 = new C96k("VIDEO_ABOUT_TO_FINISH", 5, 5);
        A09 = c96k6;
        C96k c96k7 = new C96k("LLM_STREAMING_FINISHED", 6, 6);
        A04 = c96k7;
        C96k c96k8 = new C96k("LLM_STREAMING", 7, 7);
        A03 = c96k8;
        C96k[] c96kArr = {c96k, c96k2, c96k3, c96k4, c96k5, c96k6, c96k7, c96k8};
        A01 = c96kArr;
        A00 = C00t.A00(c96kArr);
    }

    public C96k(String str, int i, int i2) {
        this.value = i2;
    }

    public static C96k valueOf(String str) {
        return (C96k) Enum.valueOf(C96k.class, str);
    }

    public static C96k[] values() {
        return (C96k[]) A01.clone();
    }
}
