package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: Gyl.class */
public final class Gyl extends If6 {
    public AudioDeviceInfo A00;
    public List A01;
    public BluetoothHeadset A02;
    public Integer A03;
    public C2a2 A04;
    public boolean A05;
    public boolean A06;
    public final BluetoothProfile.ServiceListener A07;
    public final AudioManager.OnCommunicationDeviceChangedListener A08;
    public final C01i A09;
    public final AudioDeviceCallback A0A;
    public final Handler A0B;
    public final JGN A0C;
    public final 0DE A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gyl(Context context, AudioManager audioManager, I5D i5d, HFd hFd, JGN jgn, JKQ jkq, JLv jLv, HuN huN, HgZ hgZ, ExecutorService executorService, 0DE r312) {
        super(context, audioManager, i5d, hFd, jkq, jLv, huN, hgZ, executorService);
        1BL.A1H(context, hgZ, audioManager);
        7zP.A1O(jLv, 5, r312);
        this.A0C = jgn;
        this.A0D = r312;
        this.A0B = AnonymousClass001.A07();
        this.A01 = AnonymousClass001.A0s();
        this.A09 = J9p.A00(context, 14);
        this.A07 = new IGB(this);
        this.A0A = new GSt(this, jLv);
        this.A08 = new IH8(audioManager, this, jLv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r301.aomDisableEarpieceMode != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.HBP A01(android.media.AudioDeviceInfo r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L67
            r0 = r302
            int r0 = r0.getType()
            r303 = r0
            r0 = r303
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L67
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L76
            r0 = 2
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L72
            r0 = 27
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L72
            r0 = 3
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L63
            r0 = 22
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L63
            r0 = 7
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L5f
            r0 = 26
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L5f
            r0 = 23
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L67
        L5f:
            X.HBP r0 = X.HBP.A02
            return r0
        L63:
            X.HBP r0 = X.HBP.A04
            return r0
        L67:
            r0 = r301
            boolean r0 = r0.aomDisableEarpieceMode
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L76
        L72:
            X.HBP r0 = X.HBP.A05
            return r0
        L76:
            X.HBP r0 = X.HBP.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyl.A01(android.media.AudioDeviceInfo):X.HBP");
    }

    public static final /* synthetic */ C2a2 A06(Gyl gyl) {
        return gyl.A04;
    }

    private final void A07() {
        C2a2 c2a2 = this.A04;
        if (c2a2 == null || !c2a2.BQN()) {
            super.A02.clearCommunicationDevice();
            return;
        }
        C2a2 c2a22 = this.A04;
        if (c2a22 != null) {
            c2a22.AE0(null);
        }
        this.A04 = null;
    }

    public static final /* synthetic */ void A0A(Gyl gyl) {
        gyl.A06 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r302 == r0.intValue()) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(X.Gyl r301, int r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyl.A0B(X.Gyl, int, boolean):void");
    }

    public static final /* synthetic */ void A0D(Gyl gyl, C2a2 c2a2) {
        gyl.A04 = c2a2;
    }

    public static final /* synthetic */ void A0E(Gyl gyl, boolean z) {
        gyl.A05 = z;
    }

    public static final /* synthetic */ boolean A0F(AudioDeviceInfo audioDeviceInfo) {
        if (!audioDeviceInfo.isSink()) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        return type == 1 || type == 2 || type == 3 || type == 7 || type == 22 || type == 23 || type == 26 || type == 27;
    }

    @Override // X.If6
    public void A0M(String str, boolean z, boolean z2) {
        HtL A01;
        super.A05.ALc("RtcAudioOutputManagerImplV2", "onHeadsetPlugged, isHeadsetAttached=%b", 4YU.A1b(z));
        If8 if8 = this.audioManagerQplLogger;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("is_headset_attached: ");
        A0k.append(z);
        A0k.append(", with_microphone: ");
        A0k.append(z2);
        if8.Bct("on_headset_plugged", 1BL.A0u(", headset_type: ", str, A0k));
        I5D i5d = super.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00(0Pz.A1C("on_headset_plugged: ", z));
        }
        this.aomIsHeadsetAttached = z;
    }

    public void A0N() {
        JLv jLv = super.A05;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("updateAudioOutput to ");
        jLv.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0a(this.aomCurrentAudioOutput, A0k), AnonymousClass001.A1Z());
        this.A0C.Cm2(this.aomCurrentAudioOutput);
    }

