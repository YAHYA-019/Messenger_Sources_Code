package com.facebook.messaging.avatar.hotlike.plugins.impl;

import X.0CU;
import X.11T;
import X.1Br;
import X.6Qb;
import X.6Qc;
import X.6Qd;
import X.6Qf;
import X.6fG;
import X.6fM;
import X.8O0;
import X.A4n;
import X.AnonymousClass749;
import X.C00i;
import X.C7yt;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.OneLineComposerView;
import com.google.common.base.Objects;

/* loaded from: HotLikeAvatarExtensionImplementation.class */
public final class HotLikeAvatarExtensionImplementation {
    public Drawable A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 6Qc A07;
    public final 6Qb A08;
    public final 6fG A09;
    public final 6Qd A0A;
    public final 6Qf A0B;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HotLikeAvatarExtensionImplementation(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, X.6Qd r304, X.6Qc r305, X.6Qb r306, X.6Qf r307) {
        /*
            r301 = this;
            r0 = r307
            r1 = 2
            X.11T.A0F(r0, r1)
            r0 = r305
            r1 = 3
            X.11T.A0F(r0, r1)
            r0 = r304
            r1 = 4
            X.11T.A0F(r0, r1)
            r0 = r306
            r1 = 5
            X.11T.A0F(r0, r1)
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r301
            r1 = r307
            r0.A0B = r1
            r0 = r301
            r1 = r305
            r0.A07 = r1
            r0 = r301
            r1 = r304
            r0.A0A = r1
            r0 = r301
            r1 = r306
            r0.A08 = r1
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = 66067(0x10213, float:9.258E-41)
            X.1Br r0 = X.1Bq.A00(r0)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A04 = r1
            r0 = 115099(0x1c19b, float:1.61288E-40)
            X.1Br r0 = X.1Bu.A00(r0)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A05 = r1
            r0 = r302
            r1 = r303
            r2 = 65854(0x1013e, float:9.2281E-41)
            X.1Br r0 = X.1Lm.A00(r0, r1, r2)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A03 = r1
            r0 = r302
            r1 = 65898(0x1016a, float:9.2343E-41)
            X.1Br r0 = X.1HG.A00(r0, r1)
            r308 = r0
            r0 = r301
            r1 = r308
            r0.A06 = r1
            X.6fG r0 = new X.6fG
            r309 = r0
            r0 = r309
            r1 = r301
            r0.<init>(r1)
            r0 = r301
            r1 = r309
            r0.A09 = r1
            r0 = 115909(0x1c4c5, float:1.62423E-40)
            r310 = r0
            r0 = r310
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L97
            X.67L r0 = (X.67L) r0     // Catch: java.lang.Throwable -> L97
            r1 = r309
            boolean r0 = r0.A05(r1)
            return
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation.<init>(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.6Qd, X.6Qc, X.6Qb, X.6Qf):void");
    }

    public static final void A00(Drawable drawable, HotLikeAvatarExtensionImplementation hotLikeAvatarExtensionImplementation, String str) {
        6fM r0 = hotLikeAvatarExtensionImplementation.A00;
        if ((r0 instanceof 6fM) && (drawable instanceof 6fM) && 11T.A0O(r0.A07, ((6fM) drawable).A07)) {
            return;
        }
        hotLikeAvatarExtensionImplementation.A00 = drawable;
        C7yt c7yt = hotLikeAvatarExtensionImplementation.A0B.A00.A0A;
        if (c7yt != null) {
            OneLineComposerView oneLineComposerView = (OneLineComposerView) c7yt;
            if (Objects.equal(oneLineComposerView.A06, drawable)) {
                return;
            }
            OneLineComposerView.A06(drawable, oneLineComposerView, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.graphics.drawable.Drawable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation.A01(com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation, java.lang.String):void");
    }

    public static final void A02(HotLikeAvatarExtensionImplementation hotLikeAvatarExtensionImplementation, String str, String str2) {
        if (str2 == null || 0CU.A0O(str2) || !hotLikeAvatarExtensionImplementation.A03()) {
            A01(hotLikeAvatarExtensionImplementation, str);
            return;
        }
        C00i c00i = hotLikeAvatarExtensionImplementation.A03.A00;
        String str3 = null;
        6fM A00 = ((AnonymousClass749) c00i.get()).A00(null, str);
        if (A00 != null) {
            8O0 A01 = ((AnonymousClass749) c00i.get()).A01(str);
            if (A01 != null) {
                str3 = A01.label;
            }
            A00(A00, hotLikeAvatarExtensionImplementation, str3);
        }
        ((AnonymousClass749) c00i.get()).A02(new A4n(hotLikeAvatarExtensionImplementation, str), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (com.facebook.messaging.model.threadkey.ThreadKey.A0q(r302) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03() {
        /*
            r301 = this;
            r0 = r301
            X.6Qd r0 = r0.A0A
            X.6QS r0 = r0.A00
            com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource r0 = r0.A0J
            r302 = r0
            com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource r0 = com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource.A05
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L40
            r0 = r301
            X.6Qb r0 = r0.A08
            X.6Qa r0 = (X.6Qa) r0
            X.6QS r0 = r0.A00
            X.6fA r0 = r0.A0H
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L51
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A02
            r302 = r0
        L2b:
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0p(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L40
            r0 = r302
            boolean r0 = com.facebook.messaging.model.threadkey.ThreadKey.A0q(r0)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L4e
        L40:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            r0.A00 = r1
        L4e:
            r0 = r305
            return r0
        L51:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.hotlike.plugins.impl.HotLikeAvatarExtensionImplementation.A03():boolean");
    }
}
