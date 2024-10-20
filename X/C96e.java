package X;

import android.view.View;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96e, reason: invalid class name */
/* loaded from: 96e.class */
public final class C96e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96e[] A01;
    public static final C96e A04;
    public final int viewId;
    public static final C96e A02 = new C96e("BACKGROUND", 0, View.generateViewId());
    public static final C96e A05 = new C96e("SPEAKING_A", 1, View.generateViewId());
    public static final C96e A06 = new C96e("SPEAKING_B", 2, View.generateViewId());
    public static final C96e A03 = new C96e("SILENT_A", 3, View.generateViewId());

    static {
        C96e c96e = new C96e("SILENT_B", 4, View.generateViewId());
        A04 = c96e;
        C96e[] c96eArr = {A02, A05, A06, A03, c96e};
        A01 = c96eArr;
        A00 = C00t.A00(c96eArr);
    }

    public C96e(String str, int i, int i2) {
        this.viewId = i2;
    }

    public static C96e valueOf(String str) {
        return (C96e) Enum.valueOf(C96e.class, str);
    }

    public static C96e[] values() {
        return (C96e[]) A01.clone();
    }
}
