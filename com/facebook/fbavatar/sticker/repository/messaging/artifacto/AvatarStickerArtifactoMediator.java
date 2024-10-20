package com.facebook.fbavatar.sticker.repository.messaging.artifacto;

import X.0DR;
import X.11T;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1G1;
import X.4YU;
import X.5Vk;
import X.7zU;
import X.7zV;
import X.9uP;
import X.AbR;
import X.C2s7;
import X.C9bv;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AvatarStickerArtifactoMediator.class */
public final class AvatarStickerArtifactoMediator {
    public final C9bv A00;
    public final C9bv A01;
    public final 1Br A02;
    public final 1Br A03;
    public final String A04;
    public final 1De A05;

    public AvatarStickerArtifactoMediator(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 377);
        this.A02 = 1Bu.A03(r0, 82763);
        this.A04 = ((1G1) fbUserSession).A02;
        this.A00 = ((AbR) 1Br.A0B(this.A03)).A04(fbUserSession);
        this.A01 = ((AbR) 1Br.A0B(this.A03)).A04(fbUserSession);
    }

    public static final Object A00(AvatarStickerArtifactoMediator avatarStickerArtifactoMediator, ThreadKey threadKey, 0DR r303) {
        C2s7 A0d = 7zV.A0d(r303);
        if (threadKey.A1N()) {
            A0d.resumeWith(4YU.A0z(threadKey));
        } else {
            7zU.A0M((5Vk) 1Br.A0B(avatarStickerArtifactoMediator.A02), threadKey).A03(new 9uP(A0d, avatarStickerArtifactoMediator, 0));
        }
        return A0d.A0C();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(com.facebook.messaging.model.threadkey.ThreadKey r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.sticker.repository.messaging.artifacto.AvatarStickerArtifactoMediator.A01(com.facebook.messaging.model.threadkey.ThreadKey, X.0DR):java.lang.Object");
    }
}
