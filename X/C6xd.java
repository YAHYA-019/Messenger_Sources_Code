package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6xd, reason: invalid class name */
/* loaded from: 6xd.class */
public final class C6xd {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6xd[] A01;
    public static final C6xd A02;
    public static final C6xd A03;
    public static final C6xd A04;
    public static final C6xd A05;
    public static final C6xd A06;
    public static final C6xd A07;
    public static final C6xd A08;
    public static final C6xd A09;
    public static final C6xd A0A;
    public static final C6xd A0B;

    static {
        C6xd c6xd = new C6xd("MESSENGER", 0);
        A06 = c6xd;
        C6xd c6xd2 = new C6xd("MESSENGER_TINCAN", 1);
        A07 = c6xd2;
        C6xd c6xd3 = new C6xd("COMMENTS", 2);
        A02 = c6xd3;
        C6xd c6xd4 = new C6xd("COMPOSER", 3);
        A05 = c6xd4;
        C6xd c6xd5 = new C6xd("POSTS", 4);
        A0A = c6xd5;
        C6xd c6xd6 = new C6xd("SMS", 5);
        A0B = c6xd6;
        C6xd c6xd7 = new C6xd("MONTAGE", 6);
        A08 = c6xd7;
        C6xd c6xd8 = new C6xd("NEO", 7);
        A09 = c6xd8;
        C6xd c6xd9 = new C6xd("COMMENTS_DRAWER", 8);
        A03 = c6xd9;
        C6xd c6xd10 = new C6xd("COMMENTS_WITH_VISUALS", 9);
        A04 = c6xd10;
        C6xd[] c6xdArr = {c6xd, c6xd2, c6xd3, c6xd4, c6xd5, c6xd6, c6xd7, c6xd8, c6xd9, c6xd10, new C6xd("STORY_VIEWER_FUN_FORMATS", 10)};
        A01 = c6xdArr;
        A00 = C00t.A00(c6xdArr);
    }

    public C6xd(String str, int i) {
    }

    public static C6xd valueOf(String str) {
        return (C6xd) Enum.valueOf(C6xd.class, str);
    }

    public static C6xd[] values() {
        return (C6xd[]) A01.clone();
    }
}
