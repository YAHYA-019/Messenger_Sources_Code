package com.facebook.fbavatar.artifacto;

import X.02L;
import X.04S;
import X.0AC;
import X.0CW;
import X.0DR;
import X.0Ds;
import X.0fH;
import X.0zV;
import X.11T;
import X.1BL;
import X.1BP;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.1X9;
import X.2Zo;
import X.2aK;
import X.4YU;
import X.4YV;
import X.5QE;
import X.5Yj;
import X.7zL;
import X.7zR;
import X.85W;
import X.8KQ;
import X.8KT;
import X.9E5;
import X.9Gt;
import X.9Wf;
import X.9Xo;
import X.AHv;
import X.AJF;
import X.AJN;
import X.AKh;
import X.AWc;
import X.AWd;
import X.AnonymousClass001;
import X.C00i;
import X.C07y;
import X.C0A2;
import X.C0oe;
import X.C0s8;
import X.C1A3;
import X.C5da;
import X.C5fo;
import X.C6ku;
import X.C87v;
import X.LDm;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.fbavatar.artifacto.datasource.AvatarArtifactMsys;
import com.facebook.inject.FbInjector;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* loaded from: AvatarArtifactRepository.class */
public final class AvatarArtifactRepository {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1BP A05;

    public AvatarArtifactRepository(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A05 = FbInjector.A00;
        this.A03 = 1Lm.A00(7zL.A09(), fbUserSession, 68860);
        this.A01 = 1Bu.A00(68719);
        this.A02 = 1Bu.A00(68720);
        this.A00 = 1HG.A00(7zL.A09(), 68736);
        this.A04 = 1Bu.A00(68718);
    }

