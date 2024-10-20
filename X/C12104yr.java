package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.payment.PaymentRequestData;
import com.facebook.messaging.model.payment.PaymentTransactionData;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageParams;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yr.class */
public final class C12104yr {
    public static final String A0H = new String(Character.toChars(128077));
    public 1BY A00;
    public final C15h A0F = new AHe(this, 33);
    public final C00653oY A0D = (C00653oY) 1Bi.A03(32769);
    public final C12114ys A0C = (C12114ys) 1Bi.A03(49420);
    public final AnonymousClass243 A01 = (AnonymousClass243) 1Bn.A0E((Context) null, (1BY) null, 68334);
    public final C00i A09 = new 1BQ(50145);
    public final C00i A02 = FbInjector.A00;
    public final C15h A07 = new AHe(this, 34);
    public final C15h A08 = new AHe(this, 35);
    public final C15h A05 = new AHe(this, 36);
    public final C00i A04 = new 1BV((1BY) null, 67314);
    public final C00i A0A = new 1BV((1BY) null, 66283);
    public final C00i A03 = new 1BQ(16385);
    public final C15h A06 = new AHe(this, 37);
    public final C15h A0G = new AHe(this, 38);
    public final C1q7 A0E = (C1q7) 1Bi.A03(16822);
    public final 4yK A0B = (4yK) 1Bn.A0E((Context) null, (1BY) null, 84556);

