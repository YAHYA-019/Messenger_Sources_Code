package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Lb, reason: invalid class name */
/* loaded from: 4Lb.class */
public final class C4Lb implements C4Lc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4Lb[] A01;
    public static final C4Lb A02;
    public static final C4Lb A03;
    public final boolean isShowing;

    static {
        C4Lb c4Lb = new C4Lb("OPEN", 0, true);
        A03 = c4Lb;
        C4Lb c4Lb2 = new C4Lb("CLOSED", 1, false);
        A02 = c4Lb2;
        C4Lb[] c4LbArr = {c4Lb, c4Lb2};
        A01 = c4LbArr;
        A00 = C00t.A00(c4LbArr);
    }

    public C4Lb(String str, int i, boolean z) {
        this.isShowing = z;
    }

    public static C4Lb valueOf(String str) {
        return (C4Lb) Enum.valueOf(C4Lb.class, str);
    }

    public static C4Lb[] values() {
        return (C4Lb[]) A01.clone();
    }

    @Override // X.C4Lc
    public boolean BW7() {
        return this.isShowing;
    }
}
