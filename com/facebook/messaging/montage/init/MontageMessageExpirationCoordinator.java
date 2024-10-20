package com.facebook.messaging.montage.init;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1De;
import X.1F9;
import X.1Fv;
import X.1HG;
import X.1I0;
import X.1Lm;
import X.1PG;
import X.1Tw;
import X.1Uv;
import X.2Kj;
import X.2Uy;
import X.2Uz;
import X.4YU;
import X.4YV;
import X.4cN;
import X.4yH;
import X.60V;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C0dp;
import X.C1q8;
import X.C4yz;
import X.C4z1;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.DeleteMessagesParams;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: MontageMessageExpirationCoordinator.class */
public final class MontageMessageExpirationCoordinator {
    public final 1De A00;
    public final 1Br A04;
    public final 1Br A03 = 1Bq.A00(16688);
    public final 1Br A05 = 1Bq.A00(67918);
    public final 1Br A02 = 1Bq.A00(16511);
    public final 1Br A01 = 1Bq.A00(99390);

    public MontageMessageExpirationCoordinator(1De r302) {
        this.A00 = r302;
        this.A04 = 1HG.A00((Context) 1Bn.A0E((Context) null, r302.A00, 83719), 66579);
    }

    public final void A00() {
        FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
        if (((1PG) 1Bi.A03(66265)).A07()) {
            return;
        }
        if (!((2Kj) this.A05.A00.get()).A00()) {
            0fH.A0j("MontageMessageExpirationCoordinator", "skipping");
            return;
        }
        try {
            0fH.A0j("MontageMessageExpirationCoordinator", "Checking for expired montage messages");
            1BY r0 = this.A00.A00;
            4yH r02 = (4yH) 1Lm.A07(A04, r0, 49390);
            C4yz c4yz = (C4yz) 1Lm.A07(A04, r0, 49423);
            C4z1 c4z1 = (C4z1) 1Lm.A07(A04, r0, 84638);
            long j = -1;
            1F9 r03 = 1F9.A0M;
            long now = ((C0dp) this.A01.A00.get()).now() - 86400000;
            C00i c00i = c4yz.A09;
            ((1Tw) c00i.get()).A00("fetch_messages_from_db_start");
            C00j.A05("DbFetchThreadHandler.fetchMessagesFromDb", 1174087239);
            try {
                4cN r04 = new 4cN();
                r04.A04(new 2Uy("folder", r03.dbName));
                if (now != j) {
                    r04.A04(new 2Uz("timestamp_ms", Long.toString(now), "<="));
                }
                LinkedHashMap linkedHashMap = C4yz.A00(r04, c4yz, 0Pz.A0W("timestamp_ms", " DESC"), 500, " DESC".contains(" ASC")).A00;
                ((1Tw) c00i.get()).A00("fetch_messages_from_db_end");
                C00j.A01(-802817603);
                11T.A0A(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(it);
                    if (((60V) 1Br.A0B(this.A04)).A0G((Message) A0z.getValue())) {
                        linkedHashMap2.put(A0z.getKey(), A0z.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Iterator it2 = linkedHashMap2.values().iterator();
                while (it2.hasNext()) {
                    Message A0V = 4YU.A0V(it2);
                    if (A0V.A04() != C1q8.A05) {
                        ThreadKey threadKey = A0V.A0V;
                        if (threadKey != null) {
                            Object obj = linkedHashMap3.get(threadKey);
                            if (obj == null) {
                                obj = AnonymousClass001.A0s();
                                linkedHashMap3.put(threadKey, obj);
                            }
                            String str = A0V.A1V;
                            if (str != null) {
                                ((List) obj).add(str);
                            }
                        }
                    }
                }
                ImmutableList.Builder builder = ImmutableList.builder();
                Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(it3);
                    ThreadKey threadKey2 = (ThreadKey) A0z2.getKey();
                    List list = (List) A0z2.getValue();
                    1I0 r05 = new 1I0(4);
                    r05.A08(list);
                    c4z1.A02(r03, r02.A0T(new DeleteMessagesParams(threadKey2, r05.A07(), 0S2.A01), "MontageMessageExpirationCoordinator", j, true, false));
                    builder.m11011add((Object) threadKey2);
                    ThreadSummary threadSummary = c4yz.A0G(threadKey2).A05;
                    if (threadSummary != null) {
                        c4z1.A07(threadSummary);
                        builder.m11011add((Object) threadSummary.A0n);
                    }
                }
                ImmutableList build = builder.build();
                11T.A0A(build);
                if (build.isEmpty()) {
                    return;
                }
                0fH.A0g(build, "MontageMessageExpirationCoordinator", "Updated threads: %s");
                C00i c00i2 = this.A03.A00;
                ((1Uv) c00i2.get()).A0B(A04, build, "MontageMessageExpirationCoordinator");
                ((1Uv) c00i2.get()).A07();
            } catch (Throwable th) {
                4YV.A1D(c00i);
                C00j.A01(-1948812743);
                throw th;
            }
        } catch (Exception e) {
            1Br.A04(this.A02).softReport("MontageMessageExpirationCoordinator", "Error deleting expired montage messages.", e);
        }
    }
}
