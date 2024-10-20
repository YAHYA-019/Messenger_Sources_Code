package X;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.4Dk, reason: invalid class name */
/* loaded from: 4Dk.class */
public final class C4Dk implements CallerContextable {
    public static final 1G2 A0c;
    public static final 1G2 A0d;
    public static final String __redex_internal_original_name = "MessengerAppIntentDispatcher";
    public 1BY A00;
    public 02Q A01;
    public final Context A03;
    public final FbUserSession A04;
    public final C00i A09;
    public final C00i A0B;
    public final C00i A0F;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C4Dl A0R;
    public final C00i A0Y;
    public final C00i A0W = new 1BQ(83426);
    public final C00i A0b = new 1BV((1BY) null, 83619);
    public final C00i A08 = new 1BQ(66185);
    public final C00i A07 = new 1BQ(17021);
    public final C00i A0a = new 1BQ(84488);
    public final C00i A0C = new 1BQ(16511);
    public final C00i A0X = new 1BV((1BY) null, 33182);
    public final C00i A0K = new 1BV((1BY) null, 83289);
    public final C00i A0D = new 1BV((1BY) null, 66863);
    public final C00i A06 = new 1BQ(49754);
    public final C00i A0I = new 1BQ(16386);
    public final C15h A0S = new C4Xj(this, 7);
    public final C00i A0J = new 1BV((1BY) null, 32993);
    public final C00i A05 = new 1BV((1BY) null, 85245);
    public final C00i A0P = new 1BV((1BY) null, 131260);
    public final C00i A0V = new 1BQ(68582);
    public final C15h A0T = new C4Xj(this, 8);
    public final C00i A0O = new 1BQ(66658);
    public final C00i A0A = new 1BV((1BY) null, 68141);
    public final C00i A0Z = new 1BV((1BY) null, 66691);
    public final C00i A0E = new 1BQ(33013);
    public final C00i A0H = new 1BV((1BY) null, 98666);
    public final C00i A0G = new 1BQ(49803);
    public final C00i A0U = new 1BQ(84960);
    public final C4Dm A0Q = C4Dm.A00();
    public boolean A02 = false;

    static {
        1G2 r0 = 1G0.A04;
        A0c = r0.A0D("navigate_to_chat_thread_info/");
        A0d = r0.A0D("trigger_bcf_info/");
    }

    public C4Dk(Context context, FbUserSession fbUserSession, 1BO r304) {
        this.A00 = new 1BY(r304);
        this.A0M = new 1BV(context, 115773);
        this.A0B = new 1BV(context, 82546);
        this.A0L = new 1BV(context, 83579);
        this.A0N = new 1BV(context, 85028);
        this.A0Y = new 1BV(context, 82126);
        this.A0R = (C4Dl) 1Bn.A0D(context, 99974);
        this.A09 = new 1BV(context, 66692);
        this.A0F = new 1BV(context, 17019);
        this.A03 = context;
        this.A04 = fbUserSession;
    }

    public static Intent A00(1Br r301) {
        r301.A00.get();
        return new Intent();
    }

