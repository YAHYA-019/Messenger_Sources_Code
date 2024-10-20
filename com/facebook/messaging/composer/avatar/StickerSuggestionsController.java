package com.facebook.messaging.composer.avatar;

import X.0DE;
import X.0KV;
import X.0S2;
import X.11T;
import X.16K;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Lm;
import X.1XU;
import X.2Zo;
import X.2Zs;
import X.2Zy;
import X.2aG;
import X.2aI;
import X.2aK;
import X.6Qf;
import X.6RU;
import X.6Sh;
import X.7FI;
import X.7MC;
import X.7My;
import X.82Z;
import X.AnonymousClass831;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.C6fe;
import X.C82r;
import X.C82t;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: StickerSuggestionsController.class */
public final class StickerSuggestionsController {
    public static final 82Z A0S;
    public StickerTypeaheadImpl A00;
    public 82Z A01;
    public 7My A02;
    public 6Qf A03;
    public ThreadKey A04;
    public String A05;
    public String A06;
    public WeakReference A07;
    public List A08;
    public 2aI A09;
    public boolean A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final FbUserSession A0E;
    public final 1De A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final C01i A0L;
    public final 16K A0M;
    public final 16K A0N;
    public final 1Br A0O;
    public final AtomicBoolean A0P;
    public final 2Zs A0Q;
    public volatile String A0R;

    static {
        C0ty c0ty = C0ty.A00;
        A0S = new 82Z(c0ty, c0ty);
    }

    public StickerSuggestionsController(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0F = r303;
        this.A0E = fbUserSession;
        1BY r0 = r303.A00;
        this.A0J = 1Bu.A03(r0, 66486);
        this.A0O = 1Bq.A00(116048);
        this.A0G = 1Bq.A00(116049);
        this.A0H = 1Bq.A00(116064);
        this.A0I = 1Lm.A03(fbUserSession, r0, 66228);
        this.A0L = C01g.A00(C03i.A02, new AnonymousClass831(this, 35));
        this.A0Q = 2Zo.A03(true);
        Integer num = 0S2.A00;
        this.A09 = 2Zy.A02(2Zo.A02(num));
        this.A0P = new AtomicBoolean(false);
        this.A0K = 1Lm.A03(fbUserSession, r0, 65806);
        this.A06 = "";
        this.A01 = A0S;
        this.A08 = C0ty.A00;
        this.A05 = "";
        this.A0B = "";
        this.A0R = "";
        this.A0N = 0KV.A00(num, 0, 0);
        this.A0M = 0KV.A00(num, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebook.messaging.composer.avatar.StickerSuggestionsController r301, java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.avatar.StickerSuggestionsController.A00(com.facebook.messaging.composer.avatar.StickerSuggestionsController, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.6Sh, java.lang.Object] */
    public static final void A01(StickerSuggestionsController stickerSuggestionsController) {
        6RU r0;
        if (!((List) stickerSuggestionsController.A01.A02).isEmpty()) {
            stickerSuggestionsController.A01 = A0S;
            WeakReference weakReference = stickerSuggestionsController.A07;
            if (weakReference != null && (r0 = (6RU) weakReference.get()) != null) {
                7FI.A02(r0, (6Sh) new Object());
            }
            6Qf r02 = stickerSuggestionsController.A03;
            if (r02 != null) {
                r02.CzR("expression_search");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (((X.C82q) r306).A05 != 2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0317, code lost:
    
        if ((!r0.isEmpty()) != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016b  */
    /* JADX WARN: Type inference failed for: r322v1 */
    /* JADX WARN: Type inference failed for: r322v2 */
    /* JADX WARN: Type inference failed for: r322v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r302, com.facebook.messaging.model.threadkey.ThreadKey r303, java.lang.String r304, java.lang.String r305, X.0DR r306) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.avatar.StickerSuggestionsController.A02(com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(2:3|(19:5|6|7|(2:9|(2:11|(11:13|14|15|16|17|18|(1:20)|21|22|23|24)(2:27|28))(1:29))(5:38|(4:42|(1:44)|23|24)|22|23|24)|30|31|32|33|34|(2:36|37)|15|16|17|18|(0)|21|22|23|24))|47|6|7|(0)(0)|30|31|32|33|34|(0)|15|16|17|18|(0)|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x028c, code lost:
    
        r307 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x028e, code lost:
    
        X.0fH.A0r("StickerSuggestionsController", X.7zK.A00(com.facebook.acra.constants.ActionId.DISPLAYED_ON_SCREEN), r307);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A03(com.facebook.messaging.model.threadkey.ThreadKey r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.avatar.StickerSuggestionsController.A03(com.facebook.messaging.model.threadkey.ThreadKey, X.0DR):java.lang.Object");
    }

    public void A04() {
        2aG.A04((CancellationException) null, this.A09);
        this.A04 = null;
        this.A03 = null;
        this.A0D = false;
        this.A0R = "";
        this.A07 = null;
        this.A0I.A00.get();
        7My r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A05(Context context, ThreadKey threadKey) {
        if (2aG.A05(this.A09)) {
            2aG.A04((CancellationException) null, this.A09);
        }
        this.A09 = 2Zy.A02(this.A0Q);
        7MC r0 = (7MC) this.A0L.getValue();
        2aK.A03((Integer) null, (0DE) null, new StickerSuggestionsController$onStart$1(this, threadKey, null, r0.A02 ? r0.A01 : 0L), this.A09, 3);
        if (((int) ((C6fe) this.A0J.A00.get()).A00().Auy(36603373451286682L)) > 0) {
            7My r02 = this.A02;
            if (r02 != null) {
                this.A0A = r02.A01.A00();
            }
            if (this.A02 == null) {
                this.A0A = true;
                2aK.A03((Integer) null, (0DE) null, new C82r(this, null, 7), this.A09, 3);
            }
        }
        2aK.A03((Integer) null, (0DE) null, new C82t(this, threadKey, context, null, 1), this.A09, 3);
        A06(context, threadKey);
    }

    public final void A06(Context context, ThreadKey threadKey) {
        this.A04 = threadKey;
        boolean z = false;
        if ((!ThreadKey.A0f(threadKey) || !((C6fe) this.A0J.A00.get()).A00().AZk(36321898472752031L)) && !ThreadKey.A0b(threadKey) && !1XU.A00(context)) {
            z = true;
        }
        this.A0D = z;
    }

    public void A07(String str) {
        11T.A0F(str, 0);
        if (!this.A0D || this.A0A) {
            return;
        }
        this.A0R = str;
        int length = str.length();
        if (length > ((7MC) this.A0L.getValue()).A00 || length == 0) {
            A01(this);
        } else {
            2aK.A03((Integer) null, (0DE) null, new StickerSuggestionsController$handleTextChanged$1(this, str, null), this.A09, 3);
        }
    }
}
