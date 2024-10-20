package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: J2e.class */
public final class J2e implements Runnable {
    public static final String __redex_internal_original_name = "LegacyAttachmentFrescoDelegator$writeToMediaBankAsync$1";
    public final /* synthetic */ 1xH A00;
    public final /* synthetic */ 4dR A01;
    public final /* synthetic */ 2EU A02;
    public final /* synthetic */ 2Dp A03;
    public final /* synthetic */ File A04;

    public J2e(1xH r302, 4dR r303, 2EU r304, 2Dp r305, File file) {
        this.A01 = r303;
        this.A04 = file;
        this.A03 = r305;
        this.A00 = r302;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File createTempFile = File.createTempFile("media_temp", ".tmp");
                1BK.A1Q("temp file path:  ", createTempFile.getCanonicalPath(), "[MP] LegacyAttachmentFrescoDelegator");
                fileOutputStream = GOn.A14(createTempFile);
                1SB.A00(new C05264db(this.A01), fileOutputStream);
                if (createTempFile.renameTo(this.A04)) {
                    0fH.A0j("[MP] LegacyAttachmentFrescoDelegator", "moved to media bank successfully");
                    2Cb.A01().A0B().A0J(this.A03);
                    this.A00.A04(AnonymousClass001.A0K());
                } else {
                    0fH.A0k("[MP] LegacyAttachmentFrescoDelegator", "failed to move to media bank");
                    this.A00.A04(false);
                }
                2EU.A04(this.A02);
            } catch (IOException e) {
                0fH.A0r("[MP] LegacyAttachmentFrescoDelegator", "failed to move disk cache to media bank", e);
                this.A00.A04(false);
                2EU.A04(this.A02);
                if (0 == 0) {
                    return;
                }
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            2EU.A04(this.A02);
            if (0 != 0) {
                fileOutputStream.close();
            }
            throw th;
        }
    }
}
