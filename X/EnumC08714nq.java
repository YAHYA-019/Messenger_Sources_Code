package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4nq.class */
public final class EnumC08714nq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC08714nq[] A01;
    public static final EnumC08714nq A02;
    public static final EnumC08714nq A03;
    public final int value;

    static {
        EnumC08714nq enumC08714nq = new EnumC08714nq("DEFAULT", 0, 0);
        A02 = enumC08714nq;
        EnumC08714nq enumC08714nq2 = new EnumC08714nq("END_CARD", 1, 1);
        A03 = enumC08714nq2;
        EnumC08714nq[] enumC08714nqArr = {enumC08714nq, enumC08714nq2};
        A01 = enumC08714nqArr;
        A00 = C00t.A00(enumC08714nqArr);
    }

    public EnumC08714nq(String str, int i, int i2) {
        this.value = i2;
    }

    public static EnumC08714nq valueOf(String str) {
        return (EnumC08714nq) Enum.valueOf(EnumC08714nq.class, str);
    }

    public static EnumC08714nq[] values() {
        return (EnumC08714nq[]) A01.clone();
    }
}
