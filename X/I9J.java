package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: I9J.class */
public final class I9J {
    public int A00;
    public BluetoothHeadset A01;
    public BroadcastReceiver A02;
    public AudioDeviceCallback A03;
    public boolean A04;
    public BluetoothAdapter A05;
    public final Context A06;
    public final HFd A07;
    public final BluetoothProfile.ServiceListener A08;
    public final BroadcastReceiver A09;
    public final AudioManager A0A;
    public final I5D A0B;
    public final JKQ A0C;
    public final JLv A0D;
    public final HuN A0E;
    public final 0DE A0F;
    public final 2aI A0G;
    public volatile Hmq A0H;

    public I9J(Context context, AudioManager audioManager, I5D i5d, HFd hFd, JKQ jkq, JLv jLv, 0DE r308) {
        1BL.A1H(context, audioManager, jLv);
        4YV.A1M(hFd, 5, r308);
        this.A06 = context;
        this.A07 = hFd;
        this.A0B = i5d;
        this.A0F = r308;
        this.A08 = new IGC(this, jLv);
        this.A09 = new GSO(this, 1);
        this.A0A = audioManager;
        this.A0D = jLv;
        this.A0C = new If8(jkq);
        this.A0G = 2aG.A02(r308);
        this.A0E = new HuN(audioManager, null);
    }

    public static final void A00(I9J i9j, boolean z) {
        HtL A01;
        I5D i5d = i9j.A0B;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00(0Pz.A1C("toggle_bluetooth_headset: ", z));
        }
        if (!z) {
            AudioManager audioManager = i9j.A0A;
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
            return;
        }
        try {
            AudioManager audioManager2 = i9j.A0A;
            audioManager2.startBluetoothSco();
            audioManager2.setBluetoothScoOn(true);
        } catch (NullPointerException e) {
            i9j.A0D.AQu("DefaultBluetoothManager", "AudioManager#startBluetoothSco failed", e, new Object[0]);
            i9j.A04 = false;
        }
    }

    public static final boolean A01(I9J i9j) {
        List<AudioDeviceInfo> asList;
        HFd hFd = i9j.A07;
        if ((hFd instanceof Gyn) && 1Br.A06(((Gyn) hFd).A04).AZk(36322516947453544L)) {
            asList = i9j.A0E.A01;
        } else {
            AudioDeviceInfo[] devices = i9j.A0A.getDevices(2);
            11T.A0A(devices);
            asList = Arrays.asList(devices);
            11T.A0A(asList);
        }
        for (AudioDeviceInfo audioDeviceInfo : asList) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    public void A02() {
        BluetoothAdapter bluetoothAdapter;
        A04(false);
        BroadcastReceiver broadcastReceiver = this.A02;
        if (broadcastReceiver != null) {
            try {
                this.A06.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            this.A06.unregisterReceiver(this.A09);
        } catch (IllegalArgumentException unused2) {
        }
        BluetoothHeadset bluetoothHeadset = this.A01;
        if (bluetoothHeadset != null && (bluetoothAdapter = this.A05) != null) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        HuN huN = this.A0E;
        AudioDeviceCallback audioDeviceCallback = huN.A00;
        if (audioDeviceCallback != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        AudioDeviceCallback audioDeviceCallback2 = this.A03;
        if (audioDeviceCallback2 != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback2);
        }
        huN.A00 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public void A03(Hmq hmq) {
        11T.A0F(hmq, 0);
        A02();
        this.A0H = hmq;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A05 = defaultAdapter;
        if (defaultAdapter != null) {
            Context context = this.A06;
            defaultAdapter.getProfileProxy(context, this.A08, 1);
            if (Build.VERSION.SDK_INT < 31) {
                GSO gso = this.A02;
                if (gso == null) {
                    gso = new GSO(this, 2);
                    this.A02 = gso;
                }
                GOo.A15(gso, context, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            } else {
                HuN huN = this.A0E;
                AudioManager audioManager = this.A0A;
                11T.A0F(audioManager, 0);
                if (huN.A00 == null) {
                    GSs gSs = new GSs(huN, 1);
                    huN.A00 = gSs;
                    audioManager.registerAudioDeviceCallback(gSs, AnonymousClass001.A07());
                }
                if (this.A03 == null) {
                    GSu gSu = new GSu(this);
                    this.A03 = gSu;
                    audioManager.registerAudioDeviceCallback(gSu, AnonymousClass001.A07());
                }
            }
            Intent A00 = AnonymousClass023.A00(this.A09, context, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (A00 != null) {
                this.A00 = A00.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
        }
    }

    public void A04(boolean z) {
        this.A0C.Bct("toggle_bluetooth_headset", String.valueOf(z));
        if (this.A04 != z) {
            this.A04 = z;
            HFd hFd = this.A07;
            if (!(hFd instanceof Gyn) || !1Br.A06(((Gyn) hFd).A04).AZk(36322516947650155L)) {
                A00(this, z);
            } else {
                2aK.A03((Integer) null, (0DE) null, new AJG(this, (0DR) null, 7, z), this.A0G, 3);
            }
        }
    }

    public boolean A05() {
        BluetoothAdapter bluetoothAdapter = this.A05;
        BluetoothHeadset bluetoothHeadset = this.A01;
        HFd hFd = this.A07;
        if ((!(hFd instanceof Gyn ? 1Br.A06(((Gyn) hFd).A04).AZk(36322516947584618L) : false) && (bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || !this.A0A.isBluetoothScoAvailableOffCall())) || bluetoothHeadset == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 30) {
            return A01(this);
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        11T.A0A(connectedDevices);
        return !connectedDevices.isEmpty();
    }
}
