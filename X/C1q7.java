package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.messaging.magicwords.model.MagicWordRange;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.EphemeralMediaData;
import com.facebook.messaging.model.attachment.EphemeralMediaState;
import com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData;
import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.MessengerCallLogProperties;
import com.facebook.messaging.model.mms.MmsData;
import com.facebook.messaging.model.platformmetadata.types.persona.MessagePersonaPlatformMetadata;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.model.share.ShareMedia;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;
import com.facebook.xapp.messaging.threadview.model.note.NoteMetadata;
import com.facebook.xapp.messaging.threadview.model.writewithai.WriteWithAiMetadata;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1q7, reason: invalid class name */
/* loaded from: 1q7.class */
public final class C1q7 {
    public static final ImmutableList A07 = ImmutableList.of((Object) "PAYMENT_RECEIVED", (Object) "APPOINTMENT_BOOKED", (Object) "ORDER_PLACED", (Object) "ORDER_SHIPPED");
    public static final ImmutableSet A08 = ImmutableSet.A03(C1q8.A0N, C1q8.A0M, C1q8.A0A);
    public boolean A00 = false;
    public final C00i A01 = new 1BQ(66067);
    public final C00i A02 = new 1BQ(16511);
    public final C00i A03 = new 1BV(82260);
    public final C0et A05 = (C0et) 1Bi.A03(83604);
    public final C00i A04 = new 1BV(68299);
    public final C00i A06 = new 1BQ(66266);

    public static long A00(Message message) {
        long j = message.A04;
        return (j == 0 || j >= message.A05) ? message.A05 : j;
    }

    public static Share A01(Message message) {
        ImmutableList immutableList = message.A10;
        if (!immutableList.isEmpty()) {
            return (Share) 1BK.A0r(immutableList);
        }
        SentShareAttachment sentShareAttachment = message.A0R;
        if (sentShareAttachment != null) {
            return sentShareAttachment.A02;
        }
        return null;
    }

