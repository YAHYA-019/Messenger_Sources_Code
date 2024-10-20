package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: Ifv.class */
public final class Ifv implements JGU {
    public int A00;
    public boolean A01;
    public D11 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 2JM A08;
    public final GF7 A09;
    public final Set A0A;
    public final 1De A0B;

    public Ifv(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0B = r303;
        1BY r0 = r303.A00;
        this.A06 = 1Lm.A03(fbUserSession, r0, 115577);
        this.A07 = 1Bu.A03(r0, 115578);
        this.A03 = GOn.A0g(fbUserSession, r0);
        this.A05 = 1Lm.A03(fbUserSession, r0, 99470);
        this.A04 = 1Bu.A03(r0, 67677);
        this.A0A = GOn.A1J();
        this.A08 = IY8.A01(this, 17);
        this.A09 = new IYh(this);
    }

    public final void A00(ERJ erj, ERK erk, Long l, Long l2, Long l3) {
        ((Hnx) 1Br.A0B(this.A06)).A00(HBK.A03, ((HlJ) 1Br.A0B(this.A07)).A00(new D1D(erj, erk, (Boolean) null, l, l2, l3)));
    }

    public void Bfc(byte[] bArr) {
        11T.A0F(bArr, 0);
        try {
            2An A00 = BXt.A00(new 29S(), bArr);
            A00.A0K();
            D1B d1b = null;
            ArrayList arrayList = null;
            loop0: while (true) {
                C29Q A0E = A00.A0E();
                byte b = A0E.A00;
                if (b == 0) {
                    A00.A0M();
                    D11 d11 = new D11(d1b, arrayList);
                    this.A02 = d11;
                    for (JFd jFd : this.A0A) {
                        11T.A0D(d11);
                        jFd.CNA(d11);
                    }
                    return;
                }
                short s = A0E.A03;
                if (s != 1) {
                    if (s == 2 && b == 15) {
                        int i = A00.A0F().A01;
                        arrayList = AbI.A1G(i);
                        if (i < 0) {
                            break;
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList.add(A00.A0I());
                        }
                    }
                    C3P2.A00(A00, b);
                } else if (b == 12) {
                    A00.A0K();
                    Long l = null;
                    Long l2 = null;
                    Long l3 = null;
                    ERK erk = null;
                    ArrayList arrayList2 = null;
                    while (true) {
                        C29Q A0E2 = A00.A0E();
                        byte b2 = A0E2.A00;
                        if (b2 == 0) {
                            A00.A0M();
                            new D1B(erk, l2, l3, l, arrayList2);
                            break;
                        }
                        short s2 = A0E2.A03;
                        if (s2 != 1) {
                            if (s2 != 2) {
                                if (s2 != 3) {
                                    if (s2 != 4) {
                                        if (s2 == 5 && b2 == 10) {
                                            l = AbI.A13(A00);
                                        }
                                        C3P2.A00(A00, b2);
                                    } else if (b2 == 15) {
                                        int i3 = A00.A0F().A01;
                                        arrayList2 = AbI.A1G(i3);
                                        if (i3 < 0) {
                                            break loop0;
                                        }
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            A00.A0K();
                                            Long l4 = null;
                                            while (true) {
                                                C29Q A0E3 = A00.A0E();
                                                byte b3 = A0E3.A00;
                                                if (b3 == 0) {
                                                    break;
                                                }
                                                if (A0E3.A03 == 1 && b3 == 10) {
                                                    l4 = AbI.A13(A00);
                                                } else {
                                                    C3P2.A00(A00, b3);
                                                }
                                            }
                                            A00.A0M();
                                            arrayList2.add(new RxG(l4));
                                        }
                                    } else {
                                        C3P2.A00(A00, b2);
                                    }
                                } else if (b2 == 8) {
                                    int A0C = A00.A0C();
                                    erk = A0C != 1 ? A0C != 2 ? A0C != 3 ? A0C != 4 ? null : ERK.A01 : ERK.A02 : ERK.A04 : ERK.A03;
                                } else {
                                    C3P2.A00(A00, b2);
                                }
                            } else if (b2 == 10) {
                                l3 = AbI.A13(A00);
                            } else {
                                C3P2.A00(A00, b2);
                            }
                        } else if (b2 == 10) {
                            l2 = AbI.A13(A00);
                        } else {
                            C3P2.A00(A00, b2);
                        }
                    }
                } else {
                    C3P2.A00(A00, b);
                }
            }
            2An.A06();
            throw 0Q8.createAndThrow();
        } catch (2LA e) {
            4zI.A03.A02("CoplayStateSyncTopicManager", "Unable to deserialize coplay state update", e, new Object[0]);
        }
    }
}
