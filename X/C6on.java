package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6on, reason: invalid class name */
/* loaded from: 6on.class */
public final class C6on {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6on[] A01;
    public static final C6on A02;
    public static final C6on A03;
    public static final C6on A04;
    public static final C6on A05;

    static {
        C6on c6on = new C6on("PHOTO", 0);
        A03 = c6on;
        C6on c6on2 = new C6on("GIF", 1);
        A02 = c6on2;
        C6on c6on3 = new C6on("VIDEO", 2);
        A05 = c6on3;
        C6on c6on4 = new C6on("STICKER", 3);
        A04 = c6on4;
        C6on[] c6onArr = {c6on, c6on2, c6on3, c6on4, new C6on(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 4)};
        A01 = c6onArr;
        A00 = C00t.A00(c6onArr);
    }

    public C6on(String str, int i) {
    }

    public static C6on valueOf(String str) {
        return (C6on) Enum.valueOf(C6on.class, str);
    }

    public static C6on[] values() {
        return (C6on[]) A01.clone();
    }
}
