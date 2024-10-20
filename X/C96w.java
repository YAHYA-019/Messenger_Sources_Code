package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96w, reason: invalid class name */
/* loaded from: 96w.class */
public final class C96w {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96w[] A01;
    public static final C96w A02;
    public static final C96w A03;
    public static final C96w A04;
    public static final C96w A05;
    public static final C96w A06;
    public static final C96w A07;
    public final long epsilon;
    public final long numSecondsAgo;

    static {
        C96w c96w = new C96w("RECENT", 0, 0L, 604800L);
        A03 = c96w;
        C96w c96w2 = new C96w("RECENT_TWO_YEARS", 1, 0L, 63072000L);
        A04 = c96w2;
        C96w c96w3 = new C96w("THREE_MONTHS_AGO", 2, 7776000L, 604800L);
        A06 = c96w3;
        C96w c96w4 = new C96w("SIX_MONTHS_AGO", 3, 15552000L, 604800L);
        A05 = c96w4;
        C96w c96w5 = new C96w("ONE_YEAR_AGO", 4, 31536000L, 604800L);
        A02 = c96w5;
        C96w c96w6 = new C96w("TWO_YEAR_AGO", 5, 63072000L, 604800L);
        A07 = c96w6;
        C96w[] c96wArr = {c96w, c96w2, c96w3, c96w4, c96w5, c96w6, new C96w("THREE_YEAR_AGO", 6, 94608000L, 604800L)};
        A01 = c96wArr;
        A00 = C00t.A00(c96wArr);
    }

    public C96w(String str, int i, long j, long j2) {
        this.numSecondsAgo = j;
        this.epsilon = j2;
    }

    public static C96w valueOf(String str) {
        return (C96w) Enum.valueOf(C96w.class, str);
    }

    public static C96w[] values() {
        return (C96w[]) A01.clone();
    }
}
