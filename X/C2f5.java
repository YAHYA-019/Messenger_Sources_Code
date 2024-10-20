package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2f5, reason: invalid class name */
/* loaded from: 2f5.class */
public abstract class C2f5 implements CallerContextable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2f5[] A01;
    public static final C2f5 A02;
    public static final C2f5 A03;
    public static final C2f5 A04;
    public static final C2f5 A05;
    public static final C2f5 A06;
    public static final C2f5 A07;
    public static final String __redex_internal_original_name = "RefreshType";

    static {
        C2f5 c2f5 = new C2f5() { // from class: X.2f6
            public static final String __redex_internal_original_name = "RefreshType$AUTOMATIC_REFRESH";
        };
        A02 = c2f5;
        C2f5 c2f52 = new C2f5() { // from class: X.2f7
            public static final String __redex_internal_original_name = "RefreshType$FORCE_AUTOMATIC_REFRESH";
        };
        A04 = c2f52;
        C2f5 c2f53 = new C2f5() { // from class: X.2f8
            public static final String __redex_internal_original_name = "RefreshType$REFRESH_AFTER_RESUME";

            @Override // X.C2f5
            public 2fC A00(1Hb r302, String str, boolean z) {
                return 2fC.A00(CallerContext.A0E(str, "messages", "thread_list_refresh_after_resume"), r302, false, false, false);
            }
        };
        A07 = c2f53;
        C2f5 c2f54 = new C2f5() { // from class: X.2f9
            public static final String __redex_internal_original_name = "RefreshType$EXPLICIT_USER_REFRESH";
        };
        A03 = c2f54;
        C2f5 c2f55 = new 2fA();
        A06 = c2f55;
        C2f5 c2f56 = new 2fB();
        A05 = c2f56;
        C2f5[] c2f5Arr = {c2f5, c2f52, c2f53, c2f54, c2f55, c2f56};
        A01 = c2f5Arr;
        A00 = C00t.A00(c2f5Arr);
    }

    public C2f5(String str, int i) {
    }

    public 2fC A00(1Hb r302, String str, boolean z) {
        boolean z2;
        String str2;
        String str3;
        if (this instanceof C2f6) {
            return 2fC.A00(CallerContext.A0E(str, "messages", "thread_list_refresh_auto"), r302, false, false, false);
        }
        if (this instanceof C2f7) {
            z2 = true;
            str2 = "messages";
            str3 = "thread_list_force_refresh_auto";
        } else {
            if (!(this instanceof 2fA)) {
                if (this instanceof 2fB) {
                    return 2fC.A00(CallerContext.A0E(str, "messages", "thread_list_refresh_filter"), r302, false, true, true);
                }
                return 2fC.A00(CallerContext.A0E(str, "messages", "thread_list_refresh_user"), r302, !z, true, false);
            }
            z2 = true;
            str2 = "messages";
            str3 = "thread_list_refresh_receipts";
        }
        return 2fC.A00(CallerContext.A0E(str, str2, str3), r302, false, false, z2);
    }
}
