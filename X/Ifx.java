package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;
import java.util.List;

/* loaded from: Ifx.class */
public final class Ifx implements JGU {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final List A03;
    public final FbUserSession A04;
    public final 1De A05;

    public Ifx(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = fbUserSession;
        1BY r0 = r303.A00;
        this.A01 = 1Lm.A03(fbUserSession, r0, 115577);
        this.A02 = 1Bu.A03(r0, 115578);
        this.A00 = GOo.A0M(r0);
        this.A03 = AnonymousClass001.A0s();
    }

    public static final void A00(Ifx ifx, boolean z) {
        Io8 io8;
        C00i c00i = ifx.A00.A00;
        if (((53B) c00i.get()).A02()) {
            if (2yD.A03(53B.A00((53B) c00i.get()), 36314296385675116L)) {
                String str = ifx.A04.A05;
                io8 = new Io8();
                io8.used_avatars = z;
                io8.__isset_bit_vector.set(0, true);
                io8.userId = str;
            } else {
                io8 = new Io8();
                io8.used_avatars = z;
                io8.__isset_bit_vector.set(0, true);
            }
            ((Hnx) 1Br.A0B(ifx.A01)).A00(HBK.A06, ((HlJ) 1Br.A0B(ifx.A02)).A00(io8));
        }
    }

    public final void A01(JFZ jfz) {
        synchronized (this) {
            11T.A0F(jfz, 0);
            if (((53B) 1Br.A0B(this.A00)).A02()) {
                this.A03.add(jfz);
            }
        }
    }

    public void Bfc(byte[] bArr) {
        synchronized (this) {
            11T.A0F(bArr, 0);
            C00i c00i = this.A00.A00;
            if (((53B) c00i.get()).A02()) {
                try {
                    2An A00 = BXt.A00(new 29S(), bArr);
                    boolean z = false;
                    boolean z2 = false;
                    String str = null;
                    BitSet A18 = 1BK.A18(2);
                    A00.A0L();
                    while (true) {
                        C29Q A0E = A00.A0E();
                        byte b = A0E.A00;
                        if (b == 0) {
                            break;
                        }
                        short s = A0E.A03;
                        if (s != 1) {
                            if (s != 2) {
                                if (s == 3 && b == 11) {
                                    str = A00.A0I();
                                }
                                C3P2.A00(A00, b);
                            } else if (b == 2) {
                                z = A00.A0d();
                                A18.set(1, true);
                            } else {
                                C3P2.A00(A00, b);
                            }
                        } else if (b == 2) {
                            z2 = A00.A0d();
                            A18.set(0, true);
                        } else {
                            C3P2.A00(A00, b);
                        }
                    }
                    A00.A0M();
                    for (JFZ jfz : this.A03) {
                        jfz.CBB(2yD.A03(53B.A00((53B) c00i.get()), 36314296385675116L) ? str : null, z2, z);
                    }
                } catch (2LA e) {
                    4zI.A03.A02("EnteredAvatarsModeStateSyncMessageHandler", "Unable to deserialize entered avatars mode state update", e, new Object[0]);
                }
            }
        }
    }
}
