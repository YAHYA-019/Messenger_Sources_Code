package X;

import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9g1, reason: invalid class name */
/* loaded from: 9g1.class */
public final class C9g1 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;
    public final String[] A05;

    public C9g1(1De r302) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A03 = 1Bu.A03(r0, 65709);
        this.A02 = 1Bq.A00(46);
        this.A00 = 1Bu.A03(r0, 16979);
        this.A01 = 1Bq.A00(66663);
        this.A05 = new String[]{"UNSET_OR_UNRECOGNIZED_ENUM_VALUE", "COLOR_GRADIENT", "THEME", "THIRD_PARTY", "INTERACTIVE", "IGD_CHANNEL_CUSTOMIZED_THEME", "AI_AGENT", "AI_GENERATED_THEME"};
    }

    public static final ThreadThemeInfo A00(C9g1 c9g1, 90S r302, int i) {
        2xK r0 = new 2xK();
        r0.A05(String.valueOf(7zP.A04(r302, i)));
        r0.A08 = ((1qX) r302).mResultSet.getInteger(i, 4);
        r0.A0S = ((1qX) r302).mResultSet.getLong(i, 7);
        r0.A0T = ((1qX) r302).mResultSet.getLong(i, 0);
        r0.A06(c9g1.A05[7zP.A03(r302, i)]);
        Integer nullableInteger = ((1qX) r302).mResultSet.getNullableInteger(i, 31);
        if (nullableInteger != null) {
            r0.A00 = nullableInteger.intValue();
        }
        Integer nullableInteger2 = ((1qX) r302).mResultSet.getNullableInteger(i, 28);
        if (nullableInteger2 != null) {
            r0.A01 = nullableInteger2.intValue();
        }
        Integer nullableInteger3 = ((1qX) r302).mResultSet.getNullableInteger(i, 25);
        if (nullableInteger3 != null) {
            r0.A05 = nullableInteger3.intValue();
        }
        Integer nullableInteger4 = ((1qX) r302).mResultSet.getNullableInteger(i, 26);
        if (nullableInteger4 != null) {
            r0.A06 = nullableInteger4.intValue();
        }
        Integer nullableInteger5 = ((1qX) r302).mResultSet.getNullableInteger(i, 21);
        if (nullableInteger5 != null) {
            r0.A0O = nullableInteger5.intValue();
        }
        Integer nullableInteger6 = ((1qX) r302).mResultSet.getNullableInteger(i, 22);
        if (nullableInteger6 != null) {
            r0.A0P = nullableInteger6.intValue();
        }
        Integer nullableInteger7 = ((1qX) r302).mResultSet.getNullableInteger(i, 9);
        if (nullableInteger7 != null) {
            r0.A0M = nullableInteger7.intValue();
        }
        Integer nullableInteger8 = ((1qX) r302).mResultSet.getNullableInteger(i, 42);
        if (nullableInteger8 != null) {
            r0.A0E = nullableInteger8.intValue();
        }
        String A0m = 7zP.A0m(r302, i);
        if (A0m != null) {
            r0.A04(A0m);
        }
        String string = ((1qX) r302).mResultSet.getString(i, 12);
        if (string != null) {
            r0.A0g = string;
        }
        C00i c00i = c9g1.A02.A00;
        String A03 = ((0AC) c00i.get()).A03(((1qX) r302).mResultSet.getNullableLong(i, 15), 7zP.A0s(r302, i), 7zP.A0t(r302, i));
        if (A03 != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(A03);
            } catch (SecurityException unused) {
            }
            r0.A0W = uri;
        }
        String A032 = ((0AC) c00i.get()).A03(((1qX) r302).mResultSet.getNullableLong(i, 19), 4YV.A0q(r302, i), ((1qX) r302).mResultSet.getString(i, 18));
        if (A032 != null) {
            Uri uri2 = null;
            try {
                uri2 = C0A2.A03(A032);
            } catch (SecurityException unused2) {
            }
            r0.A0V = uri2;
        }
        String string2 = ((1qX) r302).mResultSet.getString(i, 34);
        if (string2 != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : C3o5.A0n(new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(string2, 0))) {
                builder.m11011add((Object) Integer.valueOf(Integer.parseInt(str)));
            }
            r0.A01(1Fj.A01(builder));
        }
        String A033 = ((0AC) c00i.get()).A03(((1qX) r302).mResultSet.getNullableLong(i, 80), ((1qX) r302).mResultSet.getString(i, 78), ((1qX) r302).mResultSet.getString(i, 79));
        if (A033 != null) {
            Uri uri3 = null;
            try {
                uri3 = C0A2.A03(A033);
            } catch (SecurityException unused3) {
            }
            r0.A0X = uri3;
        }
        return new ThreadThemeInfo(r0);
    }
}
