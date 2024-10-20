package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.provider.Settings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: If6.class */
public abstract class If6 implements JOT {
    public BroadcastReceiver A00;
    public final Context A01;
    public final AudioManager A02;
    public final I5D A03;
    public final HFd A04;
    public final JLv A05;
    public final HuN A06;
    public final HgZ A07;
    public final ExecutorService A08;
    public final 0WH A09 = AbI.A07();
    public final HXV A0A = new HXV(this);
    public final Hj3 A0B;
    public HA4 aomAudioModeState;
    public volatile HBP aomCurrentAudioOutput;
    public boolean aomDisableEarpieceMode;
    public volatile boolean aomIsHeadsetAttached;
    public int aomSavedAudioMode;
    public volatile boolean aomShouldSpeakerOnHeadsetUnplug;
    public final If8 audioManagerQplLogger;
    public final IA9 audioRecordMonitor;

    public If6(Context context, AudioManager audioManager, I5D i5d, HFd hFd, JKQ jkq, JLv jLv, HuN huN, HgZ hgZ, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = hgZ;
        this.A02 = audioManager;
        this.A05 = jLv;
        this.A03 = i5d;
        this.A08 = executorService;
        this.A04 = hFd;
        this.A06 = huN;
        If8 if8 = new If8(jkq);
        this.audioManagerQplLogger = if8;
        this.A0B = new Hj3(context, audioManager, hFd, jLv, executorService);
        this.audioRecordMonitor = new IA9(context, audioManager, if8, jLv, executorService);
        this.aomSavedAudioMode = -2;
        this.aomCurrentAudioOutput = HBP.A03;
        this.aomAudioModeState = HA4.A04;
    }

