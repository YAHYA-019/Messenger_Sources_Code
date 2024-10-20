package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96v, reason: invalid class name */
/* loaded from: 96v.class */
public final class C96v {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96v[] A01;
    public static final C96v A02;
    public static final C96v A03;
    public static final C96v A04;
    public static final C96v A05;
    public static final C96v A06;
    public final int buttonId;
    public final int stringResId;

    static {
        C96v c96v = new C96v("SAVE", 0, 0, 2131965431);
        A06 = c96v;
        C96v c96v2 = new C96v("HIDE", 1, 5, 2131957615);
        A04 = c96v2;
        C96v c96v3 = new C96v("FORWARD", 2, 4, 2131957008);
        A03 = c96v3;
        C96v c96v4 = new C96v("FEEDBACK", 3, 1, 2131956924);
        A02 = c96v4;
        C96v c96v5 = new C96v("JUMP_TO_MESSAGE", 4, 2, 2131958518);
        A05 = c96v5;
        C96v[] c96vArr = {c96v, c96v2, c96v3, c96v4, c96v5, new C96v("SETTINGS", 5, 3, 2131965789)};
        A01 = c96vArr;
        A00 = C00t.A00(c96vArr);
    }

    public C96v(String str, int i, int i2, int i3) {
        this.buttonId = i2;
        this.stringResId = i3;
    }

    public static C96v valueOf(String str) {
        return (C96v) Enum.valueOf(C96v.class, str);
    }

    public static C96v[] values() {
        return (C96v[]) A01.clone();
    }
}
