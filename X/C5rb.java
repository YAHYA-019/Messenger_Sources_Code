package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5rb, reason: invalid class name */
/* loaded from: 5rb.class */
public final class C5rb {
    public final C00i A02 = new 1BQ(83227);
    public final C00i A05 = new 1BQ(49797);
    public final C00i A04 = new 1BV(49419);
    public final C00i A06 = new 1BQ(49860);
    public final C00i A01 = new 1BQ(49861);
    public final C00i A03 = new 1BV(83733);
    public final C00i A00 = FbInjector.A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (r304.startsWith(r302) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.CharSequence A00(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.model.messages.Message r302, X.C5rb r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5rb.A00(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.model.messages.Message, X.5rb, java.lang.String, boolean):java.lang.CharSequence");
    }

    public CharSequence A01(FbUserSession fbUserSession, Message message, ThreadSummary threadSummary, boolean z) {
        ImmutableList immutableList;
        String A08 = ((C12104yr) this.A04.get()).A08(message, threadSummary != null ? threadSummary.BF2() : null);
        ThreadKey threadKey = message.A0V;
        return (z || !(threadKey.A06 == C1yg.ONE_TO_ONE || ThreadKey.A0d(threadKey) || (threadSummary != null && ThreadKey.A0p(threadSummary.A0n) && (immutableList = threadSummary.A1L) != null && immutableList.size() == 2))) ? A00(fbUserSession, message, this, A08, false) : A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.CharSequence] */
    public CharSequence A02(FbUserSession fbUserSession, Message message, boolean z) {
        Resources resources;
        int i;
        Object[] objArr;
        String str;
        String string;
        5bF r0 = (5bF) this.A05.get();
        ThreadKey threadKey = message.A0V;
        ThreadSummary A07 = r0.A07(threadKey);
        C00i c00i = this.A02;
        if (((C45a) c00i.get()).A05(message, A07)) {
            c00i.get();
            string = A00(fbUserSession, message, this, A07 == null ? message.A0F().A00 : ((C12104yr) this.A04.get()).A08(message, A07.BF2()), z);
        } else {
            if (z) {
                str = ((2fE) 1Lo.A06(fbUserSession, 17064)).A0B(message.A0K, threadKey);
                resources = ((Context) this.A00.get()).getResources();
                i = 2131959527;
                objArr = new Object[1];
            } else {
                resources = ((Context) this.A00.get()).getResources();
                i = 2131965758;
                objArr = new Object[1];
                str = message.A0K.A09.A00;
            }
            objArr[0] = str;
            string = resources.getString(i, objArr);
        }
        C5rd c5rd = (C5rd) this.A06.get();
        int A03 = C0A8.A03(((Context) c5rd.A01.get()).getResources(), 250.0f);
        if (string != null) {
            TextPaint textPaint = c5rd.A00;
            if (textPaint.getTypeface() != null) {
                string = TextUtils.ellipsize(string, textPaint, A03, TextUtils.TruncateAt.END).toString();
            }
        }
        return string;
    }
}
