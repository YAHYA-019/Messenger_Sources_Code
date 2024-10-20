package X;

import com.facebook.acra.constants.ActionId;
import java.util.Collections;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6qi, reason: invalid class name */
/* loaded from: 6qi.class */
public final class C6qi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6qi[] A01;
    public static final C6qi A02;
    public static final C6qi A03;
    public static final C6qi A04;
    public static final C6qi A05;
    public static final C6qi A06;
    public static final C6qi A07;
    public static final C6qi A08;
    public final boolean allowOneToOneThread;
    public final boolean allowSlashTrigger;
    public final boolean alwaysUseSlash;
    public final List searchStrings;
    public final Integer threadCapability;

    static {
        List singletonList = Collections.singletonList(2131956418);
        11T.A0A(singletonList);
        A04 = new C6qi(null, "NONE", singletonList, 0, false, false, false);
        List singletonList2 = Collections.singletonList(2131956418);
        11T.A0A(singletonList2);
        A05 = new C6qi(null, "PROFILE", singletonList2, 1, false, false, false);
        List singletonList3 = Collections.singletonList(2131959851);
        11T.A0A(singletonList3);
        A07 = new C6qi(Integer.valueOf(ActionId.RTMP_STREAM_PREPARED), "THREAD", singletonList3, 2, false, false, false);
        List singletonList4 = Collections.singletonList(2131956418);
        11T.A0A(singletonList4);
        A08 = new C6qi(null, "THREAD_ACTIVE", singletonList4, 3, false, false, false);
        List singletonList5 = Collections.singletonList(2131959860);
        11T.A0A(singletonList5);
        A06 = new C6qi(null, "SILENT", singletonList5, 4, true, true, true);
        A02 = new C6qi(null, "AI", C0s8.A14(2131959846, 2131959847, 2131959848), 5, true, true, false);
        List singletonList6 = Collections.singletonList(2131959852);
        11T.A0A(singletonList6);
        C6qi c6qi = new C6qi(null, "AI_IMAGE", singletonList6, 6, true, true, true);
        A03 = c6qi;
        C6qi[] c6qiArr = {A04, A05, A07, A08, A06, A02, c6qi};
        A01 = c6qiArr;
        A00 = C00t.A00(c6qiArr);
    }

    public C6qi(Integer num, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        this.searchStrings = list;
        this.allowSlashTrigger = z;
        this.allowOneToOneThread = z2;
        this.alwaysUseSlash = z3;
        this.threadCapability = num;
    }

    public static C6qi valueOf(String str) {
        return (C6qi) Enum.valueOf(C6qi.class, str);
    }

    public static C6qi[] values() {
        return (C6qi[]) A01.clone();
    }
}
