package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zx.class */
public final class EnumC04093zx {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC04093zx[] A02;
    public static final EnumC04093zx A03;
    public static final EnumC04093zx A04;
    public static final EnumC04093zx A05;
    public static final EnumC04093zx A06;
    public static final EnumC04093zx A07;
    public static final EnumC04093zx A08;
    public static final EnumC04093zx A09;
    public static final EnumC04093zx A0A;
    public static final EnumC04093zx A0B;
    public static final EnumC04093zx A0C;
    public static final EnumC04093zx A0D;
    public static final EnumC04093zx A0E;
    public static final EnumC04093zx A0F;
    public final int value;

    static {
        EnumC04093zx enumC04093zx = new EnumC04093zx("RESERVED", 0, 0);
        A0C = enumC04093zx;
        EnumC04093zx enumC04093zx2 = new EnumC04093zx("IMAGE", 1, 1);
        A08 = enumC04093zx2;
        EnumC04093zx enumC04093zx3 = new EnumC04093zx("VIDEO", 2, 2);
        A0D = enumC04093zx3;
        EnumC04093zx enumC04093zx4 = new EnumC04093zx("GRAPHQL", 3, 3);
        A07 = enumC04093zx4;
        EnumC04093zx enumC04093zx5 = new EnumC04093zx("API", 4, 4);
        A04 = enumC04093zx5;
        EnumC04093zx enumC04093zx6 = new EnumC04093zx("ANALYTICS", 5, 5);
        A03 = enumC04093zx6;
        EnumC04093zx enumC04093zx7 = new EnumC04093zx("DO_NOT_USE", 6, 6);
        A06 = enumC04093zx7;
        EnumC04093zx enumC04093zx8 = new EnumC04093zx("CRITICAL_API", 7, 7);
        A05 = enumC04093zx8;
        EnumC04093zx enumC04093zx9 = new EnumC04093zx("MEDIA_UPLOAD", 8, 8);
        A0A = enumC04093zx9;
        EnumC04093zx enumC04093zx10 = new EnumC04093zx("VIDEO_CALL", 9, 9);
        A0E = enumC04093zx10;
        EnumC04093zx enumC04093zx11 = new EnumC04093zx("IMAGE_THUMBNAIL", 10, 10);
        A09 = enumC04093zx11;
        EnumC04093zx enumC04093zx12 = new EnumC04093zx("VIDEO_COVER_IMAGE", 11, 11);
        A0F = enumC04093zx12;
        EnumC04093zx enumC04093zx13 = new EnumC04093zx("OTHER", 12, 255);
        A0B = enumC04093zx13;
        EnumC04093zx[] enumC04093zxArr = {enumC04093zx, enumC04093zx2, enumC04093zx3, enumC04093zx4, enumC04093zx5, enumC04093zx6, enumC04093zx7, enumC04093zx8, enumC04093zx9, enumC04093zx10, enumC04093zx11, enumC04093zx12, enumC04093zx13};
        A02 = enumC04093zxArr;
        A01 = C00t.A00(enumC04093zxArr);
        A00 = new HashMap();
        for (EnumC04093zx enumC04093zx14 : values()) {
            A00.put(Integer.valueOf(enumC04093zx14.value), enumC04093zx14);
        }
    }

    public EnumC04093zx(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnumC04093zx valueOf(String str) {
        return (EnumC04093zx) Enum.valueOf(EnumC04093zx.class, str);
    }

    public static EnumC04093zx[] values() {
        return (EnumC04093zx[]) A02.clone();
    }
}
