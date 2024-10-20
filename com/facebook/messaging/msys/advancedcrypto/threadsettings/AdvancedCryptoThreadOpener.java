package com.facebook.messaging.msys.advancedcrypto.threadsettings;

import X.04S;
import X.0DE;
import X.0DR;
import X.0Ds;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BP;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1G1;
import X.1HG;
import X.1Lm;
import X.1SI;
import X.1XU;
import X.2Zo;
import X.2aK;
import X.4YU;
import X.5SW;
import X.6HS;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zT;
import X.AJb;
import X.AnonymousClass001;
import X.AnonymousClass851;
import X.C2rw;
import X.CLj;
import X.Cbd;
import X.J8J;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: AdvancedCryptoThreadOpener.class */
public final class AdvancedCryptoThreadOpener {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final FbUserSession A08;
    public final 1BP A09;
    public final 1De A0A;

    public AdvancedCryptoThreadOpener(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0A = r303;
        this.A08 = fbUserSession;
        this.A09 = FbInjector.A00;
        this.A06 = 1HG.A00(7zL.A09(), 50024);
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 49711);
        this.A04 = 7zM.A0M();
        this.A02 = 1Bq.A00(82117);
        this.A05 = 1Lm.A03(fbUserSession, r0, 16892);
        this.A07 = 1Bu.A03(r0, 16671);
        this.A03 = 7zM.A0S();
        this.A00 = 1Bq.A00(50143);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
    
        if (r322 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(android.content.Context r301, com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener r302, X.5SW r303, com.google.common.collect.ImmutableSet r304, java.lang.String r305, X.0DR r306) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener.A00(android.content.Context, com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener, X.5SW, com.google.common.collect.ImmutableSet, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    public static final void A01(Context context, ThreadKey threadKey, AdvancedCryptoThreadOpener advancedCryptoThreadOpener, 5SW r304) {
        Intent A03;
        ?? r0;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (1XU.A00(context)) {
            ((6HS) 1Br.A0B(advancedCryptoThreadOpener.A06)).A01.A04(threadKey, null, r304, "open_advanced_crypto_thread", false, false);
            return;
        }
        if (z && C2rw.A00(context)) {
            1Br.A0C(advancedCryptoThreadOpener.A02);
            Intent A01 = CLj.A01(context, threadKey);
            A03 = A01;
            r0 = A01;
        } else {
            A03 = ((6HS) 1Br.A0B(advancedCryptoThreadOpener.A06)).A03(threadKey, r304, "open_advanced_crypto_thread");
            Intent intent = A03;
            11T.A0A(intent);
            r0 = intent;
        }
        try {
            r0 = context;
            7zT.A12((Context) r0, A03, advancedCryptoThreadOpener.A04);
        } catch (NullPointerException unused) {
            0fH.A0j("ACTOpener", r0.getMessage());
        }
    }

    public static final void A02(Context context, AdvancedCryptoThreadOpener advancedCryptoThreadOpener, 5SW r303, ImmutableList immutableList, String str, int i) {
        StringBuilder A0k = AnonymousClass001.A0k();
        if (str != null && str.length() > i) {
            A0k.append(7zM.A1C(0, i, str));
        }
        2aK.A03((Integer) null, (0DE) null, new AJb(advancedCryptoThreadOpener, context, immutableList, r303, A0k, str, null, 4), 7zN.A0y(), 3);
    }

    public final Object A03(Context context, 5SW r303, ImmutableList immutableList, String str, 0DR r306) {
        Object A00;
        String A13;
        if (((1SI) 1Br.A0B(this.A07)).A02()) {
            if (str == null || immutableList.size() <= 2 || (A13 = 4YU.A13(str)) == null) {
                ImmutableSet A07 = ImmutableSet.A07(immutableList);
                11T.A0A(A07);
                A00 = A00(context, this, r303, A07, null, r306);
            } else {
                A00 = 2aK.A00(r306, 2Zo.A00(), new J8J(r303, immutableList, this, context, A13, (0DR) null, 7));
                if (A00 != 0Ds.A02) {
                    A00 = 04S.A00;
                }
            }
            if (A00 == 0Ds.A02) {
                return A00;
            }
        }
        return 04S.A00;
    }

    public final void A04(Context context, 5SW r303, User user) {
        11T.A0H(context, user);
        1G1 r0 = this.A08;
        1Br A00 = 1Lm.A00(context, r0, 84719);
        String str = r0.A02;
        if (((1SI) 1Br.A0B(this.A07)).A03()) {
            2aK.A03((Integer) null, (0DE) null, new AnonymousClass851(this, r303, context, user, (0DR) null, 30), 7zN.A0y(), 3);
            return;
        }
        try {
            long parseLong = Long.parseLong(str);
            long A0H = 7zQ.A0H(user);
            if (parseLong == 0 || A0H == 0) {
                throw AnonymousClass001.A0T("Invalid viewer user id or other user id");
            }
            ThreadKey A0I = ThreadKey.A0I(A0H, parseLong);
            Cbd cbd = (Cbd) 1Br.A0B(A00);
            String obj = r303.toString();
            if (obj == null) {
                obj = "";
            }
            cbd.A02(A0I, 1BK.A0d(), obj);
            A01(context, A0I, this, r303);
        } catch (NumberFormatException unused) {
            throw AnonymousClass001.A0T("Error while parsing viewer user id and other user id");
        }
    }

    public final void A05(Context context, 5SW r303, ImmutableList immutableList, String str) {
        2aK.A03((Integer) null, (0DE) null, new J8J(r303, immutableList, this, context, str, (0DR) null, 6), 7zN.A0y(), 3);
    }
}
