package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySettingsData;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import fxcache.model.FxCalAccount;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: D4v.class */
public final class D4v implements GJD {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CHh A01;
    public final /* synthetic */ ReachabilitySettingsData A02;

    public D4v(FbUserSession fbUserSession, CHh cHh, ReachabilitySettingsData reachabilitySettingsData) {
        this.A01 = cHh;
        this.A00 = fbUserSession;
        this.A02 = reachabilitySettingsData;
    }

    public void BxV() {
        CHh.A00(this.A01, "Refreshing FX service cache failed");
    }

    public void onSuccess() {
        CHh cHh = this.A01;
        C00i c00i = cHh.A06.A00;
        CEB ceb = (CEB) c00i.get();
        CallerContext A0B = CallerContext.A0B("ReachabilitySettingsPresenter");
        C21m c21m = (C21m) 1Br.A0B(ceb.A00);
        11T.A0F(A0B, 1);
        List A0A = c21m.A0A(A0B, "msgr_android_linking_cache_mwb_reachability_settings", 11T.A04("INSTAGRAM"));
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            A0s.add(String.valueOf(((FxCalAccount) it.next()).A07));
        }
        if (7zM.A1b(A0s)) {
            java.util.Map A03 = ((ETx) 1Br.A0B(((CEB) c00i.get()).A01)).A03(CallerContext.A0B("ReachabilitySettingsPresenter"), "msgr_android_linking_cache_mwb_reachability_settings", 7zN.A0e("MESSAGING_REACHABILITY_SETTINGS"));
            Type type = new BKa().type;
            if (!A03.isEmpty()) {
                Gson gson = new Gson();
                String str = null;
                java.util.Map map = (java.util.Map) A03.get("MESSAGING_REACHABILITY_SETTINGS");
                Object A05 = gson.A05(map != null ? AnonymousClass001.A0b(4YU.A18(Locale.ROOT, "IG_FOLLOWEES"), map) : null, type);
                11T.A0A(A05);
                cHh.A01 = (HashMap) A05;
                Gson gson2 = new Gson();
                java.util.Map map2 = (java.util.Map) A03.get("MESSAGING_REACHABILITY_SETTINGS");
                if (map2 != null) {
                    str = AbH.A1C(4YU.A18(Locale.ROOT, "IG_FOLLOWERS"), map2);
                }
                Object A052 = gson2.A05(str, type);
                11T.A0A(A052);
                cHh.A02 = (HashMap) A052;
            }
            Biq biq = new Biq(cHh);
            ArrayList A0s2 = AnonymousClass001.A0s();
            Set keySet = cHh.A01.keySet();
            11T.A0A(keySet);
            A0s2.addAll(keySet);
            Set keySet2 = cHh.A02.keySet();
            11T.A0A(keySet2);
            A0s2.addAll(keySet2);
            BsO bsO = (BsO) 1Br.A0B(((BlJ) 1Br.A0B(cHh.A05)).A00);
            C1606Amn c1606Amn = new C1606Amn(biq, 9);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0s2);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A05("caller_name", DKB.A00(401));
            A0M.A06("obfuscated_id_list_1", copyOf);
            boolean A1T = AnonymousClass001.A1T(copyOf);
            A0M.A06("obfuscated_id_list_2", copyOf2);
            boolean A1T2 = AnonymousClass001.A1T(copyOf2);
            Preconditions.checkArgument(A1T);
            Preconditions.checkArgument(A1T2);
            2Jf r0 = new 2Jf(2JX.class, (Class) null, "FxFBCompareObIdListQuery", (String) null, "fbandroid", -1056529878, 0, 2355023683L, 2355023683L, false, true);
            r0.A00 = A0M;
            1FV A09 = 7zT.A09(bsO.A01).A09(AbK.A0L(r0));
            D3J A01 = D3J.A01(bsO, 13);
            C00i c00i2 = bsO.A00.A00;
            AbI.A0o(bsO.A02).A05(c1606Amn, 2FP.A02(A01, A09, AbG.A1D(c00i2)), bsO.getClass().toString(), AbG.A1D(c00i2));
        }
        ReachabilitySettingsData reachabilitySettingsData = this.A02;
        B9D b9d = cHh.A0B;
        BLI bli = BLI.A04;
        if (!reachabilitySettingsData.equals(ReachabilitySettingsData.A03)) {
            b9d.A04 = reachabilitySettingsData;
        }
        b9d.A02 = bli;
        b9d.A1c();
        C9K c9k = (C9K) 1Br.A0B(cHh.A07);
        Bundle bundle = b9d.mArguments;
        BOD bod = (BOD) (bundle != null ? bundle.getSerializable("entry_point") : null);
        1UG A08 = 1BK.A08(1Br.A02(c9k.A00), "messenger_interop_reachability_settings_client_view");
        if (A08.isSampled()) {
            A08.A5c(bod, "entry_point");
            A08.BZL();
        }
    }
}