    public static 47I A01(C15h c15h) {
        Object obj = c15h.get();
        11T.A0A(obj);
        return ((C3Nt) obj).A00(5000L);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static ListenableFuture A02() {
        return 1Kd.A09((ListenableFuture) new Object(), (ScheduledExecutorService) 1Bq.A00(16474).get(), TimeUnit.SECONDS, 5);
    }

    public static final ListenableFuture A03(Context context, 2Pj r302, C4Dl c4Dl) {
        1hM A04;
        11T.A0F(r302, 2);
        NotificationChannel A0A = r302.A0A("messenger_orca_900_chathead_active");
        if (A0A == null) {
            A04 = C3o5.A0K(false);
        } else {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra(AbE.A00(44), ((PackageItemInfo) applicationInfo).packageName);
            intent.putExtra("android.provider.extra.CHANNEL_ID", A0A.getId());
            A04 = c4Dl.A04(context, intent);
        }
        11T.A0A(A04);
        return A04;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.142, java.lang.Object] */
    public static ListenableFuture A04(Intent intent, Uri uri, C4Dk c4Dk, Integer num) {
        Throwable th;
        13G B5T;
        if ("messaging_notification_click_from_tray".equals(intent.getStringExtra("event_type_extra"))) {
            Bundle extras = intent.getExtras();
            ((C5dx) c4Dk.A0G.get()).A00(intent, __redex_internal_original_name, extras);
            if (extras != null) {
                c4Dk.A0Q.A03(extras.getString("notif_android_tag"), extras.getInt("notif_android_id"));
            }
        }
        Uri data = intent.getData();
        boolean z = false;
        if (data != null && data.isHierarchical() && data.isAbsolute()) {
            z = true;
        }
        if (!z) {
            return C3o5.A0K(false);
        }
        if (intent.getData() == null || !(!0JR.A00(r0).isEmpty())) {
            return A05(intent, uri, c4Dk, num);
        }
        ?? obj = new Object();
        final Uri data2 = intent.getData();
        if (data2 == null) {
            return C3o5.A0K(false);
        }
        final C13w c13w = (C13w) 1Bn.A0G(c4Dk.A00, 56);
        try {
            HashSet A00 = 0JR.A00(data2);
            HashSet hashSet = new HashSet();
            NavigableSet<0WM> descendingSet = c13w.A02.descendingSet();
            0WM r321 = null;
            if (descendingSet != null) {
                0JR r312 = null;
                for (0WM r0 : descendingSet) {
                    if (r321 == null) {
                        0JR r02 = r0.A00;
                        if (A00.contains(r02)) {
                            r312 = r02;
                            r321 = r0;
                        }
                    }
                    hashSet.addAll(r0.A00.A02());
                }
                if (r321 != null && r312 != null) {
                    String A01 = r312.A01(data2);
                    if (TextUtils.isEmpty(A01)) {
                        new Exception("Empty keyID in URL");
                        throw th;
                    }
                    final ?? obj2 = new Object();
                    obj2.A00 = r321;
                    obj2.A02 = hashSet;
                    obj2.A01 = A01;
                    0fH.A0j(__redex_internal_original_name, "Found a URI with a known URI version");
                    final String str = c4Dk.A04.A02;
                    final Context context = c4Dk.A03;
                    final 4WJ r03 = new 4WJ(intent, uri, c4Dk, (SettableFuture) obj, num);
                    final long currentTimeMillis = System.currentTimeMillis();
                    final 13S A002 = 13S.A00(obj2.A01);
                    final 13C r04 = c13w.A01;
                    final C13b c13b = new C13b() { // from class: X.19e
                        @Override // X.C13b
                        public void onFailure(Throwable th2) {
                            r03.onFailure(th2);
                        }

                        @Override // X.C13b
                        public /* bridge */ /* synthetic */ void onSuccess(Object obj3) {
                            Throwable th2;
                            Throwable th3;
                            String str2;
                            Integer num2;
                            Signature signature;
                            Integer num3;
                            13G r05 = (13G) obj3;
                            try {
                                C13w c13w2 = c13w;
                                AnonymousClass142 anonymousClass142 = obj2;
                                Uri uri2 = data2;
                                PublicKey publicKey = r05.A02;
                                String str3 = str;
                                Set set = anonymousClass142.A02;
                                String queryParameter = uri2.getQueryParameter("__fbs_v2_s");
                                if (TextUtils.isEmpty(queryParameter)) {
                                    new Exception("Missing signature parameter");
                                } else {
                                    TreeMap treeMap = new TreeMap();
                                    Iterator<String> it = uri2.getQueryParameterNames().iterator();
                                    while (it.hasNext()) {
                                        String A0i = AnonymousClass001.A0i(it);
                                        if (!set.contains(A0i)) {
                                            treeMap.put(A0i, uri2.getQueryParameter(A0i));
                                        }
                                    }
                                    ArrayList A0t = AnonymousClass001.A0t(treeMap.size());
                                    Iterator A0x = AnonymousClass001.A0x(treeMap);
                                    while (A0x.hasNext()) {
                                        Map.Entry A0z = AnonymousClass001.A0z(A0x);
                                        A0t.add(0Pz.A0j(AnonymousClass001.A0j(A0z), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, (String) A0z.getValue()));
                                    }
                                    String A0j = 0Pz.A0j(uri2.buildUpon().clearQuery().build().toString(), "?", TextUtils.join("&", A0t));
                                    try {
                                        String queryParameter2 = uri2.getQueryParameter("__fbs_v2_sa");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            try {
                                                if (queryParameter2.equals("RS256")) {
                                                    num3 = 0S2.A00;
                                                } else {
                                                    if (!queryParameter2.equals("ES256")) {
                                                        throw AnonymousClass001.A0L(queryParameter2);
                                                    }
                                                    num3 = 0S2.A01;
                                                }
                                                signature = Signature.getInstance(num3.intValue() != 0 ? "SHA256withECDSA" : "SHA256withRSA");
                                            } catch (IllegalArgumentException unused) {
                                                str2 = "SHA256withRSA";
                                                try {
                                                    if (queryParameter2.equals(str2)) {
                                                        num2 = 0S2.A00;
                                                    } else {
                                                        if (!queryParameter2.equals("SHA256withECDSA")) {
                                                            throw AnonymousClass001.A0L("Unrecognized JCA algorithm");
                                                        }
                                                        num2 = 0S2.A01;
                                                    }
                                                    signature = Signature.getInstance(num2.intValue() != 0 ? "SHA256withECDSA" : "SHA256withRSA");
                                                } catch (IllegalArgumentException unused2) {
                                                    new Exception(0Pz.A0j("Unable to convert query param ", queryParameter2, " to a known signature type"));
                                                }
                                            }
                                            signature.initVerify(publicKey);
                                            signature.update(A0j.getBytes("UTF-8"));
                                            if (signature.verify(Base64.decode(queryParameter, 8))) {
                                                0JR[] r06 = 0JR.A00;
                                                String queryParameter3 = uri2.getQueryParameter("__fbs_uh");
                                                String queryParameter4 = uri2.getQueryParameter("__fbs_un");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    if (TextUtils.isEmpty(str3)) {
                                                        new Exception("Unable to validate user-bound SignedUri for logged out user");
                                                    } else if (TextUtils.isEmpty(queryParameter4)) {
                                                        new Exception("Missing nonce URL parameter");
                                                    } else {
                                                        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
                                                        byte[] decode = Base64.decode(queryParameter4, 8);
                                                        byte[] decode2 = Base64.decode(queryParameter3, 8);
                                                        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "HmacSHA256");
                                                        try {
                                                            byte[] bytes = str3.getBytes("UTF-8");
                                                            mac.init(secretKeySpec);
                                                            mac.update(bytes);
                                                            if (!MessageDigest.isEqual(mac.doFinal(), decode2)) {
                                                                throw new Exception("User ID does not match the user ID embedded in the URL");
                                                            }
                                                        } catch (UnsupportedEncodingException unused3) {
                                                            new Exception("Unable to get bytes from nonce URL parameter");
                                                        }
                                                    }
                                                }
                                                String queryParameter5 = uri2.getQueryParameter("__fbs_expires");
                                                if (TextUtils.isEmpty(queryParameter5)) {
                                                    new Exception("Missing expiration parameter");
                                                } else {
                                                    try {
                                                        if (Long.parseLong(queryParameter5, 10) - System.currentTimeMillis() < 0) {
                                                            throw new Exception("Past expiration");
                                                        }
                                                    } catch (NumberFormatException e) {
                                                        new Exception(0Pz.A0j("Cannot parse expiration parameter value '", queryParameter5, "' as base 10"), e);
                                                    }
                                                }
                                            }
                                            c13w2.A00.Bbp(uri2, System.currentTimeMillis() - currentTimeMillis);
                                            r03.onSuccess(AnonymousClass001.A0K());
                                            return;
                                        }
                                        new Exception("Missing signature algorithm param");
                                        throw th3;
                                    } catch (UnsupportedEncodingException | 1AG | InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                                        new Exception("Platform error while validating signature", e2);
                                    }
                                }
                                throw th2;
                            } catch (0JG e3) {
                                c13w.A00.Bbo(data2, e3, System.currentTimeMillis() - currentTimeMillis);
                                r03.onFailure(e3);
                            }
                        }
                    };
                    try {
                        try {
                            B5T = r04.A02.B5T(context, A002);
                        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
                            r04.A02.Cf2(context, A002);
                        }
                    } catch (IOException e) {
                        r04.A01.BaJ(A002, e);
                    }
                    if (B5T != null) {
                        c13b.onSuccess(B5T);
                        return obj;
                    }
                    r04.A01.BaI(A002);
                    r04.A00.Asn(context, new C13b() { // from class: X.15G
                        @Override // X.C13b
                        public void onFailure(Throwable th2) {
                            c13b.onFailure(th2);
                        }

                        @Override // X.C13b
                        public /* bridge */ /* synthetic */ void onSuccess(Object obj3) {
                            13G r05 = (13G) obj3;
                            try {
                                r04.A02.CqM(context, r05);
                                c13b.onSuccess(r05);
                            } catch (IOException e2) {
                                r04.A01.BaJ(A002, e2);
                                c13b.onFailure(e2);
                            }
                        }
                    }, A002);
                    return obj;
                }
            }
            new Exception("No matching validators found for signature versions");
            throw th;
        } catch (0JG e2) {
            1BK.A09(c4Dk.A0C).softReport(__redex_internal_original_name, "Unable to continue validating SignedUri", e2);
            obj.setFuture(A05(intent, uri, c4Dk, num));
            return obj;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static com.google.common.util.concurrent.ListenableFuture A05(android.content.Intent r301, android.net.Uri r302, X.C4Dk r303, java.lang.Integer r304) {
        /*
            Method dump skipped, instructions count: 46571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Dk.A05(android.content.Intent, android.net.Uri, X.4Dk, java.lang.Integer):com.google.common.util.concurrent.ListenableFuture");
    }

    public static java.util.Map A06(Context context, String str, 5Yj r303) {
        5ZL r0 = 5ZL.A01;
        java.util.Map map = (java.util.Map) r303.A00(str, new 5ZR(r0, r0));
        EU9.A00(context);
        return map;
    }

    public static void A07(Context context, String str, HashMap hashMap, boolean z) {
        Intent putExtra = C3o5.A09(context).putExtra("extra_account_switch_redirect_source", 4IA.A0L.sourceName).putExtra("silent_switch_account", z).putExtra("extra_account_switch_target_uid", str);
        if (!hashMap.isEmpty()) {
            putExtra.putExtra(AbE.A00(501), hashMap);
        }
        0LS.A0A(context, putExtra);
    }

    public static void A08(Intent intent, Intent intent2, String str) {
        if (intent.hasExtra(str)) {
            intent2.putExtra(str, intent.getParcelableExtra(str));
        }
    }

    public static void A09(AbstractMap abstractMap, BitSet bitSet, java.util.Map map) {
        bitSet.set(0);
        if (map == null || map.isEmpty()) {
            return;
        }
        abstractMap.put("extra_params", map);
    }
}
