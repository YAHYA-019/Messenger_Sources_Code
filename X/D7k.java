package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.contacts.ranking.logging.ScoreLoggingItem;
import com.facebook.messaging.internalprefs.presence.MessengerInternalPresenceDebugActivity;
import com.facebook.user.model.User;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: D7k.class */
public final class D7k implements Runnable {
    public static final String __redex_internal_original_name = "MessengerInternalPresenceDebugActivity$filterAndRenderUsersToListItems$1";
    public final /* synthetic */ MessengerInternalPresenceDebugActivity A00;
    public final /* synthetic */ List A01;

    public D7k(MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity, List list) {
        this.A00 = messengerInternalPresenceDebugActivity;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2TM r302;
        D3Y d3y;
        ImmutableList of;
        MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity = this.A00;
        6QB r0 = (6QB) 1Bu.A06(messengerInternalPresenceDebugActivity, 50092);
        FbUserSession fbUserSession = (FbUserSession) messengerInternalPresenceDebugActivity.A0I.getValue();
        List list = this.A01;
        2To r02 = 2To.A0A;
        DAo dAo = DAo.A00;
        try {
            6QB.A03(r0, 1BJ.A00(216));
            AbG.A0B(r0.A02).AAr("MessagingItemRanker must not be called on the UI thread");
            if (list == null || list.isEmpty()) {
                r302 = 2TM.A03;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
                for (Object obj : list) {
                    8Lt r03 = (8Lt) obj;
                    11T.A0F(r03, 0);
                    String A1A = AbF.A1A((User) r03.A03);
                    if (!linkedHashMap.containsKey(A1A)) {
                        linkedHashMap.put(A1A, obj);
                    }
                }
                6QB.A02(r0, r02, 1BJ.A00(213), (String) null);
                2Ts r04 = (2Ts) 1Lo.A04((Context) null, fbUserSession, r0.A00, 66490);
                2Tx A00 = r04.A00(r02);
                if (A00 == null || A00.A01.isEmpty()) {
                    A00 = AbO.A0A(r0, r04, r02);
                } else {
                    6QB.A02(r0, r02, "ranking score fetch ended", "cache");
                }
                ImmutableMap A002 = 2xS.A00(A00);
                6QB.A03(r0, 1BJ.A00(215));
                ImmutableList.Builder builder = ImmutableList.builder();
                ImmutableList.Builder builder2 = ImmutableList.builder();
                ImmutableList.Builder builder3 = ImmutableList.builder();
                ImmutableList.Builder builder4 = ImmutableList.builder();
                ImmutableList immutableList = A00.A01;
                int size = immutableList.size();
                for (int i = 0; i < size; i++) {
                    2Va r05 = (2Va) immutableList.get(i);
                    if (linkedHashMap.containsKey(((2Vb) r05).A04)) {
                        String str = ((2Vb) r05).A04;
                        Object remove = linkedHashMap.remove(str);
                        3MG r06 = new 3MG();
                        r06.A03 = r05.A00;
                        r06.A00 = ((2Vb) r05).A00;
                        2Va r07 = (2Va) A002.get(str);
                        if (r07 == null) {
                            of = ImmutableList.of();
                        } else {
                            BpL bpL = new BpL();
                            String lowerCase = ((2Vb) r07).A03.loggingName.toLowerCase(Locale.US);
                            bpL.A02 = lowerCase;
                            C1pq.A08(1BJ.A00(2013), lowerCase);
                            bpL.A00 = ((2Vb) r07).A00;
                            bpL.A01 = ((2Vb) r07).A01;
                            of = ImmutableList.of((Object) new ScoreLoggingItem(bpL));
                        }
                        r06.A01 = of;
                        C1pq.A08(1BJ.A00(532), of);
                        RankingLoggingItem rankingLoggingItem = new RankingLoggingItem(r06);
                        if (((C1n) r0.A03.get()).A00() && ((2Vb) r05).A00 == 0.0f) {
                            builder3.m11011add(remove);
                            builder4.m11011add((Object) rankingLoggingItem);
                        } else {
                            builder.m11011add(remove);
                            builder2.m11011add((Object) rankingLoggingItem);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    3MG r08 = new 3MG();
                    r08.A03 = A00.A02;
                    r08.A00 = 0.0f;
                    builder2.addAll(Collections.nCopies(linkedHashMap.values().size(), new RankingLoggingItem(r08)));
                    ArrayList A17 = 1BK.A17(linkedHashMap.values());
                    Collections.sort(A17, dAo);
                    Iterator it = A17.iterator();
                    while (it.hasNext()) {
                        AbH.A1V(builder, it);
                    }
                }
                AbG.A1U(builder4, builder2);
                AbG.A1U(builder3, builder);
                2TM r09 = 2TM.A03;
                new 2TM(builder.build(), builder2.build(), A00.A02);
                6QB.A03(r0, 1BJ.A00(214));
            }
            6QB.A03(r0, "ranking ended");
            r0.A01 = null;
            1qE A003 = 1qE.A00(r302.A00);
            int intValue = messengerInternalPresenceDebugActivity.A02.intValue();
            if (intValue == 2) {
                d3y = Predicates.ObjectPredicate.ALWAYS_TRUE;
            } else if (intValue == 0) {
                d3y = new D3Y(messengerInternalPresenceDebugActivity, 8);
            } else {
                if (intValue != 1) {
                    throw 1BK.A1F();
                }
                d3y = messengerInternalPresenceDebugActivity.A0H;
            }
            1qE A02 = A003.A03(d3y).A02(messengerInternalPresenceDebugActivity.A0E);
            11T.A0A(A02);
            4YV.A11(messengerInternalPresenceDebugActivity.A0A).execute(new D7j(messengerInternalPresenceDebugActivity, 1BL.A0a(0QD.A0S(A02))));
        } catch (Throwable th) {
            6QB.A03(r0, "ranking ended");
            r0.A01 = null;
            throw th;
        }
    }
}
