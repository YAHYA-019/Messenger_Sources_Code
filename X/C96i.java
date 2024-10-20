package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96i, reason: invalid class name */
/* loaded from: 96i.class */
public final class C96i {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96i[] A01;
    public static final C96i A02;
    public static final C96i A03;
    public static final C96i A04;
    public static final C96i A05;
    public static final C96i A06;
    public static final C96i A07;
    public final int valueResId;

    static {
        C96i c96i = new C96i("APP", 0, 2131966418);
        A02 = c96i;
        C96i c96i2 = new C96i("NON_APP", 1, 2131966422);
        A05 = c96i2;
        C96i c96i3 = new C96i("AVAILABLE_ON_DEVICE", 2, 2131966419);
        A03 = c96i3;
        C96i c96i4 = new C96i("PHOTOS", 3, 2131966423);
        A06 = c96i4;
        C96i c96i5 = new C96i("VIDEOS", 4, 2131966424);
        A07 = c96i5;
        C96i c96i6 = new C96i("FILES", 5, 2131966420);
        A04 = c96i6;
        C96i[] c96iArr = {c96i, c96i2, c96i3, c96i4, c96i5, c96i6, new C96i("MESSAGES", 6, 2131966421)};
        A01 = c96iArr;
        A00 = C00t.A00(c96iArr);
    }

    public C96i(String str, int i, int i2) {
        this.valueResId = i2;
    }

    public static C96i valueOf(String str) {
        return (C96i) Enum.valueOf(C96i.class, str);
    }

    public static C96i[] values() {
        return (C96i[]) A01.clone();
    }
}