    public static final AHv A00(AWc aWc, AvatarArtifactRepository avatarArtifactRepository, AWd aWd, List list) {
        11T.A0F(aWc, 0);
        AvatarArtifactMsys avatarArtifactMsys = (AvatarArtifactMsys) 1Br.A0B(avatarArtifactRepository.A03);
        String A00 = ((9Xo) 1Br.A0B(avatarArtifactRepository.A01)).A00(aWc);
        String A002 = aWd != null ? ((9Wf) 1Br.A0B(avatarArtifactRepository.A02)).A00(aWd) : null;
        int A06 = C07y.A01.A06(LogcatReader.DEFAULT_WAIT_TIME, LocationComponentCompassEngine.SENSOR_DELAY_MICROS);
        StringBuilder A0u = 7zR.A0u();
        A0u.append(A06);
        A0u.append("] observeAssets: packName=");
        A0u.append(A00);
        A0u.append(", templateName=");
        A0u.append(A002);
        A0u.append(", userIds=");
        A0u.append(list);
        0fH.A0j("AvatarArtifactoMsys", AnonymousClass001.A0e(", pageSize=", A0u, 500));
        return new AHv(avatarArtifactRepository, new C0oe((Function2) new AJF(A06, (0DR) null), (0zV) new AHv(avatarArtifactMsys, C5da.A00(new AKh(avatarArtifactMsys, A00, A002, list.isEmpty() ? null : 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, (Function1) null)), 85W.A00), 1), 3), 0);
    }

    public static final List A01(AvatarArtifactRepository avatarArtifactRepository, List list) {
        String str;
        JsonObject jsonObject;
        JsonElement jsonElement;
        String A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            8KT r0 = (8KT) it.next();
            9Gt r02 = (9Gt) 1Br.A0B(avatarArtifactRepository.A04);
            11T.A0F(r0, 0);
            C00i c00i = r02.A00.A00;
            String A03 = ((0AC) c00i.get()).A03(r0.A08, r0.A0F, r0.A0D);
            8KQ r313 = null;
            if (A03 != null) {
                try {
                    Uri A032 = C0A2.A03(A03);
                    if (A032 != null) {
                        String A033 = ((0AC) c00i.get()).A03(r0.A09, r0.A0L, r0.A0J);
                        if (A033 != null) {
                            Long l = null;
                            Uri A034 = C0A2.A03(A033);
                            if (A034 != null) {
                                String str2 = r0.A0I;
                                String str3 = r0.A0G;
                                int i = r0.A01;
                                int i2 = r0.A00;
                                String str4 = r0.A0M;
                                str = "";
                                if (str4 == null) {
                                    str4 = str;
                                }
                                List A19 = 4YU.A19(str4, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                                ArrayList A1E = C1A3.A1E(A19);
                                Iterator it2 = A19.iterator();
                                while (it2.hasNext()) {
                                    A1E.add(4YU.A13(AnonymousClass001.A0i(it2)));
                                }
                                String str5 = r0.A0A;
                                String str6 = r0.A0H;
                                List A192 = 4YU.A19(str6 != null ? str6 : "", ";", 0);
                                ArrayList A1E2 = C1A3.A1E(A192);
                                Iterator it3 = A192.iterator();
                                while (it3.hasNext()) {
                                    A1E2.add(4YU.A13(AnonymousClass001.A0i(it3)));
                                }
                                Long l2 = r0.A07;
                                String str7 = r0.A0B;
                                if (str7 != null && (jsonObject = (JsonObject) 5Yj.A03.A00(str7, JsonObjectSerializer.A01)) != null && (jsonElement = (JsonElement) jsonObject.get("sticker_id")) != null && (A00 = LDm.A06(jsonElement).A00()) != null) {
                                    l = 0CW.A0e(A00);
                                }
                                C87v c87v = new C87v(l, 2);
                                C5fo A002 = 9E5.A00(r0.A0E);
                                if (A002 != null) {
                                    Integer num = r0.A03;
                                    Integer num2 = r0.A02;
                                    C5fo A003 = 9E5.A00(r0.A0K);
                                    if (A003 != null) {
                                        r313 = new 8KQ(A032, A034, c87v, A002, A003, num, num2, r0.A05, r0.A04, l2, r0.A06, str2, str3, str5, r0.A0C, A1E2, A1E, i, i2);
                                    }
                                }
                            }
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
            if (r313 != null) {
                A0s.add(r313);
            }
        }
        return A0s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(X.AWc r302, X.AWd r303, java.util.List r304, X.0DR r305, int r306) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.artifacto.AvatarArtifactRepository.A02(X.AWc, X.AWd, java.util.List, X.0DR, int):java.lang.Object");
    }

    public final Object A03(AWc aWc, String str, List list, 0DR r305, String[] strArr) {
        ArrayList arrayList;
        ArrayList A11 = C0s8.A11(str);
        A11.addAll(02L.A09(strArr));
        AvatarArtifactMsys avatarArtifactMsys = (AvatarArtifactMsys) 1Br.A0B(this.A03);
        String A00 = ((9Xo) 1Br.A0B(this.A01)).A00(aWc);
        if (list != null) {
            9Wf r0 = (9Wf) 1Br.A0B(this.A02);
            arrayList = 1BL.A0z(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r0.A00((AWd) it.next()));
            }
        } else {
            arrayList = null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("issueAssets: packName=");
        A0k.append(A00);
        A0k.append(", templateNames=");
        A0k.append(arrayList);
        0fH.A0j("AvatarArtifactoMsys", AnonymousClass001.A0Z(A11, ", userIds=", A0k));
        C6ku c6ku = avatarArtifactMsys.A01;
        5QE A02 = arrayList != null ? c6ku.A02(A00, arrayList, A11) : c6ku.A01(A00, A11);
        11T.A0D(A02);
        1X9 r02 = A02.A01;
        11T.A0A(r02);
        Object A002 = 2aK.A00(r305, 2Zo.A00(), new AJN(avatarArtifactMsys, r02, (Integer) null, (Object) null, (0DR) null, avatarArtifactMsys.A00));
        0Ds r03 = 0Ds.A02;
        if (A002 != r03) {
            A002 = 04S.A00;
        }
        if (A002 != r03) {
            A002 = 04S.A00;
        }
        return A002;
    }
}
