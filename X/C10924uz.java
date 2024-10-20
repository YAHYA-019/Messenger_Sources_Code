package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.location.platform.api.Location;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4uz.class */
public class C10924uz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public Notification A08;
    public Notification A09;
    public PendingIntent A0A;
    public PendingIntent A0B;
    public Context A0C;
    public Bundle A0D;
    public RemoteViews A0E;
    public RemoteViews A0F;
    public RemoteViews A0G;
    public 4vL A0H;
    public 4vI A0I;
    public 5Uc A0J;
    public IconCompat A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public Object A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public ArrayList A0W;
    public ArrayList A0X;
    public ArrayList A0Y;
    public ArrayList A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x026e, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0708, code lost:
    
        if (r0 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x070b, code lost:
    
        r0 = r0[r315];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0714, code lost:
    
        if (r0 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0720, code lost:
    
        if (r0.isEmpty() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0723, code lost:
    
        r301.A0Y.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0732, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x073c, code lost:
    
        if (r315 >= r0) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10924uz(android.app.Notification r302, android.content.Context r303) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10924uz.<init>(android.app.Notification, android.content.Context):void");
    }

    public C10924uz(Context context, String str) {
        this.A0W = new ArrayList();
        this.A0Z = new ArrayList();
        this.A0X = new ArrayList();
        this.A0g = true;
        this.A0e = false;
        this.A01 = 0;
        this.A06 = 0;
        this.A00 = 0;
        Notification notification = new Notification();
        this.A08 = notification;
        this.A0C = context;
        this.A0S = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A03 = 0;
        this.A0Y = new ArrayList();
        this.A0a = true;
    }

    public static CharSequence A02(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            charSequence = charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public static void A03(PendingIntent pendingIntent, PendingIntent pendingIntent2, C10924uz c10924uz) {
        c10924uz.A0D(pendingIntent);
        c10924uz.A0E(pendingIntent2);
        c10924uz.A0N(true);
    }

    public static void A04(C10924uz c10924uz, int i, boolean z) {
        Notification notification = c10924uz.A08;
        int i2 = notification.flags;
        int i3 = i | i2;
        if (!z) {
            i3 = (i ^ (-1)) & i2;
        }
        notification.flags = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    public static void A05(C10924uz c10924uz, CharSequence charSequence) {
        ?? r0 = new 4vI();
        r0.A08(charSequence);
        c10924uz.A0J(r0);
    }

    public static C5rn[] A06(Bundle[] bundleArr) {
        C5rn[] c5rnArr;
        if (bundleArr != null) {
            int length = bundleArr.length;
            c5rnArr = new C5rn[length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Bundle bundle = bundleArr[i2];
                ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
                HashSet A0v = AnonymousClass001.A0v();
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        A0v.add(it.next());
                    }
                }
                c5rnArr[i2] = new C5rn(bundle.getBundle(Location.EXTRAS), bundle.getCharSequence("label"), bundle.getString("resultKey"), A0v, bundle.getCharSequenceArray("choices"), 0, bundle.getBoolean("allowFreeFormInput"));
                i = i2 + 1;
            }
        } else {
            c5rnArr = null;
        }
        return c5rnArr;
    }

    public Notification A07() {
        Bundle bundle;
        4vF r0 = new 4vF(this);
        C10924uz c10924uz = r0.A06;
        4vI r02 = c10924uz.A0I;
        if (r02 != null) {
            r02.A06(r0);
        }
        Notification build = r0.A04.build();
        RemoteViews remoteViews = c10924uz.A0F;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (r02 != null && (bundle = build.extras) != null) {
            r02.A03(bundle);
        }
        return build;
    }

    public C10924uz A08(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this.A0W.add(new 5YV(pendingIntent, charSequence, i));
        return this;
    }

    public C10924uz A09(5YV r302) {
        if (r302 != null) {
            this.A0W.add(r302);
        }
        return this;
    }

    public void A0A(int i) {
        Notification notification = this.A08;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A0B(int i) {
        this.A08.icon = i;
    }

    public void A0C(long j) {
        this.A08.when = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r0 == com.facebook.messaging.accountswitch.model.MessengerAccountType.A08) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if ((r0 instanceof com.facebook.messaging.tincan.tincanoverwamsys.backgroundsync.generic.notify.MessengerGenericTincanMessage) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(android.app.PendingIntent r302) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10924uz.A0D(android.app.PendingIntent):void");
    }

    public void A0E(PendingIntent pendingIntent) {
        this.A08.deleteIntent = pendingIntent;
    }

    public void A0F(Bitmap bitmap) {
        this.A0K = bitmap == null ? null : IconCompat.A01(bitmap);
    }

    public void A0G(Uri uri) {
        Notification notification = this.A08;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public void A0H(Uri uri, int i) {
        Notification notification = this.A08;
        notification.sound = uri;
        notification.audioStreamType = i;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
    }

    public void A0I(C5rh c5rh) {
        if (!(this instanceof C10914uy)) {
            c5rh.ARc(this);
            return;
        }
        C10914uy c10914uy = (C10914uy) this;
        if (C10914uy.A01(c10914uy)) {
            c5rh.ARc(c10914uy);
            C10914uy.A00(c10914uy);
        }
    }

    public void A0J(4vI r302) {
        if (this.A0I != r302) {
            this.A0I = r302;
            if (r302 != null) {
                r302.A07(this);
            }
        }
    }

    public void A0K(CharSequence charSequence) {
        this.A0M = A02(charSequence);
    }

    public void A0L(CharSequence charSequence) {
        this.A0N = A02(charSequence);
    }

    public void A0M(CharSequence charSequence) {
        this.A08.tickerText = A02(charSequence);
    }

    public void A0N(boolean z) {
        A04(this, 16, z);
    }
}
