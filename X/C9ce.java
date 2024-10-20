package X;

import android.os.Handler;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ce, reason: invalid class name */
/* loaded from: 9ce.class */
public final class C9ce {
    public ArrayList A01;
    public boolean A02;
    public final List A05 = AnonymousClass001.A0s();
    public final Handler A03 = AnonymousClass001.A07();
    public final 1Br A04 = 1Bu.A00(66478);
    public AvatarAudioMessagePose A00 = AvatarAudioMessagePose.A0D;

    public final Integer A00() {
        if (11T.A0O(this.A00, AvatarAudioMessagePose.A0D) || !((C6kf) 1Br.A0B(this.A04)).A00()) {
            return null;
        }
        return Integer.valueOf(this.A00.A00);
    }

    public final void A01(AvatarAudioMessagePose avatarAudioMessagePose) {
        boolean z;
        11T.A0F(avatarAudioMessagePose, 0);
        if (11T.A0O(this.A00, avatarAudioMessagePose)) {
            return;
        }
        this.A00 = avatarAudioMessagePose;
        for (70N r0 : this.A05) {
            AvatarAudioMessagePose avatarAudioMessagePose2 = this.A00;
            if (this.A02) {
                z = true;
                if (!11T.A0O(avatarAudioMessagePose2, AvatarAudioMessagePose.A0D)) {
                    r0.CKA(avatarAudioMessagePose2, z);
                }
            }
            z = false;
            r0.CKA(avatarAudioMessagePose2, z);
        }
    }

    public final void A02(boolean z) {
        AvatarAudioMessagePose avatarAudioMessagePose;
        this.A02 = false;
        if (z) {
            ArrayList arrayList = this.A01;
            if (arrayList == null) {
                this.A02 = true;
                return;
            } else {
                if (arrayList.size() <= 1) {
                    return;
                }
                Object obj = arrayList.get(1);
                11T.A0A(obj);
                avatarAudioMessagePose = (AvatarAudioMessagePose) obj;
            }
        } else {
            avatarAudioMessagePose = AvatarAudioMessagePose.A0D;
        }
        A01(avatarAudioMessagePose);
    }
}
