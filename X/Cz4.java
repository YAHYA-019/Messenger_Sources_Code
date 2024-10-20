package X;

import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.CommunityNewBadgeStatus;
import com.facebook.messaging.communitymessaging.model.MemberRequestApprovalSetting;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Cz4.class */
public final class Cz4 implements MailboxCallback {
    public Function1 A00;
    public final 1Br A01 = 1Bq.A00(46);

    @Override // com.facebook.msys.mca.MailboxCallback
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void onCompletion(MailboxNullable mailboxNullable) {
        ImmutableList of;
        String str;
        List A19;
        Long nullableLong;
        Integer nullableInteger;
        Integer nullableInteger2;
        11T.A0F(mailboxNullable, 0);
        1qX r0 = (1qX) mailboxNullable.value;
        ImmutableList immutableList = null;
        if (r0 == null) {
            0fH.A0j("CommunityListObserverCallback", "Received null community folders result");
        } else {
            1BQ A02 = 1BQ.A02(65723);
            0fH.A0j("CommunityListObserverCallback", 0Pz.A0T("Processing the community folders list with size: ", 1qX.A00(r0)));
            07E A0w = 7zR.A0w(r0);
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = A0w.iterator();
            while (it.hasNext()) {
                int A06 = 7zL.A06(it);
                long A03 = AbF.A03(r0, A06, 0);
                boolean booleanValue = AbK.A11(r0.mResultSet, A06, 14, false).booleanValue();
                long j = r0.mResultSet.getLong(A06, 13);
                boolean z = !booleanValue;
                int integer = r0.mResultSet.getInteger(A06, 30);
                int i = 0;
                if (z && 4SF.A00(Integer.valueOf(integer)) == 0S2.A00 && (nullableInteger2 = r0.mResultSet.getNullableInteger(A06, 54)) != null) {
                    i = nullableInteger2.intValue();
                }
                int i2 = 0;
                if (z && 4SF.A00(Integer.valueOf(integer)) == 0S2.A00 && (nullableInteger = r0.mResultSet.getNullableInteger(A06, 53)) != null) {
                    i2 = nullableInteger.intValue();
                }
                int i3 = i + i2;
                String A0j = 7zP.A0j(r0, A06);
                int A0G = (int) 7zQ.A0G(r0, A06);
                int i4 = (int) r0.mResultSet.getLong(A06, 29);
                Integer nullableInteger3 = r0.mResultSet.getNullableInteger(A06, 17);
                int intValue = nullableInteger3 != null ? nullableInteger3.intValue() : C20E.A05.value;
                Integer nullableInteger4 = r0.mResultSet.getNullableInteger(A06, 50);
                if (nullableInteger4 == null) {
                    nullableInteger4 = null;
                }
                String string = r0.mResultSet.getString(A06, 32);
                int A04 = AbL.A04(r0.mResultSet, A06, 31);
                String string2 = r0.mResultSet.getString(A06, 34);
                Long nullableLong2 = r0.mResultSet.getNullableLong(A06, 33);
                int longValue = nullableLong2 != null ? (int) nullableLong2.longValue() : 0;
                int longValue2 = (!((1XZ) A02.get()).BUJ() || (nullableLong = r0.mResultSet.getNullableLong(A06, 55)) == null) ? 0 : (int) nullableLong.longValue();
                Integer nullableInteger5 = r0.mResultSet.getNullableInteger(A06, 59);
                if (nullableInteger5 == null) {
                    nullableInteger5 = 0;
                }
                int intValue2 = nullableInteger5.intValue();
                String string3 = r0.mResultSet.getString(A06, 57);
                if (string3 == null || (A19 = 4YU.A19(string3, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) == null) {
                    of = ImmutableList.of();
                } else {
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    Iterator it2 = A19.iterator();
                    while (it2.hasNext()) {
                        Long A0e = 0CW.A0e(4YU.A13(AnonymousClass001.A0i(it2)));
                        if (A0e != null) {
                            builder2.add(A0e);
                        }
                    }
                    of = builder2.build();
                }
                11T.A0A(of);
                Integer nullableInteger6 = r0.mResultSet.getNullableInteger(A06, 58);
                if (nullableInteger6 == null) {
                    nullableInteger6 = 0;
                }
                int size = of.size() + nullableInteger6.intValue();
                Integer nullableInteger7 = r0.mResultSet.getNullableInteger(A06, 40);
                Integer num = null;
                if (nullableInteger7 != null) {
                    num = nullableInteger7;
                }
                Integer A00 = 6EQ.A00(num);
                Integer nullableInteger8 = r0.mResultSet.getNullableInteger(A06, 44);
                Integer num2 = null;
                if (nullableInteger8 != null) {
                    num2 = nullableInteger8;
                }
                Integer A002 = AbstractC1290Acw.A00(num2);
                int A042 = AbL.A04(r0.mResultSet, A06, 45);
                Integer nullableInteger9 = r0.mResultSet.getNullableInteger(A06, 46);
                Integer num3 = null;
                if (nullableInteger9 != null) {
                    num3 = nullableInteger9;
                }
                Integer A003 = AbstractC1289Acu.A00(num3);
                int A043 = AbL.A04(r0.mResultSet, A06, 51);
                HashSet A0v = AnonymousClass001.A0v();
                str = "";
                String valueOf = String.valueOf(A03);
                AbF.A1T(valueOf);
                String valueOf2 = String.valueOf(7zQ.A0E(r0, A06));
                C1pq.A08("groupId", valueOf2);
                AbF.A1U(A0j);
                String A032 = ((0AC) 1Br.A0B(this.A01)).A03(r0.mResultSet.getNullableLong(A06, 6), String.valueOf(7zP.A0k(r0, A06)), String.valueOf(7zP.A0l(r0, A06)));
                if (A032 == null) {
                    A032 = str;
                }
                String A0v2 = 7zP.A0v(r0, A06);
                C20E c20e = (C20E) ((java.util.Map) C20E.A00.getValue()).get(Integer.valueOf(intValue));
                C20M c20m = (C20M) ((java.util.Map) C20M.A00.getValue()).get(nullableInteger4);
                Long nullableLong3 = r0.mResultSet.getNullableLong(A06, 24);
                int longValue3 = nullableLong3 != null ? (int) nullableLong3.longValue() : -1;
                Long nullableLong4 = r0.mResultSet.getNullableLong(A06, 28);
                String string4 = r0.mResultSet.getString(A06, 23);
                str = string4 != null ? string4 : "";
                Long nullableLong5 = r0.mResultSet.getNullableLong(A06, 39);
                if (nullableLong5 == null) {
                    nullableLong5 = 4YV.A0j();
                }
                long longValue4 = nullableLong5.longValue();
                Integer nullableInteger10 = r0.mResultSet.getNullableInteger(A06, 35);
                if (nullableInteger10 == null) {
                    nullableInteger10 = null;
                }
                MemberRequestApprovalSetting memberRequestApprovalSetting = (MemberRequestApprovalSetting) MemberRequestApprovalSetting.A00.get(nullableInteger10);
                if (memberRequestApprovalSetting == null) {
                    memberRequestApprovalSetting = MemberRequestApprovalSetting.A03;
                }
                HashSet A0z = 4YV.A0z("memberRequestApprovalSetting", A0v, A0v);
                Integer nullableInteger11 = r0.mResultSet.getNullableInteger(A06, 36);
                if (nullableInteger11 == null) {
                    nullableInteger11 = null;
                }
                CommunityNewBadgeStatus communityNewBadgeStatus = (CommunityNewBadgeStatus) CommunityNewBadgeStatus.A00.get(nullableInteger11);
                if (communityNewBadgeStatus == null) {
                    communityNewBadgeStatus = CommunityNewBadgeStatus.A03;
                }
                HashSet A10 = 4YV.A10("communityNewBadgeStatus", A0z);
                C1pq.A08("groupParticipationApprovalStatus", A00);
                HashSet A102 = 4YV.A10("groupParticipationApprovalStatus", A10);
                Integer nullableInteger12 = r0.mResultSet.getNullableInteger(A06, 42);
                if (nullableInteger12 == null) {
                    nullableInteger12 = null;
                }
                AdF adF = (AdF) AdF.A00.get(nullableInteger12);
                if (adF == null) {
                    adF = AdF.A03;
                }
                HashSet A103 = 4YV.A10("communityChatsAdminAssistRegistrationStatus", A102);
                Long nullableLong6 = r0.mResultSet.getNullableLong(A06, 43);
                if (nullableLong6 == null) {
                    nullableLong6 = 4YV.A0i();
                }
                long longValue5 = nullableLong6.longValue();
                C1pq.A08("attachEventToChatPermission", A002);
                HashSet A104 = 4YV.A10("attachEventToChatPermission", A103);
                C1pq.A08("pauseStatus", A003);
                builder.add(new Community(adF, AbstractC1288Act.A00(r0.mResultSet.getNullableInteger(A06, 41)), c20e, null, c20m, communityNewBadgeStatus, memberRequestApprovalSetting, null, null, A002, A00, A003, nullableLong4, null, str, string, valueOf2, valueOf, A0v2, A0j, A032, string2, 4YV.A10("pauseStatus", A104), i4, size, longValue, i, longValue3, integer, intValue2, A0G, longValue2, A043, A042, A04, i3, longValue4, j, longValue5, 0L, 0L, booleanValue, AbK.A11(r0.mResultSet, A06, 52, false).booleanValue()));
            }
            immutableList = 1Fj.A01(builder);
        }
        Function1 function1 = this.A00;
        if (function1 != null) {
            function1.invoke(immutableList);
        } else {
            11T.A0L("resultReceiver");
            throw 0Q8.createAndThrow();
        }
    }
}
