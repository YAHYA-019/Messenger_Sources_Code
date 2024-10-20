package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.analytics.NewAnalyticsSamplingPolicyConfig;
import com.facebook.common.dextricks.DexStore;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.4Bq, reason: invalid class name */
/* loaded from: 4Bq.class */
public class C4Bq implements 1Ro {
    public static final C00i A02 = new 1BQ(16385);
    public static final String __redex_internal_original_name = "AnalyticsLogsOutputStreamHttpMethod";
    public final C4Bc A00;
    public final Integer A01 = 0S2.A0N;

    public C4Bq(C4Bc c4Bc) {
        this.A00 = c4Bc;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.4C2, X.4C3] */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public C04103zy B7F(4BS r302) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("compressed", ConstantsKt.CAMERA_ID_FRONT));
        arrayList.add(new BasicNameValuePair("cmethod", ((2yD) A02.get()).AZk(36315017934938489L) ? "zstd" : "gzip"));
        if (r302.BUK()) {
            arrayList.add(new BasicNameValuePair("multi_batch", ConstantsKt.CAMERA_ID_BACK));
        }
        String AlS = r302.AlS();
        if (AlS != null && !AlS.isEmpty()) {
            arrayList.add(new BasicNameValuePair("ffdb_token", AlS));
        }
        if (r302.CyK()) {
            arrayList.add(new BasicNameValuePair("request_debug_config", ConstantsKt.CAMERA_ID_BACK));
        }
        ArrayList arrayList2 = new ArrayList();
        ?? c4c3 = new C4C3("application/octet-stream");
        c4c3.A00 = r302;
        arrayList2.add(new C4C4(c4c3, "cmsg"));
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "sendAnalyticsLog";
        c04083zw.A0E = "POST";
        c04083zw.A0F = "logging_client_events";
        c04083zw.A03(RequestPriority.CAN_WAIT);
        c04083zw.A06 = this.A01;
        c04083zw.A04 = EnumC04093zx.A03;
        c04083zw.A07 = 0S2.A01;
        c04083zw.A0J = arrayList;
        c04083zw.A0I = arrayList2;
        C04083zw.A00(c04083zw);
        return new C04103zy(c04083zw);
    }

    /* JADX WARN: Type inference failed for: r0v275, types: [X.4Ry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v291, types: [X.4P7] */
    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        4BS r314;
        Throwable th;
        C4Ry c4Ry;
        C4Bc c4Bc = this.A00;
        int i = anonymousClass439.A00;
        Object obj2 = anonymousClass439.A02;
        Preconditions.checkState(obj2 instanceof InputStream, "No response input stream.");
        InputStream inputStream = (InputStream) obj2;
        try {
            try {
            } catch (IOException e) {
                c4Bc.A01.Bxc(e);
                r314 = c4Bc.A00;
            }
            if (i == 200) {
                SamplingPolicyConfig samplingPolicyConfig = c4Bc.A03;
                if (samplingPolicyConfig != null) {
                    1Zb r0 = c4Bc.A02;
                    NewAnalyticsSamplingPolicyConfig newAnalyticsSamplingPolicyConfig = (NewAnalyticsSamplingPolicyConfig) samplingPolicyConfig;
                    C00i c00i = newAnalyticsSamplingPolicyConfig.A02;
                    AnonymousClass244 anonymousClass244 = (AnonymousClass244) c00i.get();
                    AnonymousClass244.A05("in", inputStream);
                    24X A022 = AnonymousClass244.A02(anonymousClass244._jsonFactory.A03(inputStream), anonymousClass244);
                    if (A022 == null) {
                        0fH.A0o("NewAnalyticsSamplingPolicyConfig", "No content from Http response");
                    } else {
                        24X A0D = A022.A0D("checksum");
                        24X A0D2 = A022.A0D(DexStore.CONFIG_FILENAME);
                        if (A0D == null || A0D2 == null) {
                            0fH.A18("NewAnalyticsSamplingPolicyConfig", "Incomplete response: %s", new Object[]{A022.toString()});
                        } else {
                            24X A0D3 = A022.A0D("config_owner_id");
                            1K2 r02 = (1K2) newAnalyticsSamplingPolicyConfig.A00.get();
                            String A0H = A0D.A0H();
                            String A0H2 = A0D2.A0H();
                            String str = null;
                            if (A022.A0D("app_data") != null) {
                                A022.A0D("app_data").A0H();
                            }
                            if (A0D3 != null) {
                                str = A0D3.A0H();
                            }
                            if (!TextUtils.isEmpty(A0H)) {
                                1NP r03 = r02.A02;
                                1Jz r04 = r03.A00;
                                if (!TextUtils.isEmpty(r04.A00.getString("__fs_policy_config_checksum__", ""))) {
                                    ?? obj3 = new Object();
                                    obj3.A01 = r04;
                                    obj3.A02 = new 1Xo(200);
                                    if (r03.A03 != null) {
                                        c4Ry = r03.A03;
                                        final java.util.Map all = r03.A01.getAll();
                                        ?? r05 = new 1K0(all) { // from class: X.4P7
                                            public final java.util.Map A00;

                                            {
                                                this.A00 = all;
                                            }
                                        };
                                        synchronized (c4Ry) {
                                            try {
                                                c4Ry.A00 = r05;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                C4Ry c4Ry2 = c4Ry;
                                            }
                                        }
                                    }
                                    r03.A03 = obj3;
                                }
                                r02.A02(A0H, A0H2, str);
                            }
                            24X A0D4 = A022.A0D("app_data");
                            if (A0D4 != null) {
                                24X A0D5 = ((AnonymousClass244) c00i.get()).A0I(A0D4.A0H()).A0D("pigeon_internal");
                                if (A0D5 != null && A0D5.A0D("regenerate_deviceid") != null) {
                                    C4Tj c4Tj = (C4Tj) newAnalyticsSamplingPolicyConfig.A05.get();
                                    C00i c00i2 = c4Tj.A02;
                                    1ID A00 = 1H2.A00((1H2) c00i2.get());
                                    1ID r06 = new 1ID(C04I.A00().toString(), ((C0dp) c4Tj.A00.get()).now());
                                    1ID r07 = new 1ID(r06.A01, (((Random) c4Tj.A01.get()).nextLong() % 86400000) + 1262376061000L);
                                    c4Ry = (1H2) c00i2.get();
                                    synchronized (c4Ry) {
                                        ((1H2) c4Ry).A05 = r07;
                                        1H2.A01(((1H2) c4Ry).A05, c4Ry);
                                    }
                                    Iterator it = c4Tj.A03.iterator();
                                    while (it.hasNext()) {
                                        ((5G3) it.next()).Bni(A00, r06, 4RY.A03, (String) null);
                                    }
                                    Iterator it2 = c4Tj.A04.iterator();
                                    while (it2.hasNext()) {
                                        ((5G3) it2.next()).Bni(A00, r06, 4RY.A03, (String) null);
                                    }
                                }
                            }
                            24X A0D6 = A022.A0D("client_debug_config");
                            if (A0D6 != null) {
                                if (!A0D6.A0H().isEmpty()) {
                                    A0D6 = ((AnonymousClass244) c00i.get()).A0I(A0D6.A0H());
                                }
                                24X A0D7 = A0D6.A0D("debug_token");
                                24X A0D8 = A0D6.A0D(ErrorReportingConstants.USER_ID_KEY);
                                String A0H3 = A0D8 != null ? A0D8.A0H() : "";
                                if (!A0H3.equals("") && !A0H3.equals(ConstantsKt.CAMERA_ID_FRONT)) {
                                    r0.Cnz(A0H3);
                                    r0.Cub(false);
                                }
                                if (A0D7 != null) {
                                    String A0H4 = A0D7.A0H();
                                    r0.Coh(A0H4);
                                    0fH.A0d(A0H3, A0H4, "NewAnalyticsSamplingPolicyConfig", "FFDB config parsed: debug uid: %s, debug token: %s");
                                }
                            }
                        }
                    }
                }
                r314 = c4Bc.A00;
                r314.Bcb();
                c4Bc.A01.onSuccess();
                if (r314.BNB()) {
                    r314.unlock();
                }
                inputStream.close();
                return null;
            }
            new 4RO(i, 0Pz.A0T(1BJ.A00(890), i));
            throw th;
        } catch (Throwable th3) {
            4BR r08 = c4Bc.A00;
            if (r08.BNB()) {
                r08.unlock();
            }
            inputStream.close();
            throw th3;
        }
    }
}
