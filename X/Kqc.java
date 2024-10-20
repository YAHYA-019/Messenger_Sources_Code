package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* loaded from: Kqc.class */
public final class Kqc {
    public long A00 = 0;
    public SharedPreferences A01 = null;
    public MEc A02;
    public MBx A03;
    public MBy A04;
    public PreferenceScreen A05;
    public String A06;
    public final Context A07;

    public Kqc(Context context) {
        this.A07 = context;
        this.A06 = 0Pz.A0W(context.getPackageName(), "_preferences");
    }

    public SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            sharedPreferences = this.A07.getSharedPreferences(this.A06, 0);
            this.A01 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
