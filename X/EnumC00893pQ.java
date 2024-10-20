package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pQ.class */
public final class EnumC00893pQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC00893pQ[] A01;
    public static final EnumC00893pQ A02;
    public static final EnumC00893pQ A03;
    public static final EnumC00893pQ A04;
    public static final EnumC00893pQ A05;
    public static final EnumC00893pQ A06;
    public static final EnumC00893pQ A07;
    public static final EnumC00893pQ A08;

    static {
        EnumC00893pQ enumC00893pQ = new EnumC00893pQ("PRIVATE_CHAT", 0);
        A06 = enumC00893pQ;
        EnumC00893pQ enumC00893pQ2 = new EnumC00893pQ("BROADCAST_CHAT", 1);
        A04 = enumC00893pQ2;
        EnumC00893pQ enumC00893pQ3 = new EnumC00893pQ("COMMUNITY_GROUP_INVITED_UNJOINED", 2);
        A05 = enumC00893pQ3;
        EnumC00893pQ enumC00893pQ4 = new EnumC00893pQ("ADMOD_CHAT", 3);
        A03 = enumC00893pQ4;
        EnumC00893pQ enumC00893pQ5 = new EnumC00893pQ("PUBLIC_CHAT", 4);
        A07 = enumC00893pQ5;
        EnumC00893pQ enumC00893pQ6 = new EnumC00893pQ("ADMIN_CHAT", 5);
        A02 = enumC00893pQ6;
        EnumC00893pQ enumC00893pQ7 = new EnumC00893pQ("SUPPORTERS_ONLY_CHAT", 6);
        A08 = enumC00893pQ7;
        EnumC00893pQ[] enumC00893pQArr = {enumC00893pQ, enumC00893pQ2, enumC00893pQ3, enumC00893pQ4, enumC00893pQ5, enumC00893pQ6, enumC00893pQ7};
        A01 = enumC00893pQArr;
        A00 = C00t.A00(enumC00893pQArr);
    }

    public EnumC00893pQ(String str, int i) {
    }

    public static EnumC00893pQ valueOf(String str) {
        return (EnumC00893pQ) Enum.valueOf(EnumC00893pQ.class, str);
    }

    public static EnumC00893pQ[] values() {
        return (EnumC00893pQ[]) A01.clone();
    }
}
