package X;

import com.facebook.acra.constants.ReportField;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1B5, reason: invalid class name */
/* loaded from: 1B5.class */
public final class C1B5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1B5[] A01;
    public static final C1B5 A02;

    static {
        C1B5 c1b5 = new C1B5("USER", 0);
        A02 = c1b5;
        C1B5[] c1b5Arr = {c1b5, new C1B5(ReportField.DEVICE, 1)};
        A01 = c1b5Arr;
        A00 = C00t.A00(c1b5Arr);
    }

    public C1B5(String str, int i) {
    }

    public static C1B5 valueOf(String str) {
        return (C1B5) Enum.valueOf(C1B5.class, str);
    }

    public static C1B5[] values() {
        return (C1B5[]) A01.clone();
    }
}
