package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96j, reason: invalid class name */
/* loaded from: 96j.class */
public final class C96j {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96j[] A01;
    public static final C96j A02;
    public static final C96j A03;
    public static final C96j A04;
    public static final C96j A05;
    public static final C96j A06;
    public static final C96j A07;
    public static final C96j A08;
    public final int value;

    static {
        C96j c96j = new C96j("NOT_APPLICABLE", 0, 0);
        A08 = c96j;
        C96j c96j2 = new C96j("FRIENDS_AND_FAMILY", 1, 1);
        A07 = c96j2;
        C96j c96j3 = new C96j("COMMUNITY", 2, 2);
        A03 = c96j3;
        C96j c96j4 = new C96j("CHANNEL", 3, 3);
        A02 = c96j4;
        C96j c96j5 = new C96j("COMMUNITY_AND_CHANNEL", 4, 4);
        A04 = c96j5;
        C96j c96j6 = new C96j("DISCOVERABLE_PUBLIC_CHAT", 5, 5);
        A06 = c96j6;
        C96j c96j7 = new C96j("DISCOVERABLE_PUBLIC_BROADCAST_CHAT", 6, 6);
        A05 = c96j7;
        C96j[] c96jArr = {c96j, c96j2, c96j3, c96j4, c96j5, c96j6, c96j7};
        A01 = c96jArr;
        A00 = C00t.A00(c96jArr);
    }

    public C96j(String str, int i, int i2) {
        this.value = i2;
    }

    public static C96j valueOf(String str) {
        return (C96j) Enum.valueOf(C96j.class, str);
    }

    public static C96j[] values() {
        return (C96j[]) A01.clone();
    }
}
