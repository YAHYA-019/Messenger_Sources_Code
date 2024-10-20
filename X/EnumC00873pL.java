package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3pL, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pL.class */
public final class EnumC00873pL {
    public static EnumC00873pL[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC00873pL[] A02;
    public static final EnumC00873pL A03;
    public static final EnumC00873pL A04;
    public final String typeName;

    static {
        EnumC00873pL enumC00873pL = new EnumC00873pL("FBGROUP", 0, "Group");
        A03 = enumC00873pL;
        EnumC00873pL enumC00873pL2 = new EnumC00873pL(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 1, "Unknown");
        A04 = enumC00873pL2;
        EnumC00873pL[] enumC00873pLArr = {enumC00873pL, enumC00873pL2};
        A02 = enumC00873pLArr;
        C00u A002 = C00t.A00(enumC00873pLArr);
        A01 = A002;
        A00 = (EnumC00873pL[]) A002.toArray(new EnumC00873pL[0]);
    }

    public EnumC00873pL(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static EnumC00873pL valueOf(String str) {
        return (EnumC00873pL) Enum.valueOf(EnumC00873pL.class, str);
    }

    public static EnumC00873pL[] values() {
        return (EnumC00873pL[]) A02.clone();
    }
}
