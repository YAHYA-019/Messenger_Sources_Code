package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.08e, reason: invalid class name */
/* loaded from: 08e.class */
public class C08e extends C08f {
    public final C08b A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    public C08e(C08b c08b, String str, List list, Set set) {
        this.A00 = c08b;
        this.A03 = set;
        this.A02 = list;
        this.A01 = str;
    }

    public static Bundle A00(Bundle bundle, C08b c08b) {
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            makeBasic.setShareIdentityEnabled(c08b.A0I());
            Bundle bundle2 = makeBasic.toBundle();
            if (bundle == null) {
                return bundle2;
            }
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    public static void A01(Context context, Intent intent) {
        11T.A0F(context, 0);
        ComponentName startForegroundService = context.startForegroundService(intent);
        Iterator it = C01w.A00.iterator();
        while (it.hasNext()) {
            ((C01f) it.next()).D1k(startForegroundService, intent);
        }
    }

    public static void A02(Context context, C08e c08e) {
        if (context != null) {
            Set set = c08e.A03;
            if (set.isEmpty()) {
                return;
            }
            synchronized (set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    @Override // X.C08f
    public boolean A08(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        C0wg A0F = A0F(context, intent);
        Intent A0F2 = this.A00.A0F(context, intent, this.A01);
        if (A0F2 == null) {
            return false;
        }
        A0J(context, intent, A0F2, A0F);
        return context.bindService(A0F2, serviceConnection, i | 512);
    }

    @Override // X.C08f
    public boolean A09(Activity activity, Intent intent, int i) {
        boolean z = false;
        if (activity != null) {
            C0wg A0F = A0F(activity, intent);
            C08b c08b = this.A00;
            Intent A0E = c08b.A0E(activity, intent, this.A01);
            if (A0E != null) {
                A02(activity, this);
                A0J(activity, intent, A0E, A0F);
                activity.startActivityForResult(A0E, i, A00(null, c08b));
                z = true;
            }
        }
        return z;
    }

    @Override // X.C08f
    public boolean A0A(Context context, Intent intent) {
        C0wg A0F = A0F(context, intent);
        C08b c08b = this.A00;
        Intent A0E = c08b.A0E(context, intent, this.A01);
        if (A0E == null) {
            return false;
        }
        A02(context, this);
        if (C08f.A04(context, intent)) {
            c08b.A01.Cfz("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        A0J(context, intent, A0E, A0F);
        context.startActivity(A0E, A00(null, c08b));
        return true;
    }

    @Override // X.C08f
    public boolean A0B(Intent intent, Fragment fragment, int i) {
        Context context = fragment.getContext();
        boolean z = false;
        if (context != null) {
            C0wg A0F = A0F(context, intent);
            C08b c08b = this.A00;
            Intent A0E = c08b.A0E(context, intent, this.A01);
            if (A0E != null) {
                A02(context, this);
                A0J(context, intent, A0E, A0F);
                fragment.startActivityForResult(A0E, i, A00(null, c08b));
                z = true;
            }
        }
        return z;
    }

    public ComponentName A0C(Context context, Intent intent) {
        C0wg A0F = A0F(context, intent);
        Intent A0F2 = this.A00.A0F(context, intent, this.A01);
        if (A0F2 == null) {
            return null;
        }
        A0J(context, intent, A0F2, A0F);
        return context.startService(A0F2);
    }

    public C08e A0D(String str) {
        return new C08e(this.A00, str, this.A02, this.A03);
    }

    @Override // X.C08f
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public 0cL A07(C07r c07r, C05w c05w, C07q c07q) {
        return new 0cL(c05w.registerForActivityResult(new 0cM(c07q, this), c07r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0wg A0F(Context context, Intent intent) {
        Object obj;
        if (context != null) {
            List list = this.A02;
            if (!list.isEmpty()) {
                if (TextUtils.isEmpty(intent.getStringExtra("MSF_INTENT_METADATA_ID"))) {
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    String encodeToString = Base64.encodeToString(bArr, 8);
                    long currentTimeMillis = System.currentTimeMillis();
                    String packageName = context.getPackageName();
                    intent.putExtra("MSF_INTENT_METADATA_ID", encodeToString);
                    intent.putExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", currentTimeMillis);
                    intent.putExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME", packageName);
                } else {
                    intent.getLongExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", -1);
                    intent.getStringExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME");
                }
                obj = new Object();
                new Intent(intent);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((C0wq) it.next()).Cy4(context, intent, this.A00.A0G());
                    } catch (Exception unused) {
                    }
                }
                return obj;
            }
        }
        obj = null;
        return obj;
    }

    public void A0G(Context context, Intent intent) {
        C0wg A0F = A0F(context, intent);
        Intent A0F2 = this.A00.A0F(context, intent, this.A01);
        if (A0F2 != null) {
            A0J(context, intent, A0F2, A0F);
            A01(context, A0F2);
        }
    }

    public void A0H(Context context, Intent intent) {
        A0L(context, intent, null);
    }

    public void A0I(Context context, Intent intent) {
        C0wg A0F = A0F(context, intent);
        Intent A0F2 = this.A00.A0F(context, intent, this.A01);
        if (A0F2 != null) {
            A0J(context, intent, A0F2, A0F);
            context.stopService(A0F2);
        }
    }

    public void A0J(Context context, Intent intent, Intent intent2, C0wg c0wg) {
        if (context == null || c0wg == null) {
            return;
        }
        List<C0wq> list = this.A02;
        if (list.isEmpty()) {
            return;
        }
        Intent intent3 = new Intent(intent);
        Intent intent4 = new Intent(intent2);
        for (C0wq c0wq : list) {
            try {
                Integer A0G = this.A00.A0G();
                if (c0wq.Cy4(context, intent3, A0G) || c0wq.Cy4(context, intent4, A0G)) {
                    c0wq.BiP(context, intent3, intent4, c0wg, A0G);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void A0K(Context context, Intent intent, Bundle bundle) {
        C0wg A0F = A0F(context, intent);
        C08b c08b = this.A00;
        Intent A0E = c08b.A0E(context, intent, this.A01);
        if (A0E != null) {
            A02(context, this);
            if (C08f.A04(context, A0E)) {
                c08b.A01.Cfz("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
            }
            A0J(context, intent, A0E, A0F);
            context.startActivity(A0E, A00(bundle, c08b));
        }
    }

    public void A0L(Context context, Intent intent, String str) {
        if (intent.getPackage() == null && intent.getComponent() == null && intent.getSelector() == null) {
            StrictMode.noteSlowCall("Implicit intents using ScopedIntentLauncher queries all packages.");
        }
        C0wg A0F = A0F(context, intent);
        C08b c08b = this.A00;
        List<Intent> A0H = c08b.A0H(context, intent, this.A01);
        if (A0H.isEmpty()) {
            return;
        }
        for (Intent intent2 : A0H) {
            A0J(context, intent, intent2, A0F);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    BroadcastOptions makeBasic = BroadcastOptions.makeBasic();
                    makeBasic.setShareIdentityEnabled(c08b.A0I());
                    context.sendBroadcast(intent2, str, makeBasic.toBundle());
                } else {
                    context.sendBroadcast(intent2, str);
                }
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    throw e;
                }
            }
        }
    }
}
