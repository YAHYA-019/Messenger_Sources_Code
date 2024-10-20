package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1wj, reason: invalid class name */
/* loaded from: 1wj.class */
public final class C1wj {
    public static final C1wj[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1wj[] A02;
    public static final C1wj A03;
    public static final C1wj A04;
    public static final C1wj A05;
    public static final C1wj A06;
    public final int status;

    static {
        C1wj c1wj = new C1wj("NO_BACKUPS_PRESENT", 0, 2);
        A06 = c1wj;
        C1wj c1wj2 = new C1wj("DEVICE_ONBOARDED", 1, 3);
        A04 = c1wj2;
        C1wj c1wj3 = new C1wj("DEVICE_NOT_ONBOARDED", 2, 4);
        A03 = c1wj3;
        C1wj c1wj4 = new C1wj("FETCH_BACKUP_STATUS_ERROR", 3, -1);
        A05 = c1wj4;
        C1wj[] c1wjArr = {c1wj, c1wj2, c1wj3, c1wj4};
        A02 = c1wjArr;
        A01 = C00t.A00(c1wjArr);
        A00 = values();
    }

    public C1wj(String str, int i, int i2) {
        this.status = i2;
    }

    public static C1wj valueOf(String str) {
        return (C1wj) Enum.valueOf(C1wj.class, str);
    }

    public static C1wj[] values() {
        return (C1wj[]) A02.clone();
    }
}
