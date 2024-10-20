package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioManager;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: Gyk.class */
public final class Gyk extends If6 {
    public BluetoothHeadset A00;
    public List A01;
    public boolean A02;
    public final BluetoothProfile.ServiceListener A03;
    public final JGN A04;
    public final C01i A05;
    public final I9J A06;
    public final IDc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gyk(Context context, AudioManager audioManager, I9J i9j, HFd hFd, JGN jgn, JKQ jkq, JLv jLv, HuN huN, HgZ hgZ, IDc iDc, ExecutorService executorService) {
        super(context, audioManager, null, hFd, jkq, jLv, huN, hgZ, executorService);
        1BL.A11(1, context, hgZ, audioManager);
        11T.A0F(jLv, 7);
        7zP.A1O(iDc, 10, hFd);
        this.A06 = i9j;
        this.A04 = jgn;
        this.A07 = iDc;
        this.A01 = AnonymousClass001.A0s();
        this.A05 = J9p.A00(context, 12);
        this.A03 = new IGA(this);
    }

    private final CallEndpoint A00(HBP hbp) {
        Object obj;
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (A01((CallEndpoint) obj) == hbp) {
                break;
            }
        }
        return (CallEndpoint) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return X.HBP.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r301.aomDisableEarpieceMode != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.HBP A01(android.telecom.CallEndpoint r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r302
            int r0 = r0.getEndpointType()
            r303 = r0
            r0 = r303
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r304 = r0
            r0 = 2
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L35
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L1f
            X.HBP r0 = X.HBP.A02
            return r0
        L1f:
            r0 = 4
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L40
            r0 = 3
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L44
            X.HBP r0 = X.HBP.A04
            return r0
        L35:
            r0 = r301
            boolean r0 = r0.aomDisableEarpieceMode
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4d
        L40:
            X.HBP r0 = X.HBP.A05
            return r0
        L44:
            r0 = 1
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L35
        L4d:
            X.HBP r0 = X.HBP.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyk.A01(android.telecom.CallEndpoint):X.HBP");
    }

    public static final void A02(Gyk gyk) {
        HBP AfZ = gyk.AfZ();
        if (AfZ == HBP.A05) {
            ((If6) gyk).A05.ALc("ConnectionServiceAudioOutputManagerImpl", 0Pz.A1C("Speakerphone finished turning on for video call | AudioManager: ", ((If6) gyk).A02.isSpeakerphoneOn()), new Object[0]);
            gyk.A02 = false;
        }
        if (gyk.aomCurrentAudioOutput != AfZ) {
            ((If6) gyk).A05.ALc("ConnectionServiceAudioOutputManagerImpl", "onCallAudioStateChanged update audio output from %s to %s", gyk.aomCurrentAudioOutput, AfZ);
            11T.A0F(AfZ, 0);
            gyk.aomCurrentAudioOutput = AfZ;
            gyk.A0J();
        }
        gyk.A0N();
    }

    public void A0N() {
        super.A05.ALc("ConnectionServiceAudioOutputManagerImpl", "updateAudioOutput to %s", this.aomCurrentAudioOutput);
        this.A04.Cm2(this.aomCurrentAudioOutput);
    }

    public boolean AEW(HBP hbp) {
        11T.A0F(hbp, 0);
        super.A05.ALc("ConnectionServiceAudioOutputManagerImpl", "changeAudio to %s", hbp);
        this.audioManagerQplLogger.Bct("change_audio", String.valueOf(hbp));
        if (super.A04.A00()) {
            CallEndpoint A00 = A00(hbp);
            if (A00 == null) {
                return false;
            }
            this.A07.A06(new IHb(A00, this), A00);
            return false;
        }
        IDc iDc = this.A07;
        int ordinal = hbp.ordinal();
        int i = 4;
        if (ordinal == 2) {
            i = 2;
        } else if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 8;
        } else if (ordinal != 3) {
            throw 1BK.A1F();
        }
        I9W i9w = iDc.A03;
        if (i9w == null) {
            11T.A0L("selfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        if (i9w.A08(iDc.A07, i)) {
            return true;
        }
        iDc.A06 = Integer.valueOf(i);
        return false;
    }

    public void AEq(boolean z) {
    }

    public void AF6(boolean z, boolean z2) {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        if (z2) {
            super.A02.setMicrophoneMute(false);
        }
        if (super.A02.isSpeakerphoneOn()) {
            AEW(HBP.A03);
        }
        this.A04.Cm2((HBP) null);
        BroadcastReceiver broadcastReceiver = super.A00;
        if (broadcastReceiver != null) {
            super.A01.unregisterReceiver(broadcastReceiver);
            super.A00 = null;
        }
        if (this.A00 == null || (bluetoothManager = (BluetoothManager) this.A05.getValue()) == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return;
        }
        adapter.closeProfileProxy(1, this.A00);
    }

