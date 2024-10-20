package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Mg, reason: invalid class name */
/* loaded from: 4Mg.class */
public final class C4Mg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4Mg[] A01;
    public static final C4Mg A02;
    public static final C4Mg A03;
    public static final C4Mg A04;
    public static final C4Mg A05;
    public static final C4Mg A06;
    public static final C4Mg A07;
    public static final C4Mg A08;

    static {
        C4Mg c4Mg = new C4Mg(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0);
        A08 = c4Mg;
        C4Mg c4Mg2 = new C4Mg("DRAWER", 1);
        A06 = c4Mg2;
        C4Mg c4Mg3 = new C4Mg("DEEPLINK", 2);
        A05 = c4Mg3;
        C4Mg c4Mg4 = new C4Mg("ADMIN_NUX_DEEPLINK", 3);
        A02 = c4Mg4;
        C4Mg c4Mg5 = new C4Mg("CHAT_ENTITY_NUX_DEEPLINK", 4);
        A03 = c4Mg5;
        C4Mg c4Mg6 = new C4Mg("MULTI_GROUP_ADMIN_NUX_DEEPLINK", 5);
        A07 = c4Mg6;
        C4Mg c4Mg7 = new C4Mg("COMMUNITY_CONTAINER", 6);
        A04 = c4Mg7;
        C4Mg[] c4MgArr = {c4Mg, c4Mg2, c4Mg3, c4Mg4, c4Mg5, c4Mg6, c4Mg7};
        A01 = c4MgArr;
        A00 = C00t.A00(c4MgArr);
    }

    public C4Mg(String str, int i) {
    }

    public static C4Mg valueOf(String str) {
        return (C4Mg) Enum.valueOf(C4Mg.class, str);
    }

    public static C4Mg[] values() {
        return (C4Mg[]) A01.clone();
    }
}
