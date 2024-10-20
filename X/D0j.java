package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: D0j.class */
public final class D0j implements DHr {
    public 1BY A00;
    public final FbUserSession A01;
    public final C0et A02;
    public final C00i A04;
    public final 1Uv A08;
    public final AnonymousClass208 A09;
    public final C5a0 A0A;
    public final C6E8 A0B;
    public final 6ED A0C;
    public final C7vo A0D;
    public final CaM A0E;
    public final C6B A0F;
    public final C4z1 A0I;
    public final CQF A0J;
    public final C1q7 A0K;
    public final C00i A06 = 1BV.A01((1BY) null, 147756);
    public final C15h A0G = DBe.A00(this, ActionId.APP_DID_FINISH_LAUNCHING);
    public final C00i A03 = 1BQ.A02(49806);
    public final C00i A05 = 1BQ.A02(17066);
    public final C00i A07 = 1BQ.A02(49493);
    public final C00i A0H = 1BQ.A02(32804);

    public D0j(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        C5a0 c5a0 = (C5a0) 1Bn.A0E((Context) null, (1BY) null, 84570);
        1Uv A0M = AbJ.A0M();
        CQF cqf = (CQF) 1Bn.A0E((Context) null, (1BY) null, 84569);
        C1q7 c1q7 = (C1q7) 1Bi.A03(16822);
        C7vo c7vo = (C7vo) 1Bi.A03(85106);
        C0et A0E = AbJ.A0E();
        this.A01 = fbUserSession;
        C6B c6b = (C6B) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 85107);
        C6E8 c6e8 = (C6E8) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 49997);
        6ED r0 = (6ED) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 50002);
        CaM A0f = AbM.A0f(fbUserSession, (1BY) null);
        this.A04 = AbF.A0A(fbUserSession, (1BY) null, 84515);
        this.A0I = AbM.A0R(fbUserSession, (1BY) null);
        this.A0B = c6e8;
        this.A0C = r0;
        this.A0F = c6b;
        this.A0E = A0f;
        this.A0A = c5a0;
        this.A08 = A0M;
        this.A09 = (AnonymousClass208) 1Bn.A0E((Context) null, (1BY) null, 17006);
        this.A0J = cqf;
        this.A0K = c1q7;
        this.A0D = c7vo;
        this.A02 = A0E;
    }

    public static void A00(D0j d0j, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((3rE) d0j.A0H.get()).A03(str, (List) null, 60, i, 0);
    }

    @Override // X.DHr
    public void Bm8() {
        this.A0I.A04.A0a();
        this.A08.A0L("MessagesSyncPayloadHandler");
    }

    @Override // X.DHr
    public void C0t() {
        C00j.A05("SyncPayloadHandler.createNotif", -720939593);
        try {
            if (this.A02 != C0et.A0U) {
                this.A06.get();
                CaM caM = this.A0E;
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator A1A = 1BK.A1A(caM.A04);
                while (A1A.hasNext()) {
                    builder.addAll((Iterable) A1A.next());
                }
                Iterator it = builder.build().iterator();
                while (it.hasNext()) {
                    NewMessageNotification newMessageNotification = (NewMessageNotification) it.next();
                    this.A0A.A00(newMessageNotification);
                    ((C5e0) this.A03.get()).A07(((MessagingNotification) newMessageNotification).A02);
                }
            }
            C00j.A01(1652311395);
            CaM caM2 = this.A0E;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) caM2.A07);
            FbUserSession fbUserSession = this.A01;
            2fE r0 = (2fE) 1Lo.A04((Context) null, fbUserSession, this.A00, 17064);
            Iterator it2 = copyOf.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                ThreadKey A0k = AbG.A0k(it2);
                1Uv.A04(fbUserSession, this.A08, AnonymousClass000.A00(53), "MessagesSyncPayloadHandler.notifyUiForAllReadThreads", 1BK.A17(ImmutableList.of((Object) A0k)));
                ThreadSummary A06 = r0.A06(A0k);
                if (A06 != null) {
                    this.A09.AFx(A06.A0n, "ReadRemotely");
                    z |= AnonymousClass001.A1W(A06.A0g, 1F9.A0M);
                }
            }
            if (z) {
                this.A08.A07();
            }
            HashMap A0u = AnonymousClass001.A0u();
            Bundle A05 = 1BK.A05();
            1Du it3 = ImmutableList.copyOf((Collection) caM2.A04.keySet()).iterator();
            while (it3.hasNext()) {
                A0u.put(it3.next(), A05);
            }
            java.util.Map map = caM2.A02;
            Iterator A1B = 1BK.A1B(map);
            while (A1B.hasNext()) {
                A0u.put(A1B.next(), A05);
            }
            A0u.putAll(caM2.A06);
            java.util.Map map2 = caM2.A03;
            A0u.putAll(map2);
            Iterator A0y = AnonymousClass001.A0y(caM2.A05);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                Object key = A0z.getKey();
                BaseBundle baseBundle = (BaseBundle) A0z.getValue();
                BaseBundle baseBundle2 = (BaseBundle) map2.get(key);
                if (baseBundle2 == null || baseBundle2.getLong("sequence_id") <= baseBundle.getLong("sequence_id")) {
                    A0u.put(key, baseBundle);
                }
            }
            ImmutableMap copyOf2 = ImmutableMap.copyOf((java.util.Map) A0u);
            1Du A0i = 4YU.A0i(copyOf2);
            while (A0i.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0i);
                this.A08.A09((Bundle) A0z2.getValue(), fbUserSession, (ThreadKey) A0z2.getKey(), "MessagesSyncPayloadHandler.notifyUiForAllUpdatedThreads");
            }
            if (!copyOf2.isEmpty()) {
                this.A08.A06();
            }
            1Du it4 = ImmutableList.copyOf(map.values()).iterator();
            boolean z2 = false;
            while (it4.hasNext()) {
                BtJ btJ = (BtJ) it4.next();
                this.A08.A0K(btJ.A00, "MessagesSyncPayloadHandler.notifyUiForAllDeletedMessages", ImmutableList.copyOf((Collection) btJ.A01), ImmutableList.copyOf((Collection) btJ.A02));
                if (!z2) {
                    z2 = ImmutableSet.A07(btJ.A03).contains(1F9.A0M);
                }
            }
            if (z2) {
                this.A08.A07();
            }
            caM2.A01();
        } catch (Throwable th) {
            C00j.A01(548940313);
            throw th;
        }
    }
}
