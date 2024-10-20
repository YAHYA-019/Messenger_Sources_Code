package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rtcactivity.interfaces.DataSender;
import java.util.Collection;

/* loaded from: Ig9.class */
public final class Ig9 implements DataSender {
    public final FbUserSession A00;
    public final 1De A01;
    public final 1Br A02;

    public Ig9(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A02 = 7zM.A0h(r303, 114909);
    }

    @Override // com.facebook.rtcactivity.interfaces.DataSender
    public void sendDataMessageToPeers(String str, byte[] bArr) {
        if (I6z.A01(this.A02, str, 1BL.A1W(str, bArr))) {
            ((DataSender) 4YU.A0n(this.A00, this.A01, 114904)).sendDataMessageToPeers(str, bArr);
        }
    }

    @Override // com.facebook.rtcactivity.interfaces.DataSender
    public void sendDataMessageToPeers(String str, byte[] bArr, Collection collection) {
        11T.A0F(str, 0);
        11T.A0G(bArr, 1, collection);
        if (I6z.A01(this.A02, str, true)) {
            ((DataSender) 4YU.A0n(this.A00, this.A01, 114904)).sendDataMessageToPeers(str, bArr, collection);
        }
    }

    @Override // com.facebook.rtcactivity.interfaces.DataSender
    public void sendDataMessageToPeersTransacted(String str, byte[] bArr) {
        if (I6z.A01(this.A02, str, 1BL.A1W(str, bArr))) {
            ((DataSender) 4YU.A0n(this.A00, this.A01, 114904)).sendDataMessageToPeersTransacted(str, bArr);
        }
    }

    @Override // com.facebook.rtcactivity.interfaces.DataSender
    public void sendDataMessageToPeersTransacted(String str, byte[] bArr, Collection collection) {
        11T.A0F(str, 0);
        11T.A0G(bArr, 1, collection);
        if (I6z.A01(this.A02, str, true)) {
            return;
        }
        ((DataSender) 4YU.A0n(this.A00, this.A01, 114904)).sendDataMessageToPeersTransacted(str, bArr, collection);
    }
}
