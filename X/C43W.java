package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.SingletonImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.43W, reason: invalid class name */
/* loaded from: 43W.class */
public class C43W {
    public ImmutableList A00;
    public final C04013zk A01;
    public final java.util.Map A02;
    public final C00m A03;

    public C43W(C00m c00m) {
        this.A03 = c00m;
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        this.A00 = of;
        this.A02 = new HashMap();
        this.A01 = new C04013zk();
    }

    public static final C4Gw A00(C43W c43w, C4Gc c4Gc, List list) {
        C4Gy c4Gy;
        int size = list.size();
        C04013zk c04013zk = c43w.A01;
        int i = c04013zk.A00;
        QuickPerformanceLogger quickPerformanceLogger = c04013zk.A02;
        MarkerEditor withMarker = quickPerformanceLogger.withMarker(716778457, i);
        11T.A0D(withMarker);
        C04023zl c04023zl = c04013zk.A03;
        withMarker.point(C04023zl.A00(c04023zl, 0Pz.A0T("valid_promotion_count_is_", size), false, false));
        withMarker.annotate("valid_promotion_count", size);
        withMarker.markerEditingCompleted();
        C4Gv c4Gv = (C4Gv) c43w.A03.invoke();
        C4Gw c4Gw = new C4Gw();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            44I r0 = (44I) it.next();
            11T.A0F(r0, 0);
            4GS r02 = c4Gc.A06;
            String str = null;
            try {
                Iterator it2 = c4Gv.A01.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c4Gy = C4Gx.A00();
                        break;
                    }
                    C4Gf c4Gf = (C4Gf) it2.next();
                    str = c4Gf.DAM();
                    if (str != null) {
                        C04013zk c04013zk2 = c4Gv.A00;
                        String str2 = r0.A00.promotionId;
                        MarkerEditor withMarker2 = c04013zk2.A02.withMarker(716778457, c04013zk2.A00);
                        11T.A0D(withMarker2);
                        C04023zl c04023zl2 = c04013zk2.A03;
                        StringBuilder sb = new StringBuilder();
                        sb.append("waterfall_");
                        sb.append(str);
                        sb.append('_');
                        sb.append(str2);
                        sb.append("_start");
                        withMarker2.point(C04023zl.A00(c04023zl2, sb.toString(), false, false));
                        withMarker2.annotate("promotion_id", str2);
                        withMarker2.markerEditingCompleted();
                    }
                    c4Gy = c4Gf.A8f(c4Gc, r0);
                    if (c4Gy.A07) {
                        if (str != null) {
                            r02.A01(c4Gy.A00, r0.A00.promotionId, str, true);
                        }
                        if (c4Gy.A06) {
                            break;
                        }
                        if (str != null) {
                            C04013zk c04013zk3 = c4Gv.A00;
                            String str3 = r0.A00.promotionId;
                            MarkerEditor withMarker3 = c04013zk3.A02.withMarker(716778457, c04013zk3.A00);
                            11T.A0D(withMarker3);
                            C04023zl c04023zl3 = c04013zk3.A03;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("waterfall_");
                            sb2.append(str);
                            sb2.append('_');
                            sb2.append(str3);
                            sb2.append("_end");
                            withMarker3.point(C04023zl.A00(c04023zl3, sb2.toString(), false, false));
                            withMarker3.annotate("promotion_id", str3);
                            withMarker3.markerEditingCompleted();
                        }
                    } else if (str != null) {
                        QuickPromotionDefinition quickPromotionDefinition = r0.A00;
                        r02.A01(c4Gy.A00, quickPromotionDefinition.promotionId, str, false);
                        C04013zk c04013zk4 = c4Gv.A00;
                        String str4 = quickPromotionDefinition.promotionId;
                        MarkerEditor withMarker4 = c04013zk4.A02.withMarker(716778457, c04013zk4.A00);
                        11T.A0D(withMarker4);
                        C04023zl c04023zl4 = c04013zk4.A03;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("waterfall_");
                        sb3.append(str);
                        sb3.append('_');
                        sb3.append(str4);
                        sb3.append("_fail");
                        withMarker4.point(C04023zl.A00(c04023zl4, sb3.toString(), false, false));
                        withMarker4.annotate("promotion_id", str4);
                        withMarker4.markerEditingCompleted();
                    }
                }
            } catch (Exception e) {
                if (str != null) {
                    String str5 = r0.A00.promotionId;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "[null]";
                    }
                    11T.A0F(str5, 0);
                    2R2 r03 = (2R2) r02.A01.invoke(r02.A00);
                    if (((0D7) r03).A00.isSampled()) {
                        r03.A0D("promotion_id", 1BK.A0n(str5));
                        r03.A0E(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
                        r03.A0E("eligibility_result", "Fail");
                        ImmutableMap of = ImmutableMap.of((Object) "exception", (Object) message);
                        11T.A0A(of);
                        if (!of.isEmpty()) {
                            r03.A0I(of);
                        }
                        r03.BZL();
                    }
                }
                c4Gy = new C4Gy(null, null, null, null, e.getMessage(), e, false, false, false);
            }
            if (c4Gy.A07) {
                if (c4Gy.A06) {
                    String str6 = r0.A00.promotionId;
                    int i2 = c04013zk.A00;
                    11T.A0F(str6, 0);
                    MarkerEditor withMarker5 = quickPerformanceLogger.withMarker(716778457, i2);
                    11T.A0D(withMarker5);
                    withMarker5.point(C04023zl.A00(c04023zl, 0Pz.A0W("waterfall_force_pass_", str6), false, false));
                    withMarker5.markerEditingCompleted();
                    C4Gw c4Gw2 = new C4Gw();
                    if (c4Gw2.A00 == null) {
                        c4Gw2.A00 = r0;
                    }
                    c4Gw2.A01.add(r0);
                    return c4Gw2;
                }
                44I r04 = c4Gw.A00;
                if (r04 != null) {
                    String str7 = r04.A00.promotionId;
                    11T.A0F(str7, 1);
                    String str8 = r0.A00.promotionId;
                    11T.A0F(str8, 0);
                    2R2 r05 = (2R2) r02.A01.invoke(r02.A00);
                    if (((0D7) r05).A00.isSampled()) {
                        r05.A0D("promotion_id", 1BK.A0n(str8));
                        r05.A0E(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "client_promotion_lost_priority_selection");
                        r05.A0E("eligibility_result", "Fail");
                        ImmutableMap of2 = ImmutableMap.of((Object) "client_promotion_selected", (Object) str7);
                        11T.A0A(of2);
                        if (!of2.isEmpty()) {
                            r05.A0I(of2);
                        }
                        r05.BZL();
                    }
                }
                if (c4Gw.A00 == null) {
                    c4Gw.A00 = r0;
                    c4Gw.A01.add(r0);
                    QuickPromotionDefinition quickPromotionDefinition2 = r0.A00;
                    String str9 = quickPromotionDefinition2.promotionId;
                    int i3 = c04013zk.A00;
                    11T.A0F(str9, 0);
                    MarkerEditor withMarker6 = quickPerformanceLogger.withMarker(716778457, i3);
                    11T.A0D(withMarker6);
                    withMarker6.point(C04023zl.A00(c04023zl, 0Pz.A0W("waterfall_pass_", str9), false, false));
                    withMarker6.markerEditingCompleted();
                    r02.A01((C4H5) null, quickPromotionDefinition2.promotionId, "client_promotion_selected", true);
                } else {
                    c4Gw.A01.add(r0);
                }
                arrayList.add(r0);
            } else if (c4Gy.A05) {
                String str10 = r0.A00.promotionId;
                int i4 = c04013zk.A00;
                11T.A0F(str10, 0);
                MarkerEditor withMarker7 = quickPerformanceLogger.withMarker(716778457, i4);
                11T.A0D(withMarker7);
                withMarker7.point(C04023zl.A00(c04023zl, 0Pz.A0W("waterfall_fail_", str10), false, false));
                withMarker7.markerEditingCompleted();
                arrayList2.add(r0);
            } else {
                String str11 = c4Gy.A04;
                if (str11 == null) {
                    str11 = "null";
                }
                String str12 = r0.A00.promotionId;
                11T.A0F(str12, 0);
                String A0W = 0CV.A0W(str11, " ", "_");
                MarkerEditor withMarker8 = quickPerformanceLogger.withMarker(716778457);
                11T.A0D(withMarker8);
                withMarker8.point(C04023zl.A00(c04023zl, 0Pz.A0m("waterfall_fail_", str12, A0W, '_'), false, false));
                withMarker8.markerEditingCompleted();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            44I r06 = (44I) it3.next();
            4GS r07 = c4Gc.A06;
            11T.A0F(r06, 0);
            0D7 r08 = (0D7) r07.A03.invoke(r07.A00);
            if (r08.A00.isSampled()) {
                r08.A0D("promotion_id", Long.valueOf(Long.parseLong(r06.A00.promotionId)));
                r08.BZL();
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            44I r09 = (44I) it4.next();
            4GS r010 = c4Gc.A06;
            11T.A0F(r09, 0);
            0D7 r011 = (0D7) r010.A03.invoke(r010.A00);
            if (r011.A00.isSampled()) {
                r011.A0D("promotion_id", Long.valueOf(Long.parseLong(r09.A00.promotionId)));
                r011.BZL();
            }
        }
        int size2 = c4Gw.A01.size();
        MarkerEditor withMarker9 = quickPerformanceLogger.withMarker(716778457, c04013zk.A00);
        11T.A0D(withMarker9);
        withMarker9.point(C04023zl.A00(c04023zl, 0Pz.A0T("eligible_promotion_count_is_", size2), false, false));
        withMarker9.annotate("eligible_promotion_count", size2);
        withMarker9.markerEditingCompleted();
        return c4Gw;
    }

    public final 44I A02(4GQ r302, Object obj) {
        11T.A0F(r302, 1);
        Integer A00 = r302.A00(new SingletonImmutableSet(obj));
        44I r304 = null;
        if (A00 != null) {
            synchronized (this) {
                EjJ ejJ = (EjJ) this.A02.get(A00);
                if (ejJ != null) {
                    r304 = ejJ.A01;
                }
            }
        }
        return r304;
    }

    public final void A03(Collection collection) {
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(43X.A00, collection);
        synchronized (this) {
            11T.A0D(sortedCopyOf);
            this.A00 = sortedCopyOf;
        }
    }
}
