package X;

import com.facebook.webrtc.cameraviewcoordinator.RtcCameraViewCoordinator;

/* loaded from: Ivh.class */
public final /* synthetic */ class Ivh implements Runnable {
    public static final String __redex_internal_original_name = "MsqrdCameraViewCoordinatorBase$$ExternalSyntheticLambda0";
    public final /* synthetic */ IRI A00;
    public final /* synthetic */ IRF A01;

    public /* synthetic */ Ivh(IRI iri, IRF irf) {
        this.A00 = iri;
        this.A01 = irf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RtcCameraViewCoordinator rtcCameraViewCoordinator = this.A00;
        JMb A06 = IRF.A06(this.A01);
        if (A06 != null) {
            if (((IRI) rtcCameraViewCoordinator).A0P == null) {
                throw AnonymousClass001.A0T("MsqrdCameraViewCoordinator should be created before setting Camera on MediaCaptureSinkInterface");
            }
            A06.setCamera(rtcCameraViewCoordinator);
        }
    }
}
