package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.omnipicker.OmnipickerActivity;
import com.facebook.messaging.publicchats.creation.newgroupchat.model.CreatePublicChatParams;
import com.facebook.messaging.publicchats.creation.newgroupchat.model.CreatePublicChatSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import kotlin.jvm.functions.Function2;

/* loaded from: Ca3.class */
public final class Ca3 implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public Ca3(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj;
        this.A03 = obj5;
        this.A01 = obj4;
        this.A05 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.BRB, java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ThreadKey threadKey;
        String str;
        ThreadKey A06;
        Activity A1P;
        switch (this.A00) {
            case 0:
                java.util.Map map = (java.util.Map) this.A02;
                map.put(this.A04, obj);
                ((LiveData) this.A05).setValue(((Function2) this.A01).invoke(((0CL) this.A03).element, 04R.A0D(map)));
                return;
            case 1:
                Member member = (Member) obj;
                if (member != null) {
                    1Iw r0 = (1Iw) this.A01;
                    ?? obj2 = new Object();
                    ((BRB) obj2).A00 = member;
                    if (r0.A02 != null) {
                        r0.A0G(7zQ.A0V((Object) obj2, 1), "updateState:ProfileBottomSheetHeaderUnitSection.updateMemberState");
                    }
                    CIh cIh = (CIh) 1Hv.A02(7zL.A0A(r0), 83091);
                    1F9 r02 = (1F9) this.A03;
                    ParcelableSecondaryData parcelableSecondaryData = (ParcelableSecondaryData) this.A02;
                    ThreadSummary threadSummary = (ThreadSummary) this.A05;
                    cIh.A01((threadSummary == null || (threadKey = threadSummary.A0n) == null) ? null : AbF.A14(threadKey), Long.valueOf(CAs.A00(r02, threadSummary, parcelableSecondaryData)), CAs.A01(r02, threadSummary, parcelableSecondaryData), "ANDROID_CM_STAGE_2");
                }
                AbM.A1E(this, this.A04);
                return;
            default:
                CreatePublicChatSummary createPublicChatSummary = (CreatePublicChatSummary) obj;
                6KV r03 = (6KV) ((C01i) this.A04).getValue();
                11T.A0A(r03);
                CfG.A01(this.A03);
                r03.A05(-1);
                String str2 = createPublicChatSummary.A04;
                Long A0n = str2 != null ? 1BK.A0n(str2) : null;
                String str3 = createPublicChatSummary.A03;
                if (!createPublicChatSummary.A05) {
                    Bgc bgc = (Bgc) this.A01;
                    String str4 = createPublicChatSummary.A02;
                    String str5 = createPublicChatSummary.A01;
                    Integer num = createPublicChatSummary.A00;
                    AlD alD = bgc.A00;
                    int i = AlD.A0O;
                    C6mh.A00((C6mh) 1Br.A0B(alD.A0J)).markerEnd(946999519, (short) 3);
                    if (alD.A08) {
                        CQo A0b = AbI.A0b(alD.A0H);
                        BLF blf = alD.A03;
                        if (blf != null) {
                            CQo.A0H(BOn.A0I, A0b, (Long) null, AbL.A0g("entry_point", CQo.A07(blf)), ActionId.RTMP_CONNECTION_RELEASE, 8, CQo.A00(blf));
                        }
                    } else {
                        C1306Adj.A0D(AbM.A0Z(alD.A0I), null, 04R.A09(new 03Y[]{1BK.A1G("error_message", str4), 1BK.A1G(TraceFieldType.ErrorCode, (Object) null), 1BK.A1G("is_network_error", String.valueOf((Object) null))}), 59, 10, 2);
                    }
                    Context requireContext = alD.requireContext();
                    1BV A0R = 7zL.A0R(requireContext, 16979);
                    String A0t = 4YU.A0t(requireContext.getResources(), 2131955211);
                    if (num == null || num.intValue() != 1545126 || str5 == null) {
                        str5 = 4YU.A0t(requireContext.getResources(), 2131955210);
                    }
                    6HM r04 = (6HM) 1Hv.A02(requireContext, 50020);
                    requireContext.getResources();
                    r04.A01(requireContext, new COW((Activity) null, CSG.A00(alD, ActionId.MESSENGER_DELTA_REQUEST), (ServiceException) null, str5, A0t, ((MigColorScheme) A0R.get()).Aho()));
                    return;
                }
                long j = 0;
                if (((CreatePublicChatParams) this.A02).A07) {
                    if (A0n != null) {
                        j = A0n.longValue();
                    }
                    A06 = ThreadKey.A05(j);
                } else {
                    if (A0n != null) {
                        j = A0n.longValue();
                    }
                    A06 = ThreadKey.A06(j);
                }
                11T.A0D(A06);
                AlD alD2 = ((Bgc) this.A01).A00;
                Context requireContext2 = alD2.requireContext();
                int i2 = AlD.A0O;
                C6mh.A00((C6mh) 1Br.A0B(alD2.A0J)).markerEnd(946999519, (short) 2);
                if (alD2.A08) {
                    CQo A0b2 = AbI.A0b(alD2.A0H);
                    long A0r = A06.A0r();
                    BLF blf2 = alD2.A03;
                    if (blf2 != null) {
                        CQo.A0H(BOn.A0I, A0b2, Long.valueOf(A0r), AbL.A0g("entry_point", CQo.A07(blf2)), 8, 8, CQo.A00(blf2));
                    }
                } else {
                    C1306Adj.A04(AbM.A0Z(alD2.A0I), 4YU.A0l(A06), 60, 10, 2);
                }
                if (alD2.A08) {
                    C47 c47 = (C47) 1Bn.A0E(requireContext2, (1BY) null, 82459);
                    FbSharedPreferences A09 = 1Br.A09(c47.A00);
                    1G2 r05 = 1NK.A06;
                    String str6 = ((1EZ) 1Br.A0B(c47.A01)).Aue().mUserId;
                    11T.A0A(str6);
                    if (AbH.A1b(A09, 1G3.A00(1NK.A0t, str6)) && 4YV.A0W(alD2.A0G).AZk(36320279276633357L)) {
                        c47.A00();
                    }
                }
                6HS r06 = (6HS) 1Hv.A02(requireContext2, 50024);
                BLF blf3 = alD2.A03;
                if (blf3 != null) {
                    if (blf3 == BLF.A02) {
                        alD2.A1X();
                        alD2.A1Y();
                        r06.A07(A06, "BiiM Broadcast Channel Creation");
                        return;
                    }
                    if (alD2.A08) {
                        r06.A07(A06, "Public Broadcast Channel Creation");
                    } else {
                        r06.A07(A06, "Public Chat Creation");
                        if (str3 != null) {
                            C96j c96j = alD2.A08 ? C96j.A05 : C96j.A06;
                            String str7 = alD2.A07;
                            if (str7 == null) {
                                str = "threadName";
                                11T.A0L(str);
                                throw 0Q8.createAndThrow();
                            }
                            CQN.A01(requireContext2, (Uri) null, c96j, A06, 4YV.A0j(), str3, str7, "chat_creation_sheet", "public_chats_invite_member_button", (String) null, (String) null, (String) null, true, true);
                        }
                    }
                    if (AnonymousClass016.A00(alD2.getContext(), OmnipickerActivity.class) == null || (A1P = alD2.A1P()) == null) {
                        return;
                    }
                    A1P.finish();
                    return;
                }
                str = "entryPoint";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
        }
    }
}
