package X;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySettingsData;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.plugins.status.statusprofilesubheadinglogging.StatusProfileSubheadingLoggerImplementation;
import com.facebook.presence.plugins.status.threadsettingscontextsubheadinglogging.RichStatusThreadSettingsLoggerImplementation;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* loaded from: D4o.class */
public final class D4o implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D4o(AmH amH) {
        this.A00 = 2;
        this.A02 = amH;
        this.A01 = ((RecyclerView) amH.A04).A0C;
    }

    public D4o(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                if (th instanceof CancellationException) {
                    return;
                }
                0fH.A0N(B9o.class, "Failed to get latest image request from ImagePipelineWrapper.", th, AnonymousClass001.A1Z());
                return;
            case 1:
                ((RhC) this.A02).A06(th.getMessage());
                return;
            case 2:
            case 7:
            case 10:
            default:
                return;
            case 3:
                CFX cfx = (CFX) this.A02;
                C1532Akl c1532Akl = cfx.A00;
                if (c1532Akl != null) {
                    c1532Akl.A1X(ThreadKey.A0H(7zQ.A0H((User) this.A01), 7zO.A0C(cfx.A01)));
                    return;
                }
                return;
            case 4:
                11T.A0F(th, 0);
                CHh.A00((CHh) this.A02, th.getMessage());
                return;
            case 5:
                C1589Am8 c1589Am8 = (C1589Am8) this.A01;
                C1589Am8.A06((FbUserSession) this.A02, C1589Am8.A03(c1589Am8), c1589Am8);
                return;
            case 6:
                11T.A0F(th, 0);
                7zL.A1T(this.A01, th);
                return;
            case 8:
            case 9:
                11T.A0F(th, 0);
                0fH.A0s("StatusSettingRowCreator", "statusFetcher.fetchStatusForOwner() failed", th);
                return;
            case 11:
                C5x c5x = (C5x) this.A02;
                AbN.A0Z(c5x.A05).A0A(c5x.A00, (Intent) this.A01);
                return;
            case 12:
                11T.A0F(th, 0);
                DGO dgo = (DGO) this.A01;
                if (dgo != null) {
                    dgo.CGs(false, th);
                    return;
                }
                return;
            case 13:
                0fH.A0s("i18n_IFbResourcesPreparerImpl", "Unexpected failure waiting for prefetch result", th);
                ((C4S) ((C8M) this.A01).A01.get()).A00(th);
                ((1FX) this.A02).set(1BK.A0d());
                return;
            case 14:
                11T.A0F(th, 0);
                ((6V8) this.A02).A01("Failed to read the client autoplay setting from the server.", th);
                return;
            case 15:
                11T.A0F(th, 0);
                CfG.A01(this.A02);
                BjK bjK = (BjK) this.A01;
                AnonymousClass047 ACu = ((AnonymousClass046) 1Bn.A0A(16669)).ACu("unexpected error", 114436730);
                ACu.Cmr(th);
                ACu.report();
                AbI.A1V(AbJ.A0k(bjK.A00.A00), 2131968151, false);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [androidx.fragment.app.Fragment, X.Am8] */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        DIW A03;
        ThreadKey threadKey;
        C1532Akl c1532Akl;
        switch (this.A00) {
            case 0:
                Bi7 bi7 = (Bi7) obj;
                if (bi7 == null) {
                    0fH.A0B(B9o.class, "Fetching latest image request returned null");
                    ((D4O) this.A01).A02.setException(AnonymousClass001.A0Q("Fetching latest image request returned null"));
                    return;
                }
                if (((ImageAttachmentData) this.A02).A0C == null) {
                    0fH.A0B(B9o.class, "No fb id present in image attachment data");
                    ((D4O) this.A01).A02.setException(AnonymousClass001.A0Q("No fb id present in image attachment data"));
                    return;
                }
                2Dp r0 = (2Dp) 2Ri.A0D(bi7.A00, (Object) null);
                if (r0 == null) {
                    0fH.A0B(B9o.class, "Image fetch info returned has no first available image request");
                    ((D4O) this.A01).A02.setException(AnonymousClass001.A0Q("Image fetch info returned has no first available image request"));
                    return;
                } else {
                    D4O d4o = (D4O) this.A01;
                    B9o.A00(d4o.A00, r0, d4o.A01, d4o.A02, d4o.A03);
                    return;
                }
            case 1:
                try {
                    JSONObject jSONObject = new JSONObject((String) obj);
                    if (jSONObject.optBoolean(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS, false)) {
                        ((RhC) this.A02).A03();
                        return;
                    } else {
                        ((RhC) this.A02).A06(String.format("Error code %d", Integer.valueOf(jSONObject.optInt(TraceFieldType.ErrorCode, 0))));
                        return;
                    }
                } catch (Throwable th) {
                    onFailure(th);
                    return;
                }
            case 2:
                ImmutableList immutableList = (ImmutableList) obj;
                boolean A01 = 09K.A01(immutableList);
                Object obj2 = this.A02;
                if (!A01) {
                    ((AmH) obj2).A03.A02();
                    C1369Afb c1369Afb = (C1369Afb) this.A01;
                    c1369Afb.A00 = immutableList;
                    c1369Afb.A07();
                    return;
                }
                AmH amH = (AmH) obj2;
                amH.A03.A03();
                C00i c00i = amH.A08;
                if (0AT.A02(AbF.A0p(c00i).BDl())) {
                    ((TextView) 7zL.A0F(amH, 2131364534)).setTextColor(AbF.A0p(c00i).B4k());
                    return;
                }
                return;
            case 3:
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                Object obj3 = null;
                if (abstractCollection != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((ThreadSummary) next).A0n.A0x()) {
                            A0s.add(next);
                        }
                    }
                    Iterator it2 = A0s.iterator();
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (it2.hasNext()) {
                            long j = ((ThreadSummary) obj3).A0A;
                            do {
                                Object next2 = it2.next();
                                long j2 = ((ThreadSummary) next2).A0A;
                                if (j < j2) {
                                    obj3 = next2;
                                    j = j2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    ThreadSummary threadSummary = (ThreadSummary) obj3;
                    if (threadSummary != null && (threadKey = threadSummary.A0n) != null && (c1532Akl = ((CFX) this.A02).A00) != null) {
                        c1532Akl.A1X(threadKey);
                        return;
                    }
                }
                CFX cfx = (CFX) this.A02;
                C1532Akl c1532Akl2 = cfx.A00;
                if (c1532Akl2 != null) {
                    c1532Akl2.A1X(ThreadKey.A0H(7zQ.A0H((User) this.A01), 7zO.A0C(cfx.A01)));
                    return;
                }
                return;
            case 4:
                ReachabilitySettingsData reachabilitySettingsData = (ReachabilitySettingsData) obj;
                if (reachabilitySettingsData == null) {
                    onFailure(AnonymousClass001.A0N("Fetch reachability settings server error."));
                    return;
                }
                CHh cHh = (CHh) this.A02;
                D4v d4v = new D4v((FbUserSession) this.A01, cHh, reachabilitySettingsData);
                CEB ceb = (CEB) 1Br.A0B(cHh.A06);
                CallerContext A0B = CallerContext.A0B("ReachabilitySettingsPresenter");
                ImmutableList A0e = 7zN.A0e("MESSAGING_REACHABILITY_SETTINGS");
                03W A0G = 04R.A0G();
                11T.A0F(A0G, 4);
                ((EKS) 1Br.A0B(ceb.A01)).A0B(A0B, d4v, "msgr_android_linking_cache_mwb_reachability_settings", A0e, A0G);
                return;
            case 5:
                AbstractCollection abstractCollection2 = (AbstractCollection) obj;
                ?? r02 = (C1589Am8) this.A01;
                if (abstractCollection2 == null || !abstractCollection2.contains("SKIP_CONTACT_ELIGIBILITY_FILTER")) {
                    A03 = C1589Am8.A03(r02);
                } else {
                    ImmutableList immutableList2 = C1589Am8.A04;
                    A03 = ((AbR) 7zO.A0l((Fragment) r02, 474)).A0q(1BL.A0G((Fragment) r02), new C6o(true));
                }
                C1589Am8.A06((FbUserSession) this.A02, A03, r02);
                return;
            case 6:
                7zL.A1T(this.A02, obj);
                return;
            case 7:
                if (obj == null) {
                    ((C03513yC) 1Lm.A05(((StatusProfileSubheadingLoggerImplementation) this.A02).A00, (FbUserSession) this.A01, 68395)).A08(EnumC03533yL.ME_SETTINGS, null, null, 3, false, true);
                    return;
                }
                return;
            case 8:
            case 9:
            default:
                RichStatus richStatus = (RichStatus) obj;
                C8Z c8z = (C8Z) this.A02;
                if (c8z.A07.get()) {
                    c8z.A00 = richStatus;
                    ((DFp) this.A01).D7z();
                    return;
                }
                return;
            case 10:
                if (obj != null) {
                    ((C03513yC) 1Lm.A05(((RichStatusThreadSettingsLoggerImplementation) this.A02).A00, (FbUserSession) this.A01, 68395)).A08(EnumC03533yL.THREAD_DETAILS, null, null, 3, false, true);
                    return;
                }
                return;
            case 11:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    C5x c5x = (C5x) this.A02;
                    AbN.A0Z(c5x.A05).A0A(c5x.A00, (Intent) this.A01);
                    return;
                }
                return;
            case 12:
                DGO dgo = (DGO) this.A01;
                if (dgo != null) {
                    dgo.CGs(true, (Throwable) null);
                    return;
                }
                return;
            case 13:
                List list = (List) obj;
                boolean z = false;
                if (list == null || list.size() != 2 || list.get(0) == null || list.get(1) == null) {
                    0fH.A0o("i18n_IFbResourcesPreparerImpl", "Unexpected prefetch result");
                    ((C4S) ((C8M) this.A01).A01.get()).A00(AnonymousClass001.A0T("Impossible results size"));
                } else {
                    boolean z2 = ((1Zl) list.get(0)).A01;
                    boolean z3 = ((1Zl) list.get(1)).A01;
                    if (z2 && z3) {
                        z = true;
                    }
                    QuickPerformanceLogger A0e2 = 7zP.A0e(((C4S) ((C8M) this.A01).A01.get()).A00);
                    short s = 3;
                    if (z) {
                        s = 2;
                    }
                    A0e2.markerEnd(30474249, s);
                }
                AbG.A1W((1FX) this.A02, z);
                return;
            case 14:
                2JX r03 = (2JX) obj;
                if (r03 != null) {
                    6V8.A00(r03, (FbSharedPreferences) this.A01, (6V8) this.A02);
                    return;
                }
                return;
            case 15:
                CfG.A01(this.A02);
                7zR.A1M(AbJ.A0k(((BjK) this.A01).A00.A00), 2131968152);
                return;
        }
    }
}
