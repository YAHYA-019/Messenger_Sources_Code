package X;

import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.showconfirmationuiandsubmitreport.ShowConfirmationUIAndSubmitReportImplementation;

/* loaded from: Fjb.class */
public final class Fjb implements GHx {
    public final /* synthetic */ ShowConfirmationUIAndSubmitReportImplementation A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ GJj A03;

    public Fjb(ShowConfirmationUIAndSubmitReportImplementation showConfirmationUIAndSubmitReportImplementation, FHh fHh, GJj gJj, GJj gJj2) {
        this.A00 = showConfirmationUIAndSubmitReportImplementation;
        this.A03 = gJj;
        this.A01 = fHh;
        this.A02 = gJj2;
    }

    @Override // X.GHx
    public void BxV() {
        ShowConfirmationUIAndSubmitReportImplementation showConfirmationUIAndSubmitReportImplementation = this.A00;
        GJj gJj = this.A02;
        showConfirmationUIAndSubmitReportImplementation.A00.post(new G2W(this.A01, gJj));
    }

    @Override // X.GHx
    public void onSuccess() {
        ShowConfirmationUIAndSubmitReportImplementation showConfirmationUIAndSubmitReportImplementation = this.A00;
        GJj gJj = this.A03;
        showConfirmationUIAndSubmitReportImplementation.A00.post(new G2W(this.A01, gJj));
    }
}