    public C12104yr(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static UserKey A00(C12104yr c12104yr) {
        C15h c15h = c12104yr.A0F;
        if (c15h.get() == null) {
            return null;
        }
        return new UserKey(1Js.A03, ((ViewerContext) c15h.get()).mUserId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (X.1JF.A0B(r309) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String A01(com.facebook.messaging.model.messages.Message r302, com.facebook.messaging.model.threads.ThreadCustomization r303) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12104yr.A01(com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadCustomization):java.lang.String");
    }

    public static String A02(Message message, ThreadCustomization threadCustomization, ThreadSummary threadSummary, C12104yr c12104yr) {
        String str;
        String str2;
        1F9 r0;
        1F9 r02;
        SendPaymentMessageParams sendPaymentMessageParams;
        if (A04(message)) {
            str = c12104yr.A09(message, threadCustomization);
        } else {
            boolean equal = Objects.equal(message.A0K.A0F, A00(c12104yr));
            str = "";
            String A01 = !equal ? c12104yr.A01(message, threadCustomization) : str;
            C5ak A00 = C00653oY.A00(c12104yr.A0D, message);
            ThreadKey threadKey = message.A0V;
            if (ThreadKey.A0o(threadKey) && (A00 == C5ak.STICKER || A00 == C5ak.AUDIO_CLIP || A00 == C5ak.VIDEO_CLIP || c12104yr.A0C.A0H(message))) {
                return 1BL.A0B(c12104yr.A02).getString(2131955628);
            }
            int i = 0;
            if (A00 == C5ak.STICKER) {
                if (6Bl.A05(message.A1m)) {
                    return C22a.A00;
                }
                SecretString A0E = message.A0E();
                if (A0E != null) {
                    String str3 = A0E.A00;
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
                Resources resources = ((Context) c12104yr.A02.get()).getResources();
                return equal ? resources.getString(2131968218) : resources.getString(2131962801, A01);
            }
            if (A00 == C5ak.AUDIO_CLIP) {
                Resources resources2 = ((Context) c12104yr.A02.get()).getResources();
                return equal ? resources2.getString(2131968220) : resources2.getString(2131962803, A01);
            }
            if (A00 == C5ak.VIDEO_CLIP) {
                Resources resources3 = ((Context) c12104yr.A02.get()).getResources();
                return equal ? resources3.getString(2131968219) : resources3.getString(2131962802, A01);
            }
            C12114ys c12114ys = c12104yr.A0C;
            if (c12114ys.A0H(message)) {
                ImmutableList immutableList = message.A0r;
                if (!immutableList.isEmpty() || !5Q0.A03(message).isEmpty()) {
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        if (C00673oa.A00((Attachment) it.next())) {
                            i++;
                        }
                    }
                    if (i <= 0) {
                        1Du it2 = 5Q0.A03(message).iterator();
                        while (it2.hasNext()) {
                            if (((MediaResource) it2.next()).A03()) {
                                i++;
                            }
                        }
                    }
                }
                int A07 = c12114ys.A07(message);
                Resources resources4 = ((Context) c12104yr.A02.get()).getResources();
                return i < A07 ? equal ? resources4.getQuantityString(2131820882, A07, Integer.valueOf(A07)) : resources4.getQuantityString(2131820758, A07, A01, Integer.valueOf(A07)) : equal ? resources4.getQuantityString(2131820881, i, Integer.valueOf(i)) : resources4.getQuantityString(2131820757, i, A01, Integer.valueOf(i));
            }
            if (A00 != C5ak.PAYMENT || c12104yr.A0E.A0v(message)) {
                C5ak c5ak = C5ak.CALL_LOG;
                5Pm r03 = message.A08;
                if (A00 == c5ak) {
                    long j = message.A06;
                    11T.A0F(r03, 0);
                    return ((80D) c12104yr.A0A.get()).AKz(new C12167zi(r03, null, null, j));
                }
                if (r03 == null) {
                    boolean equals = "sms".equals(message.A1l);
                    if (equals && message.A07().A00()) {
                        return 1BL.A0B(c12104yr.A02).getString(2131960377);
                    }
                    if (equals) {
                        1Du it3 = message.A07().A02.iterator();
                        if (it3.hasNext() && GOm.A00(92).equalsIgnoreCase(4YU.A0Z(it3).A0s)) {
                            Resources A0B = 1BL.A0B(c12104yr.A02);
                            return equal ? A0B.getString(2131968210) : 4YU.A0u(A0B, A01, 2131962798);
                        }
                    }
                    if (ThreadKey.A0d(threadKey) && !equal) {
                        return 1BL.A0B(c12104yr.A02).getString(2131965746);
                    }
                    if (threadSummary != null && (str2 = threadSummary.A1q) != null && (r0 = threadSummary.A0g) != null && r0 == 1F9.A0B) {
                        return str2;
                    }
                    Resources resources5 = ((Context) c12104yr.A02.get()).getResources();
                    return equal ? resources5.getString(2131968213) : resources5.getString(2131962800, A01);
                }
                str = message.A0E().A00;
                if (1JF.A0B(str)) {
                    String str4 = null;
                    if (threadSummary != null && (r02 = threadSummary.A0g) != null && r02 == 1F9.A0B) {
                        str4 = str;
                    }
                    long j2 = message.A06;
                    return ((C12177zj) c12104yr.A04.get()).A01(equal ? new C12167zi(r03, null, str4, j2) : new C12167zi(r03, A01, str4, j2));
                }
            } else {
                boolean A1F = threadKey.A1F();
                PaymentTransactionData paymentTransactionData = message.A0O;
                if (paymentTransactionData != null) {
                    return c12104yr.A03(((C6oh) c12104yr.A09.get()).A01(new CurrencyAmount(paymentTransactionData.A03, paymentTransactionData.A00), 0S2.A0C), A01, Long.toString(paymentTransactionData.A01), true, equal, A1F);
                }
                PaymentRequestData paymentRequestData = message.A0N;
                if (paymentRequestData != null) {
                    return c12104yr.A03(((C6oh) c12104yr.A09.get()).A01(new CurrencyAmount(paymentRequestData.A03, paymentRequestData.A00), 0S2.A0C), A01, Long.toString(paymentRequestData.A01), false, equal, A1F);
                }
                SentShareAttachment sentShareAttachment = message.A0R;
                if (sentShareAttachment != null && (sendPaymentMessageParams = sentShareAttachment.A03) != null) {
                    return c12104yr.A03(((C6oh) c12104yr.A09.get()).A01(new CurrencyAmount(sendPaymentMessageParams.A00.A00, CurrencyAmount.A02.multiply(r0.A01).intValue()), 0S2.A0C), A01, sendPaymentMessageParams.A0H, true, equal, A1F);
                }
            }
        }
        return str;
    }

    private String A03(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Resources A0B;
        int i;
        Object[] objArr;
        User A00 = ((23F) this.A07.get()).A00(1BK.A0X(str3));
        String str4 = A00 != null ? A00.A0X.firstName : "";
        if (z2) {
            A0B = 1BL.A0B(this.A02);
            if (z3) {
                i = 2131968217;
                if (z) {
                    i = 2131968215;
                }
                objArr = new Object[2];
                objArr[0] = str4;
                objArr[1] = str;
            } else {
                i = 2131968216;
                if (z) {
                    i = 2131968214;
                }
                objArr = new Object[]{str};
            }
        } else {
            boolean equals = ((User) this.A0G.get()).A13.equals(str3);
            A0B = 1BL.A0B(this.A02);
            if (equals) {
                if (z) {
                    i = 2131962820;
                } else {
                    i = 2131962821;
                    if (z3) {
                        i = 2131962822;
                    }
                }
                objArr = new Object[2];
                objArr[0] = str2;
                objArr[1] = str;
            } else {
                i = 2131966874;
                if (z) {
                    i = 2131966873;
                }
                objArr = new Object[]{str2, str4, str};
            }
        }
        return A0B.getString(i, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ("drawing".equals(r0.get("photo_type")) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(com.facebook.messaging.model.messages.Message r301) {
        /*
            java.lang.String r0 = "photo_type"
            r302 = r0
            java.lang.String r0 = "drawing"
            r303 = r0
            com.google.common.collect.ImmutableList r0 = X.C1q7.A07
            r304 = r0
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A13
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L39
            r0 = r305
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            r0 = r305
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L3e
        L39:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L3e:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12104yr.A04(com.facebook.messaging.model.messages.Message):boolean");
    }

    public String A05(Message message) {
        Preconditions.checkArgument(ThreadKey.A0q(message.A0V));
        if (message.A04() == C1q8.A04) {
            return 4YU.A0x(message);
        }
        Long l = message.A1L;
        if (l == null || l.longValue() <= 0) {
            if (1JF.A0A(4YU.A0x(message))) {
                return A02(message, ThreadCustomization.A03, null, this);
            }
            return null;
        }
        if (Objects.equal(message.A0K.A0F, A00(this))) {
            return 1BL.A0B(this.A02).getString(2131956574);
        }
        return 4YU.A0u(1BL.A0B(this.A02), A01(message, ThreadCustomization.A03), 2131956570);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r306 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A06(com.facebook.messaging.model.messages.Message r302, com.facebook.messaging.model.threads.ThreadCustomization r303) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12104yr.A06(com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadCustomization):java.lang.String");
    }

    public String A07(Message message, ThreadCustomization threadCustomization) {
        if (((2yD) this.A03.get()).AZk(2342157520342228987L)) {
            ImmutableList immutableList = C1q7.A07;
            ImmutableMap immutableMap = message.A13;
            if (immutableMap != null && !immutableMap.isEmpty() && "".equals(immutableMap.get("no_preview"))) {
                return 1BL.A0B(this.A02).getString(2131965746);
            }
        }
        return A06(message, threadCustomization);
    }

    public String A08(Message message, ThreadCustomization threadCustomization) {
        String str = message.A0F().A00;
        if (TextUtils.isEmpty(str)) {
            str = A02(message, threadCustomization, null, this);
        }
        if (C22a.A00.equals(str)) {
            str = A0H;
        }
        return new C2n0((Context) this.A02.get(), null, null, -1, -1, -1, -1, 1, -1, true, false, false, true, false, false).A00(str).toString();
    }

    public String A09(Message message, ThreadCustomization threadCustomization) {
        boolean equal = Objects.equal(message.A0K.A0F, A00(this));
        C00i c00i = this.A02;
        return equal ? 1BL.A0B(c00i).getString(2131960932) : 4YU.A0u(1BL.A0B(c00i), A01(message, threadCustomization), 2131960835);
    }

    public String A0A(Message message, ThreadCustomization threadCustomization) {
        Resources A0B;
        int i;
        Object[] objArr;
        ContentAppAttribution contentAppAttribution = message.A09;
        contentAppAttribution.getClass();
        String str = contentAppAttribution.A06;
        Preconditions.checkArgument(!1JF.A0B(str));
        boolean equal = Objects.equal(message.A0K.A0F, A00(this));
        C5ak A00 = C00653oY.A00(this.A0D, message);
        String A01 = A01(message, threadCustomization);
        if (A00 == C5ak.AUDIO_CLIP) {
            A0B = 1BL.A0B(this.A02);
            i = 2131962818;
            if (equal) {
                i = 2131968234;
                objArr = new Object[]{str};
            }
            objArr = new Object[]{A01, str};
        } else if (A00 == C5ak.VIDEO_CLIP) {
            A0B = 1BL.A0B(this.A02);
            i = 2131962819;
            if (equal) {
                i = 2131968235;
                objArr = new Object[]{str};
            }
            objArr = new Object[]{A01, str};
        } else {
            C12114ys c12114ys = this.A0C;
            if (c12114ys.A0G(message)) {
                A0B = 1BL.A0B(this.A02);
                i = 2131962816;
                if (equal) {
                    i = 2131968232;
                    objArr = new Object[]{str};
                }
                objArr = new Object[]{A01, str};
            } else {
                if (!c12114ys.A0H(message)) {
                    return A02(message, ThreadCustomization.A03, null, this);
                }
                A0B = 1BL.A0B(this.A02);
                i = 2131962817;
                if (equal) {
                    i = 2131968233;
                    objArr = new Object[]{str};
                }
                objArr = new Object[]{A01, str};
            }
        }
        return A0B.getString(i, objArr);
    }
}
