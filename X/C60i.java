package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.regex.Pattern;

/* renamed from: X.60i, reason: invalid class name */
/* loaded from: 60i.class */
public final class C60i {
    public Context A00;
    public 1BY A01;
    public final FbUserSession A05;
    public final C00i A06;
    public final C00i A08;
    public final C00i A09;
    public static final Pattern A0D = Pattern.compile("�� (.*)\\n(.*)");
    public static final Pattern A0C = Pattern.compile("�� (.*)\\n(.*)\\n(.*)");
    public final C00i A02 = new 1BQ(49420);
    public final C60j A04 = (C60j) 1Bn.A0E((Context) null, (1BY) null, 68011);
    public final C60k A0B = (C60k) 1Bn.A0E((Context) null, (1BY) null, 66638);
    public final C00i A07 = new 1BQ(67347);
    public final C00i A0A = new 1BV((1BY) null, 16671);
    public final C00i A03 = new 1BV((1BY) null, 68020);

    public C60i(1BO r302, FbUserSession fbUserSession) {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A08 = new 1HH(A00, 67083);
        this.A09 = new 1HH(A00, 67080);
        this.A01 = new 1BY(r302);
        this.A05 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A06 = new 1MV(fbUserSession, (1BY) null, 17064);
    }

    public ImmutableList A00(MessageRepliedTo messageRepliedTo) {
        C12114ys c12114ys = (C12114ys) this.A02.get();
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList immutableList = messageRepliedTo.A07;
        if (!09K.A01(immutableList)) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= immutableList.size()) {
                    break;
                }
                Attachment attachment = (Attachment) immutableList.get(i2);
                if (C00673oa.A02(attachment)) {
                    builder.m11011add((Object) c12114ys.A0A(attachment, null, messageRepliedTo.A09));
                }
                i = i2 + 1;
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (com.facebook.messaging.model.attachment.EphemeralMediaState.PERMANENT.equals(X.4YU.A0T(r0, 0).A06.A01) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d2, code lost:
    
        if (r0.A00 == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0170, code lost:
    
        if (((X.89M) X.1Br.A0B(r0.A00)).A00() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer A01(com.facebook.messaging.model.messages.MessageRepliedTo r302, X.61C r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60i.A01(com.facebook.messaging.model.messages.MessageRepliedTo, X.61C, java.lang.Integer):java.lang.Integer");
    }

    public boolean A02(Message message) {
        Integer num;
        if (message == null || 5Q0.A06(message) || A01(message.A0F, null, null) == 0S2.A15) {
            return false;
        }
        if (!C1ub.A03.A0N() || (num = message.A1G) == null) {
            return true;
        }
        int intValue = num.intValue();
        return (intValue == 14 || intValue == 15) ? false : true;
    }

    public boolean A03(Message message) {
        5Pm r0;
        6Ay BCm;
        7ZM A0w;
        6BJ A0z;
        String A0r;
        7ZM A0w2;
        6BJ A0z2;
        String A0r2;
        boolean z = false;
        if ((C1q7.A08(message) || message.A08 != null) && (((r0 = message.A08) == null || (((BCm = r0.BCm()) == null || (A0w2 = BCm.A0w()) == null || (A0z2 = A0w2.A0z()) == null || (A0r2 = A0z2.A0r(3575610)) == null || !0CU.A0T(A0r2, "roll_call", false)) && (BCm == null || (A0w = BCm.A0w()) == null || (A0z = A0w.A0z()) == null || (A0r = A0z.A0r(3575610)) == null || !0CU.A0T(A0r, "shared_album", false)))) && this.A04.A00())) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0d(r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(com.facebook.messaging.model.messages.Message r302) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60i.A04(com.facebook.messaging.model.messages.Message):boolean");
    }

    public boolean A05(Message message) {
        boolean z = false;
        if (ThreadKey.A0q(message.A0V) && ((C1q7.A08(message) || C1q7.A0A(message) || message.A08 != null) && this.A04.A00())) {
            z = true;
        }
        return z;
    }

    public boolean A06(Message message) {
        boolean z = false;
        if (message != null && !5Q0.A06(message)) {
            AnonymousClass470 anonymousClass470 = (AnonymousClass470) 1Hv.A02(FbInjector.A00(), 32912);
            if (A01(message.A0F, null, null) != 0S2.A15 && !1JF.A0B(message.A0F().A00) && !anonymousClass470.A08(message) && this.A04.A00()) {
                z = true;
            }
        }
        return z;
    }

    public boolean A07(63V r302) {
        switch (r302.ordinal()) {
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
                return this.A04.A00();
            case 15:
            case 20:
            case 24:
            case 25:
            default:
                return false;
        }
    }
}
