package X;

/* loaded from: Ill.class */
public final class Ill implements JMk {
    public final /* synthetic */ C9l5 A00;

    public Ill(C9l5 c9l5) {
        this.A00 = c9l5;
    }

    @Override // X.JMk
    public void BkP() {
    }

    @Override // X.JMk
    public void Bt0() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onDeleteClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        c9l5.A01 = null;
        IEI iei = c9l5.A00;
        if (iei == null) {
            11T.A0L("audioRecordingAPI");
            throw 0Q8.createAndThrow();
        }
        IEI.A04(iei, true);
        c9l5.A03.invoke();
        c9l5.A01();
    }

    @Override // X.JMk
    public void CB1() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onPausePreviewClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei == null) {
            11T.A0L("audioRecordingAPI");
            throw 0Q8.createAndThrow();
        }
        iei.A07();
    }

    @Override // X.JMk
    public void CB3() {
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei == null) {
            11T.A0L("audioRecordingAPI");
            throw 0Q8.createAndThrow();
        }
        iei.A05();
    }

    @Override // X.JMk
    public void CC0() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onPlayPreviewClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei != null) {
            iei.A08();
            I5O i5o = (I5O) c9l5.A0D.getValue();
            IEI iei2 = c9l5.A00;
            if (iei2 != null) {
                IDp iDp = iei2.A00.A00;
                if (iDp != null) {
                    i5o.A01 = iDp;
                    return;
                }
                return;
            }
        }
        11T.A0L("audioRecordingAPI");
        throw 0Q8.createAndThrow();
    }

    @Override // X.JMk
    public void CHN() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onRestartClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei == null) {
            11T.A0L("audioRecordingAPI");
            throw 0Q8.createAndThrow();
        }
        iei.A09();
    }

    @Override // X.JMk
    public void CHv() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onResumeRecordingClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei != null) {
            iei.A07();
            IEI iei2 = c9l5.A00;
            if (iei2 != null) {
                iei2.A0A();
                return;
            }
        }
        11T.A0L("audioRecordingAPI");
        throw 0Q8.createAndThrow();
    }

    @Override // X.JMk
    public void CKM() {
        4zI.A03.A05("VoicemailRecordingControlsController", "onSendClick", AnonymousClass001.A1Z());
        C9l5 c9l5 = this.A00;
        5Rm r0 = C9l5.A0G;
        IEI iei = c9l5.A00;
        if (iei == null) {
            11T.A0L("audioRecordingAPI");
            throw 0Q8.createAndThrow();
        }
        iei.A0D((Integer) null);
    }
}
