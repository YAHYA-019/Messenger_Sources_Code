package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A01' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.3v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3v2.class */
public final class EnumC02393v2 {
    public static final /* synthetic */ EnumC02393v2[] A00;
    public static final EnumC02393v2 A01;
    public static final EnumC02393v2 A02;
    public static final EnumC02393v2 A03;
    public static final EnumC02393v2 A04;
    public static final EnumC02393v2 A05;
    public static final EnumC02393v2 A06;
    public static final EnumC02393v2 A07;
    public final 2MQ mButtonGlyph;
    public final C1u3 mIconGlyph;
    public final 2Re mIconSize;

    static {
        2MQ r0 = 2MQ.A2R;
        C1u3 c1u3 = C1u3.A4n;
        2Re r02 = 2Re.A03;
        EnumC02393v2 enumC02393v2 = new EnumC02393v2(r0, r02, c1u3, "CALL", 0);
        A01 = enumC02393v2;
        EnumC02393v2 enumC02393v22 = new EnumC02393v2(r0, r02, c1u3, "MISSED_CALL", 1);
        A06 = enumC02393v22;
        EnumC02393v2 enumC02393v23 = new EnumC02393v2(2MQ.A1X, r02, C1u3.A3L, "GAMES", 2);
        A03 = enumC02393v23;
        2MQ r03 = 2MQ.A0f;
        C1u3 c1u32 = C1u3.A1C;
        EnumC02393v2 enumC02393v24 = new EnumC02393v2(r03, r02, c1u32, "VIDEO", 3);
        A07 = enumC02393v24;
        EnumC02393v2 enumC02393v25 = new EnumC02393v2(r03, r02, c1u32, "GROUP_JOIN_VIDEO", 4);
        A05 = enumC02393v25;
        EnumC02393v2 enumC02393v26 = new EnumC02393v2(r0, r02, c1u3, "GROUP_JOIN_AUDIO", 5);
        A04 = enumC02393v26;
        EnumC02393v2 enumC02393v27 = new EnumC02393v2(2MQ.A11, 2Re.A02, C1u3.A1y, "CLOSE", 6);
        A02 = enumC02393v27;
        A00 = new EnumC02393v2[]{enumC02393v2, enumC02393v22, enumC02393v23, enumC02393v24, enumC02393v25, enumC02393v26, enumC02393v27};
    }

    public EnumC02393v2(2MQ r302, 2Re r303, C1u3 c1u3, String str, int i) {
        this.mButtonGlyph = r302;
        this.mIconGlyph = c1u3;
        this.mIconSize = r303;
    }

    public static EnumC02393v2 valueOf(String str) {
        return (EnumC02393v2) Enum.valueOf(EnumC02393v2.class, str);
    }

    public static EnumC02393v2[] values() {
        return (EnumC02393v2[]) A00.clone();
    }
}
