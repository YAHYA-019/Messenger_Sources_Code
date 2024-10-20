package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mf2, reason: case insensitive filesystem */
/* loaded from: Mf2.class */
public final class EnumC3484Mf2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3484Mf2[] A01;
    public static final EnumC3484Mf2 A02;
    public static final EnumC3484Mf2 A03;
    public static final EnumC3484Mf2 A04;
    public static final EnumC3484Mf2 A05;
    public static final EnumC3484Mf2 A06;
    public static final EnumC3484Mf2 A07;
    public static final EnumC3484Mf2 A08;

    static {
        EnumC3484Mf2 enumC3484Mf2 = new EnumC3484Mf2("BOOMERANG_HOMEBASE", 0);
        A02 = enumC3484Mf2;
        EnumC3484Mf2 enumC3484Mf22 = new EnumC3484Mf2("CAMERA", 1);
        A03 = enumC3484Mf22;
        EnumC3484Mf2 enumC3484Mf23 = new EnumC3484Mf2("FEED_CAMERA", 2);
        A04 = enumC3484Mf23;
        EnumC3484Mf2 enumC3484Mf24 = new EnumC3484Mf2("MUSIC_HOMEBASE", 3);
        A05 = enumC3484Mf24;
        EnumC3484Mf2 enumC3484Mf25 = new EnumC3484Mf2("RMS", 4);
        A06 = enumC3484Mf25;
        EnumC3484Mf2 enumC3484Mf26 = new EnumC3484Mf2("SINGLE_MEDIA_GALLERY", 5);
        A07 = enumC3484Mf26;
        EnumC3484Mf2 enumC3484Mf27 = new EnumC3484Mf2("TEXT_HOMEBASE", 6);
        A08 = enumC3484Mf27;
        EnumC3484Mf2[] enumC3484Mf2Arr = {enumC3484Mf2, enumC3484Mf22, enumC3484Mf23, enumC3484Mf24, enumC3484Mf25, enumC3484Mf26, enumC3484Mf27};
        A01 = enumC3484Mf2Arr;
        A00 = C00t.A00(enumC3484Mf2Arr);
    }

    public EnumC3484Mf2(String str, int i) {
    }

    public static EnumC3484Mf2 valueOf(String str) {
        return (EnumC3484Mf2) Enum.valueOf(EnumC3484Mf2.class, str);
    }

    public static EnumC3484Mf2[] values() {
        return (EnumC3484Mf2[]) A01.clone();
    }
}