    public int A0I() {
        int ordinal = this.aomAudioModeState.ordinal();
        int i = 1;
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 0) {
                throw new IllegalStateException();
            }
            1CO r0 = this.A07.A01;
            if (r0.AZk(36326408191694419L)) {
                i = 0;
            } else {
                i = 3;
                if (r0.AZk(36326408191759956L)) {
                    return 2;
                }
            }
        }
        return i;
    }

    public void A0J() {
        Iterator A1D = GOp.A1D(this.A09);
        while (A1D.hasNext()) {
            ((JGM) A1D.next()).AB3();
        }
    }

    public final void A0K() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        GSM gsm = new GSM(this);
        this.A00 = gsm;
        AnonymousClass023.A00(gsm, this.A01, intentFilter);
        IA9 ia9 = this.audioRecordMonitor;
        if (ia9.A04.A00 != null) {
            IA9.A00(ia9, "system_info_on_init_call");
            IA9.A02(ia9, "recording_configs_on_init", (List) null);
            AudioManager.AudioRecordingCallback audioRecordingCallback = ia9.A00;
            if (audioRecordingCallback != null) {
                ia9.A02.registerAudioRecordingCallback(audioRecordingCallback, null);
            }
        }
    }

    public final void A0L() {
        Hj3 hj3 = this.A0B;
        HXV hxv = this.A0A;
        11T.A0F(hxv, 0);
        if (hj3.A00 != null) {
            hj3.A05.DAI("VolumeChangeAnnouncer", "Observer already registered", new Object[0]);
            return;
        }
        ContentObserver gsr = new GSR(AnonymousClass001.A07(), hxv, hj3);
        hj3.A03.registerContentObserver(Settings.System.CONTENT_URI, true, gsr);
        hj3.A00 = gsr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(java.lang.String r302, boolean r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.If6.A0M(java.lang.String, boolean, boolean):void");
    }

    public void A5F(JGM jgm) {
        11T.A0F(jgm, 0);
        this.A09.add(jgm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.aomDisableEarpieceMode == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ADt() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.aomIsHeadsetAttached
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.aomDisableEarpieceMode
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.If6.ADt():boolean");
    }

    public boolean BRo() {
        return !this.aomDisableEarpieceMode;
    }

    public boolean BTE() {
        return this.aomIsHeadsetAttached;
    }

    public void BmH() {
        IA9 ia9 = this.audioRecordMonitor;
        if (ia9.A04.A00 != null) {
            IA9.A00(ia9, "system_info_on_call_end");
            ia9.A03.removeCallbacks(ia9.A05);
            AudioManager.AudioRecordingCallback audioRecordingCallback = ia9.A00;
            if (audioRecordingCallback != null) {
                ia9.A02.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        this.audioManagerQplLogger.ATM();
        HFd hFd = this.A04;
        if ((hFd instanceof Gyn) && 1Br.A06(((Gyn) hFd).A04).AZk(36322516947846766L)) {
            Hj3 hj3 = this.A0B;
            ContentObserver contentObserver = hj3.A00;
            if (contentObserver != null) {
                hj3.A03.unregisterContentObserver(contentObserver);
            }
            hj3.A00 = null;
            hj3.A02 = null;
        }
        HuN huN = this.A06;
        AudioDeviceCallback audioDeviceCallback = huN.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        huN.A00 = null;
    }

    public void C1b() {
        this.audioManagerQplLogger.ATO();
        AudioDeviceInfo[] devices = ((AudioManager) 7zN.A0l(this.A07.A00, 1, 100191)).getDevices(2);
        11T.A0A(devices);
        int length = devices.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (devices[i].getType() == 1) {
                break;
            } else {
                i++;
            }
        }
        this.aomDisableEarpieceMode = z;
        HFd hFd = this.A04;
        if ((hFd instanceof Gyn) && 1Br.A06(((Gyn) hFd).A04).AZk(36322516947453544L)) {
            HuN huN = this.A06;
            AudioManager audioManager = this.A02;
            11T.A0F(audioManager, 0);
            if (huN.A00 == null) {
                GSs gSs = new GSs(huN, 1);
                huN.A00 = gSs;
                audioManager.registerAudioDeviceCallback(gSs, AnonymousClass001.A07());
            }
        }
        this.aomIsHeadsetAttached = this.A02.isWiredHeadsetOn();
    }

    public void Ce5(JGM jgm) {
        11T.A0F(jgm, 0);
        this.A09.remove(jgm);
    }

    public void Cuk(boolean z) {
        HtL A01;
        this.A05.ALc("RtcAudioOutputManagerBase", "setSpeakerphone: %s", 4YU.A1b(z));
        this.audioManagerQplLogger.Bct("set_speakerphone", String.valueOf(z));
        I5D i5d = this.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00(0Pz.A1C("set_speakerphone ", z));
        }
        AEW(z ? HBP.A05 : this.aomIsHeadsetAttached ? HBP.A04 : HBP.A03);
        this.aomShouldSpeakerOnHeadsetUnplug = z;
    }

    public void Cwt() {
        HtL A01;
        I5D i5d = this.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00("setup_audio_output_for_audio_only_call");
        }
        if (BRT()) {
            AEW(HBP.A03);
        }
        this.aomShouldSpeakerOnHeadsetUnplug = false;
    }

    public void D4c() {
        boolean z = !BRT();
        this.A05.ALc("RtcAudioOutputManagerBase", "toggle speaker state to %b", 4YU.A1b(z));
        Cuk(z);
    }

    public void reset() {
        this.aomShouldSpeakerOnHeadsetUnplug = false;
        this.aomIsHeadsetAttached = false;
        this.aomAudioModeState = HA4.A04;
        Hj3 hj3 = this.A0B;
        ContentObserver contentObserver = hj3.A00;
        if (contentObserver != null) {
            hj3.A03.unregisterContentObserver(contentObserver);
        }
        hj3.A00 = null;
        hj3.A02 = null;
        HuN huN = this.A06;
        AudioDeviceCallback audioDeviceCallback = huN.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        huN.A00 = null;
    }

    public void setMicrophoneMute(boolean z) {
        Ixq ixq = new Ixq(this, z);
        ExecutorService executorService = this.A08;
        if (executorService != null) {
            HFd hFd = this.A04;
            if ((hFd instanceof Gyn) && 1Br.A06(((Gyn) hFd).A04).AZk(36316688677218755L)) {
                executorService.execute(ixq);
                return;
            }
        }
        ixq.run();
    }
}
