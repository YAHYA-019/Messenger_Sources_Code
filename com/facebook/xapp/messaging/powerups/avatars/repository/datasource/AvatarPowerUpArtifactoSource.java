package com.facebook.xapp.messaging.powerups.avatars.repository.datasource;

import X.0oO;
import X.0zV;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1Lm;
import X.7zP;
import X.AJr;
import X.AnonymousClass610;
import X.C9s0;
import X.C9s1;
import X.C9s2;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.artifacto.AvatarArtifactRepository;

/* loaded from: AvatarPowerUpArtifactoSource.class */
public final class AvatarPowerUpArtifactoSource {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 0zV A03;
    public final FbUserSession A04;

    public AvatarPowerUpArtifactoSource(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        1Br A01 = 1Lm.A01(fbUserSession, 68721);
        this.A00 = A01;
        this.A01 = 1Bu.A00(67802);
        this.A02 = 1Bu.A00(67781);
        AvatarArtifactRepository A0Q = 7zP.A0Q(A01);
        C9s0 c9s0 = C9s0.A00;
        String str = ((1G1) fbUserSession).A02;
        this.A03 = new 0oO(1, AvatarArtifactRepository.A00(1Br.A07(((AnonymousClass610) 1Br.A0B(this.A02)).A00).AZk(36321881294259092L) ? C9s1.A00 : C9s2.A00, 7zP.A0Q(this.A00), null, 11T.A03(str)), AvatarArtifactRepository.A00(c9s0, A0Q, null, 11T.A03(str)), new AJr(this, null, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.powerups.avatars.repository.datasource.AvatarPowerUpArtifactoSource.A00(X.0DR):java.lang.Object");
    }
}
