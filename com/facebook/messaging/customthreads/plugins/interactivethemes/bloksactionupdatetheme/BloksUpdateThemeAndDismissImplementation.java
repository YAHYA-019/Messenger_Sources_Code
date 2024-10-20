package com.facebook.messaging.customthreads.plugins.interactivethemes.bloksactionupdatetheme;

import X.0Pz;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Fj;
import X.1Hz;
import X.1Lm;
import X.1UG;
import X.1Um;
import X.1VX;
import X.1X9;
import X.2Jd;
import X.2Jf;
import X.2rT;
import X.4YU;
import X.4uZ;
import X.5Dh;
import X.5P8;
import X.5Q2;
import X.5QA;
import X.5iG;
import X.6NA;
import X.7zL;
import X.7zN;
import X.9Qa;
import X.AbstractC00603o4;
import X.AbstractC05414dq;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C01643sd;
import X.C2487Gei;
import X.C2ga;
import X.C5fm;
import X.C5gA;
import X.CyV;
import X.DKc;
import X.DLQ;
import X.DgU;
import X.EUl;
import X.FHh;
import X.Q7t;
import X.QXX;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.user.model.User;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: BloksUpdateThemeAndDismissImplementation.class */
public final class BloksUpdateThemeAndDismissImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final Context A03;

    public BloksUpdateThemeAndDismissImplementation(Context context) {
        11T.A0F(context, 1);
        this.A03 = context;
        this.A01 = 1Bq.A00(66266);
        this.A00 = 1Bq.A00(50079);
        this.A02 = 1Bu.A00(68334);
    }

    public final Object A00(FHh fHh, DKc dKc) {
        List list = dKc.A00;
        Object obj = list.get(0);
        11T.A0A(obj);
        DLQ dlq = (DLQ) obj;
        DLQ dlq2 = (DLQ) list.get(1);
        ThreadKey A0K = ThreadKey.A0K(dlq.A0F(), true);
        long j = dlq.getLong(38, -1);
        List<DLQ> Aty = dlq.Aty(35);
        11T.A0A(Aty);
        ArrayList A0z = 1BL.A0z(Aty);
        for (DLQ dlq3 : Aty) {
            String string = dlq3.getString(35);
            String string2 = dlq3.getString(38);
            long j2 = dlq3.getLong(36, 0L);
            2Jd r0 = new 2Jd(95);
            r0.A09("key", string);
            r0.A09("value", string2);
            r0.A09("participant_id", String.valueOf(j2));
            A0z.add(r0);
        }
        int i = dlq.getInt(36, -1);
        String A00 = i != 0 ? i != 5 ? i != 17 ? i != 18 ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : "COMMAND" : "BACKGROUND" : "SETTINGS" : 1BJ.A00(637);
        String string3 = dlq2 != null ? dlq2.getString(36) : null;
        Map map = null;
        if (string3 != null) {
            try {
                map = (Map) ((AnonymousClass244) 1Br.A0B(this.A02)).A0Q(new QXX(), string3);
            } catch (IOException e) {
                0fH.A0r("BloksUpdateThemeAndDismissImplementation", 0Pz.A0W("Failed to deserialize THEME_CONFIG_DATA_JSON: ", string3), e);
            }
        }
        if (A0K != null) {
            if (((2rT) 1Br.A0B(this.A01)).A02(A0K)) {
                5Q2 r02 = (5Q2) 1Lm.A05(this.A03, EUl.A00(fHh), 68485);
                ThreadKey A002 = C2ga.A00(A0K);
                List<DLQ> Aty2 = dlq.Aty(35);
                11T.A0A(Aty2);
                ImmutableList.Builder A0h = 4YU.A0h();
                for (DLQ dlq4 : Aty2) {
                    ImmutableMap.Builder builder = new ImmutableMap.Builder();
                    String valueOf = String.valueOf(dlq4.getString(35));
                    String valueOf2 = String.valueOf(dlq4.getString(38));
                    String valueOf3 = String.valueOf(dlq4.getLong(36, 0L));
                    builder.put("key", valueOf);
                    builder.put("value", valueOf2);
                    builder.put("participant_id", valueOf3);
                    A0h.m11011add((Object) builder.build());
                }
                ImmutableList A01 = 1Fj.A01(A0h);
                if (!ThreadKey.A0k(A002) && !ThreadKey.A0a(A002) && !ThreadKey.A0c(A002) && !ThreadKey.A0R(A002)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Update the Thread Theme not supported for thread type: ");
                    throw new UnsupportedOperationException(AnonymousClass001.A0a(A002.A06, A0k));
                }
                C5fm c5fm = (C5fm) r02.A02.get();
                boolean A02 = ((C5gA) c5fm.A0O.get()).A02();
                Object obj2 = c5fm.A0G.get();
                if (A02) {
                    c5fm.A0P.get();
                    ((5P8) obj2).A0H(5QA.A00(A002), A01, j);
                } else {
                    MailboxFeature mailboxFeature = (MailboxFeature) obj2;
                    long A0s = A002.A0s();
                    1Um A0O = 1BK.A0O(mailboxFeature, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    int A003 = 4uZ.A00(A0P, (1X9) null);
                    TraceInfo A022 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "updateThemeForThread");
                    if (!A0O.Cj2(new CyV(A003, 5, j, A0s, mailboxFeature, A01, A0P))) {
                        A0P.cancel(false);
                        4uZ.A03(A003);
                        4uZ.A05((LoggingOption) null, A022, "MailboxSDK", "updateThemeForThread");
                    }
                    PlatformLogger.platformEventLog(5);
                }
            } else {
                FbUserSession A004 = EUl.A00(fHh);
                Context context = this.A03;
                9Qa r03 = (9Qa) 1Lm.A05(context, A004, 68605);
                ThreadKey A005 = C2ga.A00(A0K);
                TextUtils.isEmpty(A00);
                GraphQlCallInput dgU = new DgU(39);
                dgU.A09("actor_id", ((User) r03.A02.get()).A13);
                dgU.A09(Property.SYMBOL_Z_ORDER_SOURCE, A00);
                dgU.A0A("payload", A0z);
                dgU.A09("theme_id", String.valueOf(j));
                dgU.A09("thread_id", 1BK.A0w(A005));
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A01(dgU, "input");
                C01643sd c01643sd = new C01643sd(Q7t.class, "ThreadThemeMutation", null, "input", "fbandroid", 2010636986, 192, 3149855292L, 3149855292L, false, true);
                ((2Jf) c01643sd).A00 = A0M;
                1Hz r04 = new 1Hz();
                r04.A05(110746355);
                r04.A07();
                5Dh r05 = new 5Dh(c01643sd);
                AbstractC05414dq A09 = 1VX.A09(context, r03.A00);
                4YU.A1J(r05, 442780740380519L);
                ((5iG) 1Bn.A0A(49829)).A04(new C2487Gei(context, r03, 6), A09.A06(r05), "thread_theme_mutation_key");
            }
        }
        if (map == null) {
            return null;
        }
        1UG A08 = 1BK.A08(1BK.A07(((6NA) 1Br.A0B(this.A00)).A00), AbstractC00603o4.A00(11));
        if (!A08.isSampled()) {
            return null;
        }
        A08.A7R("picker_location", "chat_theme_configuration");
        7zN.A15(A08);
        A08.A7R("thread_key", A0K != null ? A0K.A0u() : null);
        A08.A7R("new_theme_color", String.valueOf(j));
        A08.A6J("theme_config_data", map);
        A08.BZL();
        return null;
    }
}
