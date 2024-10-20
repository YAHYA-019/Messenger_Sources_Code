package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96y, reason: invalid class name */
/* loaded from: 96y.class */
public final class C96y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96y[] A01;
    public static final C96y A02;
    public static final C96y A03;
    public static final C96y A04;
    public final 9Sg imageConfig;
    public final int modeDescriptionId;
    public final int modeId;

    static {
        C96y c96y = new C96y(new 9Sg(InterfaceC07034in.A04, 100.0f, 100.0f, 0.0f), "SIMPLE", 0, 0, 2131966746);
        A04 = c96y;
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A01;
        C96y c96y2 = new C96y(new 9Sg(interfaceC07034in, 73.0f, 93.0f, 0.0f), "RETRO", 1, 1, 2131966745);
        A03 = c96y2;
        C96y c96y3 = new C96y(new 9Sg(interfaceC07034in, 63.0f, 93.0f, 10.0f), "MESSAGES", 2, 2, 2131966744);
        A02 = c96y3;
        C96y[] c96yArr = {c96y, c96y2, c96y3};
        A01 = c96yArr;
        A00 = C00t.A00(c96yArr);
    }

    public C96y(9Sg r302, String str, int i, int i2, int i3) {
        this.modeId = i2;
        this.modeDescriptionId = i3;
        this.imageConfig = r302;
    }

    public static C96y valueOf(String str) {
        return (C96y) Enum.valueOf(C96y.class, str);
    }

    public static C96y[] values() {
        return (C96y[]) A01.clone();
    }
}
