package X;

import com.facebook.acra.constants.ActionId;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96u, reason: invalid class name */
/* loaded from: 96u.class */
public final class C96u {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96u[] A01;
    public static final C96u A02;
    public static final C96u A03;
    public static final C96u A04;
    public static final C96u A05;
    public final int maxFrame;
    public final int minFrame;

    static {
        C96u c96u = new C96u("TOGGLE_ON", 0, 60, ActionId.ABORTED);
        A05 = c96u;
        C96u c96u2 = new C96u("TOGGLE_OFF", 1, 1, 45);
        A04 = c96u2;
        C96u c96u3 = new C96u("INITIAL_TOGGLE_ON", 2, 60, ActionId.ABORTED);
        A03 = c96u3;
        C96u c96u4 = new C96u("INITIAL_TOGGLE_OFF", 3, 1, 45);
        A02 = c96u4;
        C96u[] c96uArr = {c96u, c96u2, c96u3, c96u4};
        A01 = c96uArr;
        A00 = C00t.A00(c96uArr);
    }

    public C96u(String str, int i, int i2, int i3) {
        this.minFrame = i2;
        this.maxFrame = i3;
    }

    public static C96u valueOf(String str) {
        return (C96u) Enum.valueOf(C96u.class, str);
    }

    public static C96u[] values() {
        return (C96u[]) A01.clone();
    }
}
