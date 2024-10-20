package com.facebook.entitypresence;

import X.02W;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1Br;
import X.1GU;
import X.1P9;
import X.1Pf;
import X.1UG;
import X.1vU;
import X.2At;
import X.2LA;
import X.4YV;
import X.4Z3;
import X.7zP;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.AbstractC05764eu;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C29V;
import X.GOn;
import X.HZs;
import X.I3v;
import X.Iem;
import X.IgR;
import X.QvU;
import X.RyE;
import X.RyF;
import X.Ryn;
import X.Ryq;
import X.RzW;
import X.SF0;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.inject.FbInjector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: EntityPresenceManager.class */
public final class EntityPresenceManager {
    public long A00;
    public Context A01;
    public final C00i A05;
    public final Runnable A07;
    public final Set A08;
    public final AtomicReference A09;
    public final C00i A0C = 1BV.A00(115554);
    public final C00i A06 = 1BV.A00(16459);
    public final C00i A03 = 1BV.A00(115548);
    public final C00i A0A = AbH.A0a();
    public final C00i A02 = AbH.A0K();
    public final C00i A04 = 1BV.A00(115552);
    public final C00i A0B = AbH.A0S();

    public EntityPresenceManager() {
        Context A00 = FbInjector.A00();
        this.A01 = A00;
        this.A05 = AbI.A0I(A00);
        this.A09 = GOn.A1L((Object) null);
        this.A07 = new SF0(this);
        this.A00 = -1;
        this.A08 = AnonymousClass001.A0v();
        AbstractC05764eu.A00(EntityPresenceManager.class);
        1P9.A01(AbJ.A0B(this.A05.get()), new IgR(this, 1), AnonymousClass000.A00(17)).A00();
    }

