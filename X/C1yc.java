package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.communitymessaging.model.MessengerJoinRequestApprovalSetting;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupApprovalInfo;
import com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup;
import com.facebook.messaging.model.threads.GroupThreadAssociatedObject;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.JoinableInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1yc, reason: invalid class name */
/* loaded from: 1yc.class */
public abstract class C1yc {
    public static final Set A03;
    public static final Set A04;
    public final 0AC A00;
    public final 1Ih A01;
    public final C15h A02;

    static {
        Integer valueOf = Integer.valueOf(ActionId.APPLY_FINISHED_LIST_AGAIN);
        Integer valueOf2 = Integer.valueOf(ActionId.APPLY_OPTIMISTICS);
        Integer valueOf3 = Integer.valueOf(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE);
        Integer valueOf4 = Integer.valueOf(ActionId.FUTURE_LISTENERS_COMPLETE);
        Integer valueOf5 = Integer.valueOf(ActionId.APPLY_FINISHED_LIST);
        A04 = new HashSet(Arrays.asList(150, valueOf, valueOf2, valueOf3, valueOf4, valueOf5));
        A03 = new HashSet(Arrays.asList(19, 22, 24, valueOf3, valueOf4, valueOf5));
    }

    public C1yc(0AC r302, 1Ih r303, C15h c15h) {
        this.A02 = c15h;
        this.A00 = r302;
        this.A01 = r303;
    }

