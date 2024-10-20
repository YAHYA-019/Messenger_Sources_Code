package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2q2, reason: invalid class name */
/* loaded from: 2q2.class */
public final class C2q2 {
    public static final C2q2[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C2q2[] A02;
    public static final C2q2 A03;
    public static final C2q2 A04;
    public static final C2q2 A05;
    public static final C2q2 A06;
    public static final C2q2 A07;
    public static final C2q2 A08;
    public static final C2q2 A09;
    public static final C2q2 A0A;
    public static final C2q2 A0B;
    public static final C2q2 A0C;
    public static final C2q2 A0D;
    public static final C2q2 A0E;
    public static final C2q2 A0F;
    public static final C2q2 A0G;
    public static final C2q2 A0H;
    public static final C2q2 A0I;
    public static final C2q2 A0J;
    public static final C2q2 A0K;
    public static final C2q2 A0L;
    public static final C2q2 A0M;
    public static final C2q2 A0N;
    public final boolean showCutoutForBadge;
    public final C2fd tileBadge;

    static {
        C2q2 c2q2 = new C2q2(C2fd.A01, "ACTIVE_NOW", 0, true);
        A03 = c2q2;
        C2q2 c2q22 = new C2q2(C2fd.A0e, "TINCAN", 1, true);
        A0J = c2q22;
        C2q2 c2q23 = new C2q2(C2fd.A0a, "RECENTLY_ACTIVE", 2, false);
        A0H = c2q23;
        C2q2 c2q24 = new C2q2(C2fd.A0l, "WORK_FOREIGN_USER", 3, true);
        A0M = c2q24;
        C2q2 c2q25 = new C2q2(C2fd.A0m, "WORK_LIMITED_USER", 4, true);
        A0N = c2q25;
        C2q2 c2q26 = new C2q2(C2fd.A0k, "WORK_DND_STATUS", 5, true);
        A0L = c2q26;
        C2q2 c2q27 = new C2q2(C2fd.A0P, "MESSENGER", 6, true);
        A0F = c2q27;
        C2q2 c2q28 = new C2q2(C2fd.A0D, "FACEBOOK_APP", 7, true);
        A0A = c2q28;
        C2q2 c2q29 = new C2q2(C2fd.A0L, "INSTAGRAM_APP", 8, true);
        A0C = c2q29;
        C2q2 c2q210 = new C2q2(C2fd.A0g, "UNREAD_RED_DOT", 9, true);
        A0K = c2q210;
        C2q2 c2q211 = new C2q2(C2fd.A0b, "REPORTED_USER", 10, true);
        A0I = c2q211;
        C2q2 c2q212 = new C2q2(C2fd.A0T, "NONE", 11, false);
        A0G = c2q212;
        C2q2 c2q213 = new C2q2(C2fd.A0J, "GAME_WINNER", 12, true);
        A0B = c2q213;
        C2q2 c2q214 = new C2q2(C2fd.A04, "EMOJI_BIRTHDAY", 13, true);
        A04 = c2q214;
        C2q2 c2q215 = new C2q2(C2fd.A07, "EMOJI_RELATIONSHIP", 14, true);
        A07 = c2q215;
        C2q2 c2q216 = new C2q2(C2fd.A09, "EMOJI_WORK", 15, true);
        A09 = c2q216;
        C2q2 c2q217 = new C2q2(C2fd.A06, "EMOJI_MOVED", 16, true);
        A06 = c2q217;
        C2q2 c2q218 = new C2q2(C2fd.A08, "EMOJI_SCHOOL", 17, true);
        A08 = c2q218;
        C2q2 c2q219 = new C2q2(C2fd.A05, "EMOJI_CHECK_IN", 18, true);
        A05 = c2q219;
        C2q2 c2q220 = new C2q2(C2fd.A0N, "MEMORIES", 19, true);
        A0D = c2q220;
        C2q2 c2q221 = new C2q2(C2fd.A0O, "MEMORIES_SEEN", 20, true);
        A0E = c2q221;
        C2q2[] c2q2Arr = {c2q2, c2q22, c2q23, c2q24, c2q25, c2q26, c2q27, c2q28, c2q29, c2q210, c2q211, c2q212, c2q213, c2q214, c2q215, c2q216, c2q217, c2q218, c2q219, c2q220, c2q221};
        A02 = c2q2Arr;
        A01 = C00t.A00(c2q2Arr);
        A00 = values();
    }

    public C2q2(C2fd c2fd, String str, int i, boolean z) {
        this.tileBadge = c2fd;
        this.showCutoutForBadge = z;
    }

    public static C2q2 valueOf(String str) {
        return (C2q2) Enum.valueOf(C2q2.class, str);
    }

    public static C2q2[] values() {
        return (C2q2[]) A02.clone();
    }
}