    public BluetoothHeadset Adt() {
        return this.A00;
    }

    public HBP AfZ() {
        boolean A00 = super.A04.A00();
        IDc iDc = this.A07;
        if (A00) {
            return A01(iDc.A05());
        }
        int A04 = iDc.A04();
        if (A04 != 1) {
            if (A04 == 2) {
                return HBP.A02;
            }
            if (A04 == 4) {
                return HBP.A04;
            }
            if (A04 != 5 && A04 == 8) {
                return HBP.A05;
            }
        }
        return HBP.A03;
    }

    public boolean BQy() {
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        if (!super.A04.A00()) {
            IDc iDc = this.A07;
            I9W i9w = iDc.A03;
            if (i9w == null) {
                11T.A0L("selfManagedConnectionManager");
                throw 0Q8.createAndThrow();
            }
            GTT A00 = I9W.A00(i9w, iDc.A07);
            return (A00 == null || (callAudioState = A00.getCallAudioState()) == null || (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) == null || !(supportedBluetoothDevices.isEmpty() ^ true)) ? false : true;
        }
        List list = this.A01;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((CallEndpoint) it.next()).getEndpointType() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean BRR() {
        int A04;
        boolean A00 = super.A04.A00();
        IDc iDc = this.A07;
        if (A00) {
            CallEndpoint A05 = iDc.A05();
            if (A05 == null) {
                return false;
            }
            A04 = A05.getEndpointType();
        } else {
            A04 = iDc.A04();
        }
        return A04 == 2;
    }

    public boolean BRS() {
        int A04;
        boolean A00 = super.A04.A00();
        boolean z = false;
        IDc iDc = this.A07;
        if (A00) {
            CallEndpoint A05 = iDc.A05();
            if (A05 != null) {
                A04 = A05.getEndpointType();
            }
            return z;
        }
        A04 = iDc.A04();
        if (A04 == 1) {
            z = true;
        }
        return z;
    }

    public boolean BRT() {
        int A04;
        int i;
        boolean A00 = super.A04.A00();
        IDc iDc = this.A07;
        if (A00) {
            CallEndpoint A05 = iDc.A05();
            if (A05 == null) {
                return false;
            }
            A04 = A05.getEndpointType();
            i = 4;
        } else {
            A04 = iDc.A04();
            i = 8;
        }
        return A04 == i;
    }

    @Override // X.If6
    public void BmH() {
        super.BmH();
        this.A07.A0D.remove(this);
    }

    @Override // X.If6
    public void C1b() {
        BluetoothAdapter adapter;
        super.C1b();
        IDc iDc = this.A07;
        iDc.A0D.add(this);
        BluetoothManager bluetoothManager = (BluetoothManager) this.A05.getValue();
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null) {
            adapter.getProfileProxy(super.A01, this.A03, 1);
        }
        if (!super.A04.A00() && this.aomDisableEarpieceMode && !this.aomIsHeadsetAttached) {
            I9W i9w = iDc.A03;
            if (i9w == null) {
                11T.A0L("selfManagedConnectionManager");
                throw 0Q8.createAndThrow();
            }
            if (!i9w.A08(iDc.A07, 8)) {
                iDc.A06 = 8;
            }
        }
        HBP AfZ = AfZ();
        11T.A0F(AfZ, 0);
        this.aomCurrentAudioOutput = AfZ;
        A0N();
        A0L();
        A0K();
        A0J();
    }

    public void CqI(boolean z) {
    }

    public void D5O() {
        JLv jLv = super.A05;
        jLv.ALc("ConnectionServiceAudioOutputManagerImpl", "turnOnVideoSpeakerphone", new Object[0]);
        if (this.A02) {
            jLv.ALc("ConnectionServiceAudioOutputManagerImpl", "Video speakerphone is already turning on", new Object[0]);
        }
        if (!this.A02 && !BRT() && !BRR() && !this.aomIsHeadsetAttached) {
            this.A02 = AEW(HBP.A05);
        }
        this.aomShouldSpeakerOnHeadsetUnplug = true;
    }

    public void D6a(HA4 ha4) {
    }

    @Override // X.If6
    public void reset() {
        super.reset();
        HBP hbp = HBP.A03;
        11T.A0F(hbp, 0);
        this.aomCurrentAudioOutput = hbp;
        this.A02 = false;
    }
}