    public static final ImmutableSet A02(Integer num, Integer num2) {
        EnumC00893pQ enumC00893pQ;
        java.util.Map map;
        EnumC00893pQ enumC00893pQ2;
        1I0 r0 = new 1I0(4);
        if (num != null) {
            int intValue = num.intValue();
            map = CommunityChannelPrivacyType.reverseMap;
            CommunityChannelPrivacyType communityChannelPrivacyType = (CommunityChannelPrivacyType) map.get(Integer.valueOf(intValue));
            if (communityChannelPrivacyType == null) {
                communityChannelPrivacyType = CommunityChannelPrivacyType.PUBLIC;
            }
            switch (communityChannelPrivacyType.ordinal()) {
                case 0:
                    enumC00893pQ2 = EnumC00893pQ.A07;
                    break;
                case 1:
                    enumC00893pQ2 = EnumC00893pQ.A02;
                    break;
                case 2:
                    enumC00893pQ2 = EnumC00893pQ.A03;
                    break;
                case 3:
                    enumC00893pQ2 = EnumC00893pQ.A08;
                    break;
                case 4:
                    enumC00893pQ2 = EnumC00893pQ.A06;
                    break;
                case 5:
                    enumC00893pQ2 = EnumC00893pQ.A04;
                    break;
                default:
                    throw 1BK.A1F();
            }
            r0.add(enumC00893pQ2);
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 == 21 || intValue2 == 22) {
                enumC00893pQ = EnumC00893pQ.A06;
            } else if (intValue2 == 23 || intValue2 == 24) {
                enumC00893pQ = EnumC00893pQ.A04;
            }
            r0.add(enumC00893pQ);
        }
        ImmutableSet A07 = r0.A07();
        11T.A0A(A07);
        return A07;
    }

    private void A03(C1zm c1zm, Boolean bool, Boolean bool2, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, int i) {
        GroupThreadAssociatedObject groupThreadAssociatedObject;
        Uri uri;
        MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting;
        long longValue = l2 != null ? l2.longValue() : -1;
        21A r0 = new 21A();
        r0.A0F = false;
        r0.A0C = "CHAT_V2";
        if (l == null) {
            groupThreadAssociatedObject = null;
        } else {
            long longValue2 = l.longValue();
            GroupThreadAssociatedFbGroup groupThreadAssociatedFbGroup = new GroupThreadAssociatedFbGroup(3pJ.A05, null, null, 0, 0, longValue2, false);
            String str5 = EnumC00873pL.A03.typeName;
            str5.getClass();
            groupThreadAssociatedObject = new GroupThreadAssociatedObject(groupThreadAssociatedFbGroup, str5, longValue2);
        }
        r0.A04 = groupThreadAssociatedObject;
        r0.A0A = str2;
        21B r02 = 21B.A02;
        GroupApprovalInfo groupApprovalInfo = new GroupApprovalInfo(ImmutableList.of());
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        if (str != null) {
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
                uri = null;
            }
        } else {
            uri = null;
        }
        r0.A06 = new JoinableInfo(uri, null, groupApprovalInfo, r02, null, false, z);
        Boolean bool3 = true;
        r0.A05 = bool3.equals(bool) ? 21E.A02 : 21E.A03;
        MessengerJoinRequestApprovalSetting[] values = MessengerJoinRequestApprovalSetting.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                messengerJoinRequestApprovalSetting = MessengerJoinRequestApprovalSetting.A04;
                break;
            }
            messengerJoinRequestApprovalSetting = values[i2];
            int i3 = messengerJoinRequestApprovalSetting.value;
            if (num != null && i3 == num.intValue()) {
                break;
            } else {
                i2++;
            }
        }
        r0.A03 = messengerJoinRequestApprovalSetting;
        r0.A0G = Boolean.TRUE.equals(bool2);
        r0.A00 = longValue;
        r0.A01(str3);
        r0.A0B = str4;
        c1zm.A04(new GroupThreadData(r0));
    }

    private void A04(C1zm c1zm, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, int i) {
        Uri uri;
        21A r0 = new 21A();
        r0.A0F = true;
        Boolean bool3 = true;
        r0.A05 = bool3.equals(bool) ? 21E.A02 : 21E.A03;
        21B r02 = 21B.A02;
        GroupApprovalInfo groupApprovalInfo = new GroupApprovalInfo(ImmutableList.of());
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        if (str != null) {
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
                uri = null;
            }
        } else {
            uri = null;
        }
        r0.A06 = new JoinableInfo(uri, null, groupApprovalInfo, r02, null, false, z);
        r0.A0C = "GROUP";
        r0.A0A = str2;
        r0.A0G = Boolean.TRUE.equals(bool2);
        r0.A0B = str3;
        r0.A01(str4);
        c1zm.A04(new GroupThreadData(r0));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public static void A05(C1zm c1zm, Integer num) {
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 5) {
                switch (intValue) {
                    case 150:
                    case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                        graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A08;
                        break;
                    case ActionId.APPLY_OPTIMISTICS /* 152 */:
                    case ActionId.APPLY_FINISHED_LIST /* 153 */:
                        graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A07;
                        break;
                    case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                    case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                        graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A09;
                        break;
                    default:
                        return;
                }
            } else {
                graphQLMessengerGroupThreadSubType = GraphQLMessengerGroupThreadSubType.A0C;
            }
            c1zm.A0Y = graphQLMessengerGroupThreadSubType;
        }
    }

    public ThreadKey A06(C1yd c1yd) {
        C37j c37j = (C37j) this;
        Integer A01 = c1yd.A01();
        if (A01 == null) {
            throw 1BK.A0h();
        }
        return C37j.A00(c37j, c1yd.A02(), A01.intValue());
    }

    public ThreadKey A07(5pK r302) {
        if (this instanceof C1yb) {
            Integer num = r302.A0r;
            num.getClass();
            return C1yb.A00((C1yb) this, r302.A0u, num.intValue(), Long.parseLong(r302.A1N));
        }
        if (this instanceof C21Y) {
            String str = r302.A1N;
            return C21a.A00(r302.A0O, r302.A0r, str);
        }
        C37j c37j = (C37j) this;
        Integer num2 = r302.A0r;
        if (num2 == null) {
            throw 1BK.A0h();
        }
        int intValue = num2.intValue();
        String str2 = r302.A1N;
        11T.A0A(str2);
        return C37j.A00(c37j, str2, intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0a6f, code lost:
    
        if (r0.booleanValue() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ec, code lost:
    
        if (r323 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ef, code lost:
    
        r0 = r304.getString(r315, 0);
        X.11T.A0A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        if (((com.facebook.user.model.User) r0.get()).A13.equals(r0) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0122, code lost:
    
        r325 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0125, code lost:
    
        r0 = r304.getString(r315, 0);
        X.11T.A0A(r0);
        r0 = java.lang.Long.valueOf(java.lang.Long.parseLong(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014b, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014e, code lost:
    
        r0 = (com.facebook.user.model.User) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x015c, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015f, code lost:
    
        r314 = X.C1z0.A00(r0, null, null, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x13b0, code lost:
    
        if (r314 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x017c, code lost:
    
        r0 = new X.C1zJ();
        r0.A01(r314);
        r0.A02(X.C1z0.A01(java.lang.Integer.valueOf(r304.getInteger(r315, 9))));
        r0.A01 = r304.getLong(r315, 7);
        r0.A02 = r304.getLong(r315, 6);
        r0.A03 = r304.getLong(r315, 6);
        r0.A04 = r304.getLong(r315, 8);
        r0.A0H = r304.getBoolean(r315, 10);
        r0.A0C = r304.getString(r315, 5);
        r0 = r304.getInteger(r315, 11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x022e, code lost:
    
        if (r0 == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0238, code lost:
    
        if (r0 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x023b, code lost:
    
        r314 = X.0S2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0240, code lost:
    
        r0.A0A = r314;
        X.C1zJ.A00(r0, "groupParticipantJoinState");
        r0 = r304.getNullableInteger(r315, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0261, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0264, code lost:
    
        r314 = X.1zR.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x026d, code lost:
    
        if (r314 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0270, code lost:
    
        r0.A07 = r314;
        X.C1zJ.A00(r0, "reachabilityStatusType");
        r0 = new com.facebook.messaging.model.threads.ThreadParticipant(r0);
        r0 = r304.getString(r315, 0);
        X.11T.A0A(r0);
        r0.put(r0, r0);
        r0.m11011add((java.lang.Object) r0);
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02bd, code lost:
    
        if (r315 < 0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02cc, code lost:
    
        if (r315 >= r304.getCount()) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02d2, code lost:
    
        r314 = X.1M1.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02da, code lost:
    
        r314 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e2, code lost:
    
        r314 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02ea, code lost:
    
        r0 = new X.3pI();
        r0 = r304.getString(r315, 0);
        X.11T.A0A(r0);
        r0.A09 = new com.facebook.user.model.UserKey(X.1Js.A03, r0);
        r0 = r304.getNullableInteger(r315, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0330, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0333, code lost:
    
        r321 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x033a, code lost:
    
        r0 = java.lang.Integer.valueOf(r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0343, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0346, code lost:
    
        r321 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x034d, code lost:
    
        r0 = java.lang.Integer.valueOf(r321).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0362, code lost:
    
        if (r0 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x036c, code lost:
    
        if (r0 == 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x036f, code lost:
    
        r314 = X.C1z1.NOT_BLOCKED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0374, code lost:
    
        r0.A08 = r314;
        r0.A0D = r304.getString(r315, 13);
        r0.A01(r304.getNullableInteger(r315, 14));
        r0.A02(r304.getNullableLong(r315, 15));
        r314 = r0.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03c2, code lost:
    
        r314 = X.C1z1.FULLY_BLOCKED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03ca, code lost:
    
        r314 = X.C1z1.BLOCKED_ON_MESSENGER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03d2, code lost:
    
        r321 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03db, code lost:
    
        r321 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0474, code lost:
    
        if (r304.getCount() > 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0477, code lost:
    
        r0 = r304.getString(r321, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0488, code lost:
    
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x048b, code lost:
    
        r0 = r304.getString(r321, 0);
        X.11T.A0A(r0);
        r0.put(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04a8, code lost:
    
        r321 = r321 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x04b0, code lost:
    
        if (r321 < 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x04bf, code lost:
    
        if (r321 >= r304.getCount()) goto L399;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x1034  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x105e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x10fe  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1132  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x11c3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x123c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x127e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x12de  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x15cc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x15f0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x18af  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1603  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1644  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x167f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x16da  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x16fd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1967  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x19aa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x19ee  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1a45  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1a76  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1ab1  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x1aec  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1705  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x170f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x1420  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x1426  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1441  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x145c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1477  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x1491  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x14bd  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x14c6  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x14d8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x14e1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x14ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.21G A08(X.C1yd r302) {
        /*
            Method dump skipped, instructions count: 7016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1yc.A08(X.1yd):X.21G");
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0e5c, code lost:
    
        if (r0.booleanValue() == false) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0fd3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x100f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x103c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1081  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1197  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1216  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x1230  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x124a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x1284  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x12d5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x154d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x162b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1695  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x16af  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1719  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x14ed  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x142e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1437  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x1440  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1449  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x1452  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x147c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x1486  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x1490  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.21G A09(X.5pK r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 6253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1yc.A09(X.5pK, java.util.Map):X.21G");
    }

    public String A0A(C1yd c1yd, String str, boolean z) {
        return str;
    }

    public boolean A0B() {
        return false;
    }
}
