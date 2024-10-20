package X;

import com.facebook.messaging.notify.logging.conditionalworkerimpl.PushSettingsReporter;

/* loaded from: Cei.class */
public final class Cei implements C4Av {
    public final PushSettingsReporter A00 = (PushSettingsReporter) 1Bi.A03(49287);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        if (!r302.A01()) {
            return false;
        }
        0fH.A0D(Cei.class, "Report push_settings.");
        PushSettingsReporter pushSettingsReporter = this.A00;
        pushSettingsReporter.A00();
        pushSettingsReporter.A01();
        return true;
    }
}
