package X;

import com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment;

/* loaded from: AD3.class */
public final class AD3 implements Runnable {
    public static final String __redex_internal_original_name = "GDriveSetupRestoreFragment$handleGooglePlayServicesUnrecoverableError$1";
    public final /* synthetic */ GDriveSetupRestoreFragment A00;

    public AD3(GDriveSetupRestoreFragment gDriveSetupRestoreFragment) {
        this.A00 = gDriveSetupRestoreFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GDriveSetupRestoreFragment gDriveSetupRestoreFragment = this.A00;
        C00i c00i = gDriveSetupRestoreFragment.A01;
        if (c00i == null) {
            11T.A0L("toaster");
            throw 0Q8.createAndThrow();
        }
        7zR.A1M((F8q) c00i.get(), 2131957188);
        GDriveSetupRestoreFragment.A03(gDriveSetupRestoreFragment);
    }
}