    public static 5gC A02(Message message) {
        72R r313;
        7fK c82c;
        C5qu c5qu = new C5qu();
        c5qu.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        c5qu.A02 = message.A0F().A00;
        ImmutableList immutableList = message.A0u;
        if (immutableList != null && !immutableList.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                MagicWordRange magicWordRange = (MagicWordRange) it.next();
                MagicWord magicWord = magicWordRange.A02;
                A0s.add(new C82g(magicWordRange.A01, magicWordRange.A00, magicWord != null ? magicWord.A02 : "", 1));
            }
            c5qu.A02(5gF.A00, new 82X(A0s, 1));
        }
        5aU A00 = message.A0B().A00();
        if (A00.serverConstant > 0) {
            c5qu.A02(C5gH.A00, new 5vF((82Z) null, A00));
        }
        if (message.A1t) {
            c5qu.A02(C5qw.A00, new WriteWithAiMetadata(true));
        }
        HighlightsTabMetadata highlightsTabMetadata = message.A0m;
        if (highlightsTabMetadata != null) {
            c5qu.A02(C5gJ.A00, highlightsTabMetadata);
        }
        NoteMetadata noteMetadata = message.A0o;
        if (noteMetadata != null) {
            c5qu.A02(C83v.A00, noteMetadata);
        }
        int i = message.A00;
        if (i <= 0) {
            if (message.A13.containsKey(4YT.A00(1252))) {
                r313 = C5g7.A00;
                c82c = new C82c(3EU.A0C.toString(), 0);
            }
            return new 5gC(c5qu);
        }
        c5qu.A02(C5g7.A00, new C82c(3EU.A0A.toString(), 0));
        r313 = 72R.A00;
        c82c = new 7fK(i);
        c5qu.A02(r313, c82c);
        return new 5gC(c5qu);
    }

    public static Integer A03(Message message, C1q7 c1q7) {
        Integer num;
        ImmutableMap immutableMap = message.A14;
        String str = immutableMap != null ? (String) immutableMap.get(AbE.A00(187)) : null;
        if (str == null) {
            return null;
        }
        try {
            String optString = new JSONObject(str).optString(AbE.A00(695));
            if (1JF.A0B(str)) {
                return null;
            }
            Integer[] numArr = 3Hi.A00;
            int length = numArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = null;
                    break;
                }
                num = numArr[i];
                if ((1 - num.intValue() != 0 ? "REACTION" : "REPLY").equalsIgnoreCase(optString)) {
                    break;
                }
                i++;
            }
            return num;
        } catch (JSONException e) {
            1BK.A09(c1q7.A02).softReport("MessageUtil", "Error parsing status reply data", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r303 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A04(com.facebook.messaging.model.messages.GenericAdminMessageInfo r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L3b
            r0 = r301
            java.lang.String r0 = r0.A0I
            r302 = r0
            r0 = 49
            java.lang.String r0 = X.4YT.A00(r0)
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3b
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData r0 = r0.A0E
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L24
            r0 = 0
            r302 = r0
        L24:
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.messaging.model.messages.MessengerPageThreadActionSystemAddDetailsProperty
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3b
            r0 = r302
            com.facebook.messaging.model.messages.MessengerPageThreadActionSystemAddDetailsProperty r0 = (com.facebook.messaging.model.messages.MessengerPageThreadActionSystemAddDetailsProperty) r0
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3f
        L3b:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L3f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A04(com.facebook.messaging.model.messages.GenericAdminMessageInfo):java.lang.String");
    }

    public static String A05(Message message) {
        ImmutableMap immutableMap = message.A15;
        if (immutableMap == null) {
            return null;
        }
        C5qt c5qt = C5qt.A0A;
        if (immutableMap.get(c5qt) == null || ((MessagePersonaPlatformMetadata) immutableMap.get(c5qt)).A00 == null) {
            return null;
        }
        return ((MessagePersonaPlatformMetadata) immutableMap.get(c5qt)).A00.A00;
    }

    public static String A06(Message message) {
        6Ay BCm;
        2JY A0L;
        5Pm r0 = message.A08;
        String str = null;
        if (r0 != null && (BCm = r0.BCm()) != null && (A0L = BCm.A0L(-54785808, 2JX.class, -1874146071)) != null) {
            str = A0L.A0t(GraphQLStringDefUtil.A00(), "GraphQLXMALayoutType", 2011608879);
        }
        return str;
    }

    public static String A07(Message message, Boolean bool) {
        5Pm r0;
        6Ay BCm;
        7ZM A0w;
        String BHd;
        if (message.A1m != null || A0Q(message)) {
            return null;
        }
        SecretString A0F = message.A0F();
        String str = A0F.A00;
        if ((str == null || str.isEmpty()) && (r0 = message.A08) != null && (BCm = r0.BCm()) != null && (A0w = BCm.A0w()) != null) {
            6BJ A0z = A0w.A0z();
            2yD A0K = 1BK.A0K();
            if (A0z != null && (BHd = A0z.BHd()) != null && (BHd.equals(4YT.A00(81)) || (BHd.equals(4YT.A00(1597)) && A0K.AZk(36320279277354263L)))) {
                return A0z.A0r(1852205030);
            }
        }
        if (bool.booleanValue()) {
            A0F = message.A0G();
        }
        return A0F.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A08(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if ("image/gif".equals(((com.facebook.messaging.model.attachment.Attachment) r0.get(0)).A0L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A09(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L2c
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0z
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2e
            r0 = r303
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ui.media.attachments.model.MediaResource r0 = (com.facebook.ui.media.attachments.model.MediaResource) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.A03()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
        L2a:
            r0 = 1
            r302 = r0
        L2c:
            r0 = r302
            return r0
        L2e:
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2c
            r0 = r303
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            java.lang.String r0 = r0.A0L
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r303
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            java.lang.String r0 = r0.A0L
            r303 = r0
            java.lang.String r0 = "image/gif"
            r305 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2c
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A09(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0A(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0z
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0A(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0B(Message message) {
        ImmutableList immutableList;
        if (message.A08 != null || A08(message) || A0C(message)) {
            return true;
        }
        MmsData A072 = message.A07();
        if (A072 != null && (immutableList = A072.A02) != null && !immutableList.isEmpty()) {
            return true;
        }
        ImmutableList immutableList2 = message.A0v;
        return (immutableList2 == null || immutableList2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A10
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0C(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0D(Message message) {
        return !1JF.A0A(message.A0F().A00);
    }

    public static boolean A0E(Message message) {
        return !A08.contains(message.A04());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if ("GROUP_ADMIN_MODEL_NUX".equals(r0.A0I) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0F(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L22
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "GROUP_ADMIN_MODEL_NUX"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0F(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (X.1JF.A0B(r301.A0F().A00) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0G(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.powerups.model.MessagePowerup r0 = r0.A0B()
            X.5aU r0 = r0.A00()
            r302 = r0
            r0 = r302
            boolean r0 = r0.isAvatarType
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
            r0 = r301
            com.facebook.secure.secrettypes.SecretString r0 = r0.A0F()
            java.lang.String r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = X.1JF.A0B(r0)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L28
        L24:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0G(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0.contains(com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A18) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.1q8 r0 = r0.A04()
            r302 = r0
            X.1q8 r0 = X.C1q8.A07
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L3c
            r0 = r301
            X.5Pm r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r303
            X.6Ay r0 = r0.BCm()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.BDF()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3c
            com.facebook.graphql.enums.GraphQLStoryAttachmentStyle r0 = com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A18
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L41
        L3c:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L41:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0H(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0I(Message message) {
        GenericAdminMessageInfo genericAdminMessageInfo;
        if (message.A04() != C1q8.A04 || (genericAdminMessageInfo = message.A0C) == null) {
            return false;
        }
        String str = genericAdminMessageInfo.A0I;
        return 4YT.A00(547).equals(str) || 4YT.A00(214).equals(str) || 4YT.A00(546).equals(str);
    }

    public static boolean A0J(Message message) {
        boolean z = false;
        ImmutableList immutableList = message.A0r;
        if (!immutableList.isEmpty() && ((Attachment) immutableList.get(0)).A04 == 48P.A02 && C5fo.MP4.value.equals(((Attachment) immutableList.get(0)).A0L)) {
            z = true;
        }
        return z;
    }

    public static boolean A0K(Message message) {
        6Ay BCm;
        5Pm r0 = message.A08;
        boolean z = false;
        if (r0 != null && (BCm = r0.BCm()) != null) {
            ImmutableList BDF = BCm.BDF();
            if (BDF.contains(GraphQLStoryAttachmentStyle.A1D) || BDF.contains(GraphQLStoryAttachmentStyle.A0V)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean A0L(Message message) {
        ImmutableList immutableList = message.A0r;
        boolean z = false;
        if (immutableList != null && !immutableList.isEmpty() && ((Attachment) immutableList.get(0)).A06 != null) {
            z = true;
        }
        return z;
    }

    public static boolean A0M(Message message) {
        boolean z = false;
        if (A0L(message)) {
            EphemeralMediaData ephemeralMediaData = ((Attachment) message.A0r.get(0)).A06;
            ephemeralMediaData.getClass();
            if (ephemeralMediaData.A00 > 0) {
                z = true;
            }
        }
        return z;
    }

    public static boolean A0N(Message message) {
        boolean z = false;
        if (A08(message)) {
            ImmutableList immutableList = message.A0r;
            if (((Attachment) immutableList.get(0)).A04 == 48P.A0B) {
                if (87A.A00.contains(Long.valueOf(((Attachment) immutableList.get(0)).A03))) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean A0O(Message message) {
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo == null) {
            return false;
        }
        boolean equals = "MESSENGER_CALL_LOG".equals(genericAdminMessageInfo.A0I);
        if (equals) {
            GenericAdminMessageExtensibleData genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E;
            if (genericAdminMessageExtensibleData == null) {
                genericAdminMessageExtensibleData = null;
            }
            MessengerCallLogProperties messengerCallLogProperties = (MessengerCallLogProperties) genericAdminMessageExtensibleData;
            if (messengerCallLogProperties != null && 1JF.A0C(messengerCallLogProperties.A07, "group_call_started")) {
                return true;
            }
        }
        if (!equals) {
            return false;
        }
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData2 = genericAdminMessageInfo.A0E;
        if (genericAdminMessageExtensibleData2 == null) {
            genericAdminMessageExtensibleData2 = null;
        }
        MessengerCallLogProperties messengerCallLogProperties2 = (MessengerCallLogProperties) genericAdminMessageExtensibleData2;
        return messengerCallLogProperties2 != null && 1JF.A0C(messengerCallLogProperties2.A07, "group_call_ended");
    }

    public static boolean A0P(Message message) {
        GenericAdminMessageExtensibleData genericAdminMessageExtensibleData;
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo == null) {
            return false;
        }
        String str = genericAdminMessageInfo.A0I;
        if (4YT.A00(755).equals(str) || 4YT.A00(728).equals(str)) {
            return true;
        }
        return "MESSENGER_CALL_LOG".equals(str) && (genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E) != null && (genericAdminMessageExtensibleData instanceof MessengerCallLogProperties) && 1JF.A0C(((MessengerCallLogProperties) genericAdminMessageExtensibleData).A07, "group_call_started");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("GROUP_POLL".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0Q(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "GROUP_POLL"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0Q(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("INSTANT_GAME_UPDATE".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0R(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "INSTANT_GAME_UPDATE"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0R(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r0.contains(com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A0U) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0S(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.5Pm r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            r0 = r302
            X.6Ay r0 = r0.BCm()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.BDF()
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L2d
            com.facebook.graphql.enums.GraphQLStoryAttachmentStyle r0 = com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A0U
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L31
        L2d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L31:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0S(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0T(Message message) {
        6Ay BCm;
        7ZM A0w;
        5Pm r0 = message.A08;
        boolean z = false;
        if (r0 != null && (BCm = r0.BCm()) != null && (A0w = BCm.A0w()) != null && A0w.getIntValue(1208616083) == 3015) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.4YT.A00(48).equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0U(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            r0 = 48
            java.lang.String r0 = X.4YT.A00(r0)
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L24
        L20:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L24:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0U(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r0.longValue() <= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0V(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            java.lang.Long r0 = r0.A1L
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1f
            r0 = r302
            long r0 = r0.longValue()
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 > 0) goto L24
        L1f:
            r0 = 0
            r308 = r0
            r0 = 0
            r302 = r0
        L24:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0V(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (com.google.common.base.Objects.equal(r0, "227878347358915") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0W(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.A1m
            r301 = r0
            r0 = r301
            boolean r0 = X.6Bl.A05(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            java.lang.String r0 = "227878347358915"
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L1e:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L22:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0W(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A0F.id, r0.mUserId) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = 83431(0x145e7, float:1.16912E-40)
            r302 = r0
            r0 = r302
            java.lang.Object r0 = X.1Bn.A0A(r0)
            com.facebook.auth.viewercontext.ViewerContext r0 = (com.facebook.auth.viewercontext.ViewerContext) r0
            r303 = r0
            r0 = r301
            com.facebook.messaging.model.messages.ParticipantInfo r0 = r0.A0K
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L36
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r304
            com.facebook.user.model.UserKey r0 = r0.A0F
            java.lang.String r0 = r0.id
            r305 = r0
            r0 = r303
            java.lang.String r0 = r0.mUserId
            r304 = r0
            r0 = r305
            r1 = r304
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = 1
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L3a
        L36:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L3a:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0X(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r0.contains(com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A0L) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0Y(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.5Pm r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            r0 = r302
            X.6Ay r0 = r0.BCm()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2d
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.BDF()
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L2d
            com.facebook.graphql.enums.GraphQLStoryAttachmentStyle r0 = com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A0L
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L31
        L2d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L31:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0Y(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0Z(Message message) {
        6Ay BCm;
        ImmutableList BDF;
        5Pm r0 = message.A08;
        if (r0 == null || (BCm = r0.BCm()) == null || (BDF = BCm.BDF()) == null) {
            return false;
        }
        return BDF.contains(GraphQLStoryAttachmentStyle.A0Z) || BDF.contains(GraphQLStoryAttachmentStyle.A0Y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("MESSENGER_RESPOND_REMINDER_CANCEL_SUGGESTION".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0a(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "MESSENGER_RESPOND_REMINDER_CANCEL_SUGGESTION"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0a(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("MESSENGER_RESPOND_REMINDER_CONFIRMATION".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0b(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "MESSENGER_RESPOND_REMINDER_CONFIRMATION"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0b(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("MESSENGER_RESPOND_REMINDER".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0c(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "MESSENGER_RESPOND_REMINDER"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0c(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("MESSENGER_RESPOND_REMINDER_USER_CANCEL".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0d(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "MESSENGER_RESPOND_REMINDER_USER_CANCEL"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0d(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0e(Message message) {
        boolean z = false;
        if (message != null) {
            ImmutableList immutableList = message.A10;
            if (09K.A00(immutableList) && 09K.A00(((Share) immutableList.get(0)).A04) && ShareMedia.Type.A02.equals(((ShareMedia) ((Share) immutableList.get(0)).A04.get(0)).A00) && !1JF.A0A(message.A0F().A00)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean A0f(Message message) {
        5Pm r0;
        6Ay BCm;
        ImmutableList BDF;
        boolean z = false;
        if (message != null && (r0 = message.A08) != null && (BCm = r0.BCm()) != null && (BDF = BCm.BDF()) != null && !BDF.isEmpty() && GraphQLStoryAttachmentStyle.A0j.equals(BDF.get(0))) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ("PHONE_CONTACT_UPLOAD".equals(r0.A0I) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0g(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.1q8 r0 = r0.A04()
            r302 = r0
            X.1q8 r0 = X.C1q8.A04
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L2d
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r303
            java.lang.String r0 = r0.A0I
            r302 = r0
            java.lang.String r0 = "PHONE_CONTACT_UPLOAD"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0g(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0h(Message message) {
        ImmutableList immutableList;
        boolean z = false;
        if (message != null && (immutableList = message.A0z) != null && !immutableList.isEmpty() && immutableList.get(0) != null) {
            return ((MediaResource) immutableList.get(0)).A0y;
        }
        if (A0L(message)) {
            EphemeralMediaData ephemeralMediaData = ((Attachment) message.A0r.get(0)).A06;
            ephemeralMediaData.getClass();
            if (!EphemeralMediaState.PERMANENT.equals(ephemeralMediaData.A01)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean A0i(Message message) {
        GenericAdminMessageInfo genericAdminMessageInfo;
        if (message != null && (genericAdminMessageInfo = message.A0C) != null) {
            if (4YT.A00(240).equals(genericAdminMessageInfo.A0I)) {
                return true;
            }
        }
        if (message.A04() != C1q8.A04) {
            return false;
        }
        GenericAdminMessageInfo genericAdminMessageInfo2 = message.A0C;
        if (genericAdminMessageInfo2 == null || !"CONFIRM_FRIEND_REQUEST".equals(genericAdminMessageInfo2.A0I)) {
            return genericAdminMessageInfo2 != null && "ACCEPT_PENDING_THREAD".equals(genericAdminMessageInfo2.A0I);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if ("GROUP_POLL".equals(r0.A0I) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0j(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A0I
            r301 = r0
            java.lang.String r0 = "GROUP_POLL"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L22
        L1e:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0j(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r0 == X.C1q8.A07) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0k(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.1q8 r0 = r0.A04()
            r301 = r0
            X.1q8 r0 = X.C1q8.A0I
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.1q8 r0 = X.C1q8.A0C
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.1q8 r0 = X.C1q8.A0D
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.1q8 r0 = X.C1q8.A0W
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.1q8 r0 = X.C1q8.A0E
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3f
            X.1q8 r0 = X.C1q8.A07
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L41
        L3f:
            r0 = 1
            r304 = r0
        L41:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0k(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ("RAMP_UP_WELCOME_MESSAGE".equals(r0.A0I) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0l(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.1q8 r0 = r0.A04()
            r302 = r0
            X.1q8 r0 = X.C1q8.A04
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L2d
            r0 = r301
            com.facebook.messaging.model.messages.GenericAdminMessageInfo r0 = r0.A0C
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r303
            java.lang.String r0 = r0.A0I
            r302 = r0
            java.lang.String r0 = "RAMP_UP_WELCOME_MESSAGE"
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L32
        L2d:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L32:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0l(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r0.A0F == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.A00 != 2003) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0m(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.facebook.messaging.model.share.SentShareAttachment r0 = r0.A0R
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r302
            com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r302
            int r0 = r0.A00
            r304 = r0
            r0 = 2003(0x7d3, float:2.807E-42)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L2a
        L27:
            r0 = 0
            r306 = r0
        L2a:
            r0 = r301
            com.facebook.messaging.model.messages.ParticipantInfo r0 = r0.A0K
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L41
            r0 = r302
            com.facebook.user.model.UserKey r0 = r0.A0F
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L46
        L41:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L46:
            r0 = r306
            if (r0 != 0) goto L62
            r0 = r305
            if (r0 == 0) goto L62
            r0 = r301
            java.lang.String r0 = r0.A1Z
            r302 = r0
            r0 = r302
            boolean r0 = X.1JF.A0B(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L62
            r0 = r303
            return r0
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0m(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0n(Message message) {
        boolean z = false;
        if (A08(message) && ((Attachment) message.A0r.get(0)).A04 == 48P.A0A) {
            z = true;
        }
        return z;
    }

    public static boolean A0o(Message message) {
        6Ay BCm;
        7ZM A0w;
        6BJ A0z;
        5Pm r0 = message.A08;
        boolean z = false;
        if (r0 != null && (BCm = r0.BCm()) != null && (A0w = BCm.A0w()) != null && (A0z = A0w.A0z()) != null) {
            if (4YT.A00(1600).equals(A0z.BHd())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.BDF().contains(com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A1A) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0p(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.5Pm r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r302
            X.6Ay r0 = r0.BCm()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.BDF()
            r301 = r0
            com.facebook.graphql.enums.GraphQLStoryAttachmentStyle r0 = com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A1A
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0p(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.BDF().contains(com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A1F) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0q(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            X.5Pm r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r302
            X.6Ay r0 = r0.BCm()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.BDF()
            r301 = r0
            com.facebook.graphql.enums.GraphQLStoryAttachmentStyle r0 = com.facebook.graphql.enums.GraphQLStoryAttachmentStyle.A1F
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2d
        L29:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0q(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A0r(Message message, Message message2) {
        boolean z = false;
        if (message2 != null && Objects.equal(message.A1V, message2.A1V) && Objects.equal(message.A1g, message2.A1g)) {
            z = true;
        }
        return z;
    }

    public static boolean A0s(MessagesCollection messagesCollection, String str, long j) {
        if (str == null && j == -1) {
            return false;
        }
        1Du it = messagesCollection.A01.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            if ((str != null && str.equals(message.A1V)) || j == message.A05) {
                return true;
            }
        }
        return false;
    }

    public boolean A0t(Message message) {
        6Ay BCm;
        ArE BEO;
        5Pm r0 = message.A08;
        boolean z = false;
        if (r0 != null && (BCm = r0.BCm()) != null && this.A05 == C0et.A0P && BCm.BDF().contains(GraphQLStoryAttachmentStyle.A0l) && (BEO = BCm.BEO()) != null && !BEO.A0c(-19805526, DkZ.class, -228116867).isEmpty()) {
            z = true;
        }
        return z;
    }

    public boolean A0u(Message message) {
        5Pm r0;
        6Ay BCm;
        boolean z = false;
        if (!A0t(message) && (r0 = message.A08) != null && (BCm = r0.BCm()) != null) {
            ImmutableList BDF = BCm.BDF();
            if (BDF.contains(GraphQLStoryAttachmentStyle.A0m) || BDF.contains(GraphQLStoryAttachmentStyle.A0r)) {
                z = true;
            }
        }
        return z;
    }

    public boolean A0v(Message message) {
        if (A0u(message) || A0t(message)) {
            return true;
        }
        GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
        if (genericAdminMessageInfo == null) {
            return false;
        }
        String str = genericAdminMessageInfo.A0I;
        return 4YT.A00(28).equals(str) || 4YT.A00(29).equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (((X.C22a) r301.A01.get()).BWc(r0, (-1) >>> 1) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0w(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.secure.secrettypes.SecretString r0 = r0.A0F()
            r303 = r0
            r0 = r303
            java.lang.String r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r301
            X.00i r0 = r0.A01
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.22a r0 = (X.C22a) r0
            X.2KY r0 = (X.2KY) r0
            r305 = r0
            r0 = r305
            r1 = r304
            r2 = -1
            r3 = 1
            int r2 = r2 >>> r3
            boolean r0 = r0.BWc(r1, r2)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L39
        L34:
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
        L39:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1q7.A0w(com.facebook.messaging.model.messages.Message):boolean");
    }

    public boolean A0x(Message message) {
        C1q8 A04;
        boolean z = false;
        if (message.A08 != null && (((2rT) this.A06.get()).A02(message.A0V) || (A04 = message.A04()) == C1q8.A07 || A04 == C1q8.A0U || A04 == C1q8.A0S || A0O(message) || A04 == C1q8.A0B)) {
            z = true;
        }
        return z;
    }
}
