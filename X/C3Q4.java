package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

/* renamed from: X.3Q4, reason: invalid class name */
/* loaded from: 3Q4.class */
public final class C3Q4 {
    public static C3Q4 A02;
    public static final SimpleDateFormat A03 = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences A00;
    public final SharedPreferences A01;

    public C3Q4(Context context) {
        this.A01 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.A00 = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
}
