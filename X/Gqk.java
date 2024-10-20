package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Gqk.class */
public abstract class Gqk extends GS2 {
    public final String A00;
    public final List A01;

    public Gqk(String str) {
        super("set in CallScopedBasePresenter constructor");
        this.A01 = AnonymousClass001.A0s();
        this.A00 = str;
        ((GS2) this).A02 = A0d();
    }

    public String A0d() {
        return this instanceof GrU ? "ParticipantPresenter" : this instanceof GrR ? "CallStatusPresenter" : this instanceof GrP ? "AudioParticipantRsysPresenter" : this instanceof GrL ? "MultiParticipantRsysPresenter" : this instanceof GrT ? "RemoteVideoParticipantPresenter" : this instanceof GrQ ? "ActiveDrawerContainerPresenter" : this instanceof GrN ? "CallControlsPresenter" : this instanceof GrV ? "ActiveCallControlsPresenter" : this instanceof GrS ? "CallPresenter" : this instanceof GpX ? "HaloDetailsPresenter" : this instanceof GrM ? "ScreenSharingParticipantRsysPresenter" : this instanceof GrO ? "MediaSyncReelsPlaybackPresenter" : this instanceof GrJ ? "RedialRsysPresenter" : this instanceof GrK ? "RosterSheetHeaderPresenter" : "HaloSettingsPresenter";
    }

    public final AKW A0e(Function1 function1, boolean z) {
        C00m A01 = GS2.A04(this).A01(function1, z);
        this.A01.add(A01);
        return new AKW(A01, this, 12);
    }
}
