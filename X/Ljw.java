package X;

import androidx.preference.PreferenceGroup;

/* loaded from: Ljw.class */
public final class Ljw implements Runnable {
    public static final String __redex_internal_original_name = "PreferenceGroup$1";
    public final /* synthetic */ PreferenceGroup A00;

    public Ljw(PreferenceGroup preferenceGroup) {
        this.A00 = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            this.A00.A04.clear();
        }
    }
}
