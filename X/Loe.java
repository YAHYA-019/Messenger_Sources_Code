package X;

import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Loe.class */
public final class Loe implements Runnable {
    public static final String __redex_internal_original_name = "zzo";
    public final /* synthetic */ JRZ A00;
    public final /* synthetic */ C4Ez A01;

    public Loe(JRZ jrz, C4Ez c4Ez) {
        this.A00 = jrz;
        this.A01 = c4Ez;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Exception] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            JRZ jrz = this.A00;
            JRY jry = jrz.A00;
            Object A05 = this.A01.A05();
            JRY jry2 = jry;
            FirebaseInstanceId firebaseInstanceId = jry2.A00;
            String str = jry2.A01;
            String str2 = jry2.A02;
            String str3 = (String) A05;
            1eA r0 = FirebaseInstanceId.A08;
            String A052 = firebaseInstanceId.A04.A05();
            synchronized (r0) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject A12 = AnonymousClass001.A12();
                    A12.put("token", str3);
                    A12.put("appVersion", A052);
                    A12.put("timestamp", currentTimeMillis);
                    String obj = A12.toString();
                    if (obj != null) {
                        SharedPreferences.Editor edit = r0.A01.edit();
                        edit.putString(1eA.A01(str, str2), obj);
                        edit.commit();
                    }
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    android.util.Log.w("FirebaseInstanceId", 1BL.A0u("Failed to encode token: ", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 24)));
                }
            }
            3K7 r02 = new 3K7(str3);
            C4Ez c4Ez = new C4Ez();
            c4Ez.A0C(r02);
            Executor executor = C4F7.A01;
            c4Ez.A03(jrz, executor);
            c4Ez.A0A(jrz, executor);
            c4Ez.A07(jrz, executor);
        } catch (Lwu e2) {
            e = e2;
            boolean z = e.getCause() instanceof Exception;
            JRZ jrz2 = this.A00;
            if (z) {
                e = (Exception) e.getCause();
            }
            jrz2.onFailure(e);
        } catch (CancellationException unused) {
            this.A00.Bmz();
        } catch (Exception e3) {
            this.A00.onFailure(e3);
        }
    }
}
