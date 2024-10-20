package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.groupescalation.GroupEscalationImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation;
import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Gyx.class */
public final class Gyx extends 2Qe {
    public final int A00;
    public final Object A01;

    public Gyx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        if (11 - this.A00 != 0) {
            super.A00();
            return;
        }
        GroupEscalationImplementation groupEscalationImplementation = (GroupEscalationImplementation) this.A01;
        IZI A0c = GOq.A0c(groupEscalationImplementation.A02);
        GOn.A1R(A0c.A01, AbN.A0X(A0c), "SAFETY_WARNING_ELIGIBLE_PARTICIPANT_ADDED_NOTIFICATION_SHOWN");
        I8a i8a = ((HEt) groupEscalationImplementation).A00;
        if (i8a != null) {
            HBr hBr = HBr.A0U;
            Context context = groupEscalationImplementation.A00;
            String A0u = 1BK.A0u(context, 2131965065);
            String string = context.getString(2131965064);
            C1u3 c1u3 = C1u3.A0q;
            i8a.A02(new GjI((Uri) null, new IKB(groupEscalationImplementation, 25), (View.OnClickListener) null, c1u3, C1u4.SIZE_32, (Hre) null, (Hre) null, hBr, A0u, string, C0ty.A00, 0, 0, 0, 7000L, false, false));
        }
    }

    public void A01() {
        switch (this.A00) {
            case 1:
                GrV grV = (GrV) this.A01;
                I0g A0B = GrV.A0B(grV);
                if (GOp.A0s(grV.A0B).A0y()) {
                    1Br.A0C(grV.A0P);
                }
                A0B.A0h = false;
                IZy.A00(A0B, grV);
                return;
            case 2:
                GrN.A02(this.A01);
                return;
            case 13:
                RsysBridge rsysBridge = (RsysBridge) this.A01;
                rsysBridge.A01.invoke(rsysBridge.A02());
                return;
            default:
                super.A01();
                return;
        }
    }

    public void A02() {
        if (13 - this.A00 != 0) {
            super.A02();
        } else {
            ((RsysBridge) this.A01).A03();
        }
    }

    public void A05() {
        if (4 - this.A00 != 0) {
            super.A05();
        } else {
            Gqx.A00((Gqx) this.A01);
        }
    }

    public void A06() {
        UserKey userKey;
        switch (this.A00) {
            case 4:
                Gqx.A00((Gqx) this.A01);
                return;
            case 5:
                Gr3.A00((Gr3) this.A01);
                return;
            case 6:
            case 7:
            default:
                super.A06();
                return;
            case 8:
                C2475GeW.A00((C2475GeW) this.A01);
                return;
            case 9:
                GrT grT = (GrT) this.A01;
                if (grT.A00 == 3) {
                    I9O Ai6 = GOp.A0w(grT.A06).Ai6();
                    if (Ai6 == null || (userKey = grT.A01) == null || !11T.A0O(Ai6.A03.A03, userKey.id)) {
                        GrT.A01(grT);
                        return;
                    } else {
                        GrT.A08(grT, "dominant speaker rendered in the grid");
                        return;
                    }
                }
                return;
        }
    }

    public void A07() {
        if (14 - this.A00 != 0) {
            super.A07();
        } else {
            ((GS4) this.A01).A0d();
        }
    }

    public void A08(I2c i2c) {
        I9O i9o;
        Runnable ixA;
        switch (this.A00) {
            case 10:
                List list = i2c.A02;
                if (1BK.A1Y(list)) {
                    CoWatchNotificationFeature coWatchNotificationFeature = (CoWatchNotificationFeature) this.A01;
                    I9O i9o2 = (I9O) list.get(0);
                    if (!GOp.A0V(coWatchNotificationFeature.A07).A06 || I6L.A01(HBQ.A02, i9o2)) {
                        return;
                    }
                    DKE.A0K(coWatchNotificationFeature.A0E).postDelayed(new Ix6(coWatchNotificationFeature, I9O.A00(i9o2)), 3000L);
                    return;
                }
                return;
            case 12:
                UserStateUpdateImplementation userStateUpdateImplementation = (UserStateUpdateImplementation) this.A01;
                List list2 = i2c.A03;
                if (1BK.A1Y(list2) && GOq.A0s(userStateUpdateImplementation.A08).A0S) {
                    int i = 1;
                    if (IFr.A0N(GS1.A01(userStateUpdateImplementation.A06)).length <= 2) {
                        i = 0;
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        I9O A13 = GOn.A13(it);
                        ((I8j) 1Br.A0B(userStateUpdateImplementation.A05)).A03(new J0o(userStateUpdateImplementation, A13, i), 11T.A03(A13));
                        i++;
                    }
                }
                List list3 = i2c.A02;
                if (!1BK.A1Y(list3)) {
                    List list4 = i2c.A01;
                    if (1BK.A1Y(list4)) {
                        i9o = (I9O) list4.get(0);
                        ixA = new Ix9(userStateUpdateImplementation, i9o);
                    } else {
                        List list5 = i2c.A04;
                        if (!1BK.A1Y(list5)) {
                            return;
                        }
                        i9o = (I9O) list5.get(0);
                        ixA = new IxA(userStateUpdateImplementation, i9o);
                    }
                } else {
                    if (IFr.A0N(GS1.A01(userStateUpdateImplementation.A06)).length <= 2 && !GOq.A0s(userStateUpdateImplementation.A08).A0V) {
                        return;
                    }
                    i9o = (I9O) list3.get(0);
                    ixA = new Ix8(userStateUpdateImplementation, i9o);
                }
                ((I8j) 1Br.A0B(userStateUpdateImplementation.A05)).A03(ixA, 11T.A03(i9o));
                return;
            default:
                super.A08(i2c);
                return;
        }
    }

    public void A09(I9O i9o) {
        if (6 - this.A00 != 0) {
            super.A09(i9o);
            return;
        }
        JFq jFq = ((GS2) this.A01).A00;
        if (AbM.A1a(jFq)) {
            Fragment fragment = (Fragment) AbM.A0r(jFq);
            String str = i9o.A09;
            if (str == null) {
                str = "";
            }
            11T.A0A(str);
            2Ov r0 = new 2Ov();
            Bundle A05 = 1BK.A05();
            A05.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
            r0.setArguments(A05);
            r0.A0q(AbJ.A09(fragment), "dialog", true);
        }
    }

    public void A0A(String str, byte[] bArr) {
        switch (this.A00) {
            case 0:
                I2x i2x = (I2x) this.A01;
                if (I6z.A01(i2x.A0C, str, false)) {
                    if (!str.equals("available_interactive_effects")) {
                        if (!str.equals("available_interactive_effects_request") || GOp.A0F(i2x.A0B).A04().size() <= 0) {
                            return;
                        }
                        ((Hon) 1Br.A0B(i2x.A0F)).A00(i2x.A05, ((IMH) 1Br.A0B(i2x.A0E)).A01(), null);
                        return;
                    }
                    Hon hon = (Hon) 1Br.A0B(i2x.A0F);
                    String A16 = GOq.A16(bArr);
                    1Hz r0 = new 1Hz();
                    try {
                        JSONObject A1F = DKC.A1F(A16);
                        String string = A1F.getString("user_id");
                        11T.A0A(string);
                        JSONArray jSONArray = A1F.getJSONArray("effects");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            r0.A05(jSONArray.getString(i));
                        }
                        ImmutableSet A07 = r0.A07();
                        11T.A0A(A07);
                        0WH r02 = new 0WH(0);
                        C04r c04r = i2x.A04;
                        synchronized (c04r) {
                            for (ImmutableSet immutableSet : c04r.values()) {
                                11T.A0D(immutableSet);
                                r02.addAll(immutableSet);
                            }
                            c04r.put(string, A07);
                        }
                        ImmutableList immutableList = i2x.A01;
                        if (immutableList == null) {
                            I2x.A00(i2x, immutableList);
                            immutableList = ImmutableList.of();
                        }
                        I2x.A00(i2x, immutableList);
                        return;
                    } catch (JSONException unused) {
                        ((2Iq) 1Br.A0B(hon.A01)).A01("rtc_android_effects_available_json_parse_error");
                        return;
                    }
                }
                return;
            case 3:
                if (str.equals("co_watch_end")) {
                    IDo iDo = (IDo) this.A01;
                    4YV.A11(iDo.A0U).execute(new Iwr(iDo, bArr));
                    return;
                }
                return;
            case 7:
                if ("codec_avatar_streaming_start".equals(str)) {
                    GrS grS = (GrS) this.A01;
                    if (grS.A03) {
                        return;
                    }
                    grS.A03 = true;
                    return;
                }
                return;
            case 10:
                if ("cowatch_start".equals(str)) {
                    CoWatchNotificationFeature coWatchNotificationFeature = (CoWatchNotificationFeature) this.A01;
                    ThreadKey A00 = ((HpT) 1Br.A0B(coWatchNotificationFeature.A0C)).A00();
                    if (A00 == null || !A00.A1F() || ((ICR) 1Br.A0B(coWatchNotificationFeature.A06)).A05(coWatchNotificationFeature.A02)) {
                        return;
                    }
                    DKE.A0K(coWatchNotificationFeature.A0E).post(new Is8(coWatchNotificationFeature));
                    return;
                }
                return;
            default:
                super.A0A(str, bArr);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        if (r0.A01() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(java.lang.String r302, java.lang.String r303, int r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gyx.A0C(java.lang.String, java.lang.String, int, boolean, boolean):boolean");
    }
}
