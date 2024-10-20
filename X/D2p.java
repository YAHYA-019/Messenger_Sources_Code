package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.google.common.base.Function;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: D2p.class */
public final class D2p implements Function {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public D2p(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        byte b;
        BLE[] bleArr;
        BLE[] bleArr2;
        BLE ble;
        String str;
        switch (this.A00) {
            case 0:
                Collection collection = (Collection) obj;
                boolean z = this.A02;
                CbS cbS = ((BuY) this.A01).A04;
                if (z) {
                    b = true;
                    bleArr = new BLE[]{BLE.A01};
                    bleArr2 = new BLE[2];
                    bleArr2[0] = BLE.A03;
                    ble = BLE.A02;
                } else {
                    b = false;
                    bleArr = new BLE[]{BLE.A02};
                    bleArr2 = new BLE[1];
                    ble = BLE.A04;
                }
                bleArr2[b == true ? 1 : 0] = ble;
                cbS.A00.AAs();
                HashSet A0v = collection == null ? AnonymousClass001.A0v() : AbF.A1E(collection);
                Iterator A0y = AnonymousClass001.A0y(cbS.A05);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    BLE ble2 = ((Bli) A0z.getValue()).A01;
                    if (ble2 == bleArr[0]) {
                        A0v.addAll((Collection) A0z.getKey());
                    } else {
                        int length = bleArr2.length;
                        int i = 0;
                        while (true) {
                            if (ble2 == bleArr2[i]) {
                                A0v.removeAll((Collection) A0z.getKey());
                            } else {
                                i++;
                                if (i < length) {
                                }
                            }
                        }
                    }
                }
                return 1BK.A17(A0v);
            case 1:
                IXv iXv = (JNm) obj;
                if (iXv != null) {
                    iXv.A00.APQ(this.A02);
                    11T.A0A(1hM.A01);
                }
                return AnonymousClass001.A0K();
            default:
                Boolean A0K = AnonymousClass001.A0K();
                if (11T.A0O(obj, A0K)) {
                    Cp3 cp3 = (Cp3) this.A01;
                    boolean z2 = this.A02;
                    LobbyRootView lobbyRootView = cp3.A02;
                    LithoView lithoView = lobbyRootView.A01;
                    int i2 = 2131967874;
                    if (z2) {
                        i2 = 2131967876;
                    }
                    C2cd.A05(lithoView, lobbyRootView.getResources().getString(i2));
                    IFc.A06(AbM.A0b(lobbyRootView.A0T), "rooms_lobby_toggle_video");
                    if (11T.A0O(cp3.A03, A0K) && (str = cp3.A04) != null) {
                        C5k c5k = new C5k();
                        c5k.A00 = z2 ? BOf.A0H : BOf.A0G;
                        c5k.A00(BOG.A01);
                        c5k.A02 = BOd.A04;
                        c5k.A05 = str;
                        ((CPV) 1Br.A0B(lobbyRootView.A0O)).A04(new C99(c5k));
                    }
                }
                return Boolean.valueOf(11T.A0O(obj, A0K));
        }
    }
}
