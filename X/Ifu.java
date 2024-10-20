package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

/* loaded from: Ifu.class */
public final class Ifu implements JGU {
    public Io9 A00;
    public final C00i A01 = 1BV.A00(115578);
    public final Set A02 = GOn.A1J();
    public final C00i A03;

    public Ifu(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A03 = new 1MV(fbUserSession, 115577);
    }

    public void A00(HCk hCk) {
        IoB ioB = new IoB();
        ioB.floorControlAction = hCk;
        ioB.floorControlStream = null;
        ioB.floorControlIntent = null;
        ioB.session_id = null;
        ioB.clientEndpointId = null;
        ((Hnx) this.A03.get()).A00(HBK.A07, ((HlJ) this.A01.get()).A00(ioB));
    }

    public void Bfc(byte[] bArr) {
        HA2 ha2;
        try {
            2An A00 = BXt.A00(new 29S(), bArr);
            ArrayList arrayList = null;
            String str = null;
            long j = 0;
            BitSet A18 = 1BK.A18(1);
            A00.A0L();
            while (true) {
                C29Q A0E = A00.A0E();
                byte b = A0E.A00;
                if (b == 0) {
                    A00.A0M();
                    BitSet A182 = 1BK.A18(1);
                    A182.set(0, true);
                    Io9 io9 = new Io9();
                    io9.floorParticipants = arrayList;
                    io9.session_id = str;
                    if (A182.get(0)) {
                        io9.session_start_time_ms = j;
                        io9.__isset_bit_vector.set(0, true);
                    }
                    this.A00 = io9;
                    for (HVL hvl : this.A02) {
                        Io9 io92 = this.A00;
                        11T.A0F(io92, 0);
                        Hu8 hu8 = hvl.A00;
                        if (hu8.A02() && hu8.A00 == 7) {
                            4zJ r0 = 4zI.A03;
                            r0.A05("ScreenshareFloorControlStateImpl", "onStateReceived called for %s", new Object[]{io92.toString()});
                            List list = io92.floorParticipants;
                            if (list != null) {
                                String str2 = null;
                                if (list.isEmpty()) {
                                    String str3 = hu8.A02;
                                    if (str3 != null) {
                                        ha2 = HA2.A02;
                                        hu8.A01 = ha2;
                                        boolean equals = str3.equals(hu8.A03);
                                        hu8.A02 = null;
                                        if (!equals) {
                                            r0.A05("ScreenshareFloorControlStateImpl", "notifyStateChangeEvent for state %s and owner is : %s", new Object[]{ha2, str2});
                                            7zP.A0N(hu8.A05).Ciz(new Irm(hu8));
                                        }
                                    }
                                } else {
                                    String str4 = ((IoA) io92.floorParticipants.get(0)).fbid;
                                    if (str4 == null) {
                                        hu8.A02 = null;
                                        hu8.A01 = HA2.A02;
                                    } else if (!str4.equals(hu8.A02)) {
                                        boolean equals2 = str4.equals(hu8.A03);
                                        hu8.A02 = str4;
                                        str2 = str4;
                                        ha2 = equals2 ? HA2.A04 : HA2.A03;
                                        hu8.A01 = ha2;
                                        r0.A05("ScreenshareFloorControlStateImpl", "notifyStateChangeEvent for state %s and owner is : %s", new Object[]{ha2, str2});
                                        7zP.A0N(hu8.A05).Ciz(new Irm(hu8));
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                short s = A0E.A03;
                if (s != 1) {
                    if (s != 2) {
                        if (s == 3 && b == 10) {
                            j = A00.A0D();
                            A18.set(0, true);
                        }
                        C3P2.A00(A00, b);
                    } else if (b == 11) {
                        str = A00.A0I();
                    } else {
                        C3P2.A00(A00, b);
                    }
                } else if (b == 15) {
                    int i = A00.A0F().A01;
                    arrayList = AbI.A1G(i);
                    if (i < 0) {
                        2An.A06();
                        throw 0Q8.createAndThrow();
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        IoA ioA = new IoA();
                        A00.A0L();
                        while (true) {
                            C29Q A0E2 = A00.A0E();
                            byte b2 = A0E2.A00;
                            if (b2 == 0) {
                                break;
                            }
                            short s2 = A0E2.A03;
                            if (s2 != 1) {
                                if (s2 != 2) {
                                    if (s2 != 3) {
                                        if (s2 == 4 && b2 == 11) {
                                            ioA.clientEndpointId = A00.A0I();
                                        }
                                        C3P2.A00(A00, b2);
                                    } else if (b2 == 8) {
                                        int A0C = A00.A0C();
                                        ioA.floorControlIntent = A0C != 0 ? A0C != 1 ? null : HCh.A01 : HCh.A02;
                                    } else {
                                        C3P2.A00(A00, b2);
                                    }
                                } else if (b2 == 8) {
                                    int A0C2 = A00.A0C();
                                    ioA.floorControlStream = A0C2 != 0 ? A0C2 != 1 ? null : HCi.A02 : HCi.A01;
                                } else {
                                    C3P2.A00(A00, b2);
                                }
                            } else if (b2 == 11) {
                                ioA.fbid = A00.A0I();
                            } else {
                                C3P2.A00(A00, b2);
                            }
                        }
                        A00.A0M();
                        arrayList.add(ioA);
                    }
                } else {
                    C3P2.A00(A00, b);
                }
            }
        } catch (2LA e) {
            4zI.A03.A02("FloorControlStateSyncTopicManager", "Unable to deserialize floorcontrol state update", e, AnonymousClass001.A1Z());
        }
    }
}