    public static long A00(EntityPresenceManager entityPresenceManager) {
        1GU.A00(entityPresenceManager.A02);
        Set set = entityPresenceManager.A08;
        02W.A04(AnonymousClass001.A1P(set.size()));
        long j = ((I3v) set.iterator().next()).A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long j2 = ((I3v) it.next()).A03;
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public static RyE A01(EntityPresenceManager entityPresenceManager) {
        C00i c00i = entityPresenceManager.A0B;
        String A3a = 1BK.A0R(c00i).A3a(1Pf.A01, "");
        String A3a2 = 1BK.A0R(c00i).A3a(1Pf.A02, "");
        if (TextUtils.isEmpty(A3a) || TextUtils.isEmpty(A3a2)) {
            return null;
        }
        return new RyE(new Ryq(A3a, 443, A3a2));
    }

    public static void A02(EntityPresenceManager entityPresenceManager) {
        long A00;
        1GU.A00(entityPresenceManager.A02);
        long j = entityPresenceManager.A00;
        long j2 = -1;
        boolean isEmpty = entityPresenceManager.A08.isEmpty();
        if (j == j2) {
            if (isEmpty) {
                return;
            } else {
                A00 = A00(entityPresenceManager);
            }
        } else if (isEmpty) {
            ((1vU) entityPresenceManager.A06.get()).A02(entityPresenceManager.A07);
            entityPresenceManager.A00 = j2;
            return;
        } else {
            A00 = A00(entityPresenceManager);
            if (entityPresenceManager.A00 <= 1BL.A08(entityPresenceManager.A0A) + A00) {
                return;
            }
        }
        A03(entityPresenceManager, A00);
    }

    public static void A03(EntityPresenceManager entityPresenceManager, long j) {
        C00i c00i = entityPresenceManager.A06;
        1vU r0 = (1vU) c00i.get();
        Runnable runnable = entityPresenceManager.A07;
        r0.A02(runnable);
        ((1vU) c00i.get()).A03(runnable, j);
        entityPresenceManager.A00 = 1BL.A08(entityPresenceManager.A0A) + j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x009e, code lost:
    
        if (java.lang.Math.random() <= (r0 != null ? r0.doubleValue() : X.1BK.A0N(r0).Ai7(37155298221555839L))) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(com.facebook.entitypresence.EntityPresenceManager r301, X.I3v r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.entitypresence.EntityPresenceManager.A04(com.facebook.entitypresence.EntityPresenceManager, X.I3v, java.lang.String):void");
    }

    public static void A05(EntityPresenceManager entityPresenceManager, I3v i3v, String str) {
        String str2;
        1GU.A00(entityPresenceManager.A02);
        QvU qvU = QvU.A02;
        String str3 = i3v.A08;
        String str4 = i3v.A07;
        Long A0j = 4YV.A0j();
        RyE A01 = A01(entityPresenceManager);
        EntityPresenceLogger entityPresenceLogger = (EntityPresenceLogger) entityPresenceManager.A04.get();
        Map map = entityPresenceLogger.A03;
        String A0b = AnonymousClass001.A0b(i3v, map);
        Map map2 = entityPresenceLogger.A05;
        List list = (List) map2.get(i3v);
        Ryn ryn = null;
        if (A0b != null && list != null) {
            long A00 = EntityPresenceLogger.A00(entityPresenceLogger, i3v);
            try {
                JSONObject put = AnonymousClass001.A12().put("action", "leave").put("client_subscription_id", A0b).put("sequence_id", A00).put("gateway_connected", entityPresenceLogger.A02.A03() ? 1 : 0).put("client_time_ms", EntityPresenceLogger.A01(entityPresenceLogger, i3v).A00()).put("action_reason", str);
                list.add(put.toString());
                str2 = "com.facebook.entitypresence.EntityPresenceLogger";
                0fH.A0d(str4, put.toString(), str2, "Adding entity id: %s, json string: %s");
            } catch (JSONException e) {
                str2 = "com.facebook.entitypresence.EntityPresenceLogger";
                0fH.A0r(str2, "Json serialize failed", e);
            }
            0fH.A0g(list, str2, "sendLogToServer: %s");
            1UG A08 = 1BK.A08(1BK.A07(entityPresenceLogger.A00), "entity_presence_activity_batch");
            if (A08.isSampled()) {
                A08.A7h("events", list);
                A08.BZL();
            }
            map.remove(i3v);
            map2.remove(i3v);
            entityPresenceLogger.A06.remove(i3v);
            entityPresenceLogger.A04.remove(i3v);
            ryn = new Ryn(Long.valueOf(A00), A0b, (Map) null);
        }
        byte[] A07 = A07(new RzW(A01, qvU, ryn, A0j, str3, str4));
        if (A07 != null) {
            A06(entityPresenceManager, i3v.A00, "leave", A07);
        }
    }

    public static void A06(EntityPresenceManager entityPresenceManager, Integer num, String str, byte[] bArr) {
        0fH.A0g(str, "com.facebook.entitypresence.EntityPresenceManager", "%s publishMessage ");
        1GU.A00(entityPresenceManager.A02);
        HZs hZs = (HZs) entityPresenceManager.A0C.get();
        11T.A0F(num, 2);
        0fH.A0g(str, "DefaultEntityPresenceMqttPublisher", "%s publishMessage ");
        7zP.A0N(hZs.A00).AAq();
        ((2At) 1Br.A0B(hZs.A01)).A00(new Iem(str), num, "/t_entity_presence", bArr);
    }

    public static byte[] A07(RzW rzW) {
        C29V A0s = AbK.A0s();
        try {
            byte[] A00 = A0s.A00(new 4Z3(""));
            byte[] A002 = A0s.A00(new RyF(4YV.A0j(), A0s.A00(rzW)));
            int length = A00.length;
            int length2 = A002.length;
            byte[] copyOf = Arrays.copyOf(A00, length + length2);
            System.arraycopy(A002, 0, copyOf, length, length2);
            return copyOf;
        } catch (2LA e) {
            0fH.A0r("com.facebook.entitypresence.EntityPresenceManager", "constructPayload serialize failed", e);
            return null;
        }
    }
}
