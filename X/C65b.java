package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.65b, reason: invalid class name */
/* loaded from: 65b.class */
public final class C65b {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C65b[] A01;
    public static final C65b A02;
    public static final C65b A03;
    public static final C65b A04;
    public static final C65b A05;
    public static final C65b A06;
    public final Integer clickableTextResId;
    public final boolean isForSelfMessage;
    public final int testResId;
    public final boolean viewStickerPackOnClick;

    static {
        C65b c65b = new C65b(null, "AVATAR_HOT_LIKE_OPT_IN_WITH_AVATAR", 0, 2131953123, true, false);
        A03 = c65b;
        C65b c65b2 = new C65b(null, "AVATAR_HOT_LIKE_OPT_IN_WITHOUT_AVATAR", 1, 2131953123, true, false);
        A02 = c65b2;
        C65b c65b3 = new C65b(null, "TAP_TO_CREATE_AVATAR", 2, 2131953144, false, false);
        A04 = c65b3;
        C65b c65b4 = new C65b(null, "TAP_TO_TRY_AVATAR", 3, 2131953145, false, true);
        A05 = c65b4;
        C65b c65b5 = new C65b(2131953073, "TAP_TO_TRY_AVATAR_AUDIO_MESSAGE", 4, 2131953072, false, false);
        A06 = c65b5;
        C65b[] c65bArr = {c65b, c65b2, c65b3, c65b4, c65b5};
        A01 = c65bArr;
        A00 = C00t.A00(c65bArr);
    }

    public C65b(Integer num, String str, int i, int i2, boolean z, boolean z2) {
        this.testResId = i2;
        this.isForSelfMessage = z;
        this.viewStickerPackOnClick = z2;
        this.clickableTextResId = num;
    }

    public static C65b valueOf(String str) {
        return (C65b) Enum.valueOf(C65b.class, str);
    }

    public static C65b[] values() {
        return (C65b[]) A01.clone();
    }
}
