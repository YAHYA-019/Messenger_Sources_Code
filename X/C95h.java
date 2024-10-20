package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95h, reason: invalid class name */
/* loaded from: 95h.class */
public final class C95h {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95h[] A01;
    public static final C95h A02;
    public static final C95h A03;
    public static final C95h A04;

    static {
        C95h c95h = new C95h(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0);
        A04 = c95h;
        C95h c95h2 = new C95h("INBOX_TAB", 1);
        A03 = c95h2;
        C95h c95h3 = new C95h("HIGHLIGHTS_TAB", 2);
        A02 = c95h3;
        C95h[] c95hArr = {c95h, c95h2, c95h3};
        A01 = c95hArr;
        A00 = C00t.A00(c95hArr);
    }

    public C95h(String str, int i) {
    }

    public static C95h valueOf(String str) {
        return (C95h) Enum.valueOf(C95h.class, str);
    }

    public static C95h[] values() {
        return (C95h[]) A01.clone();
    }
}
