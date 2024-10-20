package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.firebase.iid.zzm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1ea, reason: invalid class name */
/* loaded from: 1ea.class */
public final class C1ea {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public zzm A01;
    public Messenger A02;
    public final Context A03;
    public final 0QO A04 = new 0QO(0);
    public final C1e4 A05;

    public C1ea(Context context, C1e4 c1e4) {
        this.A03 = context;
        this.A05 = c1e4;
        final Looper mainLooper = Looper.getMainLooper();
        this.A02 = new Messenger(new C1ec(mainLooper) { // from class: X.1eb
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String str;
                String str2;
                String group;
                Bundle extras;
                String str3;
                String A0s;
                C1ea c1ea = this;
                if (message != null) {
                    Object obj = message.obj;
                    if (obj instanceof Intent) {
                        Intent intent = (Intent) obj;
                        intent.setExtrasClassLoader(new 3DZ());
                        if (intent.hasExtra("google.messenger")) {
                            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                            if (parcelableExtra instanceof zzm) {
                                c1ea.A01 = (zzm) parcelableExtra;
                            }
                            if (parcelableExtra instanceof Messenger) {
                                c1ea.A00 = (Messenger) parcelableExtra;
                            }
                        }
                        Intent intent2 = (Intent) message.obj;
                        String action = intent2.getAction();
                        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                            String stringExtra = intent2.getStringExtra("registration_id");
                            if (stringExtra == null) {
                                stringExtra = intent2.getStringExtra("unregistered");
                            }
                            if (stringExtra == null) {
                                String stringExtra2 = intent2.getStringExtra("error");
                                str = "FirebaseInstanceId";
                                if (stringExtra2 == null) {
                                    String valueOf = String.valueOf(intent2.getExtras());
                                    str2 = 1BL.A0u("Unexpected response, no error or registration id ", valueOf, AnonymousClass001.A0l(1BK.A02(valueOf) + 49));
                                } else {
                                    if (android.util.Log.isLoggable(str, 3)) {
                                        String valueOf2 = String.valueOf(stringExtra2);
                                        android.util.Log.d(str, valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                                    }
                                    if (!stringExtra2.startsWith("|")) {
                                        0QO r0 = c1ea.A04;
                                        synchronized (r0) {
                                            int i = 0;
                                            while (true) {
                                                if (i < r0.size()) {
                                                    C1ea.A01(intent2.getExtras(), c1ea, (String) r0.A04(i));
                                                    i++;
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    String[] split = stringExtra2.split("\\|");
                                    if (split.length <= 2 || !"ID".equals(split[1])) {
                                        str2 = 1BL.A0s("Unexpected structured response ", stringExtra2);
                                    } else {
                                        group = split[2];
                                        String str4 = split[3];
                                        if (str4.startsWith(":")) {
                                            str4 = str4.substring(1);
                                        }
                                        extras = intent2.putExtra("error", str4).getExtras();
                                    }
                                }
                                android.util.Log.w(str, str2);
                            }
                            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                            if (matcher.matches()) {
                                group = matcher.group(1);
                                String group2 = matcher.group(2);
                                extras = intent2.getExtras();
                                extras.putString("registration_id", group2);
                            } else {
                                str3 = "FirebaseInstanceId";
                                if (!android.util.Log.isLoggable(str3, 3)) {
                                    return;
                                } else {
                                    A0s = 1BL.A0s("Unexpected response string: ", stringExtra);
                                }
                            }
                            C1ea.A01(extras, c1ea, group);
                            return;
                        }
                        str3 = "FirebaseInstanceId";
                        if (!android.util.Log.isLoggable(str3, 3)) {
                            return;
                        } else {
                            A0s = 1BL.A0s("Unexpected response action: ", action);
                        }
                        android.util.Log.d(str3, A0s);
                        return;
                    }
                }
                str = "FirebaseInstanceId";
                str2 = "Dropping invalid message";
                android.util.Log.w(str, str2);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:91:0x026d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.os.Bundle A00(android.os.Bundle r301, X.C1ea r302) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ea.A00(android.os.Bundle, X.1ea):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, C1ea c1ea, String str) {
        0QO r0 = c1ea.A04;
        synchronized (r0) {
            4FE r02 = (4FE) r0.remove(str);
            if (r02 == null) {
                android.util.Log.w("FirebaseInstanceId", 1BL.A0s("Missing callback for ", str));
            } else {
                r02.A01(bundle);
            }
        }
    }
}
