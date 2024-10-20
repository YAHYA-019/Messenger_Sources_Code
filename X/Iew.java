package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: Iew.class */
public final class Iew implements AbA {
    public final /* synthetic */ GrS A00;
    public final /* synthetic */ 0CL A01;

    public Iew(GrS grS, 0CL r303) {
        this.A00 = grS;
        this.A01 = r303;
    }

    @Override // X.AbA
    public final void BQ5(8LW r302) {
        C00m c00m;
        11T.A0F(r302, 0);
        CallModel callModel = (CallModel) r302.A00(CallModel.class);
        if (callModel != null) {
            GrS grS = this.A00;
            grS.A00 = callModel.callConnectedTimestampMs;
            String str = callModel.selfParticipant.userProfile.profilePictureUrl;
            if (str == null) {
                str = "";
            }
            grS.A01 = str;
            if (!7zL.A1V(str) || grS.A00 <= 0 || (c00m = (C00m) this.A01.element) == null) {
                return;
            }
            c00m.invoke();
        }
    }
}