    public boolean AEW(HBP hbp) {
        HtL A01;
        11T.A0F(hbp, 0);
        JLv jLv = super.A05;
        jLv.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0Z(hbp, "changeAudio to ", AnonymousClass001.A0k()), new Object[0]);
        this.audioManagerQplLogger.Bct("change_audio", String.valueOf(hbp));
        I5D i5d = super.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A02(AnonymousClass001.A0Z(hbp, "change_audio: ", AnonymousClass001.A0k()));
        }
        A0B(this, A0I(), false);
        if (this.aomCurrentAudioOutput == hbp) {
            return false;
        }
        if (hbp == HBP.A03 && !this.aomIsHeadsetAttached && this.aomDisableEarpieceMode) {
            return false;
        }
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (A01((AudioDeviceInfo) next) == hbp) {
                if (next != null) {
                    2aK.A03((Integer) null, (0DE) null, new AnonymousClass851(hbp, (0DR) null, this, next, 39), 2aG.A02(this.A0D), 3);
                    return true;
                }
            }
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("changeAudio: no device matching route ");
        A0k.append(hbp);
        jLv.ALc("RtcAudioOutputManagerImplV2", AnonymousClass001.A0d(" available", A0k), new Object[0]);
        return false;
    }

    public void AEq(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        if (r306 != (-2)) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AF6(boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyl.AF6(boolean, boolean):void");
    }

    public BluetoothHeadset Adt() {
        return this.A02;
    }

    public HBP AfZ() {
        return A01(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQy() {
        /*
            r301 = this;
            X.HBP r0 = X.HBP.A02
            r302 = r0
            r0 = r301
            java.util.List r0 = r0.A01
            r303 = r0
            r0 = r303
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L10:
            r0 = r304
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L41
            r0 = r304
            java.lang.Object r0 = r0.next()
            r306 = r0
            r0 = r306
            r303 = r0
            r0 = r306
            android.media.AudioDeviceInfo r0 = (android.media.AudioDeviceInfo) r0
            r303 = r0
            r0 = r301
            r1 = r303
            X.HBP r0 = r0.A01(r1)
            r303 = r0
            r0 = r303
            r1 = r302
            if (r0 != r1) goto L10
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L46
        L41:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L46:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyl.BQy():boolean");
    }

    public boolean BRR() {
        return AnonymousClass001.A1W(A01(this.A00), HBP.A02);
    }

    public boolean BRS() {
        throw 0Q8.createAndThrow();
    }

    public boolean BRT() {
        return AnonymousClass001.A1W(A01(this.A00), HBP.A05);
    }

    @Override // X.If6
    public void BmH() {
        super.BmH();
        this.A06 = false;
        this.A05 = false;
        this.A01 = AnonymousClass001.A0s();
        try {
            super.A02.removeOnCommunicationDeviceChangedListener(this.A08);
        } catch (IllegalArgumentException unused) {
            super.A05.DAI("RtcAudioOutputManagerImplV2", "safeUnregisterDeviceChangedListener: tried to remove unregistered listener", new Object[0]);
        }
        super.A02.unregisterAudioDeviceCallback(this.A0A);
        A07();
    }

    @Override // X.If6
    public void C1b() {
        BluetoothAdapter adapter;
        super.C1b();
        try {
            super.A02.addOnCommunicationDeviceChangedListener(J5X.A00, this.A08);
        } catch (IllegalArgumentException unused) {
            super.A05.DAI("RtcAudioOutputManagerImplV2", "safeRegisterDeviceChangedListener: tried to add listener twice", AnonymousClass001.A1Z());
        }
        AudioManager audioManager = super.A02;
        audioManager.registerAudioDeviceCallback(this.A0A, this.A0B);
        BluetoothManager bluetoothManager = (BluetoothManager) this.A09.getValue();
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null) {
            adapter.getProfileProxy(super.A01, this.A07, 1);
        }
        if (this.aomDisableEarpieceMode && !this.aomIsHeadsetAttached) {
            AEW(HBP.A05);
        }
        AudioDeviceInfo communicationDevice = audioManager.getCommunicationDevice();
        this.A00 = communicationDevice;
        HBP A01 = A01(communicationDevice);
        11T.A0F(A01, 0);
        this.aomCurrentAudioOutput = A01;
        A0N();
        A0L();
        A0K();
        A0J();
    }

    public void CqI(boolean z) {
    }

    public void D5O() {
        HtL A01;
        I5D i5d = super.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00("turn_on_video_speakerphone");
        }
        if (this.A06) {
            super.A05.ALc("RtcAudioOutputManagerImplV2", "turnOnVideoSpeakerphone: Video speakerphone is already turning on", new Object[0]);
        }
        if (!this.A06 && !BRT() && !BRR() && !this.aomIsHeadsetAttached && !this.A05) {
            super.A05.ALc("RtcAudioOutputManagerImplV2", "turnOnVideoSpeakerphone: changeAudio to speakerphone", new Object[0]);
            this.A06 = AEW(HBP.A05);
        }
        this.aomShouldSpeakerOnHeadsetUnplug = true;
    }

    public void D6a(HA4 ha4) {
        11T.A0F(ha4, 0);
        this.aomAudioModeState = ha4;
        A0B(this, A0I(), false);
        IA9 ia9 = this.audioRecordMonitor;
        if (ia9.A04.A00 == null || ha4 != HA4.A03) {
            return;
        }
        Handler handler = ia9.A03;
        Runnable runnable = ia9.A05;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    @Override // X.If6
    public void reset() {
        HtL A01;
        I5D i5d = super.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00("reset");
        }
        super.reset();
        this.A06 = false;
        this.A05 = false;
        A07();
    }
}
