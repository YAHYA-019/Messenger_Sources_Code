package X;

import com.facebook.msys.mci.CQLResultSet;
import com.google.common.collect.ImmutableList;

/* loaded from: N4R.class */
public abstract class N4R {
    public static 1qX A00(MWb mWb, Object obj, int i) {
        mWb.A0G = null;
        1qX r0 = (1qX) obj;
        mWb.A0o = r0.mResultSet.getString(i, 0);
        mWb.A0I = r0.mResultSet.getNullableLong(i, 1);
        mWb.A0n = r0.mResultSet.getString(i, 3);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r308v0, types: [java.lang.Object, X.MWb] */
    /* JADX WARN: Type inference failed for: r308v2, types: [java.lang.Object, X.MWb] */
    /* JADX WARN: Type inference failed for: r308v5, types: [java.lang.Object, X.MWb] */
    public static final ImmutableList A01(Object obj) {
        1qX A00;
        MWb mWb;
        MWb mWb2;
        11T.A0F(obj, 0);
        boolean z = obj instanceof MXE;
        int count = (z || (obj instanceof MXD) || (obj instanceof MXC)) ? ((1qX) obj).mResultSet.getCount() : 0;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < count; i++) {
            if (z) {
                ?? obj2 = new Object();
                ((MWb) obj2).A0o = null;
                ((MWb) obj2).A0I = null;
                ((MWb) obj2).A0n = null;
                ((MWb) obj2).A0p = null;
                ((MWb) obj2).A0m = null;
                ((MWb) obj2).A0h = null;
                ((MWb) obj2).A0e = null;
                ((MWb) obj2).A0d = null;
                ((MWb) obj2).A0O = null;
                ((MWb) obj2).A0g = null;
                ((MWb) obj2).A03 = 0;
                ((MWb) obj2).A0K = null;
                ((MWb) obj2).A0L = null;
                ((MWb) obj2).A0R = null;
                ((MWb) obj2).A0S = null;
                ((MWb) obj2).A0H = null;
                ((MWb) obj2).A02 = 0;
                ((MWb) obj2).A0l = null;
                ((MWb) obj2).A07 = null;
                ((MWb) obj2).A0f = null;
                ((MWb) obj2).A04 = -1;
                ((MWb) obj2).A0F = null;
                ((MWb) obj2).A0r = false;
                ((MWb) obj2).A0j = null;
                ((MWb) obj2).A0c = null;
                ((MWb) obj2).A0N = null;
                ((MWb) obj2).A0C = null;
                ((MWb) obj2).A0E = null;
                ((MWb) obj2).A0D = null;
                ((MWb) obj2).A0b = null;
                ((MWb) obj2).A0M = null;
                ((MWb) obj2).A05 = null;
                ((MWb) obj2).A08 = null;
                ((MWb) obj2).A0k = null;
                ((MWb) obj2).A0i = null;
                ((MWb) obj2).A00 = 0;
                ((MWb) obj2).A0P = null;
                MWb.A00((MWb) obj2);
                ((MWb) obj2).A0J = null;
                ((MWb) obj2).A0Q = null;
                ((MWb) obj2).A06 = null;
                ((MWb) obj2).A0A = null;
                ((MWb) obj2).A0q = null;
                ((MWb) obj2).A0B = null;
                ((MWb) obj2).A09 = null;
                ((MWb) obj2).A0U = null;
                1qX A002 = A00(obj2, obj, i);
                A02(obj2, A002.mResultSet, A002, i);
                A03(obj2, A002.mResultSet, A002, i);
                ((MWb) obj2).A0b = A002.mResultSet.getString(i, 30);
                ((MWb) obj2).A0M = A002.mResultSet.getNullableLong(i, 32);
                ((MWb) obj2).A05 = A002.mResultSet.getNullableBoolean(i, 33);
                A04(obj2, A002, i);
                ((MWb) obj2).A0Y = A002.mResultSet.getString(i, 42);
                ((MWb) obj2).A0Z = A002.mResultSet.getString(i, 44);
                ((MWb) obj2).A0a = A002.mResultSet.getString(i, 43);
                ((MWb) obj2).A0V = A002.mResultSet.getString(i, 48);
                ((MWb) obj2).A0W = A002.mResultSet.getString(i, 59);
                ((MWb) obj2).A0X = A002.mResultSet.getString(i, 60);
                A06(obj2, A002, i);
                ((MWb) obj2).A0q = A002.mResultSet.getString(i, 51);
                A05(obj2, A002, i);
                mWb2 = obj2;
            } else {
                if (obj instanceof MXD) {
                    ?? obj3 = new Object();
                    ((MWb) obj3).A0o = null;
                    ((MWb) obj3).A0I = null;
                    ((MWb) obj3).A0n = null;
                    ((MWb) obj3).A0p = null;
                    ((MWb) obj3).A0m = null;
                    ((MWb) obj3).A0h = null;
                    ((MWb) obj3).A0e = null;
                    ((MWb) obj3).A0d = null;
                    ((MWb) obj3).A0O = null;
                    ((MWb) obj3).A0g = null;
                    ((MWb) obj3).A03 = 0;
                    ((MWb) obj3).A0K = null;
                    ((MWb) obj3).A0L = null;
                    ((MWb) obj3).A0R = null;
                    ((MWb) obj3).A0S = null;
                    ((MWb) obj3).A0H = null;
                    ((MWb) obj3).A02 = 0;
                    ((MWb) obj3).A0l = null;
                    ((MWb) obj3).A07 = null;
                    ((MWb) obj3).A0f = null;
                    ((MWb) obj3).A04 = -1;
                    ((MWb) obj3).A0F = null;
                    ((MWb) obj3).A0r = false;
                    ((MWb) obj3).A0j = null;
                    ((MWb) obj3).A0c = null;
                    ((MWb) obj3).A0N = null;
                    ((MWb) obj3).A0C = null;
                    ((MWb) obj3).A0E = null;
                    ((MWb) obj3).A0D = null;
                    ((MWb) obj3).A0b = null;
                    ((MWb) obj3).A0M = null;
                    ((MWb) obj3).A05 = null;
                    ((MWb) obj3).A08 = null;
                    ((MWb) obj3).A0k = null;
                    ((MWb) obj3).A0i = null;
                    ((MWb) obj3).A00 = 0;
                    ((MWb) obj3).A0P = null;
                    MWb.A00((MWb) obj3);
                    ((MWb) obj3).A0J = null;
                    ((MWb) obj3).A0Q = null;
                    ((MWb) obj3).A06 = null;
                    ((MWb) obj3).A0A = null;
                    ((MWb) obj3).A0q = null;
                    ((MWb) obj3).A0B = null;
                    ((MWb) obj3).A09 = null;
                    ((MWb) obj3).A0U = null;
                    A00 = A00(obj3, obj, i);
                    A02(obj3, A00.mResultSet, A00, i);
                    A03(obj3, A00.mResultSet, A00, i);
                    A04(obj3, A00, i);
                    ((MWb) obj3).A0Y = A00.mResultSet.getString(i, 42);
                    ((MWb) obj3).A0V = A00.mResultSet.getString(i, 48);
                    ((MWb) obj3).A0W = A00.mResultSet.getString(i, 60);
                    A06(obj3, A00, i);
                    ((MWb) obj3).A0q = A00.mResultSet.getString(i, 51);
                    mWb = obj3;
                } else if (obj instanceof MXC) {
                    ?? obj4 = new Object();
                    ((MWb) obj4).A0o = null;
                    ((MWb) obj4).A0I = null;
                    ((MWb) obj4).A0n = null;
                    ((MWb) obj4).A0p = null;
                    ((MWb) obj4).A0m = null;
                    ((MWb) obj4).A0h = null;
                    ((MWb) obj4).A0e = null;
                    ((MWb) obj4).A0d = null;
                    ((MWb) obj4).A0O = null;
                    ((MWb) obj4).A0g = null;
                    ((MWb) obj4).A03 = 0;
                    ((MWb) obj4).A0K = null;
                    ((MWb) obj4).A0L = null;
                    ((MWb) obj4).A0R = null;
                    ((MWb) obj4).A0S = null;
                    ((MWb) obj4).A0H = null;
                    ((MWb) obj4).A02 = 0;
                    ((MWb) obj4).A0l = null;
                    ((MWb) obj4).A07 = null;
                    ((MWb) obj4).A0f = null;
                    ((MWb) obj4).A04 = -1;
                    ((MWb) obj4).A0F = null;
                    ((MWb) obj4).A0r = false;
                    ((MWb) obj4).A0j = null;
                    ((MWb) obj4).A0c = null;
                    ((MWb) obj4).A0N = null;
                    ((MWb) obj4).A0C = null;
                    ((MWb) obj4).A0E = null;
                    ((MWb) obj4).A0D = null;
                    ((MWb) obj4).A0b = null;
                    ((MWb) obj4).A0M = null;
                    ((MWb) obj4).A05 = null;
                    ((MWb) obj4).A08 = null;
                    ((MWb) obj4).A0k = null;
                    ((MWb) obj4).A0i = null;
                    ((MWb) obj4).A00 = 0;
                    ((MWb) obj4).A0P = null;
                    MWb.A00((MWb) obj4);
                    ((MWb) obj4).A0J = null;
                    ((MWb) obj4).A0Q = null;
                    ((MWb) obj4).A06 = null;
                    ((MWb) obj4).A0A = null;
                    ((MWb) obj4).A0q = null;
                    ((MWb) obj4).A0B = null;
                    ((MWb) obj4).A09 = null;
                    ((MWb) obj4).A0U = null;
                    A00 = A00(obj4, obj, i);
                    A02(obj4, A00.mResultSet, A00, i);
                    A03(obj4, A00.mResultSet, A00, i);
                    ((MWb) obj4).A05 = A00.mResultSet.getNullableBoolean(i, 33);
                    A04(obj4, A00, i);
                    ((MWb) obj4).A0V = A00.mResultSet.getString(i, 48);
                    ((MWb) obj4).A0W = A00.mResultSet.getString(i, 60);
                    ((MWb) obj4).A0X = A00.mResultSet.getString(i, 59);
                    A06(obj4, A00, i);
                    mWb = obj4;
                }
                A05(mWb, A00, i);
                mWb.A0G = A00.mResultSet.getNullableInteger(i, 56);
                mWb2 = mWb;
            }
            String str = mWb2.A0o;
            Long l = mWb2.A0I;
            String str2 = mWb2.A0p;
            String str3 = mWb2.A0m;
            String str4 = mWb2.A0h;
            String str5 = mWb2.A0e;
            String str6 = mWb2.A0d;
            Long l2 = mWb2.A0O;
            String str7 = mWb2.A0g;
            Long l3 = mWb2.A0K;
            Long l4 = mWb2.A0L;
            Long l5 = mWb2.A0R;
            Integer num = mWb2.A0H;
            int i2 = mWb2.A02;
            String str8 = mWb2.A0l;
            Double d = mWb2.A07;
            String str9 = mWb2.A0f;
            int i3 = mWb2.A04;
            boolean z2 = mWb2.A0r;
            String str10 = mWb2.A0j;
            String str11 = mWb2.A0c;
            Long l6 = mWb2.A0N;
            String str12 = mWb2.A0b;
            Long l7 = mWb2.A0M;
            Boolean bool = mWb2.A05;
            String str13 = mWb2.A0i;
            String str14 = mWb2.A0T;
            String str15 = mWb2.A0Y;
            String str16 = mWb2.A0a;
            String str17 = mWb2.A0Z;
            String str18 = mWb2.A0V;
            String str19 = mWb2.A0W;
            String str20 = mWb2.A0X;
            builder.m11011add((Object) new Bz8(bool, mWb2.A06, d, num, mWb2.A0A, mWb2.A0B, mWb2.A09, mWb2.A0G, l, l2, l3, l4, l5, l6, l7, mWb2.A0J, mWb2.A0Q, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, mWb2.A0q, mWb2.A0U, i2, i3, z2));
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    public static void A02(MWb mWb, CQLResultSet cQLResultSet, 1qX r303, int i) {
        mWb.A0p = cQLResultSet.getString(i, 4);
        mWb.A0m = r303.mResultSet.getString(i, 5);
        mWb.A0h = r303.mResultSet.getString(i, 6);
        mWb.A0e = r303.mResultSet.getString(i, 7);
        mWb.A0d = r303.mResultSet.getString(i, 8);
        mWb.A0O = r303.mResultSet.getNullableLong(i, 9);
        mWb.A0g = r303.mResultSet.getString(i, 10);
        mWb.A03 = r303.mResultSet.getInteger(i, 11);
        mWb.A0K = r303.mResultSet.getNullableLong(i, 12);
        mWb.A0L = r303.mResultSet.getNullableLong(i, 13);
        mWb.A0R = r303.mResultSet.getNullableLong(i, 14);
        mWb.A0S = r303.mResultSet.getNullableLong(i, 15);
        mWb.A0H = r303.mResultSet.getNullableInteger(i, 16);
    }

    public static void A03(MWb mWb, CQLResultSet cQLResultSet, 1qX r303, int i) {
        mWb.A02 = cQLResultSet.getInteger(i, 17);
        mWb.A0l = r303.mResultSet.getString(i, 18);
        mWb.A07 = r303.mResultSet.getNullableDouble(i, 19);
        mWb.A0f = r303.mResultSet.getString(i, 20);
        mWb.A04 = r303.mResultSet.getInteger(i, 21);
        mWb.A0F = r303.mResultSet.getNullableInteger(i, 22);
        mWb.A0r = r303.mResultSet.getBoolean(i, 23);
        mWb.A0j = r303.mResultSet.getString(i, 24);
        mWb.A0c = r303.mResultSet.getString(i, 25);
        mWb.A0N = r303.mResultSet.getNullableLong(i, 26);
        mWb.A0C = r303.mResultSet.getNullableInteger(i, 27);
        mWb.A0E = r303.mResultSet.getNullableInteger(i, 28);
        mWb.A0D = r303.mResultSet.getNullableInteger(i, 29);
    }

    public static void A04(MWb mWb, 1qX r302, int i) {
        mWb.A08 = r302.mResultSet.getNullableInteger(i, 34);
        mWb.A0k = r302.mResultSet.getString(i, 35);
        mWb.A0i = r302.mResultSet.getString(i, 36);
        mWb.A00 = r302.mResultSet.getInteger(i, 37);
        mWb.A0P = r302.mResultSet.getNullableLong(i, 38);
        mWb.A01 = r302.mResultSet.getInteger(i, 39);
        mWb.A0T = r302.mResultSet.getString(i, 40);
    }

    public static void A05(MWb mWb, 1qX r302, int i) {
        mWb.A0B = r302.mResultSet.getNullableInteger(i, 53);
        mWb.A09 = r302.mResultSet.getNullableInteger(i, 54);
        mWb.A0U = r302.mResultSet.getString(i, 55);
    }

    public static void A06(MWb mWb, 1qX r302, int i) {
        mWb.A0J = r302.mResultSet.getNullableLong(i, 41);
        mWb.A0Q = r302.mResultSet.getNullableLong(i, 2);
        mWb.A06 = r302.mResultSet.getNullableBoolean(i, 49);
        mWb.A0A = r302.mResultSet.getNullableInteger(i, 50);
    }
}
