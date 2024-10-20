package X;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: Hu6.class */
public final class Hu6 {
    public Optional A00;
    public Optional A01;
    public Optional A02;
    public Optional A03;
    public Optional A04;
    public Optional A05;
    public Optional A06;
    public Collection A07;
    public Collection A08;
    public Collection A09;
    public java.util.Map A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Hu6 hu6 = (Hu6) obj;
            if (!Objects.equal(this.A04, hu6.A04) || !Objects.equal(this.A09, hu6.A09) || !Objects.equal(this.A07, hu6.A07) || !Objects.equal(this.A00, hu6.A00) || !Objects.equal(this.A06, hu6.A06) || !Objects.equal(this.A03, hu6.A03) || !Objects.equal(this.A0A, hu6.A0A) || !Objects.equal(this.A08, hu6.A08) || !Objects.equal(this.A01, hu6.A01) || !Objects.equal(this.A05, hu6.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A09, this.A07, this.A00, this.A06, this.A03, this.A0A, this.A08, this.A01, this.A05});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JoinParams{serverInfoData=");
        A0k.append(this.A04);
        A0k.append(", usersToCall=");
        A0k.append(this.A09);
        A0k.append(", dataMessages=");
        A0k.append(this.A07);
        A0k.append(", stateSyncMessages=");
        A0k.append(this.A0A);
        A0k.append(", collisionKey=");
        A0k.append(this.A00);
        A0k.append(", threadKey=");
        A0k.append(this.A06);
        A0k.append(", linkUrl=");
        A0k.append(this.A03);
        A0k.append(", usersToApproveFromWaitingRoom=");
        A0k.append(this.A08);
        A0k.append(", isE2eeMandated=");
        A0k.append(this.A01);
        A0k.append(AbE.A00(100));
        A0k.append(this.A05);
        A0k.append(", isMicrophoneOn=");
        A0k.append(this.A02);
        return AnonymousClass001.A0f(A0k);
    }
}
