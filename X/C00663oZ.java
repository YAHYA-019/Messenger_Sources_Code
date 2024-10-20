package X;

import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.graphql.enums.GraphQLVideoBroadcastStatus;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3oZ.class */
public final class C00663oZ {
    public final C00i A00 = new 1BQ(32771);
    public final C00i A01 = new 1BQ(16822);

    public static boolean A00(Message message) {
        6Ay BCm;
        2JY A0u;
        5Pm r0 = message.A08;
        if (r0 == null || (BCm = r0.BCm()) == null || (A0u = BCm.A0u()) == null || !"Video".equals(A0u.getTypeName())) {
            return false;
        }
        ImmutableList BDF = BCm.BDF();
        if (BDF.contains(GraphQLStoryAttachmentStyle.A0A) || BDF.contains(GraphQLStoryAttachmentStyle.A0k) || BDF.contains(GraphQLStoryAttachmentStyle.A1J)) {
            return false;
        }
        GraphQLVideoBroadcastStatus graphQLVideoBroadcastStatus = GraphQLVideoBroadcastStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        Enum A0g = A0u.A0g(graphQLVideoBroadcastStatus, -351684304);
        if (A0g != null && A0g != graphQLVideoBroadcastStatus && A0g != GraphQLVideoBroadcastStatus.VOD_READY) {
            return false;
        }
        7ZM A0w = BCm.A0w();
        return (A0w == null || A0w.A0v() == null) && A0u.A0r(752641086) != null && A0u.A0L(-1967793586, C10334t7.class, 537206042) != null && A0u.getIntValue(113126854) > 0 && A0u.getIntValue(-1221029593) > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (X.C6kg.A03((com.facebook.ui.media.attachments.model.MediaResource) r0.get(0)) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r302 = r0
            r0 = r302
            int r0 = r0.size()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L29
            r0 = r302
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            com.facebook.messaging.model.attachment.VideoData r0 = r0.A08
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L4f
        L29:
            r0 = r301
            com.google.common.collect.ImmutableList r0 = X.5Q0.A03(r0)
            r302 = r0
            r0 = r302
            int r0 = r0.size()
            r303 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L6c
            r0 = r302
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ui.media.attachments.model.MediaResource r0 = (com.facebook.ui.media.attachments.model.MediaResource) r0
            r306 = r0
            r0 = r306
            boolean r0 = X.C6kg.A03(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
        L4f:
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A10
            r306 = r0
            r0 = r306
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6c
            r0 = r301
            com.facebook.messaging.model.share.SentShareAttachment r0 = r0.A0R
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L6c
            r0 = 1
            r304 = r0
        L6c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00663oZ.A01(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r0.startsWith("audio/") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A0r
            r303 = r0
            r0 = r303
            int r0 = r0.size()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L86
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0V
            r306 = r0
            r0 = r306
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0q(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L58
            r0 = r301
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r0 = r303
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            r306 = r0
            r0 = r306
            java.lang.String r0 = r0.A0L
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L58
            java.lang.String r0 = "audio/"
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r308 = r0
            r0 = r304
            if (r0 != 0) goto L5e
        L58:
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
        L5e:
            r0 = r301
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r0 = r303
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.messaging.model.attachment.Attachment r0 = (com.facebook.messaging.model.attachment.Attachment) r0
            r306 = r0
            r0 = r306
            boolean r0 = X.C00673oa.A01(r0)
            r304 = r0
            r0 = r308
            if (r0 != 0) goto L83
            r0 = r304
            if (r0 == 0) goto L86
        L83:
            r0 = r305
            return r0
        L86:
            r0 = r302
            com.google.common.collect.ImmutableList r0 = X.5Q0.A03(r0)
            r307 = r0
            r0 = r307
            int r0 = r0.size()
            r304 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto Lc3
            r0 = r307
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ui.media.attachments.model.MediaResource r0 = (com.facebook.ui.media.attachments.model.MediaResource) r0
            X.5HP r0 = r0.A0Q
            r307 = r0
            X.5HP r0 = X.5HP.A03
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 == r1) goto L83
            X.5HP r0 = X.5HP.A04
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto Lc3
            r0 = r305
            return r0
        Lc3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00663oZ.A02(com.facebook.messaging.model.messages.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r0.A01 != X.BM7.A04) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            X.5Pm r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r303
            X.6Ay r0 = r0.BCm()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1q7 r0 = (X.C1q7) r0
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A0u(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2d
        L2b:
            r0 = 0
            return r0
        L2d:
            r0 = r302
            com.facebook.messaging.model.share.SentShareAttachment r0 = r0.A0R
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L49
            r0 = r303
            X.BM7 r0 = r0.A01
            r305 = r0
            X.BM7 r0 = X.BM7.A04
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L4c
        L49:
            r0 = 0
            r306 = r0
        L4c:
            r0 = 16385(0x4001, float:2.296E-41)
            r304 = r0
            r0 = r304
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2yD r0 = (X.2yD) r0
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L83
            r0 = r302
            com.facebook.messaging.model.payment.PaymentTransactionData r0 = r0.A0O
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L83
            r0 = 36315954237417044(0x81052b00002654, double:3.029693920128251E-306)
            r307 = r0
            r0 = r305
            r1 = r307
            boolean r0 = r0.AZk(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2b
            r0 = r302
            com.facebook.messaging.model.payment.PaymentRequestData r0 = r0.A0N
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2b
        L83:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00663oZ.A03(com.facebook.messaging.model.messages.Message):boolean");
    }

    public boolean A04(Message message) {
        boolean z;
        ImmutableList immutableList = message.A0r;
        1Du it = immutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Attachment attachment = (Attachment) it.next();
            this.A00.get();
            if (!C00673oa.A02(attachment)) {
                z = true;
                break;
            }
        }
        if (immutableList.size() == 0 || z) {
            ImmutableList A03 = 5Q0.A03(message);
            if (A03.isEmpty()) {
                return false;
            }
            1Du it2 = A03.iterator();
            while (it2.hasNext()) {
                if (!C6kg.A02((MediaResource) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A00(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05(com.facebook.messaging.model.messages.Message r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = A01(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L14
            r0 = r302
            boolean r0 = A00(r0)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00663oZ.A05(com.facebook.messaging.model.messages.Message):boolean");
    }
}
