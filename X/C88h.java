package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import java.util.List;

/* renamed from: X.88h, reason: invalid class name */
/* loaded from: 88h.class */
public final class C88h extends 62R implements AnonymousClass624 {
    public final int A00;
    public final long A01;
    public final Message A02;
    public final ParticipantInfo A03;
    public final 32M A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final long A08;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C88h(com.facebook.messaging.model.messages.Message r302, com.facebook.messaging.model.messages.ParticipantInfo r303, X.32M r304, java.util.List r305, int r306, long r307, boolean r309, boolean r310) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r305
            if (r0 == 0) goto L13
            r0 = 0
            r311 = r0
            r0 = 0
            r312 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L13:
            r0 = 1
            r311 = r0
        L16:
            r0 = r311
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            r1 = r305
            r0.A05 = r1
            r0 = r301
            r1 = r307
            r0.A01 = r1
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = r301
            r1 = r309
            r0.A06 = r1
            r0 = r301
            r1 = r310
            r0.A07 = r1
            r0 = r302
            java.lang.String r0 = r0.A1g
            r313 = r0
            r0 = r307
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r312 = r0
            java.lang.Class<X.88h> r0 = X.C88h.class
            r1 = r304
            r2 = r313
            r3 = r303
            r4 = r312
            int r0 = X.0J6.A03(r0, r1, r2, r3, r4)
            long r0 = (long) r0
            r314 = r0
            r0 = r301
            r1 = r314
            r0.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88h.<init>(com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.messages.ParticipantInfo, X.32M, java.util.List, int, long, boolean, boolean):void");
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return Long.MIN_VALUE;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A0M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r301.A07 != r0.A07) goto L16;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVc(X.AnonymousClass624 r302) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88h.BVc(X.624):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r301.A08 != ((X.C88h) r302).A08) goto L8;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            X.62b r0 = X.C62b.A0M
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L3d
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r303 = r0
            java.lang.Class<X.88h> r0 = X.C88h.class
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L3d
            r0 = r301
            long r0 = r0.A08
            r305 = r0
            r0 = r302
            X.88h r0 = (X.C88h) r0
            r302 = r0
            r0 = r302
            long r0 = r0.A08
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L42
        L3d:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L42:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88h.BVk(X.624):boolean");
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RowReceiptItem{, readers=");
        Object obj = this.A05;
        str = "";
        if (obj == null) {
            obj = str;
        }
        A0k.append(obj);
        A0k.append(", senderOrDeliveree=");
        ParticipantInfo participantInfo = this.A03;
        A0k.append(participantInfo != null ? participantInfo : "");
        A0k.append(", messageSource='");
        Message message = this.A02;
        A0k.append(message.A1l);
        A0k.append("', type=");
        A0k.append(this.A04);
        A0k.append(", messageId='");
        A0k.append(message.A1V);
        A0k.append("', offlineThreadingId='");
        A0k.append(message.A1g);
        A0k.append("', timestampMs=");
        A0k.append(message.A05);
        A0k.append(", sentTimestampMs=");
        A0k.append(message.A04);
        A0k.append(", receiptTimestampMs=");
        A0k.append(this.A01);
        return AnonymousClass001.A0g(A0k, '}');
    }
}
