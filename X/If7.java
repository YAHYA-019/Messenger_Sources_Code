package X;

import android.bluetooth.BluetoothHeadset;

/* loaded from: If7.class */
public final class If7 implements JOT {
    public final JLv A00;

    public If7(JLv jLv) {
        11T.A0F(jLv, 1);
        this.A00 = jLv;
    }

    private final void A00(String str) {
        this.A00.ALc("NoopAudioOutputManagerImpl", 0Pz.A0W("Method call on legacy audio proxy path: ", str), AnonymousClass001.A1Z());
    }

    public void A5F(JGM jgm) {
        A00("addAudioOutputChangedListener");
    }

    public boolean ADt() {
        A00("canToggleFromSpeakerphoneToEarpiece");
        return false;
    }

    public boolean AEW(HBP hbp) {
        A00("changeAudio");
        return false;
    }

    public void AEq(boolean z) {
        A00("checkAudioRouteAndFixIfWrong");
    }

    public void AF6(boolean z, boolean z2) {
        A00("cleanAudioStates");
    }

    public BluetoothHeadset Adt() {
        A00("getConnectedBluetoothHeadset");
        return null;
    }

    public HBP AfZ() {
        A00("getCurrentAudioOutput");
        return HBP.A03;
    }

    public boolean BQy() {
        A00("isBluetoothAvailableAndAllowed");
        return false;
    }

    public boolean BRR() {
        A00("isCurrentAudioOutputBluetooth");
        return false;
    }

    public boolean BRS() {
        throw 0Q8.createAndThrow();
    }

    public boolean BRT() {
        A00("isCurrentAudioOutputSpeakerPhone");
        return false;
    }

    public boolean BRo() {
        A00("isEarpieceModeEnabled");
        return false;
    }

    public boolean BTE() {
        A00("isHeadsetAttached");
        return false;
    }

    public void BmH() {
        A00("onCallEnded");
    }

    public void C1b() {
        A00("onInitCall");
    }

    public void Ce5(JGM jgm) {
        A00("removeAudioOutputChangedListener");
    }

    public void CqI(boolean z) {
        A00("setIsVideoCall");
    }

    public void Cuk(boolean z) {
        A00("setSpeakerphone");
    }

    public void Cwt() {
        A00("setupAudioOutputForAudioOnlyCall");
    }

    public void D4c() {
        A00("toggleSpeakerphone");
    }

    public void D5O() {
        A00("turnOnVideoSpeakerphone");
    }

    public void D6a(HA4 ha4) {
        A00("updateAudioModeForState");
    }

    public void reset() {
        A00("reset");
    }

    public void setMicrophoneMute(boolean z) {
    }
}
